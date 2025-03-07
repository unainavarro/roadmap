<h1 align="center">ArrayDeque</h1>

<h2>📑 Contenido</h2>

- [ArrayDeque](#arraydeque)
- [¿Qué es ArrayDeque?](#qué-es-arraydeque)
  - [Características de ArrayDeque](#características-de-arraydeque)
- [Probando métodos](#probando-métodos)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplo práctico: simulación de una cola de tareas](#ejemplo-práctico-simulación-de-una-cola-de-tareas)

## ArrayDeque

La clase `ArrayDeque` en Java es una implementación de la interfaz `Deque` que utiliza un arreglo redimensionable para almacenar elementos. Proporciona operaciones eficientes para añadir, eliminar y acceder a elementos tanto al principio como al final de la cola.

## ¿Qué es ArrayDeque?

`ArrayDeque` es una clase en el paquete java.util que implementa la interfaz `Deque`. Utiliza un arreglo redimensionable para almacenar elementos, lo que permite un acceso rápido y operaciones eficientes tanto al principio como al final de la cola.

### Características de ArrayDeque

**Cola doble (Deque):** Permite añadir y eliminar elementos tanto al principio como al final.

**Acceso rápido:** Proporciona un acceso rápido a los elementos.

**Sin orden garantizado:** Los elementos no están ordenados.

**Permite elementos null:** No puede contener elementos `null`.

## Probando métodos

```java
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        // Crear una ArrayDeque de enteros
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Agregar elementos al principio y al final de la deque
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);

        // Eliminar y obtener el primer elemento de la deque
        int primerElemento = deque.removeFirst();
        System.out.println("Primer elemento de la deque: " + primerElemento);

        // Eliminar y obtener el último elemento de la deque
        int ultimoElemento = deque.removeLast();
        System.out.println("Último elemento de la deque: " + ultimoElemento);

        // Imprimir todos los elementos de la deque
        System.out.println("Elementos de la deque:");
        for (int elemento : deque) {
            System.out.println(elemento);
        }
    }
}
```

## Buenas prácticas

**Usa genéricos:** Especifica el tipo de elementos que almacenará el `ArrayDeque` para evitar errores en tiempo de compilación.

**Considera el rendimiento:** `ArrayDeque` es ideal para operaciones de inserción y eliminación tanto al principio como al final.

**Evita elementos null:** `ArrayDeque` no permite elementos `null`, así que asegúrate de no intentar añadirlos.

**Maneja adecuadamente las excepciones:** Usa `pollFirst` y `pollLast` para evitar excepciones en deques vacíos

## Ejemplo práctico: simulación de una cola de tareas

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class ColaTareas {
    public static void main(String[] args) {
        Deque<String> tareas = new ArrayDeque<>();

        // Añadir tareas al principio y al final
        tareas.addLast("Tarea 1");
        tareas.addLast("Tarea 2");
        tareas.addFirst("Tarea Urgente");

        // Procesar tareas
        while (!tareas.isEmpty()) {
            String tarea = tareas.pollFirst();
            System.out.println("Procesando: " + tarea);
        }

        System.out.println("Todas las tareas han sido procesadas.");
    }
}
```
