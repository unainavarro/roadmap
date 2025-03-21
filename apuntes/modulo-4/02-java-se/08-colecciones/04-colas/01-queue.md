<h1 align="center">Queue</h1>

<h2>📑 Contenido</h2>

- [Queue](#queue)
- [¿Qué es Queue?](#qué-es-queue)
  - [Características de Queue](#características-de-queue)
- [Métodos comunes](#métodos-comunes)
  - [Añadir elemento](#añadir-elemento)
    - [add(E e)](#adde-e)
    - [offer(E e)](#offere-e)
  - [Eliminar elemento](#eliminar-elemento)
    - [remove()](#remove)
    - [poll()](#poll)
  - [Acceder al primer elemento](#acceder-al-primer-elemento)
    - [element()](#element)
    - [peek()](#peek)
- [Probando métodos](#probando-métodos)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplo práctico: simulación de una cola de atención al cliente](#ejemplo-práctico-simulación-de-una-cola-de-atención-al-cliente)

## Queue

La interfaz `Queue` en Java es una colección que representa una cola de elementos, donde los elementos se insertan al final y se eliminan desde el principio. Sigue el principio FIFO (First In, First Out), es decir, el primer elemento en entrar es el primero en salir.

## ¿Qué es Queue?

`Queue` es una interfaz en el paquete `java.util` que extiende la interfaz `Collection`. Representa una cola de elementos donde los elementos se insertan al final y se eliminan desde el principio. Las implementaciones más comunes de `Queue` son:

- **LinkedList:** Implementa una cola doblemente enlazada.

- **PriorityQueue:** Implementa una cola de prioridad, donde los elementos se ordenan según su prioridad.

- **ArrayDeque:** Implementa una cola doble (deque) con un arreglo redimensionable.

### Características de Queue

- **FIFO:** El primer elemento en entrar es el primero en salir.

- **Operaciones básicas:** `add`, `offer`, `remove`, `poll`, `element`, `peek`, etc.

- **Permite elementos duplicados:** Dependiendo de la implementación, puede contener múltiples instancias del mismo objeto.

## Métodos comunes

A continuación, se presentan algunos de los métodos más utilizados de la interfaz `Queue`.

### Añadir elemento

#### add(E e)

Añade un elemento al final de la cola. Lanza una excepción si la cola está llena.

```java
cola.add("JavaScript");
System.out.println("Cola después de añadir: " + cola);
```

#### offer(E e)

Añade un elemento al final de la cola. Devuelve `false` si la cola está llena.

```java
boolean exito = cola.offer("Ruby");
System.out.println("¿Elemento añadido? " + exito);
```

---

### Eliminar elemento

#### remove()

Elimina y devuelve el primer elemento de la cola. Lanza una excepción si la cola está vacía.

```java
String elementoEliminado = cola.remove();
System.out.println("Elemento eliminado: " + elementoEliminado);
```

#### poll()

Elimina y devuelve el primer elemento de la cola. Devuelve `null` si la cola está vacía.

```java
String elementoEliminado = cola.poll();
System.out.println("Elemento eliminado: " + elementoEliminado);
```

---

### Acceder al primer elemento

#### element()

Devuelve el primer elemento de la cola sin eliminarlo. Lanza una excepción si la cola está vacía.

```java
String primerElemento = cola.element();
System.out.println("Primer elemento: " + primerElemento);
```

#### peek()

Devuelve el primer elemento de la cola sin eliminarlo. Devuelve null si la cola está vacía.

```java
String primerElemento = cola.peek();
System.out.println("Primer elemento: " + primerElemento);
```

---

## Probando métodos

```java
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Crear una cola usando LinkedList
        Queue<String> cola = new LinkedList<>();

        // Agregar elementos a la cola
        cola.offer("Primer elemento");
        cola.offer("Segundo elemento");
        cola.offer("Tercer elemento");

        // Ver el primer elemento de la cola sin eliminarlo
        String primerElemento = cola.peek();
        System.out.println("Primer elemento de la cola: " + primerElemento);

        // Eliminar y obtener el primer elemento de la cola
        String elementoEliminado = cola.poll();
        System.out.println("Elemento eliminado de la cola: " + elementoEliminado);

        // Imprimir todos los elementos de la cola
        System.out.println("Elementos de la cola:");
        for (String elemento : cola) {
            System.out.println(elemento);
        }
    }
}
```

## Buenas prácticas

- **Elige la implementación adecuada:** Usa `LinkedList` para colas simples, PriorityQueue para colas de prioridad y `ArrayDeque` para colas dobles.

- **Usa genéricos:** Especifica el tipo de elementos que almacenará la cola para evitar errores en tiempo de compilación.

- **Considera el rendimiento:** `PriorityQueue` es ideal para operaciones que requieren priorización, mientras que `LinkedList` y `ArrayDeque` son más eficientes para operaciones de inserción y eliminación.

- **Maneja adecuadamente las excepciones:** Usa `offer` y `poll` para evitar excepciones en colas llenas o vacías.

## Ejemplo práctico: simulación de una cola de atención al cliente

```java
import java.util.LinkedList;
import java.util.Queue;

public class ColaAtencion {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        // Añadir clientes a la cola
        cola.add("Cliente 1");
        cola.add("Cliente 2");
        cola.add("Cliente 3");

        // Atender clientes
        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Atendiendo a: " + cliente);
        }

        System.out.println("Todos los clientes han sido atendidos.");
    }
}
```
