<h1 align="center">TreeSet</h1>

<h2>📑 Contenido</h2>

- [TreeSet](#treeset)
- [¿Qué es TreeSet?](#qué-es-treeset)
  - [Características de TreeSet:](#características-de-treeset)
- [Probando métodos](#probando-métodos)
- [Buenas practicas](#buenas-practicas)
- [Ejemplo práctico: ordenamiento personalizado](#ejemplo-práctico-ordenamiento-personalizado)

## TreeSet

La clase TreeSet en Java es una implementación de la interfaz Set que almacena elementos en un árbol rojo-negro. Esto garantiza que los elementos estén ordenados según su orden natural o un comparador personalizado.

## ¿Qué es TreeSet?

TreeSet es una clase en el paquete java.util que implementa la interfaz Set. Utiliza un árbol rojo-negro para almacenar elementos, lo que garantiza que los elementos estén ordenados y no haya duplicados.

> Un árbol rojo-negro es una estructura de datos de tipo árbol binario de búsqueda autoequilibrado. Se utiliza comúnmente en informática para organizar y buscar datos de manera eficiente, ya que garantiza operaciones como inserción, eliminación y búsqueda con una complejidad de tiempo de 𝑂(log⁡𝑛)es el número de nodos.

### Características de TreeSet:

- **Elementos únicos:** No permite duplicados.

- **Ordenamiento:** Los elementos están ordenados según su orden natural o un comparador personalizado.

- **Acceso rápido:** Proporciona un acceso rápido a los elementos debido a la estructura de árbol.

- **No permite elementos null:** No puede contener elementos `null` a menos que se especifique un comparador que los maneje.

## Probando métodos

```java
import java.util.TreeSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear un TreeSet de enteros
        Set<Integer> conjunto = new TreeSet<>();

        // Agregar elementos al conjunto
        conjunto.add(5);
        conjunto.add(3);
        conjunto.add(8);
        conjunto.add(3); // No se agregará, ya que "3" ya está presente
        conjunto.add(10);

        // Verificar si un elemento está presente
        boolean contieneOcho = conjunto.contains(8);
        System.out.println("¿El conjunto contiene '8'? " + contieneOcho);

        // Eliminar un elemento del conjunto
        conjunto.remove(5);

        // Imprimir todos los elementos del conjunto
        System.out.println("Elementos del conjunto:");
        for (Integer elemento : conjunto) {
            System.out.println(elemento);
        }

        // Obtener el tamaño del conjunto
        int tamaño = conjunto.size();
        System.out.println("Tamaño del conjunto: " + tamaño);

        // Verificar si el conjunto está vacío
        boolean vacio = conjunto.isEmpty();
        System.out.println("¿El conjunto está vacío? " + vacio);
    }
}
```

## Buenas practicas

- **Usa genéricos:** Especifica el tipo de elementos que almacenará el `TreeSet` para evitar errores en tiempo de compilación.

- **Considera el ordenamiento:** `TreeSet` es ideal para operaciones que requieren elementos ordenados.

- **Evita duplicados:** Aprovecha la característica de unicidad de `TreeSet` para eliminar duplicados automáticamente.

- **Maneja adecuadamente los comparadores:** Si necesitas un orden personalizado, asegúrate de que el comparador sea consistente con el diseño de tu aplicación.

## Ejemplo práctico: ordenamiento personalizado

```java
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;

public class OrdenamientoPersonalizado {
    public static void main(String[] args) {
        // Crear un TreeSet con un comparador personalizado (orden descendente)
        Set<String> conjunto = new TreeSet<>(Comparator.reverseOrder());

        // Añadir elementos
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("C++");
        conjunto.add("JavaScript");

        // Imprimir el conjunto (ordenado en orden descendente)
        System.out.println("Conjunto ordenado descendente: " + conjunto);
    }
}
```
