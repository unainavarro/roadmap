<h1 align='center'>Alternancia</h1>

<h2>📑 Contenido</h2>

- [Alternancia](#alternancia)
- [Sintaxis básica de la alternancia](#sintaxis-básica-de-la-alternancia)
- [Uso de la alternancia en subexpresiones](#uso-de-la-alternancia-en-subexpresiones)
- [Prioridad de la alternancia](#prioridad-de-la-alternancia)
- [Usando alternancia con más de dos opciones](#usando-alternancia-con-más-de-dos-opciones)
- [Alternancia y cuantificadores](#alternancia-y-cuantificadores)
- [Alternancia en expresiones complejas](#alternancia-en-expresiones-complejas)

## Alternancia

La alternancia en expresiones regulares permite especificar múltiples patrones posibles que se pueden encontrar en una cadena de texto. En lugar de definir un solo patrón fijo, la alternancia nos da la capacidad de elegir entre diferentes opciones dentro de una búsqueda. En las expresiones regulares, este concepto se implementa con el símbolo de barra vertical |, que actúa como un "o lógico" entre las posibles coincidencias.

## Sintaxis básica de la alternancia

El operador `|` permite definir varias alternativas dentro de una expresión regular. Se busca cualquier patrón que coincida con las opciones que aparecen a la izquierda o derecha de este operador.

```js
let regex = /perro|gato/;
console.log(regex.test("perro")); // true (coincide con "perro")
console.log(regex.test("gato")); // true (coincide con "gato")
console.log(regex.test("pájaro")); // false (no coincide con ninguna opción)
```

En este caso, el patrón `/perro|gato/` indica que la cadena de texto puede coincidir con "perro" o con "gato". La cadena "pájaro" no coincide con ninguna de las opciones, por lo que el resultado es `false`.

## Uso de la alternancia en subexpresiones

Puedes usar la alternancia dentro de subexpresiones agrupadas con paréntesis para definir opciones más complejas que incluyan múltiples partes de la expresión.

```js
let regex = /(rojo|azul) coche/;
console.log(regex.test("rojo coche")); // true (coincide con "rojo coche")
console.log(regex.test("azul coche")); // true (coincide con "azul coche")
console.log(regex.test("verde coche")); // false (no coincide con ninguna de las opciones de color)
```

Aquí, el patrón `(rojo|azul)` coche busca una cadena que contenga "rojo coche" o "azul coche". La palabra "coche" es común en ambas alternativas, pero el color puede ser "rojo" o "azul". "Verde coche" no coincide porque "verde" no está en las alternativas.

## Prioridad de la alternancia

En expresiones regulares, la prioridad se determina por la posición de los paréntesis y el orden de los operadores. Si no se usan paréntesis, la alternancia se aplica a toda la expresión que precede o sigue al operador `|`.

```js
let regex = /rojo|azul coche/;
console.log(regex.test("rojo")); // true (coincide con "rojo")
console.log(regex.test("azul coche")); // true (coincide con "azul coche")
console.log(regex.test("rojo coche")); // false (no coincide con "rojo coche")
```

```js
let regex = /rojo|azul coche/;
console.log(regex.test("rojo")); // true (coincide con "rojo")
console.log(regex.test("azul coche")); // true (coincide con "azul coche")
console.log(regex.test("rojo coche")); // false (no coincide con "rojo coche")
```

En este caso, el patrón `/rojo|azul coche/` significa "coincidir con 'rojo' o con 'azul coche'". Esto es diferente del ejemplo anterior con paréntesis, ya que ahora "rojo" se busca como una coincidencia independiente, mientras que "azul coche" se trata como una sola unidad.

> [!WARNING]
> Si queremos agrupar las alternativas correctamente, debemos utilizar paréntesis:

```js
let regex = /(rojo coche|azul coche)/;
```

Este patrón asegura que tanto "rojo coche" como "azul coche" se traten como una sola unidad cada uno.

## Usando alternancia con más de dos opciones

La alternancia no se limita a solo dos opciones. Puedes especificar tantas alternativas como necesites, separadas por el operador `|`.

```js
let regex = /manzana|pera|naranja|uva/;
console.log(regex.test("manzana")); // true
console.log(regex.test("pera")); // true
console.log(regex.test("naranja")); // true
console.log(regex.test("sandía")); // false (no coincide con ninguna opción)
```

En este caso, el patrón `/manzana|pera|naranja|uva/` busca cualquiera de las frutas listadas. La cadena "sandía" no está en la lista, por lo que no coincide.

## Alternancia y cuantificadores

La alternancia también se puede combinar con cuantificadores como `*, +, ?, o {n,m}` para controlar el número de veces que debe aparecer cada opción en la cadena.

```js
let regex = /(gato|perro)+/;
console.log(regex.test("gato")); // true (una aparición de "gato")
console.log(regex.test("perroperro")); // true (dos apariciones de "perro")
console.log(regex.test("gato perro")); // false (no coincide porque hay un espacio)
```

Aquí, el patrón `(gato|perro)+` indica que debe haber al menos una repetición de "gato" o "perro", y que las coincidencias pueden repetirse varias veces consecutivas.

## Alternancia en expresiones complejas

La alternancia es muy útil en expresiones regulares complejas, donde hay múltiples posibles coincidencias que podrían aparecer en una cadena. Un uso común es en situaciones donde los formatos varían pero siguen un patrón común.

```js
let regex = /\b(Mr\.|Ms\.|Dr\.)\s[A-Z][a-z]+/;
console.log(regex.test("Mr. Smith")); // true
console.log(regex.test("Ms. Johnson")); // true
console.log(regex.test("Dr. Adams")); // true
console.log(regex.test("Mister Smith")); // false (no coincide con "Mister")
```

En este patrón, `/\b(Mr\.|Ms\.|Dr\.)\s[A-Z][a-z]+/`, se buscan títulos formales ("Mr.", "Ms." o "Dr.") seguidos de un apellido que comienza con una letra mayúscula. La alternancia `Mr\.|Ms\.|Dr\.` permite buscar cualquier de los tres títulos.
