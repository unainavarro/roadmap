<h1 align='center'>Métodos de creación</h1>

<h2>📑 Contenido</h2>

- [Métodos de creación](#métodos-de-creación)
- [Array.from()](#arrayfrom)
  - [Convertir una cadena en un array](#convertir-una-cadena-en-un-array)
  - [Convertir un NodeList en un array](#convertir-un-nodelist-en-un-array)
  - [Usar la función de mapeo](#usar-la-función-de-mapeo)
  - [Convertir arguments en un array](#convertir-arguments-en-un-array)
- [Array.of()](#arrayof)
  - [Crear un array con múltiples elementos](#crear-un-array-con-múltiples-elementos)
  - [Comparación entre Array.of() y Array()](#comparación-entre-arrayof-y-array)
  - [Crear un array con valores heterogéneos](#crear-un-array-con-valores-heterogéneos)
- [Casos de Uso Comunes](#casos-de-uso-comunes)
  - [Cuando usar Array.from()](#cuando-usar-arrayfrom)
  - [Cuando usar Array.of()](#cuando-usar-arrayof)

## Métodos de creación

En JavaScript, el objeto Array proporciona varios métodos útiles para crear arrays. Dos de estos métodos son `Array.from()` y `Array.of()`, que facilitan la creación de arrays en situaciones específicas.

## Array.from()

`Array.from()` es un método estático que crea una nueva instancia de array a partir de un objeto iterable o similar a un array (como un `NodeList`, `arguments`, o incluso cadenas de texto). Este método también acepta un argumento opcional, una función de mapeo, que puede aplicarse a cada elemento del iterable mientras se crea el array.

- **iterable:** Un objeto iterable o similar a un array que será convertido en un array.
- **mapFunction (opcional):** Una función que se aplicará a cada elemento del nuevo array.
- **thisArg (opcional):** El valor que será usado como this dentro de la función de mapeo.-

### Convertir una cadena en un array

Dado que las cadenas de texto son iterables, `Array.from()` puede convertir una cadena en un array, donde cada carácter de la cadena es un elemento del array.

```js
let arrayDeCaracteres = Array.from("Hola");
console.log(arrayDeCaracteres); // ["H", "o", "l", "a"]
```

### Convertir un NodeList en un array

En el contexto del DOM, los métodos como `document.querySelectorAll()` devuelven un NodeList, que no es un array pero es iterable. `Array.from()` permite convertirlo fácilmente en un array.

```js
let nodos = document.querySelectorAll("p");
let arrayDeNodos = Array.from(nodos);
console.log(arrayDeNodos); // Un array de nodos <p>
```

### Usar la función de mapeo

Puedes pasar una función de mapeo para transformar los elementos del array mientras se crea.

```js
let numeros = [1, 2, 3, 4];
let cuadrados = Array.from(numeros, (x) => x * x);
console.log(cuadrados); // [1, 4, 9, 16]
```

### Convertir arguments en un array

El objeto arguments, disponible en las funciones, no es un array, pero puede convertirse en uno usando `Array.from()`.

```js
function sumarTodos() {
  let argsArray = Array.from(arguments);
  return argsArray.reduce((acc, val) => acc + val, 0);
}

console.log(sumarTodos(1, 2, 3, 4)); // 10
```

## Array.of()

`Array.of()` es un método estático que crea una nueva instancia de array con los argumentos proporcionados, sin importar cuántos o qué tipo de argumentos sean. La principal diferencia entre `Array.of()` y el constructor `Array()` es la forma en que manejan los argumentos.

- `Array.of()` crea un array con los elementos proporcionados, sin interpretación.
- `Array()` varía su comportamiento según el número de argumentos: si recibe un solo número, creará un array con esa cantidad de elementos vacíos.

### Crear un array con múltiples elementos

```js
let array = Array.of(1, 2, 3);
console.log(array); // [1, 2, 3]
```

### Comparación entre Array.of() y Array()

La diferencia clave entre `Array.of()` y `Array()` se hace evidente cuando pasas un solo número como argumento.

```js
let arrayOf = Array.of(5);
console.log(arrayOf); // [5] -> Crea un array con el número 5 como elemento

let arrayConstructor = Array(5);
console.log(arrayConstructor); // [empty × 5] -> Crea un array vacío con 5 espacios
```

```js
let arrayOf = Array.of(5);
console.log(arrayOf); // [5] -> Crea un array con el número 5 como elemento

let arrayConstructor = Array(5);
console.log(arrayConstructor); // [empty × 5] -> Crea un array vacío con 5 espacios
```

En el caso de `Array(5)`, se crea un array con cinco elementos vacíos. Sin embargo, `Array.of(5)` crea un array con un único elemento, el número 5.

### Crear un array con valores heterogéneos

Puedes usar `Array.of()` para crear arrays con diferentes tipos de valores.

```js
let arrayHeterogeneo = Array.of(1, "JavaScript", true, { nombre: "Juan" });
console.log(arrayHeterogeneo); // [1, "JavaScript", true, {nombre: "Juan"}]
```

## Casos de Uso Comunes

### Cuando usar Array.from()

- Cuando necesitas convertir un objeto iterable o similar a un array en un array real.
- Si necesitas aplicar una transformación o mapeo a los elementos de un iterable mientras los conviertes en un array.
- Para manipular resultados de consultas DOM (NodeList).

### Cuando usar Array.of()

- Cuando deseas crear un array a partir de valores individuales o elementos heterogéneos.
- Para evitar confusiones con el constructor Array(), especialmente al manejar un único número como argumento.
