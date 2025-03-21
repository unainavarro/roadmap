<h1 align="center">Colecciones sincronizadas</h1>

<h2>📑 Contenido</h2>

- [Colecciones sincronizadas](#colecciones-sincronizadas)
- [¿Qué son las colecciones sincronizadas?](#qué-son-las-colecciones-sincronizadas)
  - [Características de las solecciones sincronizadas](#características-de-las-solecciones-sincronizadas)
- [Métodos en la clase collections](#métodos-en-la-clase-collections)
- [Colecciones concurrentes](#colecciones-concurrentes)
  - [ConcurrentHashMap](#concurrenthashmap)
  - [CopyOnWriteArrayList](#copyonwritearraylist)
  - [BlockingQueue](#blockingqueue)
- [Buenas prácticas](#buenas-prácticas)

## Colecciones sincronizadas

En aplicaciones multihilo, es crucial garantizar que las operaciones sobre colecciones sean seguras y consistentes. Java proporciona varias formas de sincronizar colecciones para evitar problemas de concurrencia, como condiciones de carrera y accesos inconsistentes.

## ¿Qué son las colecciones sincronizadas?

Las colecciones sincronizadas son versiones seguras para hilos de las colecciones estándar de Java. Proporcionan sincronización interna para garantizar que las operaciones sean atómicas y consistentes cuando son accedidas por múltiples hilos.

### Características de las solecciones sincronizadas

- **Seguridad en hilos:** Las operaciones son atómicas y consistentes.

- **Sincronización interna:** La sincronización se maneja internamente, lo que simplifica su uso.

- **Rendimiento:** Pueden ser más lentas que las colecciones no sincronizadas debido a la sobrecarga de la sincronización.

## Métodos en la clase collections

Java proporciona métodos en la clase `Collections` para crear versiones sincronizadas de las colecciones estándar.

- **Collections.synchronizedList(List<T> list):** Crea una lista sincronizada a partir de una lista estándar.

- **Collections.synchronizedSet(Set<T> set):** Crea un conjunto sincronizado a partir de un conjunto estándar.

- **Collections.synchronizedMap(Map<K, V> map):** Crea un mapa sincronizado a partir de un mapa estándar.

## Colecciones concurrentes

Además de las colecciones sincronizadas, Java proporciona colecciones concurrentes en el paquete `java.util.concurrent` que están diseñadas específicamente para entornos multihilo.

### ConcurrentHashMap

Una implementación de `Map` que es segura para hilos y proporciona un alto rendimiento.

```java
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new ConcurrentHashMap<>();

        // Añadir pares clave-valor de manera segura
        mapa.put("Java", 1);
        mapa.put("Python", 2);

        // Iterar de manera segura
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }
}
```

### CopyOnWriteArrayList

Una implementación de `List` que es segura para hilos y proporciona una vista consistente de la lista en cualquier momento.

```java
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new CopyOnWriteArrayList<>();

        // Añadir elementos de manera segura
        lista.add("Java");
        lista.add("Python");

        // Iterar de manera segura
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
```

### BlockingQueue

Una interfaz que representa una cola bloqueante, que es segura para hilos y proporciona operaciones de bloqueo.

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> cola = new ArrayBlockingQueue<>(10);

        // Añadir elementos de manera segura
        cola.put("Java");
        cola.put("Python");

        // Obtener elementos de manera segura
        String elemento = cola.take();
        System.out.println("Elemento obtenido: " + elemento);
    }
}
```

## Buenas prácticas

- **Usa colecciones concurrentes cuando sea posible:** Las colecciones concurrentes están diseñadas específicamente para entornos multihilo y suelen ofrecer un mejor rendimiento que las colecciones sincronizadas.

- **Sincroniza manualmente cuando sea necesario:** Si usas colecciones sincronizadas, asegúrate de sincronizar manualmente las operaciones compuestas.

- **Evita bloqueos innecesarios:** Minimiza el tiempo que pasas dentro de bloques sincronizados para evitar cuellos de botella.

- **Considera el rendimiento:** Las colecciones sincronizadas pueden ser más lentas que las no sincronizadas debido a la sobrecarga de la sincronización.
