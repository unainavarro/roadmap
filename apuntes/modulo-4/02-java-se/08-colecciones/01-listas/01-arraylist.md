<h1 align="center">ArrayList </h1>

<h2>📑 Contenido</h2>

- [ArrayList](#arraylist)
- [¿Qué es ArrayList?](#qué-es-arraylist)
  - [Características de ArrayList](#características-de-arraylist)
- [Creación de un ArrayList](#creación-de-un-arraylist)
- [Métodos comunes](#métodos-comunes)
  - [Añadir elementos](#añadir-elementos)
    - [add(E e)](#adde-e)
    - [add(int index, E element)](#addint-index-e-element)
  - [Obtener elementos](#obtener-elementos)
    - [get(int index)](#getint-index)
  - [Eliminar elementos](#eliminar-elementos)
    - [remove(int index)](#removeint-index)
    - [remove(Object o)](#removeobject-o)
  - [Tamaño de la lista](#tamaño-de-la-lista)
    - [size()](#size)
  - [Verificar la existencia de un elemento](#verificar-la-existencia-de-un-elemento)
    - [contains(Object o)](#containsobject-o)
  - [Iterar sobre la lista](#iterar-sobre-la-lista)
- [Probando métodos](#probando-métodos)
- [Buenas práctica](#buenas-práctica)
- [Ejemplo práctico: gestión de una lista de tareas](#ejemplo-práctico-gestión-de-una-lista-de-tareas)

## ArrayList

La clase `ArrayList` en Java es una de las estructuras de datos más utilizadas. Es una implementación de la interfaz `List` que almacena elementos en un arreglo dinámico, lo que permite un acceso rápido a los elementos y una fácil manipulación de la lista.

## ¿Qué es ArrayList?

`ArrayList` es una clase en el paquete `java.util` que implementa la interfaz `List`. A diferencia de los arreglos tradicionales, `ArrayList` puede cambiar de tamaño dinámicamente, lo que la hace ideal para situaciones donde el número de elementos no es fijo.

### Características de ArrayList

**Tamaño dinámico:** Puede crecer o reducirse según sea necesario.

**Acceso rápido:** Permite acceso aleatorio a los elementos en tiempo constante `(O(1))`.

**Almacenamiento ordenado:** Los elementos se almacenan en el orden en que se añaden.

**Permite elementos duplicados:** Puede contener múltiples instancias del mismo objeto.

## Creación de un ArrayList

Para crear un `ArrayList`, debes especificar el tipo de elementos que almacenará. Esto se hace utilizando genéricos (`<T>`).

> Breve introducción a genéricos:
>
> Son una poderosa característica del lenguaje que **permite escribir clases, interfaces y métodos que pueden operar con cualquier tipo de datos, sin necesidad de especificar el tipo exacto al momento de programarlos**.

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList de cadenas
        ArrayList<String> lista = new ArrayList<>();

        // Añadir elementos
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        // Imprimir la lista
        System.out.println("Lista: " + lista);
    }
}
```

## Métodos comunes

A continuación, se presentan algunos de los métodos más utilizados de `ArrayList`.

### Añadir elementos

#### add(E e)

Añade un elemento al final de la lista.

```java
lista.add("JavaScript");
System.out.println("Lista después de añadir: " + lista);
```

#### add(int index, E element)

Añade un elemento en una posición específica.

```java
lista.add(1, "Ruby");
System.out.println("Lista después de añadir en posición 1: " + lista);
```

---

### Obtener elementos

#### get(int index)

Devuelve el elemento en la posición especificada.

```java
String elemento = lista.get(2);
System.out.println("Elemento en la posición 2: " + elemento);
```

---

### Eliminar elementos

#### remove(int index)

Elimina el elemento en la posición especificada.

```java
lista.remove(1);
System.out.println("Lista después de eliminar posición 1: " + lista);
```

#### remove(Object o)

Elimina la primera ocurrencia del elemento especificado.

```java
lista.remove("C++");
System.out.println("Lista después de eliminar 'C++': " + lista);
```

---

### Tamaño de la lista

#### size()

Devuelve el número de elementos en la lista.

```java
int tamaño = lista.size();
System.out.println("Tamaño de la lista: " + tamaño);
```

---

### Verificar la existencia de un elemento

#### contains(Object o)

Devuelve `true` si la lista contiene el elemento especificado.

```java
boolean contieneJava = lista.contains("Java");
System.out.println("¿Contiene 'Java'? " + contieneJava);
```

---

### Iterar sobre la lista

Puedes iterar sobre un `ArrayList` usando un bucle `for-each` o un iterador.

```java
// for-each
for (String lenguaje : lista) {
    System.out.println(lenguaje);
}

// iterator
import java.util.Iterator;

Iterator<String> iterador = lista.iterator();
while (iterador.hasNext()) {
    System.out.println(iterador.next());
}
```

## Probando métodos

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList
        ArrayList<String> lista = new ArrayList<>();

        // Agregar elementos
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("!");

        // Acceder a elementos por índice
        String elemento = lista.get(0);
        System.out.println("Elemento en el índice 0: " + elemento);

        // Modificar elementos
        lista.set(2, "Java");
        System.out.println("ArrayList modificado: " + lista);

        // Eliminar elementos
        lista.remove(1);
        System.out.println("ArrayList después de eliminar elemento en el índice 1: " + lista);

        // Tamaño del ArrayList
        int tamaño = lista.size();
        System.out.println("Tamaño del ArrayList: " + tamaño);

        // Iterar sobre elementos
        System.out.println("Elementos del ArrayList:");
        for (String item : lista) {
            System.out.println(item);
        }

        // Verificar si un elemento está presente
        boolean contiene = lista.contains("Java");
        System.out.println("¿El ArrayList contiene 'Java'? " + contiene);

        // Eliminar todos los elementos
        lista.clear();
        System.out.println("ArrayList después de limpiar: " + lista);
    }
}
```

## Buenas práctica

- **Usa genéricos:** Especifica el tipo de elementos que almacenará el `ArrayList` para evitar errores en tiempo de compilación.

- **Evita el acceso concurrente:** Si necesitas trabajar con `ArrayList` en un entorno multihilo, considera usar `CopyOnWriteArrayList` o sincronizar el acceso.

- **Optimiza el uso de memoria:** Si conoces el tamaño aproximado de la lista, usa el constructor `ArrayList`(`int initialCapacity`) para evitar redimensionamientos frecuentes.

- **Considera alternativas:** Para operaciones frecuentes de inserción/eliminación en el medio de la lista, considera usar `LinkedList`.

## Ejemplo práctico: gestión de una lista de tareas

```java
import java.util.ArrayList;
import java.util.Scanner;

public class ListaTareas {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Añadir tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la tarea: ");
                    String tarea = scanner.nextLine();
                    tareas.add(tarea);
                    break;
                case 2:
                    System.out.println("Tareas:");
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println((i + 1) + ". " + tareas.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Introduce el número de la tarea a eliminar: ");
                    int indice = scanner.nextInt() - 1;
                    if (indice >= 0 && indice < tareas.size()) {
                        tareas.remove(indice);
                        System.out.println("Tarea eliminada.");
                    } else {
                        System.out.println("Número de tarea inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
```
