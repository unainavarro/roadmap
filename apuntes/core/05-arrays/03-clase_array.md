<h1 align="center">Clase de Array</h1>

<h2>📑 Clase de Array</h2>

- [Clase de Array](#clase-de-array)
- [Métodos](#métodos)
  - [toString()](#tostring)
  - [sort()](#sort)
  - [equals()](#equals)
  - [binarySearch()](#binarysearch)
  - [fill()](#fill)
  - [copyOf()](#copyof)
- [Reflexión(reflection)](#reflexiónreflection)
  - [newInstance(Class\<?\> componentType, int length)](#newinstanceclass-componenttype-int-length)
  - [get(Object array, int index)](#getobject-array-int-index)
  - [set(Object array, int index, Object value)](#setobject-array-int-index-object-value)
  - [getLength(Object array)](#getlengthobject-array)
  - [getComponentType(Class\<?\> arrayClass)](#getcomponenttypeclass-arrayclass)

## Clase de Array

En Java, la clase `java.util.Arrays` proporciona varios métodos estáticos para trabajar con arrays. Estos métodos permiten realizar diversas operaciones, como ordenar, buscar, comparar y manipular arrays de diferentes tipos de datos.

## Métodos

### toString()

Convierte un array en una cadena de caracteres.

```java
int[] numeros = {1, 2, 3, 4, 5};
String cadenaNumeros = Arrays.toString(numeros);
System.out.println(cadenaNumeros);

// Imprime "[1, 2, 3, 4, 5]"
```

### sort()

Ordena los elementos de un array en orden ascendente.

```java
int[] numeros = {5, 2, 7, 1, 4};
Arrays.sort(numeros);
System.out.println(Arrays.toString(numeros));

// Imprime "[1, 2, 4, 5, 7]"
```

### equals()

Compara dos arrays para verificar si son iguales.

```java
int[] array1 = {1, 2, 3};
int[] array2 = {1, 2, 3};
boolean sonIguales = Arrays.equals(array1, array2);
System.out.println("¿Los arrays son iguales?: " + sonIguales);

// Imprime "¿Los arrays son iguales?: true"
```

### binarySearch()

Realiza una búsqueda binaria en un array ordenado para encontrar un elemento específico.

```java
int[] numeros = {1, 2, 3, 4, 5};
int indice = Arrays.binarySearch(numeros, 3);
System.out.println("El índice de 3 es: " + indice);

// Imprime "El índice de 3 es: 2"
```

### fill()

Rellena todos los elementos de un array con un valor específico.

```java
int[] numeros = new int[5];
Arrays.fill(numeros, 0); // Rellena todos los elementos con el valor 0
System.out.println(Arrays.toString(numeros));

// Imprime "[0, 0, 0, 0, 0]"
```

### copyOf()

Crea una copia de un array con una longitud específica.

```java
import java.util.Arrays;

public class Ejemplo {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        int[] copia = Arrays.copyOf(numeros, 5);
        System.out.println(Arrays.toString(copia));
    }

    // Imprime [1, 2, 3, 0, 0]
}
```

## Reflexión(reflection)

La reflexión (reflection) es una característica que permite a un programa inspeccionar y modificar su propia estructura interna en tiempo de ejecución. La clase `java.lang.reflect.Array` es parte de esta API de reflexión y proporciona métodos estáticos para trabajar con arrays en tiempo de ejecución.

La clase Array ofrece métodos para crear nuevos arrays, obtener y modificar elementos de arrays, así como para obtener información sobre los tipos de arrays.

Algunos de los métodos más comunes de la clase Array incluyen:

### newInstance(Class<?> componentType, int length)

Crea un nuevo array con un tipo de componente (`componentType`) y una longitud dada (`length`).

```java
import java.lang.reflect.Array;

public class Example {
    public static void main(String[] args) {
        // Crear un array de enteros de longitud 5
        int length = 5;
        int[] intArray = (int[]) Array.newInstance(int.class, length);

        // Inicializar valores
        for (int i = 0; i < length; i++) {
            intArray[i] = i + 1;
        }

        // Mostrar los valores
        for (int i : intArray) {
            System.out.println(i);
        }
    }
}

/*
Salida:
        1
        2
        3
        4
        5
*/
```

### get(Object array, int index)

Devuelve el elemento en la posición especificada del array.

```java
import java.lang.reflect.Array;

public class Example {
    public static void main(String[] args) {
        // Crear un array de cadenas
        String[] stringArray = {"Hola", "Mundo", "Java"};

        // Obtener un elemento del array en la posición 1
        String element = (String) Array.get(stringArray, 1);
        System.out.println(element);

        // Salida: Mundo
    }
}
```

### set(Object array, int index, Object value)

Establece el valor de un elemento en la posición especificada del array.

```java
import java.lang.reflect.Array;

public class Example {
    public static void main(String[] args) {
        // Crear un array de enteros
        int[] intArray = {1, 2, 3, 4, 5};

        // Cambiar el valor en la posición 2
        Array.set(intArray, 2, 99);

        // Mostrar los valores actualizados
        for (int i : intArray) {
            System.out.println(i);
        }
    }
}

/*
Salida:
       1
       2
       99
       4
       5
*/
```

### getLength(Object array)

Devuelve la longitud del array.

```java
import java.lang.reflect.Array;

public class Example {
    public static void main(String[] args) {
        // Crear un array de enteros
        int[] intArray = {1, 2, 3, 4, 5};

        // Obtener la longitud del array
        int length = Array.getLength(intArray);
        System.out.println("Longitud del array: " + length);
    }
}

// Salida: Longitud del array: 5
```

### getComponentType(Class<?> arrayClass)

Devuelve el tipo de los elementos del array. Para este caso, utilizamos el método getComponentType de la clase `Class`, ya que no existe un método directo en `Array` para esto.

```java
public class Example {
    public static void main(String[] args) {
        // Crear un array de enteros
        int[] intArray = new int[5];

        // Obtener el tipo de componente del array
        Class<?> componentType = intArray.getClass().getComponentType();
        System.out.println("Tipo de componente: " + componentType);
    }
}

// Salida: Tipo de componente: int
```

> [!NOTE]
>
> La reflexión puede ser útil en situaciones en las que necesitas trabajar con arrays de forma dinámica en tiempo de ejecución, como al manipular datos genéricos o al trabajar con código que no conoce de antemano los tipos de datos con los que está trabajando. Sin embargo, la reflexión también puede hacer que el código sea más difícil de entender y mantener, por lo que debe usarse con precaución.
