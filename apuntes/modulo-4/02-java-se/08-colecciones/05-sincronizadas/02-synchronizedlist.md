<h1 align="center">Collections.synchronizedList</h1>

<h2>📑 Contenido</h2>

- [Collections.synchronizedList](#collectionssynchronizedlist)
- [¿Qué es Collections.synchronizedList?](#qué-es-collectionssynchronizedlist)
  - [Características de Collections.synchronizedList](#características-de-collectionssynchronizedlist)
- [Creación de una lista sincronizada](#creación-de-una-lista-sincronizada)
- [Métodos comunes](#métodos-comunes)
  - [Añadir elementos](#añadir-elementos)
    - [add(E e)](#adde-e)
  - [Eliminar elementos](#eliminar-elementos)
    - [remove(Object o)](#removeobject-o)
  - [Obtener elementos](#obtener-elementos)
    - [get(int index)](#getint-index)
  - [Tamaño de la lista](#tamaño-de-la-lista)
    - [size()](#size)
  - [Iterar sobre la lista](#iterar-sobre-la-lista)
- [Probando métodos](#probando-métodos)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplo práctico: lista sincronizada en un entorno multihilo](#ejemplo-práctico-lista-sincronizada-en-un-entorno-multihilo)

## Collections.synchronizedList

En aplicaciones multihilo, es crucial garantizar que las operaciones sobre listas sean seguras y consistentes. Java proporciona la clase `Collections` con el método synchronizedList para crear versiones sincronizadas de listas estándar.

## ¿Qué es Collections.synchronizedList?

`Collections.synchronizedList` es un método estático en la clase `Collections` que devuelve una lista sincronizada (segura para hilos) a partir de una lista estándar. Proporciona sincronización interna para garantizar que las operaciones sean atómicas y consistentes cuando son accedidas por múltiples hilos.

### Características de Collections.synchronizedList

- **Seguridad en hilos:** Las operaciones son atómicas y consistentes.

- **Sincronización interna:** La sincronización se maneja internamente, lo que simplifica su uso.

- **Rendimiento:** Puede ser más lenta que las listas no sincronizadas debido a la sobrecarga de la sincronización.

## Creación de una lista sincronizada

Para crear una lista sincronizada, debes especificar el tipo de elementos que almacenará. Esto se hace utilizando genéricos (<T>).

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista estándar
        List<String> lista = new ArrayList<>();

        // Crear una lista sincronizada
        List<String> listaSincronizada = Collections.synchronizedList(lista);

        // Añadir elementos de manera segura
        synchronized (listaSincronizada) {
            listaSincronizada.add("Java");
            listaSincronizada.add("Python");
        }

        // Imprimir la lista sincronizada
        System.out.println("Lista sincronizada: " + listaSincronizada);
    }
}
```

## Métodos comunes

A continuación, se presentan algunos de los métodos más utilizados de una lista sincronizada.

### Añadir elementos

#### add(E e)

Añade un elemento al final de la lista.

```java
synchronized (listaSincronizada) {
    listaSincronizada.add("C++");
}
```

---

### Eliminar elementos

#### remove(Object o)

Elimina la primera ocurrencia del elemento especificado.

```java
synchronized (listaSincronizada) {
    listaSincronizada.remove("Python");
}
```

---

### Obtener elementos

#### get(int index)

Devuelve el elemento en la posición especificada.

```java
synchronized (listaSincronizada) {
    String elemento = listaSincronizada.get(0);
    System.out.println("Elemento en la posición 0: " + elemento);
}
```

---

### Tamaño de la lista

#### size()

Devuelve el número de elementos en la lista.

```java
synchronized (listaSincronizada) {
    int tamaño = listaSincronizada.size();
    System.out.println("Tamaño de la lista: " + tamaño);
}
```

---

### Iterar sobre la lista

Puedes iterar sobre una lista sincronizada usando un `bucle for-each` o un iterador. Sin embargo, debes sincronizar manualmente la iteración para evitar condiciones de carrera.

```java
// for-each
synchronized (listaSincronizada) {
    for (String elemento : listaSincronizada) {
        System.out.println(elemento);
    }
}

// iterador
import java.util.Iterator;

synchronized (listaSincronizada) {
    Iterator<String> iterador = listaSincronizada.iterator();
    while (iterador.hasNext()) {
        System.out.println(iterador.next());
    }
}
```

---

## Probando métodos

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista
        List<Integer> listaOriginal = new ArrayList<>();

        // Crear una lista sincronizada a partir de la lista original
        List<Integer> listaSincronizada = Collections.synchronizedList(listaOriginal);

        // Agregar elementos a la lista sincronizada
        listaSincronizada.add(1);
        listaSincronizada.add(2);
        listaSincronizada.add(3);

        // Imprimir la lista sincronizada
        System.out.println("Lista sincronizada:");
        synchronized (listaSincronizada) {
            for (int elemento : listaSincronizada) {
                System.out.println(elemento);
            }
        }
    }
}
```

## Buenas prácticas

- **Sincroniza manualmente las operaciones compuestas:** Aunque `Collections.synchronizedList` sincroniza operaciones individuales, las operaciones compuestas (como iteraciones) deben sincronizarse manualmente.

- **Evita bloqueos innecesarios:** Minimiza el tiempo que pasas dentro de bloques sincronizados para evitar cuellos de botella.

- **Considera el rendimiento:** Las listas sincronizadas pueden ser más lentas que las no sincronizadas debido a la sobrecarga de la sincronización.

- **Usa colecciones concurrentes cuando sea posible:** Para operaciones más complejas, considera usar colecciones concurrentes como `CopyOnWriteArrayList`.

## Ejemplo práctico: lista sincronizada en un entorno multihilo

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaSincronizada {
    public static void main(String[] args) {
        // Crear una lista sincronizada
        List<String> listaSincronizada = Collections.synchronizedList(new ArrayList<>());

        // Crear y ejecutar hilos
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (listaSincronizada) {
                    listaSincronizada.add("Hilo 1 - Elemento " + i);
                }
            }
        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (listaSincronizada) {
                    listaSincronizada.add("Hilo 2 - Elemento " + i);
                }
            }
        });

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Imprimir el tamaño final de la lista
        System.out.println("Tamaño final de la lista: " + listaSincronizada.size());
    }
}
```
