<h1 align="center">Vector</h1>

<h2>📑 Contenido</h2>

- [Vector](#vector)
- [¿Qué es vector?](#qué-es-vector)
  - [Características de vector](#características-de-vector)
- [Creación de un vector](#creación-de-un-vector)
- [Métodos comunes](#métodos-comunes)
  - [Añadir elementos](#añadir-elementos)
    - [add(E e)](#adde-e)
    - [add(int index, E element)](#addint-index-e-element)
  - [Obtener elementos](#obtener-elementos)
    - [get(int index)](#getint-index)
  - [Eliminar elementos](#eliminar-elementos)
    - [remove(int index)](#removeint-index)
    - [remove(Object o)](#removeobject-o)
  - [Tamaño del vector](#tamaño-del-vector)
    - [size()](#size)
  - [Verificar existencia de un elemento](#verificar-existencia-de-un-elemento)
    - [contains(Object o)](#containsobject-o)
  - [Iterar sobre vector](#iterar-sobre-vector)
- [Probando métodos](#probando-métodos)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplo práctico: gestión de una lista de tareas](#ejemplo-práctico-gestión-de-una-lista-de-tareas)

## Vector

La clase `Vector` en Java es una implementación de la interfaz `List` que almacena elementos en un arreglo dinámico. A diferencia de `ArrayList`, `Vector` es sincronizado, lo que significa que es seguro para su uso en entornos multihilo.

## ¿Qué es vector?

Vector es una clase en el paquete `java.util` que implementa la interfaz `List`. Al igual que `ArrayList`, `Vector` utiliza un arreglo dinámico para almacenar elementos, pero con la diferencia de que `Vector` es sincronizado, lo que lo hace seguro para su uso en aplicaciones multihilo.

### Características de vector

- **Tamaño dinámico:** Puede crecer o reducirse según sea necesario.

- **Acceso rápido:** Permite acceso aleatorio a los elementos en tiempo constante `(O(1))`.

- **Sincronización:** Es seguro para su uso en entornos multihilo.

- **Almacenamiento ordenado:** Los elementos se almacenan en el orden en que se añaden.

- **Permite elementos duplicados:** Puede contener múltiples instancias del mismo objeto.

## Creación de un vector

Para crear un `Vector`, debes especificar el tipo de elementos que almacenará. Esto se hace utilizando genéricos (`<T>`).

```java
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Crear un Vector de cadenas
        Vector<String> vector = new Vector<>();

        // Añadir elementos
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        // Imprimir el Vector
        System.out.println("Vector: " + vector);
    }
}
```

## Métodos comunes

A continuación, se presentan algunos de los métodos más utilizados de Vector.

### Añadir elementos

#### add(E e)

Añade un elemento al final del Vector.

```java
vector.add("JavaScript");
System.out.println("Vector después de añadir: " + vector);
```

#### add(int index, E element)

Añade un elemento en una posición específica.

```java
vector.add(1, "Ruby");
System.out.println("Vector después de añadir en posición 1: " + vector);
```

---

### Obtener elementos

#### get(int index)

Devuelve el elemento en la posición especificada.

```java
String elemento = vector.get(2);
System.out.println("Elemento en la posición 2: " + elemento);
```

---

### Eliminar elementos

#### remove(int index)

Elimina el elemento en la posición especificada.

```java
vector.remove(1);
System.out.println("Vector después de eliminar posición 1: " + vector);
```

#### remove(Object o)

Elimina la primera ocurrencia del elemento especificado.

```java
vector.remove("C++");
System.out.println("Vector después de eliminar 'C++': " + vector);
```

---

### Tamaño del vector

#### size()

Devuelve el número de elementos en el Vector.

```java
int tamaño = vector.size();
System.out.println("Tamaño del Vector: " + tamaño);
```

---

### Verificar existencia de un elemento

#### contains(Object o)

Devuelve `true` si el Vector contiene el elemento especificado.

```java
boolean contieneJava = vector.contains("Java");
System.out.println("¿Contiene 'Java'? " + contieneJava);
```

---

### Iterar sobre vector

Puedes iterar sobre un `Vector` usando un bucle `for-each` o un `iterador`.

```java
// for-each
for (String lenguaje : vector) {
    System.out.println(lenguaje);
}

// iterator
import java.util.Iterator;

Iterator<String> iterador = vector.iterator();
while (iterador.hasNext()) {
    System.out.println(iterador.next());
}
```

---

## Probando métodos

```java
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Crear un vector
        Vector<Integer> vector = new Vector<>();

        // Agregar elementos al vector
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Acceder a un elemento por su índice
        int elemento = vector.get(1);
        System.out.println("Elemento en el índice 1: " + elemento);

        // Modificar un elemento
        vector.set(2, 40);
        System.out.println("Vector modificado: " + vector);

        // Eliminar un elemento por su índice
        vector.remove(0);
        System.out.println("Vector después de eliminar elemento en el índice 0: " + vector);

        // Tamaño del vector
        int tamaño = vector.size();
        System.out.println("Tamaño del vector: " + tamaño);

        // Iterar sobre los elementos del vector
        System.out.println("Elementos del vector:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        // Verificar si un elemento está presente
        boolean contiene = vector.contains(40);
        System.out.println("¿El vector contiene 40? " + contiene);

        // Eliminar todos los elementos
        vector.clear();
        System.out.println("Vector después de limpiar: " + vector);
    }
}
```

## Buenas prácticas

- **Usa genéricos:** Especifica el tipo de elementos que almacenará el `Vector` para evitar errores en tiempo de compilación.

- **Considera la sincronización:** Si no necesitas sincronización, considera usar `ArrayList` para mejorar el rendimiento.

- **Evita el acceso concurrente innecesario:** Aunque `Vector` es sincronizado, el acceso concurrente puede afectar el rendimiento. Usa `Collections.synchronizedList` si necesitas sincronización en `ArrayList`.

- **Optimiza el uso de memoria:** Si conoces el tamaño aproximado del `Vector`, usa el constructor `Vector`(`int initialCapacity`) para evitar redimensionamientos frecuentes.

## Ejemplo práctico: gestión de una lista de tareas

```java
import java.util.Vector;
import java.util.Scanner;

public class ListaTareas {
    public static void main(String[] args) {
        Vector<String> tareas = new Vector<>();
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
