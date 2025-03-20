<h1 align='center'>Arrays</h1>

<h2>📑 Contenido</h2>

- [Arrays](#arrays)
- [Definición y sintaxis](#definición-y-sintaxis)
  - [Usando corchetes](#usando-corchetes)
  - [Usando el constructor array](#usando-el-constructor-array)
- [Características principales de los arrays](#características-principales-de-los-arrays)
  - [Indexación basada en cero](#indexación-basada-en-cero)
  - [Arrays heterogéneos](#arrays-heterogéneos)
  - [Propiedad length](#propiedad-length)
  - [Longitud dinámica](#longitud-dinámica)
- [Acceso y modificación de elementos](#acceso-y-modificación-de-elementos)
  - [Acceder a elementos](#acceder-a-elementos)
  - [Modificar elementos](#modificar-elementos)
  - [Si intentas acceder a un índice que no existe, el resultado será undefined](#si-intentas-acceder-a-un-índice-que-no-existe-el-resultado-será-undefined)
- [Arrays multidimensionales](#arrays-multidimensionales)
- [Elementos dispersos (arrays esparcidos)](#elementos-dispersos-arrays-esparcidos)
- [Comparación de arrays](#comparación-de-arrays)
- [Array like (parecidos a arrays)](#array-like-parecidos-a-arrays)
- [Array declarado con la palabra clave const](#array-declarado-con-la-palabra-clave-const)
  - [Inmutabilidad de la referencia](#inmutabilidad-de-la-referencia)
  - [Mutabilidad de los elementos](#mutabilidad-de-los-elementos)

## Arrays

En JavaScript, los arrays son uno de los tipos de datos más importantes y versátiles. Un array es una estructura de datos que permite almacenar múltiples valores bajo un solo nombre, organizados de manera secuencial y accesibles a través de un índice. A diferencia de otros lenguajes de programación, donde los arrays suelen estar limitados a contener un único tipo de datos (por ejemplo, solo números o solo cadenas), los arrays en JavaScript son dinámicos y heterogéneos, lo que significa que pueden almacenar valores de diferentes tipos, incluyendo otros arrays, objetos o funciones.

## Definición y sintaxis

Un array en JavaScript puede definirse de varias maneras. La forma más común es utilizando corchetes (`[]`), pero también puede crearse usando el constructor Array.

### Usando corchetes

```js
let frutas = ["manzana", "naranja", "plátano"];
```

### Usando el constructor array

```js
let numeros = new Array(1, 2, 3, 4);
```

Ambas formas son válidas, pero la primera (con corchetes) es la más utilizada por su simplicidad y legibilidad.

## Características principales de los arrays

### Indexación basada en cero

Los arrays en JavaScript son indexados, lo que significa que cada elemento tiene una posición o índice dentro del array. Los arrays son indexados a partir de cero (`0`), es decir, el primer elemento tiene el índice `0`, el segundo el índice `1`, y así sucesivamente.

```js
let colores = ["rojo", "verde", "azul"];
console.log(colores[0]); // 'rojo'
console.log(colores[2]); // 'azul'
```

### Arrays heterogéneos

Como mencionamos antes, los arrays en JavaScript pueden contener valores de diferentes tipos. Esto significa que un array puede almacenar números, cadenas, objetos y funciones, todo en un mismo array.

```js
let mixto = [42, "JavaScript", true, { nombre: "Objeto" }, [1, 2, 3]];
console.log(mixto[3]); // { nombre: 'Objeto' }
```

### Propiedad length

Cada array tiene una propiedad `length`, que indica el número de elementos en el array. Esta propiedad es dinámica, lo que significa que se actualiza automáticamente a medida que se añaden o eliminan elementos del array.

```js
let frutas = ["manzana", "pera", "plátano"];
console.log(frutas.length); // 3
```

### Longitud dinámica

Los arrays en JavaScript son dinámicos, lo que significa que pueden crecer o reducirse en tamaño. Puedes añadir elementos a un array después de haberlo creado, y el array ajustará automáticamente su longitud.

```js
let numeros = [1, 2, 3];
numeros.push(4); // Añadir un nuevo elemento al final
console.log(numeros); // [1, 2, 3, 4]
```

También puedes reducir la longitud de un array simplemente cambiando el valor de su propiedad `length`.

```js
let numeros = [1, 2, 3, 4, 5];
numeros.length = 3; // Reduce el tamaño del array
console.log(numeros); // [1, 2, 3]
```

## Acceso y modificación de elementos

Acceder a un elemento en un array se hace utilizando su índice correspondiente. Puedes tanto leer el valor de un elemento como modificarlo de la misma manera.

### Acceder a elementos

```js
let dias = ["lunes", "martes", "miércoles"];
console.log(dias[1]); // 'martes'
```

### Modificar elementos

```js
dias[1] = "sábado";
console.log(dias); // ['lunes', 'sábado', 'miércoles']
```

### Si intentas acceder a un índice que no existe, el resultado será undefined

```js
console.log(dias[5]); // undefined
```

## Arrays multidimensionales

Un array en JavaScript puede contener otros arrays como elementos. Esto permite crear estructuras más complejas, como los arrays multidimensionales, también conocidos como matrices.

```js
let matriz = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];
console.log(matriz[0][1]); // 2 (segunda columna, primera fila)
```

Aquí, cada elemento del array principal es a su vez otro array. Esto permite representar estructuras como tablas o cuadrículas.

## Elementos dispersos (arrays esparcidos)

En JavaScript, es posible crear arrays esparcidos, donde no todos los índices tienen un valor definido. Esto significa que puedes tener "huecos" en el array.

```js
let arrayDisperso = [];
arrayDisperso[3] = "hola";
console.log(arrayDisperso); // [ <3 empty items>, 'hola' ]
console.log(arrayDisperso.length); // 4
```

En este caso, el array tiene un solo valor en el índice 3, pero la propiedad `length` es 4, porque JavaScript rellena los índices vacíos con `undefined`. Aunque los arrays esparcidos pueden ser útiles en algunos casos, se recomienda usarlos con cuidado, ya que pueden complicar el seguimiento y manejo de los datos.

## Comparación de arrays

En JavaScript, los arrays son objetos, y como tal, se comportan de manera diferente en comparación con los valores primitivos (como números o cadenas) al ser comparados. Al usar el operador de igualdad (`==` o `===`), los arrays no se comparan por sus elementos, sino por sus referencias en la memoria.

```js
let array1 = [1, 2, 3];
let array2 = [1, 2, 3];
console.log(array1 === array2); // false
```

En este caso, aunque `array1` y `array2` parecen iguales, son diferentes objetos en la memoria, por lo que no son estrictamente iguales. Para comparar arrays basados en sus elementos, deberías recorrerlos y comparar cada elemento individualmente o usar una biblioteca de utilidades.

## Array like (parecidos a arrays)

Algunos objetos en JavaScript se comportan de manera similar a un array en el sentido de que tienen una propiedad `length` y pueden accederse a través de índices, pero no son instancias de `Array`. Ejemplos de esto incluyen arguments dentro de funciones y las listas de nodos del DOM. Estos "arrays-like" (parecidos a arrays) no tienen acceso a los métodos de un array normal, pero pueden convertirse en arrays reales utilizando `Array.from()`.

```js
function ejemplo() {
  console.log(arguments); // No es un array, pero tiene índices y length
  let argsArray = Array.from(arguments); // Convertir a array real
  console.log(argsArray);
}
ejemplo(1, 2, 3); // [1, 2, 3]
```

## Array declarado con la palabra clave const

En JavaScript, un array declarado con la palabra clave `const` es simplemente un arreglo cuyo referencia no puede ser reasignada. Sin embargo, el contenido del arreglo puede modificarse, es decir, puedes agregar, eliminar o modificar los elementos dentro de ese arreglo

### Inmutabilidad de la referencia

Cuando defines un array con `const`, estás haciendo que la referencia al array sea constante. Esto significa que no puedes reasignar la variable para que apunte a otro array u otro tipo de valor.

```js
const arr = [1, 2, 3];
arr = [4, 5, 6]; // Esto arrojará un error porque estás intentando reasignar la referencia del array.
```

### Mutabilidad de los elementos

Aunque la referencia es constante, el contenido del array puede cambiar. Puedes agregar, eliminar o modificar elementos dentro del array sin problemas.

```js
const arr = [1, 2, 3];
arr.push(4); // Agrega un elemento al final del array
console.log(arr); // [1, 2, 3, 4]

arr[0] = 10; // Modifica el primer elemento
console.log(arr); // [10, 2, 3, 4]
```
