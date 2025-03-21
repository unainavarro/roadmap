<h1 align="center">HashSet </h1>

<h2>📑 Contenido</h2>

- [HashSet](#hashset)
- [¿Qué es HashSet?](#qué-es-hashset)
  - [Características de HashSet](#características-de-hashset)
- [Creación de un HashSet](#creación-de-un-hashset)
- [Probando métodos](#probando-métodos)
- [Buenas prácticas](#buenas-prácticas)

## HashSet

La clase `HashSet` en Java es una de las implementaciones más utilizadas de la interfaz `Set`. Almacena elementos en una tabla hash, lo que proporciona un acceso rápido a los elementos y garantiza que no haya duplicados

## ¿Qué es HashSet?

`HashSet` es una clase en el paquete `java.util` que implementa la interfaz `Set`. Utiliza una tabla hash para almacenar elementos, lo que permite un acceso rápido a los elementos y garantiza que no haya duplicados. Sin embargo, **no garantiza un orden específico de los elementos**.

### Características de HashSet

- **Elementos únicos:** No permite duplicados.

- **Acceso rápido:** Proporciona un acceso rápido a los elementos debido a la tabla hash.

- **Sin orden garantizado:** Los elementos no están ordenados.

- **Permite un elemento null:** Puede contener un solo elemento `null`.

## Creación de un HashSet

Para crear un `HashSet`, debes especificar el tipo de elementos que almacenará. Esto se hace utilizando genéricos (`<T>`).

```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear un HashSet de cadenas
        Set<String> conjunto = new HashSet<>();

        // Añadir elementos
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("C++");

        // Intentar añadir un duplicado
        conjunto.add("Java");

        // Imprimir el conjunto
        System.out.println("Conjunto: " + conjunto);
    }
}
```

## Probando métodos

```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear un HashSet de Strings
        Set<String> conjunto = new HashSet<>();

        // Agregar elementos al conjunto
        conjunto.add("Hola");
        conjunto.add("Mundo");
        conjunto.add("Hola"); // No se agregará, ya que "Hola" ya está presente

        // Verificar si un elemento está presente
        boolean contieneHola = conjunto.contains("Hola");
        System.out.println("¿El conjunto contiene 'Hola'? " + contieneHola);

        // Eliminar un elemento del conjunto
        conjunto.remove("Mundo");

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

- **Usa genéricos:** Especifica el tipo de elementos que almacenará el `HashSet` para evitar errores en tiempo de compilación.

- **Considera el rendimiento:** `HashSet` es ideal para operaciones de acceso rápido, pero no garantiza un orden específico.

- **Evita duplicados:** Aprovecha la característica de unicidad de `HashSet` para eliminar duplicados automáticamente.

- **Maneja adecuadamente los elementos null:** `HashSet` permite un solo elemento `null`, pero asegúrate de que esto sea consistente con el diseño de tu aplicación.
