<h1 align="center">Propagación</h1>

<h2>📑 Contenido</h2>

- [Propagación](#propagación)
- [¿Qué es la propagación de eventos?](#qué-es-la-propagación-de-eventos)
- [Modelos de propagación](#modelos-de-propagación)
  - [Bubbling (propagación hacia arriba)](#bubbling-propagación-hacia-arriba)
  - [Capturing (propagación hacia abajo)](#capturing-propagación-hacia-abajo)
- [Controlar la propagación con stopPropagation()](#controlar-la-propagación-con-stoppropagation)
- [Ejemplo práctico: propagación en elementos anidados](#ejemplo-práctico-propagación-en-elementos-anidados)

## Propagación

En JavaScript, la propagación de eventos es un mecanismo que define cómo los eventos se propagan a través del DOM (Document Object Model) cuando ocurren en un elemento. Este proceso es fundamental para entender cómo los eventos se manejan en elementos anidados y cómo podemos controlar su comportamiento.

## ¿Qué es la propagación de eventos?

Cuando ocurre un evento en un elemento del DOM (por ejemplo, un clic en un botón), el evento no solo afecta a ese elemento, sino que también se propaga a sus elementos ancestros (en el caso de bubbling) o desciende desde el elemento raíz hasta el objetivo (en el caso de capturing). Este proceso se conoce como propagación de eventos.

## Modelos de propagación

Existen dos modelos principales de propagación de eventos:

### Bubbling (propagación hacia arriba)

En el modelo bubbling, el evento comienza en el elemento objetivo (donde ocurrió el evento) y luego se propaga hacia arriba a través de sus ancestros en el DOM. Este es el comportamiento predeterminado en la mayoría de los eventos.

```html
<div id="abuelo">
  <div id="padre">
    <div id="hijo">Haz clic aquí</div>
  </div>
</div>
```

```javascript
document.getElementById("abuelo").addEventListener("click", () => {
  console.log("Clic en el abuelo");
});

document.getElementById("padre").addEventListener("click", () => {
  console.log("Clic en el padre");
});

document.getElementById("hijo").addEventListener("click", () => {
  console.log("Clic en el hijo");
});

/*
Si haces clic en el elemento hijo, la salida en la consola será:
Clic en el hijo
Clic en el padre
Clic en el abuelo
*/
```

### Capturing (propagación hacia abajo)

En el modelo capturing, el evento comienza en el elemento raíz y desciende hasta el elemento objetivo. Para usar este modelo, debes pasar un tercer parámetro `true` a `addEventListener`.

```html
<div id="abuelo">
  <div id="padre">
    <div id="hijo">Haz clic aquí</div>
  </div>
</div>
```

```javascript
document.getElementById("abuelo").addEventListener(
  "click",
  () => {
    console.log("Clic en el abuelo (capturing)");
  },
  true
);

document.getElementById("padre").addEventListener(
  "click",
  () => {
    console.log("Clic en el padre (capturing)");
  },
  true
);

document.getElementById("hijo").addEventListener(
  "click",
  () => {
    console.log("Clic en el hijo (capturing)");
  },
  true
);

/*
Si haces clic en el elemento hijo, la salida en la consola será:
Clic en el abuelo (capturing)
Clic en el padre (capturing)
Clic en el hijo (capturing)
*/
```

## Controlar la propagación con stopPropagation()

El método `stopPropagation()` permite detener la propagación del evento, ya sea en la fase de capturing o bubbling. Esto es útil cuando no deseas que un evento se propague a elementos ancestros o descendientes.

```javascript
// Mismo HTML que arriba

document.getElementById("hijo").addEventListener("click", (evento) => {
  console.log("Clic en el hijo");
  evento.stopPropagation(); // Detiene la propagación
});

document.getElementById("padre").addEventListener("click", () => {
  console.log("Clic en el padre");
});

document.getElementById("abuelo").addEventListener("click", () => {
  console.log("Clic en el abuelo");
});

/*
Si haces clic en el elemento hijo, la salida en la consola será solo:
Clic en el hijo
*/
```

## Ejemplo práctico: propagación en elementos anidados

En este ejemplo, crearemos una interfaz donde varios elementos anidados manejan el mismo evento, y mostraremos cómo aprovechar o controlar la propagación

HTML

```html
<div id="contenedor">
  <div id="caja1">
    Caja 1
    <div id="caja2">
      Caja 2
      <div id="caja3">Caja 3</div>
    </div>
  </div>
</div>
<button id="togglePropagacion">Alternar Propagación</button>
```

JavaScript

```javascript
const contenedor = document.getElementById("contenedor");
const caja1 = document.getElementById("caja1");
const caja2 = document.getElementById("caja2");
const caja3 = document.getElementById("caja3");
const toggleButton = document.getElementById("togglePropagacion");

let propagacionActivada = true;

function manejarClic(evento) {
  console.log(`Clic en: ${evento.currentTarget.id}`);
  if (!propagacionActivada) {
    evento.stopPropagation(); // Detiene la propagación si está desactivada
  }
}

contenedor.addEventListener("click", manejarClic);
caja1.addEventListener("click", manejarClic);
caja2.addEventListener("click", manejarClic);
caja3.addEventListener("click", manejarClic);

toggleButton.addEventListener("click", () => {
  propagacionActivada = !propagacionActivada;
  console.log(
    `Propagación ${propagacionActivada ? "activada" : "desactivada"}`
  );
});
```

Explicación

- **Elementos anidados:** Cada caja (caja1, caja2, caja3) y el contenedor principal manejan el evento click.

- **Control de propagación:** Al hacer clic en caja3, el evento se propaga a caja2, caja1 y contenedor (si la propagación está activada).

- **Alternar propagación:** El botón `togglePropagacion` permite activar o desactivar la propagación usando `stopPropagation()`.
