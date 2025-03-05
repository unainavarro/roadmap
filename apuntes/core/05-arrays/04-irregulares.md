<h1 align="center">Array Irregulares</h1>

<h2>📑 Contenido</h2>

- [Array Irregulares](#array-irregulares)
- [Declaración e Inicialización](#declaración-e-inicialización)
- [Inicialización Directa](#inicialización-directa)
- [Ventajas](#ventajas)

## Array Irregulares

Un "Jagged Array" (o array irregular) en Java es un tipo de array multidimensional donde las submatrices tienen diferentes longitudes. A diferencia de un array multidimensional regular, donde todas las filas tienen la misma longitud, en un array irregular, cada fila puede tener una longitud diferente.

En un array irregular, cada elemento del array principal es en realidad un array de una dimensión. Estos arrays internos pueden tener diferentes longitudes, lo que los hace "irregulares" en comparación con un array multidimensional regular.

```java
int[][] jaggedArray = {
    {1, 2, 3},
    {4, 5},
    {6, 7, 8, 9}
};
```

## Declaración e Inicialización

Podemos declarar un array irregular especificando solo el tamaño del primer nivel y luego inicializando manualmente cada subarray.

```java
public class ArrayIrregular {
    public static void main(String[] args) {
        int[][] numeros = new int[3][]; // Declaración del array irregular

        numeros[0] = new int[2]; // Primer subarray con 2 elementos
        numeros[1] = new int[4]; // Segundo subarray con 4 elementos
        numeros[2] = new int[3]; // Tercer subarray con 3 elementos

        // Asignación de valores
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[1][0] = 3;
        numeros[1][1] = 4;
        numeros[1][2] = 5;
        numeros[1][3] = 6;
        numeros[2][0] = 7;
        numeros[2][1] = 8;
        numeros[2][2] = 9;

        // Impresión del array irregular
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Salida:
        1 2
        3 4 5 6
        7 8 9
*/
```

## Inicialización Directa

También podemos inicializar un array irregular directamente con valores predefinidos.

```java
public class ArrayIrregularDirecto {
    public static void main(String[] args) {
        int[][] numeros = {
            {1, 2},
            {3, 4, 5, 6},
            {7, 8, 9}
        };

        // Impresión del array irregular
        for (int[] fila : numeros) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

/*
Salida:
    1 2
    3 4 5 6
    7 8 9
*/
```

## Ventajas

- **Eficiencia en memoria:** Se asigna solo la cantidad necesaria de espacio para cada fila.

- **Flexibilidad:** Permite representar estructuras de datos que varían en tamaño, como listas de diferentes longitudes.

- **Útil en estructuras dinámicas:** Se puede utilizar en sistemas donde cada conjunto de datos tiene un tamaño variable.

---

> [!NOTE]
>
> Los arrays irregulares son útiles cuando necesitas representar datos que no tienen una estructura regular o cuando las longitudes de las submatrices varían en tu aplicación. Sin embargo, debido a su naturaleza irregular, pueden ser un poco más complicados de manejar en comparación con los arrays multidimensionales regulares.
