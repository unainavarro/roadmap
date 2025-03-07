<h1 align="center">Collections synchronizedSet</h1>

<h2>📑 Contenido</h2>

- [Collections synchronizedSet](#collections-synchronizedset)
- [¿Qué es synchronizedSet?](#qué-es-synchronizedset)
- [¿Por qué usar synchronizedSet?](#por-qué-usar-synchronizedset)
- [Probando métodos](#probando-métodos)
- [Buenas prácticas](#buenas-prácticas)
- [Rendimiento](#rendimiento)
- [Ejemplo: añadir hilos sin riesgo de corrupción de datos](#ejemplo-añadir-hilos-sin-riesgo-de-corrupción-de-datos)

## Collections synchronizedSet

En el mundo de la programación concurrente, uno de los desafíos más comunes es garantizar que las estructuras de datos sean seguras para su uso en entornos multihilo. Java proporciona varias herramientas para manejar este tipo de situaciones, y una de ellas es la clase `Collections.synchronizedSet`.

## ¿Qué es synchronizedSet?

`Collections.synchronizedSet` es un método de la clase `java.util.Collections` que devuelve un conjunto (`Set`) sincronizado (o thread-safe). Esto significa que el conjunto resultante está envuelto en un objeto que sincroniza todas sus operaciones, garantizando que solo un hilo pueda acceder al conjunto en un momento dado.

## ¿Por qué usar synchronizedSet?

En aplicaciones multihilo, si varios hilos acceden y modifican un conjunto simultáneamente sin sincronización, pueden ocurrir problemas como:

- **Condiciones de carrera:** Situaciones en las que el comportamiento del programa depende del orden en que los hilos ejecutan las operaciones.

- **Corrupción de datos:** Inconsistencias en los datos debido a modificaciones concurrentes no controladas.

`Collections.synchronizedSet` resuelve estos problemas al garantizar que todas las operaciones en el conjunto sean atómicas y estén protegidas por un mecanismo de bloqueo.

## Probando métodos

```java
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear un conjunto
        Set<Integer> conjuntoOriginal = new HashSet<>();

        // Crear un conjunto sincronizado a partir del conjunto original
        Set<Integer> conjuntoSincronizado = Collections.synchronizedSet(conjuntoOriginal);

        // Agregar elementos al conjunto sincronizado
        conjuntoSincronizado.add(1);
        conjuntoSincronizado.add(2);
        conjuntoSincronizado.add(3);

        // Imprimir el conjunto sincronizado
        System.out.println("Conjunto sincronizado:");
        synchronized (conjuntoSincronizado) {
            for (int elemento : conjuntoSincronizado) {
                System.out.println(elemento);
            }
        }
    }
}
```

## Buenas prácticas

- **Sincroniza la iteración:** Siempre sincroniza manualmente la iteración sobre un `synchronizedSet` para evitar excepciones.

- **Evalúa alternativas:** Considera el uso de `CopyOnWriteArraySet` o conjuntos basados en `ConcurrentHashMap` si el rendimiento es crítico.

- **Minimiza el ámbito de sincronización:** Sincroniza solo las partes del código que lo necesiten para reducir la contención de hilos.

## Rendimiento

El uso de `synchronizedSet` puede afectar el rendimiento debido a la sobrecarga de la sincronización. Si el conjunto es accedido con mucha frecuencia por múltiples hilos, es recomendable evaluar si otras estructuras de datos concurrentes son más adecuadas.

## Ejemplo: añadir hilos sin riesgo de corrupción de datos

```java
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronizedSetExample {
    public static void main(String[] args) {
        // Crear un conjunto sincronizado
        Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet<>());

        // Añadir elementos desde múltiples hilos
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                synchronizedSet.add("Hilo 1 - Elemento " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                synchronizedSet.add("Hilo 2 - Elemento " + i);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Imprimir el contenido del conjunto
        System.out.println("Tamaño del conjunto: " + synchronizedSet.size());
    }
}
```
