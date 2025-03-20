<h1 align="center">Propiedad target</h1>

<h2>📑 Contenido</h2>

- [Propiedad target](#propiedad-target)
- [¿Qué es event.target?](#qué-es-eventtarget)
- [Uso de event.target en la delegación de eventos](#uso-de-eventtarget-en-la-delegación-de-eventos)
- [Ejemplos prácticos](#ejemplos-prácticos)
  - [Ejemplo 1: identificar el elemento que originó el evento](#ejemplo-1-identificar-el-elemento-que-originó-el-evento)
  - [Ejemplo 2: delegación de eventos en una lista](#ejemplo-2-delegación-de-eventos-en-una-lista)
  - [Ejemplo 3: manejo de clics en un contenedor con múltiples hijos](#ejemplo-3-manejo-de-clics-en-un-contenedor-con-múltiples-hijos)

## Propiedad target

En JavaScript, el objeto de evento (`event`) contiene una propiedad llamada `target`, que es una referencia al elemento que originó el evento. Esta propiedad es especialmente útil cuando se trabaja con delegación de eventos, ya que permite identificar el elemento específico que desencadenó el evento, incluso si el evento se registró en un contenedor padre.

## ¿Qué es event.target?

La propiedad `event.target` hace referencia al elemento que desencadenó el evento. A diferencia de `event.currentTarget`, que siempre hace referencia al elemento al que está asociado el controlador de eventos, `event.target` apunta al elemento que originó el evento, independientemente de dónde se haya registrado el controlador.

```html
<button id="miBoton">Haz clic</button>
```

```javascript
document.getElementById("miBoton").addEventListener("click", (evento) => {
  console.log(evento.target); // <button id="miBoton">Haz clic</button>
});
```

En este ejemplo, evento.target es el botón que se hizo clic.

## Uso de event.target en la delegación de eventos

La delegación de eventos es una técnica en la que se registra un controlador de eventos en un contenedor padre en lugar de en cada elemento hijo. Esto es útil cuando tienes muchos elementos hijos dinámicos o cuando deseas optimizar el rendimiento.

La propiedad `event.target` es clave para la delegación de eventos, ya que permite identificar el elemento hijo específico que desencadenó el evento.

## Ejemplos prácticos

### Ejemplo 1: identificar el elemento que originó el evento

```html
<div id="contenedor">
  <button id="boton1">Botón 1</button>
  <button id="boton2">Botón 2</button>
  <button id="boton3">Botón 3</button>
</div>
```

```javascript
document.getElementById("contenedor").addEventListener("click", (evento) => {
  console.log(`Clic en: ${evento.target.id}`);
});

/*
Si haces clic en Botón 2, la salida en la consola será:
Clic en: boton2
*/
```

### Ejemplo 2: delegación de eventos en una lista

En este ejemplo, usamos `event.target` para manejar clics en una lista dinámica de elementos.

```html
<ul id="lista">
  <li>Elemento 1</li>
  <li>Elemento 2</li>
  <li>Elemento 3</li>
</ul>
```

```javascript
document.getElementById("lista").addEventListener("click", (evento) => {
  if (evento.target.tagName === "LI") {
    console.log(`Clic en: ${evento.target.textContent}`);
  }
});

/*
Si haces clic en Elemento 2, la salida en la consola será:
Clic en: Elemento 2
*/
```

### Ejemplo 3: manejo de clics en un contenedor con múltiples hijos

En este ejemplo, un contenedor maneja clics en varios tipos de elementos hijos (botones, enlaces, imágenes), y `event.target` se usa para diferenciarlos.

```html
<div id="contenedor">
  <button>Botón</button>
  <a href="#">Enlace</a>
  <img src="imagen.jpg" alt="Imagen" />
</div>
```

```javascript
document.getElementById("contenedor").addEventListener("click", (evento) => {
  if (evento.target.tagName === "BUTTON") {
    console.log("Clic en un botón");
  } else if (evento.target.tagName === "A") {
    console.log("Clic en un enlace");
  } else if (evento.target.tagName === "IMG") {
    console.log("Clic en una imagen");
  }
});

/*
Si haces clic en el enlace, la salida en la consola será:
Clic en un enlace
*/
```
