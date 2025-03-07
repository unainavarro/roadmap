<h1 align="center">PriorityQueue</h1>

<h2>📑 Contenido</h2>

- [PriorityQueue](#priorityqueue)

## PriorityQueue

La clase `PriorityQueue` en Java es una implementación de la interfaz `Queue` que almacena elementos en un heap, lo que garantiza que el elemento con la mayor prioridad esté siempre en la cabeza de la cola.

## ¿Qué es PriorityQueue?

`PriorityQueue` es una clase en el paquete `java.util` que implementa la interfaz `Queue`. Utiliza un heap para almacenar elementos, lo que garantiza que el elemento con la mayor prioridad esté siempre en la cabeza de la cola. Los elementos pueden ser ordenados según su orden natural o un comparador personalizado.

### Características de PriorityQueue

**Ordenamiento:** Los elementos están ordenados según su prioridad.

**Acceso rápido:** Proporciona un acceso rápido al elemento con la mayor prioridad.

**Sin orden garantizado:** Aunque los elementos están ordenados por prioridad, no garantiza un orden específico para elementos con la misma prioridad.

**Permite elementos duplicados:** Puede contener múltiples instancias del mismo objeto.

## Probando métodos

```java
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Crear una PriorityQueue de enteros
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Agregar elementos a la cola
        priorityQueue.offer(5);
        priorityQueue.offer(10);
        priorityQueue.offer(3);
        priorityQueue.offer(8);

        // Recuperar y eliminar el elemento con la mayor prioridad
        int primerElemento = priorityQueue.poll();
        System.out.println("Primer elemento de la cola: " + primerElemento);

        // Recuperar el elemento con la mayor prioridad sin eliminarlo
        int elementoPrioritario = priorityQueue.peek();
        System.out.println("Elemento prioritario de la cola: " + elementoPrioritario);

        // Imprimir todos los elementos de la cola
        System.out.println("Elementos de la cola:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
```

## Buenas Prácticas

- **Usa genéricos:** Especifica el tipo de elementos que almacenará la cola para evitar errores en tiempo de compilación.

- **Considera el ordenamiento:** `PriorityQueue` es ideal para operaciones que requieren priorización.

- **Evita duplicados:** Aunque `PriorityQueue` permite duplicados, asegúrate de que esto sea consistente con el diseño de tu aplicación.

- **Maneja adecuadamente los comparadores:** Si necesitas un orden personalizado, asegúrate de que el comparador sea consistente con el diseño de tu aplicación.

## Ejemplo práctico: cola de prioridad con objetos personalizados

```java
import java.util.PriorityQueue;
import java.util.Comparator;

class Tarea {
    String nombre;
    int prioridad;

    Tarea(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return nombre + " (Prioridad: " + prioridad + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear una PriorityQueue con un comparador personalizado
        PriorityQueue<Tarea> cola = new PriorityQueue<>(Comparator.comparingInt(t -> t.prioridad));

        // Añadir tareas
        cola.add(new Tarea("Hacer la compra", 2));
        cola.add(new Tarea("Estudiar para el examen", 1));
        cola.add(new Tarea("Llamar al médico", 3));

        // Procesar tareas en orden de prioridad
        while (!cola.isEmpty()) {
            Tarea tarea = cola.poll();
            System.out.println("Procesando: " + tarea);
        }
    }
}
```
