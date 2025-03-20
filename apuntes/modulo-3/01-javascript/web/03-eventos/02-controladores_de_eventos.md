<h1 align="center">Controladores de eventos</h1>

<h2>📑 Contenido</h2>

- [Controladores de eventos](#controladores-de-eventos)
- [¿Qué son los controladores de eventos?](#qué-son-los-controladores-de-eventos)
- [Registrar eventos con addEventListener](#registrar-eventos-con-addeventlistener)
- [Eliminar eventos con removeEventListener](#eliminar-eventos-con-removeeventlistener)
- [Caso práctico: agregar y eliminar eventos dinámicamente](#caso-práctico-agregar-y-eliminar-eventos-dinámicamente)

## Controladores de eventos

En JavaScript, los controladores de eventos son funciones que se ejecutan en respuesta a un evento específico, como un clic del mouse, una pulsación de tecla o la carga de una página. Estos controladores permiten que las aplicaciones web respondan a las interacciones del usuario, haciendo que las páginas sean dinámicas e interactivas.

## ¿Qué son los controladores de eventos?

Un controlador de eventos es una función que se asocia a un evento específico en un elemento del DOM (Document Object Model). Cuando ocurre el evento, la función se ejecuta automáticamente. Por ejemplo, si un usuario hace clic en un botón, puedes usar un controlador de eventos para mostrar un mensaje o realizar una acción.

## Registrar eventos con addEventListener

El método `addEventListener` es la forma recomendada de registrar eventos en JavaScript. Permite asociar un controlador de eventos a un elemento específico y es más flexible que los atributos HTML como `onclick` o `onkeydown`.

Sintaxis:

```javascript
elemento.addEventListener(evento, controlador, opciones);
```

- **evento:** El tipo de evento que deseas escuchar (por ejemplo, "click", "keydown").

- **controlador:** La función que se ejecutará cuando ocurra el evento.

- **opciones:** (Opcional) Un objeto que especifica opciones adicionales, como once para ejecutar el evento solo una vez.

```javascript
const boton = document.getElementById("miBoton");

boton.addEventListener("click", () => {
  console.log("¡Botón clickeado!");
});
```

## Eliminar eventos con removeEventListener

Para eliminar un controlador de eventos previamente registrado, puedes usar el método `removeEventListener`. Es importante que la función que se pasa a `removeEventListener` sea la misma que se usó en `addEventListener`.

```javascript
function manejarClic() {
  console.log("¡Botón clickeado!");
}

const boton = document.getElementById("miBoton");

// Registrar el evento
boton.addEventListener("click", manejarClic);

// Eliminar el evento después de 5 segundos
setTimeout(() => {
  boton.removeEventListener("click", manejarClic);
  console.log("Evento de clic eliminado.");
}, 5000);
```

## Caso práctico: agregar y eliminar eventos dinámicamente

HTML

```html
<div
  id="miDiv"
  style="width: 200px; height: 200px; background-color: lightblue;"
></div>
<button id="toggleEvent">Alternar Evento</button>
```

JS

```javascript
const div = document.getElementById("miDiv");
const botonToggle = document.getElementById("toggleEvent");

let eventoActivo = false;

function cambiarColor() {
  const colores = ["lightblue", "lightgreen", "lightcoral"];
  const colorActual = div.style.backgroundColor;
  const nuevoColor =
    colores.find((color) => color !== colorActual) || colores[0];
  div.style.backgroundColor = nuevoColor;
}

function alternarEvento() {
  if (eventoActivo) {
    div.removeEventListener("click", cambiarColor);
    botonToggle.textContent = "Activar Evento";
    eventoActivo = false;
  } else {
    div.addEventListener("click", cambiarColor);
    botonToggle.textContent = "Desactivar Evento";
    eventoActivo = true;
  }
}

// Registrar el evento en el botón de alternar
botonToggle.addEventListener("click", alternarEvento);
```

- **Div interactivo:** Al hacer clic en el div, su color de fondo cambia.

- **Botón de alternar:** El botón permite activar o desactivar el evento de clic en el div.

- **Uso de addEventListener y removeEventListener:** El evento se agrega o elimina dinámicamente según el estado actual.
