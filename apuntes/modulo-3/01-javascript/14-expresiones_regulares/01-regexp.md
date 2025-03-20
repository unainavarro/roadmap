<h1 align='center'>Expresiones regulares</h1>

<h2>📑 Contenido</h2>

- [Expresiones regulares](#expresiones-regulares)
- [Sintaxis básica de expresiones regulares](#sintaxis-básica-de-expresiones-regulares)
  - [Notación literal](#notación-literal)
  - [Usando el constructor RegExp()](#usando-el-constructor-regexp)
- [Límites de cadenas](#límites-de-cadenas)
  - [^ (Inicio de la cadena)](#-inicio-de-la-cadena)
  - [$ (Final de la cadena)](#-final-de-la-cadena)
  - [Combinación de ^ y $](#combinación-de--y-)
  - [Literales y caracteres especiales](#literales-y-caracteres-especiales)
  - [Literales](#literales)
  - [Caracteres especiales](#caracteres-especiales)
    - [`.`](#)
    - [`\d`](#d)
    - [`\w`](#w)
    - [`\s`](#s)
    - [`+`](#-1)
    - [`\*`](#-2)
    - [`?`](#-3)
    - [`|`](#-4)
- [Escapado de caracteres especiales (`\`)](#escapado-de-caracteres-especiales-)

## Expresiones regulares

Las expresiones regulares (o RegExp, por su abreviatura en inglés) son una poderosa herramienta utilizada en programación para buscar, manipular o validar patrones de texto. En JavaScript, las expresiones regulares permiten realizar búsquedas avanzadas en cadenas, sustituciones y validaciones con patrones complejos.

## Sintaxis básica de expresiones regulares

En JavaScript, una expresión regular puede definirse de dos maneras:

- Usando la notación literal, donde el patrón de la expresión regular está entre dos barras inclinadas `/.../`.
- Usando el constructor `RegExp()`, que acepta una cadena como argumento.

### Notación literal

```js
let regex = /hola/;
```

### Usando el constructor RegExp()

```js
let regex = new RegExp("hola");
```

Ambos ejemplos crean una expresión regular que busca la palabra "hola" en una cadena.

## Límites de cadenas

Los límites de cadenas se usan en las expresiones regulares para especificar el comienzo o el final de una cadena. En lugar de buscar el patrón en cualquier parte de la cadena, los límites permiten restringir la búsqueda a posiciones específicas.

### ^ (Inicio de la cadena)

El carácter `^` se utiliza para indicar que el patrón debe comenzar al principio de la cadena.

```js
let regex = /^hola/;
console.log(regex.test("hola mundo")); // true
console.log(regex.test("mundo hola")); // false
```

En este ejemplo, la expresión regular `^hola` coincide solo si la cadena empieza con "hola".

### $ (Final de la cadena)

El carácter `$` indica que el patrón debe estar al final de la cadena.

```js
let regex = /mundo$/;
console.log(regex.test("hola mundo")); // true
console.log(regex.test("mundo hola")); // false
```

Aquí, la expresión regular `mundo$` coincide solo si la cadena termina con "mundo".

### Combinación de ^ y $

Se pueden usar ambos límites para indicar que el patrón debe coincidir con toda la cadena.

```js
let regex = /^hola$/;
console.log(regex.test("hola")); // true
console.log(regex.test("hola mundo")); // false
console.log(regex.test("mundo hola")); // false
```

En este caso, `^hola$` coincide solo si la cadena es exactamente "hola" y no contiene ningún otro texto antes o después.

### Literales y caracteres especiales

### Literales

Los literales en las expresiones regulares son simplemente los caracteres que coinciden exactamente con el texto que se busca. Por ejemplo, la expresión regular `/abc/` busca las letras "abc" en ese orden exacto.

```js
let regex = /abc/;
console.log(regex.test("abc")); // true
console.log(regex.test("123abc456")); // true
console.log(regex.test("ab")); // false
```

### Caracteres especiales

En las expresiones regulares, ciertos caracteres tienen significados especiales y no se interpretan literalmente. A continuación, se presentan algunos de los caracteres especiales más comunes:

#### `.`

Coincide con cualquier carácter, excepto con una nueva línea.

```js
let regex = /a.b/;
console.log(regex.test("aXb")); // true
console.log(regex.test("acb")); // true
console.log(regex.test("ab")); // false
```

#### `\d`

Coincide con cualquier dígito (equivalente a `[0-9]`).

```js
let regex = /\d/;
console.log(regex.test("123")); // true
console.log(regex.test("abc")); // false
```

#### `\w`

Coincide con cualquier carácter de palabra (letras, números y guion bajo) (equivalente a `[A-Za-z0-9_]`).

```js
let regex = /\w/;
console.log(regex.test("Hola123_")); // true
console.log(regex.test("!@#")); // false
```

#### `\s`

Coincide con cualquier espacio en blanco (espacio, tabulación, salto de línea).

```js
let regex = /\s/;
console.log(regex.test("hola mundo")); // true
console.log(regex.test("holamundo")); // false
```

#### `+`

Coincide con una o más repeticiones del carácter o patrón anterior.

```js
let regex = /a+/;
console.log(regex.test("aaa")); // true
console.log(regex.test("b")); // false
```

#### `\*`

Coincide con cero o más repeticiones del carácter o patrón anterior.

```js
let regex = /a*/;
console.log(regex.test("aaa")); // true
console.log(regex.test("b")); // true (porque a* permite 0 repeticiones de "a")
```

#### `?`

Coincide con cero o una repetición del carácter o patrón anterior.

```js
let regex = /colou?r/;
console.log(regex.test("color")); // true
console.log(regex.test("colour")); // true
console.log(regex.test("colouur")); // false
```

#### `|`

Alternancia (OR lógico).

Coincide con uno u otro patrón.

```js
let regex = /perro|gato/;
console.log(regex.test("perro")); // true
console.log(regex.test("gato")); // true
console.log(regex.test("pez")); // false
```

## Escapado de caracteres especiales (`\`)

Dado que ciertos caracteres tienen un significado especial en las expresiones regulares, para buscarlos literalmente, es necesario escaparlos con una barra invertida (`\`). Por ejemplo:

Para buscar el carácter `.` de manera literal, se debe escribir `\.` en la expresión regular.

```js
let regex = /\./;
console.log(regex.test("1.5")); // true
console.log(regex.test("15")); // false
```

De manera similar, para buscar otros caracteres especiales como `*, +, ?, ^, $, {, }, (, ), [, ], y |`, también se deben escapar con `\`.

```js
let regex = /\$/;
console.log(regex.test("precio$")); // true
console.log(regex.test("precio")); // false
```
