<h1 align='center'>Funciones autoejecutadas (IIFE)</h1>

<h2>📑 Contenido</h2>

- [Funciones autoejecutadas (IIFE)](#funciones-autoejecutadas-iife)
- [¿Qué es una IIFE?](#qué-es-una-iife)
- [¿Por qué usar una IIFE?](#por-qué-usar-una-iife)
- [Variaciones de la IIFE](#variaciones-de-la-iife)
  - [IIFE con función anónima (la más común)](#iife-con-función-anónima-la-más-común)
  - [IIFE con función nombrada](#iife-con-función-nombrada)
  - [IIFE con parámetros](#iife-con-parámetros)
  - [IIFE moderna](#iife-moderna)

## Funciones autoejecutadas (IIFE)

Una IIFE (Immediately Invoked Function Expression) es una función en JavaScript que se ejecuta inmediatamente después de ser definida. Esta técnica es muy útil para evitar la contaminación del ámbito global y es común en situaciones donde se desea crear un ámbito privado. Las IIFE eran ampliamente utilizadas antes de la introducción de los módulos en ES6, pero siguen siendo una herramienta útil en muchas situaciones.

## ¿Qué es una IIFE?

Una IIFE es una función que se define y se invoca inmediatamente después de su declaración. Se utiliza para crear un ámbito local en el que se pueden definir variables sin afectar el ámbito global o el ámbito en el que se encuentra la función.

```js
(function () {
  console.log("Esta función se ejecuta inmediatamente");
})();
```

Esta estructura puede parecer algo inusual al principio, ya que combina la definición de una función anónima con su invocación inmediata. El primer par de paréntesis (`function() {...})` define la función, mientras que el segundo par `()` la invoca inmediatamente.

Este código define una función que imprime un mensaje en la consola y la ejecuta inmediatamente, sin necesidad de ser llamada explícitamente más tarde.

## ¿Por qué usar una IIFE?

La razón principal para usar una IIFE es encapsular código y evitar la contaminación del ámbito global. En JavaScript, todas las variables definidas en el ámbito global están disponibles en cualquier parte del código, lo que puede causar conflictos de nombres y errores inesperados. Al encapsular el código dentro de una IIFE, puedes evitar que las variables definidas dentro interfieran con otras partes del programa.

- **Evitar la contaminación del ámbito global:** Las variables y funciones dentro de una IIFE están aisladas del resto del código.
- **Crear ámbitos locales:** Se puede utilizar una IIFE para crear un ámbito en el que se definan variables temporales sin que persistan más allá de la función.
- **Mejora en la modularidad:** Permite organizar el código en pequeños bloques autoejecutables y autocontenidos.

```js
// Ejemplo de encapsulación:
(function () {
  var mensaje = "Hola, solo existo dentro de esta IIFE";
  console.log(mensaje); // "Hola, solo existo dentro de esta IIFE"
})();

console.log(mensaje); // Error: mensaje is not defined
```

En este ejemplo, la variable mensaje solo existe dentro de la IIFE, por lo que no está disponible fuera de ella.

## Variaciones de la IIFE

Existen varias formas de escribir una IIFE. Aunque el patrón más común utiliza una función anónima, también puedes utilizar funciones nombradas o añadir parámetros a la IIFE.

### IIFE con función anónima (la más común)

```js
(function () {
  console.log("IIFE con función anónima");
})();
```

### IIFE con función nombrada

```js
(function miFuncion() {
  console.log("IIFE con función nombrada");
})();
```

Aunque la función tiene un nombre (miFuncion), no es accesible fuera de la IIFE, ya que solo existe dentro de su propio ámbito.

### IIFE con parámetros

```js
(function (nombre) {
  console.log("Hola, " + nombre);
})("Juan");
```

En este ejemplo, el valor "Juan" se pasa como argumento a la IIFE, y la función lo utiliza para imprimir un mensaje personalizado.

### IIFE moderna

```js
(() => {
  const nombre = "JavaScript Moderno";
  console.log(nombre);
})();
```
