<h1 align="center">Final array</h1>

<h2>📑 Contenido</h2>

- [Final array](#final-array)
  - [Final array reference (referencia final de array)](#final-array-reference-referencia-final-de-array)
  - [Final array elements (elementos finales del array)](#final-array-elements-elementos-finales-del-array)
  - [Final array (array final)](#final-array-array-final)
- [Ejemplo](#ejemplo)
- [Ventajas](#ventajas)

## Final array

La palabra clave `final` se puede utilizar con variables, métodos y clases para denotar que no se pueden modificar después de su inicialización. Cuando se aplica a un array, `final` **indica que la referencia al array no cambiará después de la inicialización**, lo que significa que **no se puede asignar otro array a esa referencia**.

### Final array reference (referencia final de array)

```java
final int[] numeros = {1, 2, 3};
```

En este caso, la referencia números es `final`, lo que significa que no se puede asignar otro array a números. Sin embargo, los elementos del array números aún pueden ser modificados.

### Final array elements (elementos finales del array)

```java
final int[] numeros = {1, 2, 3};
numeros[0] = 5; // Esto es válido, se puede modificar el contenido del array
```

En este caso, la referencia al array números es `final`, pero los elementos del array aún pueden ser modificados.

### Final array (array final)

```java
final int[] numeros = {1, 2, 3};
// Esto no es válido, no se puede asignar un nuevo array a la referencia final
// numeros = new int[]{4, 5, 6};
```

En este caso, tanto la referencia al array como los elementos del array son finales, lo que significa que no se puede asignar otro array a la referencia números ni modificar los elementos del array.

## Ejemplo

Recuerda un array declarado como `final` no puede ser reasignado a otro array, pero sus elementos sí pueden modificarse.

```java
public class FinalArray {
    public static void main(String[] args) {
        final int[] numeros = {1, 2, 3, 4, 5};

        // Modificación de elementos dentro del array
        numeros[0] = 10; // Válido
        numeros[1] = 20; // Válido

        // Intento de reasignación del array
        // numeros = new int[]{6, 7, 8}; // ERROR: No se puede cambiar la referencia

        // Impresión del array modificado
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}

// Salida: 10 20 3 4 5
```

## Ventajas

- **Protección de la referencia:** Evita que el array sea reasignado, asegurando que siempre se use la misma estructura.

- **Mayor claridad en el código:** Indica que la referencia no cambiará, lo que facilita la lectura y mantenimiento del código.

- **Útil en programación concurrente:** En entornos multihilo, puede evitar problemas al asegurar que una referencia no se modifique accidentalmente.
