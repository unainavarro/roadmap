<h1 align="center">Collections synchronizedMap
</h1>

<h2>📑 Contenido</h2>

- [Collections synchronizedMap](#collections-synchronizedmap)
- [¿Qué es synchronizedMap?](#qué-es-synchronizedmap)
- [¿Por qué usar synchronizedMap?](#por-qué-usar-synchronizedmap)
- [Pruebas](#pruebas)
- [Buenas prácticas](#buenas-prácticas)

## Collections synchronizedMap

En aplicaciones multihilo, garantizar la seguridad de los datos es crucial para evitar problemas como condiciones de carrera y corrupción de datos. Java proporciona varias herramientas para manejar estructuras de datos en entornos concurrentes, y una de ellas es la clase `Collections.synchronizedMap`.

## ¿Qué es synchronizedMap?

`Collections.synchronizedMap` es un método de la clase `java.util.Collections` que devuelve un mapa (`Map`) sincronizado (o thread-safe). Esto significa que el mapa resultante está envuelto en un objeto que sincroniza todas sus operaciones, garantizando que solo un hilo pueda acceder al mapa en un momento dado.

## ¿Por qué usar synchronizedMap?

En aplicaciones multihilo, si varios hilos acceden y modifican un mapa simultáneamente sin sincronización, pueden ocurrir problemas como:

- **Condiciones de carrera:** Situaciones en las que el comportamiento del programa depende del orden en que los hilos ejecutan las operaciones.

- **Corrupción de datos:** Inconsistencias en los datos debido a modificaciones concurrentes no controladas.

`Collections.synchronizedMap` resuelve estos problemas al garantizar que todas las operaciones en el mapa sean atómicas y estén protegidas por un mecanismo de bloqueo.

## Pruebas

```java
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crear un mapa
        Map<String, Integer> mapaOriginal = new HashMap<>();

        // Crear un mapa sincronizado a partir del mapa original
        Map<String, Integer> mapaSincronizado = Collections.synchronizedMap(mapaOriginal);

        // Agregar elementos al mapa sincronizado
        mapaSincronizado.put("Juan", 25);
        mapaSincronizado.put("María", 30);
        mapaSincronizado.put("Pedro", 28);

        // Imprimir el mapa sincronizado
        System.out.println("Mapa sincronizado:");
        synchronized (mapaSincronizado) {
            for (Map.Entry<String, Integer> entry : mapaSincronizado.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
```

## Buenas prácticas

- **Sincroniza la iteración:** Siempre sincroniza manualmente la iteración sobre un `synchronizedMap` para evitar excepciones.

- **Evalúa alternativas:** Considera el uso de `ConcurrentHashMap` si el rendimiento es crítico.

- **Minimiza el ámbito de sincronización:** Sincroniza solo las partes del código que lo necesiten para reducir la contención de hilos.
