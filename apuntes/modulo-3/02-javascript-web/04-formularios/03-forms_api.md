<h1 align="center">Forms API</h1>

<h2>📑 Contenido</h2>

- [Forms API](#forms-api)
- [Acceder y manipular elementos de formularios](#acceder-y-manipular-elementos-de-formularios)
- [Enviar y resetear formularios programáticamente](#enviar-y-resetear-formularios-programáticamente)
  - [Enviar un formulario programáticamente](#enviar-un-formulario-programáticamente)
  - [Enviar un formulario programáticamente](#enviar-un-formulario-programáticamente-1)
  - [Ejemplo: enviar y resetear un formulario](#ejemplo-enviar-y-resetear-un-formulario)
- [Ejemplos prácticos de uso de la Forms API](#ejemplos-prácticos-de-uso-de-la-forms-api)
  - [Ejemplo 1: validación en tiempo real](#ejemplo-1-validación-en-tiempo-real)
  - [Ejemplo 2: agregar campos dinámicamente](#ejemplo-2-agregar-campos-dinámicamente)

## Forms API

La Forms API es una interfaz que nos permite acceder y manipular formularios y sus elementos directamente desde JavaScript. Con esta API, podemos realizar tareas como validar campos, enviar o resetear formularios, y acceder a los datos de los campos de manera sencilla.

La API está integrada en el objeto document y se puede acceder a los formularios a través de propiedades como document.forms o métodos como `document.getElementById`.

## Acceder y manipular elementos de formularios

Para acceder a un formulario y sus elementos, podemos usar el objeto document.forms, que devuelve una colección de todos los formularios en el documento. También podemos acceder a los elementos de un formulario utilizando la propiedad elements.

```html
<form id="miFormulario">
  <label for="nombre">Nombre:</label>
  <input type="text" id="nombre" name="nombre" />

  <label for="email">Correo electrónico:</label>
  <input type="email" id="email" name="email" />

  <button type="submit">Enviar</button>
</form>
```

```javascript
// Acceder al formulario
const formulario = document.forms["miFormulario"];

// Acceder a los elementos del formulario
const nombre = formulario.elements.nombre;
const email = formulario.elements.email;

// Manipular los valores de los campos
nombre.value = "Juan Pérez";
email.value = "juan@example.com";

console.log(nombre.value); // Juan Pérez
console.log(email.value); // juan@example.com
```

En este ejemplo, accedemos al formulario y sus elementos utilizando `document.forms` y `formulario.elements`. Luego, manipulamos los valores de los campos directamente desde JavaScript.

## Enviar y resetear formularios programáticamente

La Forms API nos permite enviar y resetear formularios de manera programática, lo que es útil en situaciones donde necesitamos controlar el flujo de envío o reiniciar los campos del formulario.

### Enviar un formulario programáticamente

Este método envía el formulario como si el usuario hubiera hecho clic en el botón de envío.

```javascript
formulario.submit();
```

### Enviar un formulario programáticamente

Este método restablece todos los campos del formulario a sus valores iniciales.

```javascript
formulario.reset();
```

### Ejemplo: enviar y resetear un formulario

```javascript
// Enviar el formulario después de 5 segundos
setTimeout(() => {
  formulario.submit();
}, 5000);

// Resetear el formulario después de 10 segundos
setTimeout(() => {
  formulario.reset();
}, 10000);
```

En este ejemplo, el formulario se envía automáticamente después de 5 segundos y se resetea después de 10 segundos.

## Ejemplos prácticos de uso de la Forms API

### Ejemplo 1: validación en tiempo real

Podemos usar el evento input para validar los campos en tiempo real.

```javascript
const nombre = formulario.elements.nombre;

nombre.addEventListener("input", function () {
  if (nombre.validity.valid) {
    mensajeError.textContent = "";
  } else {
    mensajeError.textContent = "El nombre es requerido.";
  }
});
```

### Ejemplo 2: agregar campos dinámicamente

Podemos usar la Forms API para agregar campos dinámicamente a un formulario.

```javascript
const botonAgregar = document.createElement("button");
botonAgregar.textContent = "Agregar campo";

botonAgregar.addEventListener("click", function () {
  const nuevoCampo = document.createElement("input");
  nuevoCampo.type = "text";
  nuevoCampo.placeholder = "Nuevo campo";
  formulario.appendChild(nuevoCampo);
});

document.body.appendChild(botonAgregar);
```
