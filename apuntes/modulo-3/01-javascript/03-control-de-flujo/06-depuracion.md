<h1 align='center'>Depuración</h1>

<h2>📑 Contenido</h2>

- [Depuración](#depuración)
- [Introducción a la depuración](#introducción-a-la-depuración)
- [Tipos de errores en JavaScript](#tipos-de-errores-en-javascript)
  - [Errores de sintaxis](#errores-de-sintaxis)
  - [Errores en tiempo de ejecución](#errores-en-tiempo-de-ejecución)
  - [Errores lógicos](#errores-lógicos)
- [Depuración con console.log()](#depuración-con-consolelog)
- [Uso del debugger](#uso-del-debugger)
- [Herramientas de desarrollo del navegador (devtools)](#herramientas-de-desarrollo-del-navegador-devtools)
  - [Acceso a las devtools](#acceso-a-las-devtools)
  - [Uso de breakpoints](#uso-de-breakpoints)
  - [Ejecución paso a paso](#ejecución-paso-a-paso)
- [Uso de linters para detectar errores](#uso-de-linters-para-detectar-errores)
- [Buenas prácticas](#buenas-prácticas)

## Depuración

La depuración es una parte fundamental del ciclo de desarrollo de software. Incluso los programadores más experimentados cometen errores, y es ahí donde entra en juego el proceso de depuración. En JavaScript, la depuración te permite identificar, entender y corregir los errores que ocurren en tu código. Ya sea que estés desarrollando aplicaciones pequeñas o grandes proyectos, tener una buena estrategia de depuración es esencial para asegurarte de que tu código funcione correctamente.

En este capítulo, exploraremos las técnicas más comunes de depuración en JavaScript, incluidas las herramientas, estrategias y mejores prácticas para rastrear errores y mejorar la calidad de tu código.

## Introducción a la depuración

Cuando escribes código, pueden surgir errores (bugs) que afectan su funcionalidad. Estos errores pueden ser tanto sintácticos (por ejemplo, olvidarte de cerrar un paréntesis) como lógicos (cuando tu código no produce el resultado esperado). Depurar consiste en encontrar estos errores, entender por qué ocurren y corregirlos.

En JavaScript, la depuración suele involucrar:

- **Identificar errores:** Detectar el momento y el lugar en que el código falla.
- **Examinar el estado:** Verificar el estado de las variables y cómo el código se está ejecutando.
- **Corregir:** Implementar cambios en el código para resolver el problema.

## Tipos de errores en JavaScript

Antes de comenzar a depurar, es importante conocer los tipos de errores más comunes que puedes encontrar en JavaScript:

### Errores de sintaxis

Son errores que ocurren cuando el código no está escrito correctamente. Por ejemplo, olvidar un punto y coma o un paréntesis. Estos errores evitan que el programa se ejecute.

```js
console.log("Hola mundo" // Falta cerrar el paréntesis
```

### Errores en tiempo de ejecución

Ocurren cuando el código es sintácticamente correcto pero algo falla durante su ejecución. Esto podría ser debido a que una variable no está definida o un objeto no tiene la propiedad que intentas acceder.

```js
console.log(variableNoDefinida); // Error en tiempo de ejecución
```

### Errores lógicos

Son los más difíciles de detectar, ya que el código puede ejecutarse sin generar ningún error visible, pero no produce el resultado correcto. Suele ocurrir cuando la lógica de un algoritmo o una operación matemática está mal planteada.

```js
let a = 5;
let b = 10;
let suma = a - b; // Error lógico: Debe ser una suma, no una resta
```

## Depuración con console.log()

Una de las formas más sencillas y comunes de depurar en JavaScript es usando la función `console.log()`. Esta función imprime mensajes en la Consola del navegador o en la terminal, permitiendo ver el valor de variables o mensajes a medida que el programa se ejecuta.

```js
let objeto = { nombre: "Juan", edad: 25 };
console.log(objeto); // Imprime el objeto completo
console.table(objeto); // Muestra el objeto en forma de tabla
console.log("Valor en %s: %d", "x", x); // Usa placeholders en las cadenas
```

El uso de `console.log()` te permite rastrear el valor de una variable en distintos puntos del código y detectar posibles discrepancias. Aunque es una técnica simple, puede ser muy poderosa cuando se aplica correctamente.

## Uso del debugger

JavaScript proporciona una palabra clave especial llamada `debugger` que te permite pausar la ejecución del programa en un punto específico y abrir herramientas de depuración. Es una forma manual de indicar a JavaScript dónde quieres detener el código para inspeccionar su estado.

```js
let a = 5;
let b = 10;

debugger; // Pausa aquí la ejecución

let suma = a + b;
console.log(suma);
```

Cuando el navegador encuentra la instrucción `debugger`, detiene la ejecución y abre las Herramientas de Desarrollo del navegador, específicamente en la pestaña Sources (Fuentes) donde podrás ver el código y examinar el valor de las variables, la pila de llamadas (call stack), y mucho más.

El `debugger` es útil cuando quieres detener la ejecución de tu programa sin tener que colocar muchos `console.log()` dispersos por el código. Puedes inspeccionar los valores de las variables en tiempo real y ver cómo está fluyendo tu programa.

## Herramientas de desarrollo del navegador (devtools)

La mayoría de los navegadores modernos, como Google Chrome, Firefox y Microsoft Edge, tienen potentes herramientas de desarrollo integradas que permiten realizar una depuración avanzada.

### Acceso a las devtools

En Chrome, puedes abrir las herramientas de desarrollo presionando `Ctrl + Shift + I` (en Windows) o `Cmd + Option + I` (en macOS), o haciendo clic derecho en la página y seleccionando "Inspeccionar". Una vez dentro, verás varias pestañas, pero para la depuración de JavaScript nos enfocaremos en:

- **Consola:** Muestra mensajes, advertencias y errores. También puedes ejecutar comandos de JavaScript directamente en esta pestaña.
- **Sources (Fuentes):** Aquí puedes ver, navegar y depurar tu código JavaScript. Permite agregar `breakpoints` (puntos de interrupción) y examinar el estado de la aplicación mientras se ejecuta.

### Uso de breakpoints

Los puntos de interrupción o `breakpoints` son puntos en tu código donde decides detener la ejecución para inspeccionar el estado de tu programa. Esto te permite seguir la ejecución paso a paso y ver qué ocurre en cada línea de código.

1. Abre las DevTools y ve a la pestaña Sources.
1. Busca el archivo JavaScript que quieres depurar.
1. Haz clic en el número de línea en la parte izquierda para establecer un breakpoint.
1. Cuando el programa llegue a esa línea, se detendrá, permitiéndote inspeccionar las variables y su estado.

### Ejecución paso a paso

Una vez que se detiene en un breakpoint, puedes:

- **Step Over (F10):** Ejecuta la siguiente línea de código.
- **Step Into (F11):** Entra en la ejecución de una función llamada en esa línea.
- **Step Out (Shift + F11):** Sale de la función actual.

## Uso de linters para detectar errores

Los linters son herramientas que analizan tu código fuente y detectan problemas o posibles errores antes de que el código se ejecute. Uno de los linters más utilizados en JavaScript es `ESLint`.

`ESLint` revisa el código en busca de errores comunes, problemas de sintaxis y adherencia a buenas prácticas. Puedes configurarlo en tu proyecto para recibir advertencias y errores antes de ejecutar el código, lo que te ahorra tiempo en el proceso de depuración.

```js
let x = 10;
console.log(z); // Error: 'z' is not defined
```

Un linter podría advertirte que `z` no está definido antes de que intentes ejecutar el código y te enfrentes a un error en tiempo de ejecución.

## Buenas prácticas

- **Divide y vencerás:** Si tienes un bloque grande de código que no funciona, intenta aislar partes pequeñas y depurar de manera incremental.
- **Comentarios estratégicos:** Comenta temporalmente secciones de código para ver si el problema está en una parte específica.
- **Simplicidad:** Simplifica el problema antes de comenzar a depurar. A menudo, los errores lógicos provienen de una sobrecomplicación del código.
- **Revisar la consola:** Asegúrate siempre de revisar la consola del navegador, ya que los errores y advertencias a menudo se registran ahí.
- **Depuración incremental:** Cuando trabajes en una nueva funcionalidad, prueba y depura pequeñas partes a medida que avanzas, en lugar de intentar depurar todo al final.
