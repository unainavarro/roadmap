<h1 align="center">LinkedHashSet </h1>

<h2>📑 Contenido</h2>

- [LinkedHashSet](#linkedhashset)
- [¿Qué es LinkedHashSet?](#qué-es-linkedhashset)
  - [Características de LinkedHashSet](#características-de-linkedhashset)
- [Probando métodos](#probando-métodos)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplo práctico: mantener el orden de inserción](#ejemplo-práctico-mantener-el-orden-de-inserción)

## LinkedHashSet

La clase `LinkedHashSet` en Java es una implementación de la interfaz `Set` que combina las ventajas de `HashSet` y `LinkedList`. Almacena elementos en una tabla hash, lo que proporciona un acceso rápido, y mantiene el orden de inserción mediante una lista enlazada.

## ¿Qué es LinkedHashSet?

`LinkedHashSet` es una clase en el paquete `java.util` que implementa la interfaz `Set`. Es una subclase de `HashSet` y utiliza una tabla hash para almacenar elementos, pero también mantiene una lista enlazada que conserva el orden de inserción de los elementos.

### Características de LinkedHashSet

- **Elementos únicos:** No permite duplicados.

- **Acceso rápido:** Proporciona un acceso rápido a los elementos debido a la tabla hash.

- **Orden de inserción:** Mantiene el orden en que los elementos fueron añadidos.

- **Permite un elemento null:** Puede contener un solo elemento `null`.

## Probando métodos

```java
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear un LinkedHashSet de Strings
        Set<String> conjunto = new LinkedHashSet<>();

        // Agregar elementos al conjunto
        conjunto.add("Perro");
        conjunto.add("Gato");
        conjunto.add("Perro"); // No se agregará, ya que "Perro" ya está presente
        conjunto.add("Araña");

        // Verificar si un elemento está presente
        boolean contieneGato = conjunto.contains("Gato");
        System.out.println("¿El conjunto contiene 'Gato'? " + contieneGato);

        // Eliminar un elemento del conjunto
        conjunto.remove("Araña");

        // Imprimir todos los elementos del conjunto
        System.out.println("Elementos del conjunto:");
        for (String elemento : conjunto) {
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

## Buenas prácticas

- **Usa genéricos**: Especifica el tipo de elementos que almacenará el `LinkedHashSet` para evitar errores en tiempo de compilación.

- **Considera el rendimiento:** `LinkedHashSet` es ideal para operaciones de acceso rápido y mantener el orden de inserción.

- **Evita duplicados:** Aprovecha la característica de unicidad de LinkedHashSet para eliminar duplicados automáticamente.

- **Maneja adecuadamente los elementos null:** `LinkedHashSet` permite un solo elemento `null`, pero asegúrate de que esto sea consistente con el diseño de tu aplicación.

## Ejemplo práctico: mantener el orden de inserción

```java
import java.util.LinkedHashSet;
import java.util.Set;

public class OrdenInsercion {
    public static void main(String[] args) {
        Set<String> conjunto = new LinkedHashSet<>();

        // Añadir elementos en un orden específico
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("C++");
        conjunto.add("JavaScript");
        conjunto.add("Ruby");

        // Intentar añadir un duplicado
        conjunto.add("Python");

        // Imprimir el conjunto (mantiene el orden de inserción)
        System.out.println("Conjunto en orden de inserción: " + conjunto);
    }
}
```
