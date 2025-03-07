<h1 align="center">LinkedHashMap</h1>

<h2>📑 Contenido</h2>

- [LinkedHashMap](#linkedhashmap)
- [¿Qué es LinkedHashMap?](#qué-es-linkedhashmap)
  - [Características de LinkedHashMap](#características-de-linkedhashmap)
- [Probando métodos](#probando-métodos)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplo práctico: mantener el orden de inserción](#ejemplo-práctico-mantener-el-orden-de-inserción)

## LinkedHashMap

La clase `LinkedHashMap` en Java es una implementación de la interfaz `Map` que combina las ventajas de `HashMap` y `LinkedList`. Almacena pares clave-valor en una tabla hash, lo que proporciona un acceso rápido, y mantiene el orden de inserción mediante una lista enlazada.

## ¿Qué es LinkedHashMap?

`LinkedHashMap` es una clase en el paquete `java.util` que implementa la interfaz `Map`. Es una subclase de `HashMap` y utiliza una tabla hash para almacenar pares clave-valor, pero también mantiene una lista enlazada que conserva el orden de inserción de los elementos.

### Características de LinkedHashMap

**Claves únicas:** No permite claves duplicadas.

**Acceso rápido:** Proporciona un acceso rápido a los valores mediante las claves.

**Orden de inserción:** Mantiene el orden en que los pares clave-valor fueron añadidos.

**Permite un valor null y una clave null:** Puede contener un solo valor `null` y una sola clave `null`.

## Probando métodos

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crear un LinkedHashMap de Strings (clave) a Integers (valor)
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Agregar elementos al LinkedHashMap
        linkedHashMap.put("Juan", 25);
        linkedHashMap.put("María", 30);
        linkedHashMap.put("Pedro", 28);

        // Acceder a un valor por su clave
        int edadDeMaria = linkedHashMap.get("María");
        System.out.println("La edad de María es: " + edadDeMaria);

        // Eliminar un elemento del LinkedHashMap
        linkedHashMap.remove("Juan");

        // Imprimir todos los pares clave-valor del LinkedHashMap
        System.out.println("Elementos del LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Obtener el tamaño del LinkedHashMap
        int tamaño = linkedHashMap.size();
        System.out.println("Tamaño del LinkedHashMap: " + tamaño);
    }
}
```

## Buenas prácticas

- **Usa genéricos:** Especifica el tipo de claves y valores que almacenará el `LinkedHashMap` para evitar errores en tiempo de compilación.

- **Considera el rendimiento:** `LinkedHashMap` es ideal para operaciones de acceso rápido y mantener el orden de inserción.

- **Evita claves duplicadas:** Aprovecha la característica de unicidad de las claves para evitar duplicados.

- **Maneja adecuadamente los valores null:** `LinkedHashMap` permite un solo valor `null` y una sola clave `null`, pero asegúrate de que esto sea consistente con el diseño de tu aplicación.

## Ejemplo práctico: mantener el orden de inserción

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class OrdenInsercion {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new LinkedHashMap<>();

        // Añadir pares clave-valor en un orden específico
        mapa.put("Java", 1);
        mapa.put("Python", 2);
        mapa.put("C++", 3);
        mapa.put("JavaScript", 4);
        mapa.put("Ruby", 5);

        // Intentar añadir un duplicado (sobrescribe el valor)
        mapa.put("Java", 6);

        // Imprimir el mapa (mantiene el orden de inserción)
        System.out.println("Mapa en orden de inserción: " + mapa);
    }
}
```
