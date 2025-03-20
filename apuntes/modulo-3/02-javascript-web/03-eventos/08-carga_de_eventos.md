<h1 align="center">Carga de eventos</h1>

<h2>📑 Contenido</h2>

- [Carga de eventos](#carga-de-eventos)
- [¿Qué es DOMContentLoaded?](#qué-es-domcontentloaded)
  - [Ejemplo de uso](#ejemplo-de-uso)
- [¿Qué es load?](#qué-es-load)
  - [Ejemplo de uso](#ejemplo-de-uso-1)
- [Diferencias entre DOMContentLoaded y load](#diferencias-entre-domcontentloaded-y-load)

## Carga de eventos

En el desarrollo web, es crucial saber cuándo el contenido de una página está listo para ser manipulado o cuándo todos los recursos (como imágenes, scripts y estilos) han terminado de cargarse. Para ello, JavaScript proporciona dos eventos clave: `DOMContentLoaded` y `load`. Estos eventos permiten ejecutar código en momentos específicos del ciclo de vida de una página, optimizando la experiencia del usuario y el rendimiento de la aplicación.

## ¿Qué es DOMContentLoaded?

El evento `DOMContentLoaded` se dispara cuando el DOM (Document Object Model) ha sido completamente cargado y parseado, sin esperar a que se carguen recursos externos como imágenes, hojas de estilo o scripts. Esto significa que puedes manipular el DOM de manera segura tan pronto como este evento ocurra.

Características clave:

- Se ejecuta antes de que se carguen imágenes y hojas de estilo.

- Es ideal para inicializar scripts que dependen del DOM.

- No espera a que se carguen recursos externos.

### Ejemplo de uso

Supongamos que deseas inicializar un script que manipula el DOM tan pronto como esté listo.

HTML

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <title>Ejemplo DOMContentLoaded</title>
  </head>
  <body>
    <h1 id="titulo">Hola, Mundo!</h1>
    <script src="script.js"></script>
  </body>
</html>
```

JavaScript (script.js)

```javascript
document.addEventListener("DOMContentLoaded", () => {
  const titulo = document.getElementById("titulo");
  titulo.textContent = "¡DOM cargado y listo!";
  console.log("DOM completamente cargado.");
});
```

En este ejemplo, el texto del `<h1>` se cambia tan pronto como el DOM esté listo, sin esperar a que se carguen imágenes u otros recursos.

## ¿Qué es load?

El evento load se dispara cuando todos los recursos de la página (imágenes, scripts, hojas de estilo, etc.) han terminado de cargarse. Este evento es útil cuando necesitas asegurarte de que todo el contenido de la página esté disponible antes de ejecutar ciertas acciones.

Características clave:

- Se ejecuta después de que todos los recursos (imágenes, scripts, estilos) se hayan cargado.

- Es ideal para acciones que dependen de recursos externos, como imágenes pesadas.

- Es más lento que `DOMContentLoaded` porque espera a que todo esté completamente cargado.

### Ejemplo de uso

Supongamos que deseas asegurarte de que una imagen grande esté completamente cargada antes de mostrarla en la página.

HTML

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <title>Ejemplo load</title>
  </head>
  <body>
    <img id="imagen" src="imagen-grande.jpg" alt="Imagen grande" />
    <script src="script.js"></script>
  </body>
</html>
```

JavaScript (script.js)

```javascript
window.addEventListener("load", () => {
  const imagen = document.getElementById("imagen");
  console.log("Imagen completamente cargada:", imagen.src);
});
```

En este ejemplo, el mensaje en la consola solo se mostrará después de que la imagen grande haya terminado de cargarse.

## Diferencias entre DOMContentLoaded y load

| Característica       | DOMContentLoaded                                  | load                                                            |
| -------------------- | ------------------------------------------------- | --------------------------------------------------------------- |
| Momento de ejecución | Cuando el DOM está listo (sin recursos externos). | Cuando todos los recursos están cargados.                       |
| Uso recomendado      | Manipulación del DOM, inicialización de scripts.  | Acciones que dependen de recursos externos (imágenes, estilos). |
| Velocidad            | Más rápido (no espera recursos externos).         | Más lento (espera a que todo se cargue).                        |
