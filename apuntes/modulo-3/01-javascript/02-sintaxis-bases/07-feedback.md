<h1 align='center'>Feedback básicos</h1>

<h2>📑 Contenido</h2>

- [Feedback básicos](#feedback-básicos)
- [La consola del navegador](#la-consola-del-navegador)
  - [console.log()](#consolelog)
  - [console.info()](#consoleinfo)
  - [console.warn()](#consolewarn)
  - [console.error()](#consoleerror)
  - [console.table()](#consoletable)
  - [console.clear()](#consoleclear)
  - [console.time() y console.timeEnd()](#consoletime-y-consoletimeend)
  - [console.group() y console.groupEnd()](#consolegroup-y-consolegroupend)
- [Alertas y cuadros de diálogo del navegador](#alertas-y-cuadros-de-diálogo-del-navegador)
  - [alert()](#alert)
  - [prompt()](#prompt)
  - [confirm()](#confirm)

## Feedback básicos

En este capítulo, exploraremos los principales mecanismos para generar salidas o entradas en JavaScript, los cuales nos permiten mostrar mensajes, obtener datos del usuario o comunicar el estado de la ejecución de nuestro programa. Esto incluye métodos comunes como console.log, alert, prompt, confirm y otras funciones útiles que te ayudarán a interactuar con el usuario y depurar tu código.

## La consola del navegador

La consola del navegador es una herramienta indispensable para desarrolladores, ya que permite enviar mensajes de depuración, advertencias, errores, e información general durante la ejecución de un programa. JavaScript proporciona varios métodos dentro del objeto `console` que facilitan la visualización de diferentes tipos de mensajes.

### console.log()

El método más común de la consola es `console.log()`, que se utiliza para imprimir mensajes generales o valores de variables en la consola. Es muy útil para inspeccionar el estado del programa en distintos puntos de la ejecución

```js
let nombre = "Juan";
console.log(nombre); // Output: Juan
```

### console.info()

El método `console.info()` se utiliza para imprimir mensajes informativos. Aunque en muchos navegadores se comporta igual que console.log(), está diseñado para señalar información útil, como el estado de un proceso.

```js
console.info("El proceso ha comenzado correctamente.");
```

### console.warn()

El método `console.warn()` se utiliza para emitir advertencias. Los navegadores suelen mostrar estos mensajes en la consola con un ícono de advertencia amarillo para resaltar que algo podría no estar funcionando como se esperaba, pero no detendrá la ejecución del programa.

```js
console.warn(
  "El valor ingresado no es válido, utilizando el valor por defecto."
);
```

### console.error()

`console.error()` se utiliza para mostrar errores en la consola. Estos errores suelen estar resaltados en rojo y son útiles para señalar fallos graves en el código.

```js
console.error("Error al cargar el archivo.");
```

### console.table()

Muestra un conjunto de datos en formato de tabla, lo cual es útil para visualizar arrays y objetos con claridad.

```js
// El ejemplo usa un array de objetos, se vera más adelante.
let usuarios = [
  { nombre: "Juan", edad: 25 },
  { nombre: "Ana", edad: 30 },
  { nombre: "Pedro", edad: 35 },
];
console.table(usuarios);
```

### console.clear()

El método `console.clear()` se utiliza para limpiar la consola, eliminando todos los mensajes previos. Es útil cuando deseas eliminar el historial de mensajes de la consola antes de realizar nuevas pruebas.

```js
console.clear();
```

### console.time() y console.timeEnd()

Estos métodos sirven para medir el tiempo que tarda en ejecutarse una porción de código.

```js
console.time("tiempoDeEjecucion");
// Código cuya duración deseas medir
for (let i = 0; i < 100000; i++) {}
console.timeEnd("tiempoDeEjecucion");
```

### console.group() y console.groupEnd()

Organizan los mensajes en grupos, facilitando la visualización de datos agrupados.

```js
console.group("Detalles del usuario");
console.log("Nombre: Juan");
console.log("Edad: 25");
console.groupEnd();
```

## Alertas y cuadros de diálogo del navegador

Además de los métodos de consola, JavaScript ofrece cuadros de diálogo para interactuar directamente con los usuarios. Estas ventanas emergentes son útiles para mostrar mensajes, solicitar datos o confirmar acciones.

### alert()

El método `alert()` genera una ventana emergente con un mensaje. El usuario debe hacer clic en "Aceptar" para cerrarla. Este método se usa principalmente para mostrar mensajes simples.

```js
alert("Bienvenido a la página web.");
```

### prompt()

El método `prompt()` muestra una ventana emergente que permite al usuario ingresar un valor. El valor ingresado se devuelve como una cadena (string), o `null` si el usuario cancela la operación.

```js
let nombre = prompt("¿Cuál es tu nombre?");
console.log("Hola, " + nombre);
```

### confirm()

El método `confirm()` muestra una ventana emergente con un mensaje y dos botones: Aceptar y Cancelar. Devuelve `true` si el usuario hace clic en "Aceptar" y `false` si hace clic en "Cancelar". Se utiliza para confirmar una acción

```js
let respuesta = confirm("¿Estás seguro de que quieres eliminar este archivo?");
if (respuesta) {
  console.log("Archivo eliminado.");
} else {
  console.log("Eliminación cancelada.");
}
```
