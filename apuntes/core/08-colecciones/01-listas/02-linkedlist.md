<h1 align="center">LinkedList</h1>

<h2>📑 Contenido</h2>

- [LinkedList](#linkedlist)
- [¿Qué es LinkedList?](#qué-es-linkedlist)
  - [Características de LinkedList](#características-de-linkedlist)
- [Creación de una LinkedList](#creación-de-una-linkedlist)
- [Métodos comunes](#métodos-comunes)
  - [Añadir elementos](#añadir-elementos)
    - [add(E e)](#adde-e)
    - [add(int index, E element)](#addint-index-e-element)
    - [addFirst(E e) y addLast(E e)](#addfirste-e-y-addlaste-e)
  - [Obtener elementos](#obtener-elementos)
    - [get(int index)](#getint-index)
    - [getFirst() y getLast()](#getfirst-y-getlast)
  - [Eliminar elementos](#eliminar-elementos)
    - [remove(int index)](#removeint-index)
    - [remove(Object o)](#removeobject-o)
    - [removeFirst() y removeLast()](#removefirst-y-removelast)
  - [Tamaño de la lista](#tamaño-de-la-lista)
    - [size()](#size)
  - [Verificar existencia de un elemento](#verificar-existencia-de-un-elemento)
    - [contains(Object o)](#containsobject-o)
  - [Iterar sobre la lista](#iterar-sobre-la-lista)
- [Probando métodos](#probando-métodos)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplo práctico: gestión de una cola de mensajes](#ejemplo-práctico-gestión-de-una-cola-de-mensajes)

## LinkedList

La clase `LinkedList` en Java es una implementación de la interfaz `List` que utiliza una lista doblemente enlazada para almacenar elementos. A diferencia de `ArrayList`, `LinkedList` es **más eficiente para operaciones de inserción y eliminación en el medio de la lista**, aunque es **menos eficiente para el acceso aleatorio**.

## ¿Qué es LinkedList?

`LinkedList` es una clase en el paquete `java.util` que implementa la interfaz `List` y la interfaz `Deque`. Utiliza una lista doblemente enlazada, donde cada elemento (nodo) contiene una referencia al elemento anterior y al siguiente.

### Características de LinkedList

- **Estructura de lista enlazada:** Cada elemento está conectado al anterior y al siguiente.

- **Inserción y eliminación eficientes:** Las operaciones de inserción y eliminación son más rápidas que en `ArrayList`, especialmente en el medio de la lista.

- **Acceso secuencial:** El acceso a elementos por índice es más lento que en `ArrayList` (`O(n)` en lugar de `O(1)`).

- **Permite elementos duplicados:** Puede contener múltiples instancias del mismo objeto.

## Creación de una LinkedList

Para crear una `LinkedList`, debes especificar el tipo de elementos que almacenará. Esto se hace utilizando genéricos (`<T>`).

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Crear una LinkedList de cadenas
        LinkedList<String> lista = new LinkedList<>();

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

A continuación, se presentan algunos de los métodos más utilizados de `LinkedList`.

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

#### addFirst(E e) y addLast(E e)

Añaden un elemento al principio o al final de la lista, respectivamente.

```java
lista.addFirst("Go");
lista.addLast("Swift");
System.out.println("Lista después de añadir al principio y al final: " + lista);
```

---

### Obtener elementos

#### get(int index)

Devuelve el elemento en la posición especificada.

```java
String elemento = lista.get(2);
System.out.println("Elemento en la posición 2: " + elemento);
```

#### getFirst() y getLast()

Devuelven el primer y último elemento de la lista, respectivamente.

```java
String primerElemento = lista.getFirst();
String ultimoElemento = lista.getLast();
System.out.println("Primer elemento: " + primerElemento);
System.out.println("Último elemento: " + ultimoElemento);
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

#### removeFirst() y removeLast()

Eliminan el primer y último elemento de la lista, respectivamente.

```java
lista.removeFirst();
lista.removeLast();
System.out.println("Lista después de eliminar el primero y el último: " + lista);
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

### Verificar existencia de un elemento

#### contains(Object o)

Devuelve `true` si la lista contiene el elemento especificado.

```java
boolean contieneJava = lista.contains("Java");
System.out.println("¿Contiene 'Java'? " + contieneJava);
```

---

### Iterar sobre la lista

Puedes iterar sobre una `LinkedList` usando un bucle `for-each` o un `iterador`.

```java
// for-each
for (String lenguaje : lista) {
    System.out.println(lenguaje);
}

//Iterator
import java.util.Iterator;

Iterator<String> iterador = lista.iterator();
while (iterador.hasNext()) {
    System.out.println(iterador.next());
}
```

---

## Probando métodos

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Crear una LinkedList
        LinkedList<String> listaEnlazada = new LinkedList<>();

        // Agregar elementos al final de la lista
        listaEnlazada.add("Hola");
        listaEnlazada.add("Mundo");
        listaEnlazada.add("!");

        // Agregar un elemento en una posición específica
        listaEnlazada.add(1, "Java");

        // Acceder a un elemento por su índice
        String elemento = listaEnlazada.get(2);
        System.out.println("Elemento en el índice 2: " + elemento);

        // Modificar un elemento
        listaEnlazada.set(3, "LinkedList");

        // Eliminar un elemento por su valor
        listaEnlazada.remove("Mundo");

        // Eliminar un elemento por su índice
        listaEnlazada.remove(0);

        // Iterar sobre los elementos de la lista
        System.out.println("Elementos de la LinkedList:");
        for (String item : listaEnlazada) {
            System.out.println(item);
        }

        // Verificar si un elemento está presente
        boolean contieneJava = listaEnlazada.contains("Java");
        System.out.println("¿La LinkedList contiene 'Java'? " + contieneJava);

        // Tamaño de la LinkedList
        int tamaño = listaEnlazada.size();
        System.out.println("Tamaño de la LinkedList: " + tamaño);

        // Eliminar todos los elementos
        listaEnlazada.clear();
        System.out.println("LinkedList después de limpiar: " + listaEnlazada);
    }
}
```

## Buenas prácticas

- **Usa genéricos:** Especifica el tipo de elementos que almacenará la `LinkedList` para evitar errores en tiempo de compilación.

- **Elige LinkedList para inserciones/eliminaciones frecuentes:** Es más eficiente que `ArrayList` para estas operaciones, especialmente en el medio de la lista.

- **Evita el acceso aleatorio:** Si necesitas acceso frecuente a elementos por índice, considera usar `ArrayList`.

- **Considera alternativas:** Para operaciones de cola o pila, `LinkedList` es ideal debido a su implementación de `Deque`.

## Ejemplo práctico: gestión de una cola de mensajes

```java
import java.util.LinkedList;
import java.util.Scanner;

public class ColaMensajes {
    public static void main(String[] args) {
        LinkedList<String> mensajes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Añadir mensaje");
            System.out.println("2. Mostrar mensajes");
            System.out.println("3. Eliminar primer mensaje");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el mensaje: ");
                    String mensaje = scanner.nextLine();
                    mensajes.addLast(mensaje);
                    break;
                case 2:
                    System.out.println("Mensajes:");
                    for (String msg : mensajes) {
                        System.out.println(msg);
                    }
                    break;
                case 3:
                    if (!mensajes.isEmpty()) {
                        String mensajeEliminado = mensajes.removeFirst();
                        System.out.println("Mensaje eliminado: " + mensajeEliminado);
                    } else {
                        System.out.println("No hay mensajes para eliminar.");
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
