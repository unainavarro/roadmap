<h1 align="center">Objetos de eventos</h1>

<h2>📑 Contenido</h2>

- [Objetos de eventos](#objetos-de-eventos)
- [¿Qué es un objeto de evento?](#qué-es-un-objeto-de-evento)
- [Eventos de teclado](#eventos-de-teclado)
  - [Propiedades clave: key y code](#propiedades-clave-key-y-code)
- [Eventos de ratón](#eventos-de-ratón)
  - [Propiedades clave: clientX, clientY, button](#propiedades-clave-clientx-clienty-button)
- [Eventos de formulario](#eventos-de-formulario)
  - [Propiedades clave: target, type](#propiedades-clave-target-type)
- [Eventos de carga y desplazamiento](#eventos-de-carga-y-desplazamiento)
  - [Propiedades clave: window, scrollY](#propiedades-clave-window-scrolly)

## Objetos de eventos

En JavaScript, cuando ocurre un evento (como un clic del ratón, una pulsación de tecla o la carga de una página), el navegador genera un objeto de evento. Este objeto contiene información detallada sobre el evento, como el tipo de evento, el elemento que lo desencadenó y datos específicos según el tipo de evento (por ejemplo, la tecla presionada o la posición del ratón).

Los objetos de eventos son fundamentales para manejar interacciones en aplicaciones web, ya que permiten acceder a información útil para personalizar el comportamiento de la aplicación.

## ¿Qué es un objeto de evento?

Un objeto de evento es un objeto que se pasa automáticamente a la función controladora de eventos cuando ocurre un evento. Este objeto contiene propiedades y métodos que proporcionan detalles sobre el evento.

```javascript
document.addEventListener("click", (evento) => {
  console.log(evento); // Muestra el objeto de evento en la consola
});
```

En este ejemplo, el objeto evento contiene información como el tipo de evento (`click`), el elemento que lo desencadenó (`target`) y la posición del ratón (`clientX`, `clientY`).

## Eventos de teclado

Los eventos de teclado ocurren cuando el usuario presiona o suelta una tecla. Los más comunes son `keydown`, `keyup` y `keypress`.

### Propiedades clave: key y code

- **key:** Devuelve el valor de la tecla presionada (por ejemplo, `"a"`, `"Enter"`).

- **code:** Devuelve el código físico de la tecla (por ejemplo, `"KeyA"`, `"Enter"`).

```javascript
document.addEventListener("keydown", (evento) => {
  console.log(`Tecla presionada: ${evento.key}`); // Ejemplo: "a"
  console.log(`Código de tecla: ${evento.code}`); // Ejemplo: "KeyA"
});
```

## Eventos de ratón

Los eventos de ratón ocurren cuando el usuario interactúa con el mouse, como hacer clic (`click`), mover el ratón (`mousemove`) o pasar el ratón sobre un elemento (`mouseover`).

### Propiedades clave: clientX, clientY, button

- **clientX y clientY:** Coordenadas del ratón en relación con la ventana del navegador.

- **button:** Indica qué botón del ratón se presionó (0: izquierdo, 1: central, 2: derecho).

```javascript
document.addEventListener("mousemove", (evento) => {
  console.log(`Posición del ratón: X=${evento.clientX}, Y=${evento.clientY}`);
});

document.addEventListener("click", (evento) => {
  if (evento.button === 0) {
    console.log("Botón izquierdo presionado");
  } else if (evento.button === 2) {
    console.log("Botón derecho presionado");
  }
});
```

## Eventos de formulario

Los eventos de formulario ocurren cuando el usuario interactúa con elementos de un formulario, como hacer clic en un campo (`focus`), salir de un campo (`blur`) o enviar el formulario (`submit`).

### Propiedades clave: target, type

- **target:** El elemento que desencadenó el evento.

- **type:** El tipo de evento (por ejemplo, "`focus`", "`blur`").

```javascript
const input = document.getElementById("miInput");

input.addEventListener("focus", (evento) => {
  console.log(`Campo enfocado: ${evento.target.id}`);
});

input.addEventListener("blur", (evento) => {
  console.log(`Campo perdido: ${evento.target.id}`);
});
```

## Eventos de carga y desplazamiento

Los eventos de carga y desplazamiento ocurren cuando la página se carga completamente (`load`) o cuando el usuario se desplaza por la página (`scroll`).

### Propiedades clave: window, scrollY

- **window:** Representa la ventana del navegador.

- **scrollY:** La cantidad de píxeles que se ha desplazado verticalmente la página.

```javascript
window.addEventListener("load", () => {
  console.log("La página ha terminado de cargarse");
});

window.addEventListener("scroll", () => {
  console.log(`Desplazamiento vertical: ${window.scrollY}px`);
});
```
