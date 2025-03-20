<h1 align='center'>Funciones integradas</h1>

<h2>📑 Contenido</h2>

- [Funciones integradas](#funciones-integradas)
- [¿Qué son las funciones integradas?](#qué-son-las-funciones-integradas)
- [Funciones globales comunes](#funciones-globales-comunes)
  - [parseInt()](#parseint)
  - [parseFloat()](#parsefloat)
  - [isNaN()](#isnan)
  - [Number()](#number)
  - [eval()](#eval)
- [Eval riesgos](#eval-riesgos)
  - [Riesgos de seguridad](#riesgos-de-seguridad)
  - [Dificultad para depuración](#dificultad-para-depuración)
  - [Impacto en el rendimiento](#impacto-en-el-rendimiento)
  - [Alternativas disponibles](#alternativas-disponibles)

## Funciones integradas

JavaScript incluye una amplia gama de funciones integradas o built-in functions, que son funciones predefinidas en el lenguaje. Estas funciones están disponibles globalmente o como parte de objetos nativos y proporcionan una base sólida para realizar tareas comunes como manipulación de datos, ejecución de cálculos matemáticos, manipulación de cadenas de texto, y manejo de fechas, entre otras.

## ¿Qué son las funciones integradas?

Las funciones integradas en JavaScript son funciones predefinidas que vienen con el lenguaje y están disponibles sin necesidad de que el desarrollador las implemente. Estas funciones ayudan a realizar tareas comunes de forma sencilla y eficiente, evitando la necesidad de escribir código adicional para operaciones que se utilizan frecuentemente.

Existen funciones globales como parseInt(), parseFloat() y isNaN(), y también funciones que pertenecen a objetos integrados como Math, String, Array, Date, entre otros.

> [!NOTE]
> Las funciones que pertenecen a objetos incorporados se verán en su sección.

## Funciones globales comunes

JavaScript incluye varias funciones que son accesibles de forma global, sin necesidad de ser parte de un objeto en particular. Algunas de las más comunes incluyen:

### parseInt()

Convierte una cadena de texto en un número entero.

```js
let numero = parseInt("123"); // Devuelve 123
let hexadecimal = parseInt("A", 16); // Devuelve 10 (base hexadecimal)
```

### parseFloat()

Convierte una cadena de texto en un número con punto flotante.

```js
let decimal = parseFloat("3.14"); // Devuelve 3.14
```

### isNaN()

Determina si un valor es NaN ("Not a Number"), un valor especial en JavaScript que indica que algo no es numéricamente válido.

```js
let resultado = isNaN("abc"); // Devuelve true
```

### Number()

Convierte un valor a tipo número.

```js
let numero = Number("456"); // Devuelve 456
```

### eval()

Evalúa una cadena de texto como código JavaScript. Aunque esta función puede parecer poderosa, debe usarse con precaución por razones de seguridad, ya que puede ejecutar código malicioso si no se controla adecuadamente.

```js
eval("2 + 2"); // Devuelve 4
```

> [!WARNING]
> La función`eval()` es considerada "peligrosa" y no es recomendada en la mayoría de los casos por posibles riesgos de seguridad.

## Eval riesgos

### Riesgos de seguridad

`eval()` puede ejecutar cualquier código JavaScript que se le pase como argumento. Si un atacante logra inyectar código malicioso en un programa que utiliza `eval()`, esto podría comprometer seriamente la seguridad de la aplicación. Por ejemplo, si usas `eval()` con datos proporcionados por el usuario, existe el riesgo de ejecución de scripts maliciosos.

### Dificultad para depuración

El código pasado a `eval()` se evalúa en tiempo de ejecución, lo que dificulta el análisis estático del código y la depuración. Las herramientas como linters y analizadores de código no pueden identificar errores o problemas dentro del código ejecutado por `eval()`.

### Impacto en el rendimiento

`eval()` ralentiza el rendimiento de la aplicación, ya que obliga al motor JavaScript a interpretar el código dinámicamente en lugar de optimizarlo previamente. Esto significa que usar `eval()` puede impedir que el código se beneficie de optimizaciones realizadas por el motor de JavaScript.

### Alternativas disponibles

En muchos casos, el uso de `eval()` se puede evitar mediante alternativas más seguras y eficientes, como objetos JSON, funciones específicas o métodos como `Function()`, que aunque también conlleva riesgos, es más controlable que `eval()`.
