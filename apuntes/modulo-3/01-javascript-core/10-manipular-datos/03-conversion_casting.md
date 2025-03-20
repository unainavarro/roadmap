<h1 align='center'>Casting y conversión</h1>

<h2>📑 Contenido</h2>

- [Casting y conversión](#casting-y-conversión)
- [Conversión implícita (coerción)](#conversión-implícita-coerción)
  - [Coerción a String](#coerción-a-string)
  - [Coerción a número](#coerción-a-número)
- [Conversión explícita (casting)](#conversión-explícita-casting)
  - [Conversión a String](#conversión-a-string)
    - [Usar el método String()](#usar-el-método-string)
    - [Usar el método toString()](#usar-el-método-tostring)
  - [Conversión a número](#conversión-a-número)
    - [Usar el método Number()](#usar-el-método-number)
    - [Usar parseInt() o parseFloat()](#usar-parseint-o-parsefloat)
    - [Uso del operador `+`](#uso-del-operador-)
- [Conversión a boolean](#conversión-a-boolean)
  - [Valores "falsy"](#valores-falsy)
  - [Conversión explícita a boolean](#conversión-explícita-a-boolean)
- [Ejemplos avanzados de conversión](#ejemplos-avanzados-de-conversión)
  - [Operadores de comparación](#operadores-de-comparación)
  - [Conversiones con null, undefined, y NaN](#conversiones-con-null-undefined-y-nan)

## Casting y conversión

En JavaScript, el término casting se refiere a la conversión de tipos de datos de un valor de un tipo a otro. Como un lenguaje de programación de tipado dinámico, JavaScript maneja automáticamente la conversión de tipos en muchas situaciones, pero también permite realizar conversiones explícitas para tener un control más preciso sobre cómo se interpretan los datos.

Existen dos formas principales de conversión de tipos en JavaScript:

- **Conversión Implícita (Coerción):** JavaScript convierte automáticamente un tipo de dato en otro cuando es necesario.
- **Conversión Explícita (Casting):** El programador convierte manualmente un tipo de dato en otro utilizando funciones o métodos específicos.

## Conversión implícita (coerción)

La conversión implícita ocurre cuando JavaScript convierte automáticamente un valor de un tipo a otro en base al contexto en el que se está utilizando.

### Coerción a String

Cuando se utiliza un operador que espera una cadena de texto (como la concatenación con `+`), JavaScript convierte automáticamente los valores no string en strings.

```js
let numero = 5;
let texto = "El número es: " + numero; // Coerción a String
console.log(texto); // "El número es: 5"
```

En este ejemplo, el número 5 se convierte implícitamente en una cadena al concatenarlo con otra cadena.

### Coerción a número

JavaScript convierte automáticamente ciertos tipos de datos en números cuando se utilizan operadores aritméticos.

```js
let resultado = "5" - 2;
console.log(resultado); // 3 (la cadena "5" se convierte en número)
```

Aquí, la cadena "5" se convierte en el número 5 automáticamente cuando se realiza la resta.

## Conversión explícita (casting)

La conversión explícita ocurre cuando el programador toma el control y convierte manualmente un valor a otro tipo de dato. JavaScript ofrece varias funciones y métodos para realizar estas conversiones.

### Conversión a String

Para convertir explícitamente un valor a un `string`, puedes usar las siguientes técnicas:

#### Usar el método String()

El método `String()` convierte cualquier valor a una cadena.

```js
let numero = 123;
let texto = String(numero);
console.log(texto); // "123"
```

#### Usar el método toString()

El método `toString()` también convierte un valor a cadena, pero no funciona en valores `null` o `undefined`.

```js
let booleano = true;
let texto = booleano.toString();
console.log(texto); // "true"
```

### Conversión a número

Para convertir un valor a un número, puedes usar varias técnicas dependiendo del contexto.

#### Usar el método Number()

El método `Number()` convierte explícitamente un valor a número.

```js
let cadena = "456";
let numero = Number(cadena);
console.log(numero); // 456
```

#### Usar parseInt() o parseFloat()

- `parseInt()` convierte una cadena a un número entero.
- `parseFloat()` convierte una cadena a un número de punto flotante (decimal).

```js
let cadenaEntero = "123px";
let entero = parseInt(cadenaEntero);
console.log(entero); // 123

let cadenaDecimal = "3.14em";
let decimal = parseFloat(cadenaDecimal);
console.log(decimal); // 3.14
```

#### Uso del operador `+`

Puedes utilizar el operador `+` para convertir una cadena a un número rápidamente.

```js
let cadena = "123";
let numero = +cadena;
console.log(numero); // 123
```

## Conversión a boolean

Cualquier valor en JavaScript puede ser convertido explícita o implícitamente a un booleano, lo que es importante cuando se trata de condiciones en estructuras de control como `if`, `while`, etc.

### Valores "falsy"

Los siguientes valores se consideran `falsy`, es decir, se convierten en false cuando se evalúan en un contexto booleano:

- `0`
- `"" (cadena vacía)`
- `null`
- `undefined`
- `NaN`
- `false`

Todos los demás valores se consideran truthy (evaluados como true).

### Conversión explícita a boolean

Puedes usar la función `Boolean()` para convertir cualquier valor en true o false.

```js
let vacio = "";
let booleano = Boolean(vacio);
console.log(booleano); // false
```

O puedes usar el operador de doble negación `!!` para forzar la conversión a booleano.

```js
let valor = "hola";
let booleano = !!valor;
console.log(booleano); // true
```

## Ejemplos avanzados de conversión

### Operadores de comparación

Los operadores de comparación como `==` y `===` pueden desencadenar conversiones implícitas.

El operador `==` compara dos valores después de realizar la conversión de tipos, por lo que puede producir resultados inesperados.

```js
console.log("5" == 5); // true (coerción implícita a número)
```

El operador `===` compara los valores sin conversión de tipos (comparación estricta).

```js
console.log("5" === 5); // false (no se hace conversión, tipos diferentes)
```

### Conversiones con null, undefined, y NaN

`null`: Se convierte a 0 cuando se evalúa como número, pero es false en un contexto booleano.

```js
console.log(Number(null)); // 0
console.log(Boolean(null)); // false
```

`undefined`: Se convierte en NaN cuando se evalúa como número, y es false en un contexto booleano.

```js
console.log(Number(undefined)); // NaN
console.log(Boolean(undefined)); // false
```

`NaN (Not-a-Number)`: Es el resultado de conversiones fallidas a número y siempre se considera false en un contexto booleano.

```js
console.log(Boolean(NaN)); // false
```
