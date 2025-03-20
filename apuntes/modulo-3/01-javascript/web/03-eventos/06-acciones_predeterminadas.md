<h1 align="center">Acciones predeterminadas</h1>

<h2>📑 Contenido</h2>

- [Acciones predeterminadas](#acciones-predeterminadas)
- [¿Qué son las acciones predeterminadas?](#qué-son-las-acciones-predeterminadas)
- [El método preventDefault()](#el-método-preventdefault)
- [Ejemplos prácticos](#ejemplos-prácticos)
  - [Ejemplo1: evitar que un enlace redirija al hacer clic](#ejemplo1-evitar-que-un-enlace-redirija-al-hacer-clic)
  - [Ejemplo2: interceptar el envío de un formulario para validación personalizada](#ejemplo2-interceptar-el-envío-de-un-formulario-para-validación-personalizada)

## Acciones predeterminadas

En el desarrollo web, muchos elementos HTML tienen acciones predeterminadas asociadas a ciertos eventos. Por ejemplo, un enlace (`<a>`) redirige a una nueva página cuando se hace clic, o un formulario (`<form>`) se envía cuando se presiona el botón de envío. Estas acciones son comportamientos integrados en el navegador, pero a veces es necesario personalizarlos o evitarlos.

## ¿Qué son las acciones predeterminadas?

Las acciones predeterminadas son comportamientos automáticos que el navegador ejecuta cuando ocurre un evento en un elemento HTML. Algunos ejemplos comunes incluyen:

- **Enlaces:** Redirigir a una nueva URL al hacer clic.

- **Formularios:** Enviar datos al servidor al presionar el botón de envío.

- **Teclado:** Insertar un carácter en un campo de texto al presionar una tecla.

Estas acciones son útiles en muchos casos, pero a veces es necesario evitarlas para implementar comportamientos personalizados.

## El método preventDefault()

El método `preventDefault()` es una función del objeto de evento (`event`) que permite evitar la acción predeterminada asociada a un evento. Esto es útil cuando deseas personalizar el comportamiento de un elemento o realizar acciones adicionales antes de permitir que ocurra la acción predeterminada.

```javascript
evento.preventDefault();
```

## Ejemplos prácticos

### Ejemplo1: evitar que un enlace redirija al hacer clic

Supongamos que tienes un enlace, pero no deseas que redirija a una nueva página. En su lugar, quieres mostrar un mensaje en la consola.

```html
<a id="miEnlace" href="https://www.ejemplo.com">Haz clic aquí</a>
```

```javascript
document.getElementById("miEnlace").addEventListener("click", (evento) => {
  evento.preventDefault(); // Evita la redirección
  console.log("Enlace clickeado, pero no se redirigió.");
});
```

Al hacer clic en el enlace, no se redirigirá a la URL, y en su lugar se mostrará el mensaje en la consola.

---

### Ejemplo2: interceptar el envío de un formulario para validación personalizada

Supongamos que tienes un formulario y deseas validar los datos antes de enviarlos. Si la validación falla, evitas el envío del formulario.

```html
<form id="miFormulario">
  <label for="nombre">Nombre:</label>
  <input type="text" id="nombre" name="nombre" required />
  <button type="submit">Enviar</button>
</form>
```

```javascript
document.getElementById("miFormulario").addEventListener("submit", (evento) => {
  const nombre = document.getElementById("nombre").value;

  if (nombre.trim() === "") {
    evento.preventDefault(); // Evita el envío del formulario
    console.log("El campo 'Nombre' no puede estar vacío.");
  } else {
    console.log("Formulario enviado correctamente.");
  }
});
```

Si el campo "Nombre" está vacío, el formulario no se enviará, y se mostrará un mensaje en la consola.
