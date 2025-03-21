<h1 align="center">TreeMap </h1>

<h2>📑 Contenido</h2>

- [TreeMap](#treemap)
- [¿Qué es TreeMap?](#qué-es-treemap)
  - [Características de TreeMap](#características-de-treemap)
- [Probando métodos](#probando-métodos)
- [Buenas Prácticas con TreeMap](#buenas-prácticas-con-treemap)
- [Ejemplo práctico: ordenamiento personalizado](#ejemplo-práctico-ordenamiento-personalizado)

## TreeMap

La clase `TreeMap` en Java es una implementación de la interfaz `Map` que almacena pares clave-valor en un árbol rojo-negro. Esto garantiza que los pares clave-valor estén ordenados según el orden natural de las claves o un comparador personalizado.

## ¿Qué es TreeMap?

`TreeMap` es una clase en el paquete `java.util` que implementa la interfaz `Map`. Utiliza un árbol rojo-negro para almacenar pares clave-valor, lo que garantiza que los elementos estén ordenados según el orden natural de las claves o un comparador personalizado.

### Características de TreeMap

- **Claves únicas:** No permite claves duplicadas.

- **Ordenamiento:** Los pares clave-valor están ordenados según el orden natural de las claves o un comparador personalizado.

- **Acceso rápido:** Proporciona un acceso rápido a los valores mediante las claves.

- **No permite claves null:** No puede contener claves null a menos que se especifique un comparador que las maneje.

## Probando métodos

```java
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crear un TreeMap de Strings (clave) a Integers (valor)
        Map<String, Integer> treeMap = new TreeMap<>();

        // Agregar elementos al TreeMap
        treeMap.put("Juan", 25);
        treeMap.put("María", 30);
        treeMap.put("Pedro", 28);

        // Acceder a un valor por su clave
        int edadDeMaria = treeMap.get("María");
        System.out.println("La edad de María es: " + edadDeMaria);

        // Eliminar un elemento del TreeMap
        treeMap.remove("Juan");

        // Imprimir todos los pares clave-valor del TreeMap
        System.out.println("Elementos del TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Obtener el tamaño del TreeMap
        int tamaño = treeMap.size();
        System.out.println("Tamaño del TreeMap: " + tamaño);
    }
}
```

## Buenas Prácticas con TreeMap

- **Usa genéricos:** Especifica el tipo de claves y valores que almacenará el `TreeMap` para evitar errores en tiempo de compilación.

- **Considera el ordenamiento:** `TreeMap` es ideal para operaciones que requieren elementos ordenados.

- **Evita claves duplicadas:** Aprovecha la característica de unicidad de las claves para evitar duplicados.

- **Maneja adecuadamente los comparadores:** Si necesitas un orden personalizado, asegúrate de que el comparador sea consistente con el diseño de tu aplicación.

## Ejemplo práctico: ordenamiento personalizado

```java
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;

public class OrdenamientoPersonalizado {
    public static void main(String[] args) {
        // Crear un TreeMap con un comparador personalizado (orden descendente)
        Map<String, Integer> mapa = new TreeMap<>(Comparator.reverseOrder());

        // Añadir pares clave-valor
        mapa.put("Java", 1);
        mapa.put("Python", 2);
        mapa.put("C++", 3);
        mapa.put("JavaScript", 4);

        // Imprimir el mapa (ordenado en orden descendente)
        System.out.println("Mapa ordenado descendente: " + mapa);
    }
}
```
