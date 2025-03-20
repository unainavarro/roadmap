<h1 align='center'>Error</h1>

<h2>📑 Contenido</h2>

- [Error](#error)
- [El objeto error](#el-objeto-error)
- [Propiedades de instancia](#propiedades-de-instancia)
  - [message](#message)
  - [name](#name)
  - [stack](#stack)
- [Propiedades estáticas (constructores de subclases)](#propiedades-estáticas-constructores-de-subclases)
  - [Error.prototype](#errorprototype)
  - [EvalError](#evalerror)
  - [RangeError](#rangeerror)
  - [ReferenceError](#referenceerror)
  - [SyntaxError](#syntaxerror)
  - [TypeError](#typeerror)
  - [URIError](#urierror)
  - [Creación de errores personalizados](#creación-de-errores-personalizados)

## Error

El manejo de errores es una parte fundamental del desarrollo de software, y JavaScript proporciona una estructura poderosa a través del objeto `Error` para manejar excepciones y reportar problemas en el código.

## El objeto error

El objeto `Error` en JavaScript es el mecanismo principal para manejar y crear errores. Se utiliza para representar un error cuando ocurre una excepción en el código y puede ser lanzado (`throw`) y capturado (`catch`) usando el bloque `try...catch`. La creación de una instancia de Error se hace de la siguiente manera:

```js
let error = new Error("Este es un mensaje de error");
throw error;
```

## Propiedades de instancia

Las instancias de `Error` en JavaScript tienen varias propiedades que describen el error de manera más detallada. Las tres principales son:

### message

Esta propiedad contiene el mensaje de error. Se asigna cuando se crea el error y puede ser personalizada para proporcionar información útil sobre lo que ha salido mal.

```js
let error = new Error("Algo salió mal");
console.log(error.message); // Imprime: "Algo salió mal"
```

### name

La propiedad `name` representa el tipo o nombre del error. Por defecto, es "`Error`", pero las subclases del objeto `Error` (como `TypeError` o `SyntaxError`) pueden sobrescribir este valor.

```js
let error = new Error("Error genérico");
console.log(error.name); // Imprime: "Error"
```

### stack

La propiedad `stack` es una cadena que contiene el rastreo de la pila (`stack trace`), lo que muestra el punto exacto en el código donde ocurrió el error y las funciones que estaban siendo llamadas en ese momento. Esta propiedad es muy útil para depurar.

```js
try {
  throw new Error("Error en el código");
} catch (e) {
  console.log(e.stack); // Imprime el rastreo de la pila
}
```

## Propiedades estáticas (constructores de subclases)

El objeto `Error` cuenta con varias subclases que son específicas para diferentes tipos de errores. Cada una de estas subclases es utilizada para representar un tipo particular de error que puede ocurrir en diferentes situaciones de un programa. Las más comunes son:

### Error.prototype

El prototipo del objeto `Error`. Proporciona la estructura base para todos los errores. Cuando creas una instancia de un error personalizado o una subclase, heredan de este prototipo.

```js
let error = new Error();
console.log(Error.prototype); // Imprime el prototipo de Error
```

### EvalError

Indica un error relacionado con la función `eval()`. Aunque rara vez se usa, está definida para mantener la compatibilidad con versiones anteriores.

```js
let error = new EvalError("Uso incorrecto de eval");
throw error;
```

### RangeError

Este error ocurre cuando un valor está fuera del rango esperado, como al intentar acceder a un índice de array fuera de sus límites o usar un número que no está dentro del rango permitido.

```js
let error = new RangeError("Valor fuera de rango");
throw error;
```

### ReferenceError

Indica que se está tratando de acceder a una variable que no está definida o que no está en el alcance correcto.

```js
try {
  console.log(x); // Variable no definida
} catch (e) {
  console.log(e instanceof ReferenceError); // Imprime: true
}
```

### SyntaxError

Este error se lanza cuando hay un error de sintaxis en el código JavaScript, por ejemplo, un paréntesis mal colocado o un carácter inesperado en el código fuente.

```js
try {
  eval("if true"); // Error de sintaxis
} catch (e) {
  console.log(e instanceof SyntaxError); // Imprime: true
}
```

### TypeError

Indica que se ha intentado realizar una operación en un tipo de datos inadecuado. Por ejemplo, llamar a un valor que no es una función o acceder a una propiedad de `undefined`.

```js
try {
  let obj;
  obj.prop = "test"; // Error: no se puede leer la propiedad de undefined
} catch (e) {
  console.log(e instanceof TypeError); // Imprime: true
}
```

### URIError

Un `URIError` ocurre cuando hay un problema con las funciones relacionadas con URIs (como `decodeURIComponent()` o `encodeURIComponent()`) si reciben un argumento que no puede ser interpretado correctamente.

```js
try {
  decodeURIComponent("%"); // URI mal formado
} catch (e) {
  console.log(e instanceof URIError); // Imprime: true
}
```

### Creación de errores personalizados

Además de los errores integrados, también puedes crear tus propios errores personalizados usando la clase `Error` como base. Esto es útil cuando necesitas arrojar errores específicos en tus aplicaciones.

Ejemplo de un error personalizado:

```js
class MiErrorPersonalizado extends Error {
  constructor(mensaje) {
    super(mensaje);
    this.name = "MiErrorPersonalizado";
  }
}

try {
  throw new MiErrorPersonalizado("Este es un error personalizado");
} catch (e) {
  console.log(e.name); // Imprime: "MiErrorPersonalizado"
  console.log(e.message); // Imprime: "Este es un error personalizado"
}
```
