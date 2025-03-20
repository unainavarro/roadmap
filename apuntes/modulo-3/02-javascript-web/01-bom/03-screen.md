<h1 align='center'>Screen</h1>

<h2>📑 Contenido</h2>

- [Screen](#screen)
- [¿Qué es el objeto screen?](#qué-es-el-objeto-screen)
- [Propiedades principales del objeto screen](#propiedades-principales-del-objeto-screen)
  - [screen.width](#screenwidth)
  - [screen.height](#screenheight)
  - [screen.availWidth](#screenavailwidth)
  - [screen.availHeight](#screenavailheight)
  - [screen.colorDepth](#screencolordepth)
  - [screen.pixelDepth](#screenpixeldepth)
- [Casos de uso comunes](#casos-de-uso-comunes)
  - [Diseño web responsive](#diseño-web-responsive)
  - [Optimización de gráficos o imágenes](#optimización-de-gráficos-o-imágenes)
  - [Control de ventanas emergentes (pop-ups)](#control-de-ventanas-emergentes-pop-ups)
  - [Detección de resoluciones de pantalla](#detección-de-resoluciones-de-pantalla)
- [Diferencias entre screen y el tamaño de la ventana (window.innerWidth)](#diferencias-entre-screen-y-el-tamaño-de-la-ventana-windowinnerwidth)
- [Limitaciones del objeto screen](#limitaciones-del-objeto-screen)

## Screen

El objeto `screen` en JavaScript es parte del Browser Object Model (BOM) y proporciona información sobre la pantalla en la que se está ejecutando la aplicación web. Este objeto permite acceder a detalles como el tamaño total de la pantalla, el espacio disponible para la ventana del navegador y la profundidad de color, entre otros.

El objeto `screen` no interactúa con el contenido de la página web (como lo haría el DOM), sino con el dispositivo que la muestra. A continuación, exploraremos las principales propiedades y usos de este objeto.

## ¿Qué es el objeto screen?

El objeto `screen` es una propiedad del objeto global `window` que contiene información sobre la pantalla física del dispositivo donde se está mostrando el navegador. Esta información es particularmente útil en casos en los que es necesario adaptar el contenido de la página en función del tamaño o las capacidades de la pantalla, por ejemplo, para hacer una página responsive o para optimizar la experiencia en diferentes dispositivos.

El objeto `screen` es de solo lectura, lo que significa que no puedes cambiar los valores que ofrece, pero puedes utilizarlos para modificar el comportamiento de tu aplicación web.

## Propiedades principales del objeto screen

El objeto `screen` contiene varias propiedades útiles para obtener detalles sobre la pantalla. Estas propiedades te permiten ajustar el diseño, la presentación y el comportamiento de las aplicaciones en diferentes tamaños y resoluciones de pantalla.

### screen.width

Devuelve el ancho total de la pantalla en píxeles.

```js
console.log(screen.width); // Ancho total de la pantalla
```

### screen.height

Devuelve la altura total de la pantalla en píxeles.

```js
console.log(screen.height); // Altura total de la pantalla
```

### screen.availWidth

Devuelve el ancho disponible de la pantalla, excluyendo elementos de la interfaz del sistema operativo, como la barra de tareas en sistemas operativos de escritorio.

```js
console.log(screen.availWidth); // Ancho disponible en la pantalla
```

### screen.availHeight

Devuelve la altura disponible de la pantalla, excluyendo elementos como la barra de tareas o menús del sistema.

```js
console.log(screen.availHeight); // Altura disponible en la pantalla
```

### screen.colorDepth

Devuelve la profundidad de color en bits por píxel que soporta la pantalla. Esto indica cuántos colores diferentes puede mostrar la pantalla. Por ejemplo, una profundidad de color de 24 bits significa que la pantalla puede mostrar más de 16 millones de colores.

```js
console.log(screen.colorDepth); // Profundidad de color de la pantalla
```

### screen.pixelDepth

Devuelve la profundidad de color de la pantalla, igual que colorDepth. A menudo ambas propiedades tienen el mismo valor.

```js
console.log(screen.pixelDepth); // Profundidad de color en píxeles
```

## Casos de uso comunes

La información proporcionada por el objeto `screen` puede ser útil en una variedad de situaciones donde necesitas adaptar tu aplicación en función del dispositivo en el que se está ejecutando. Aquí te presento algunos casos de uso comunes:

### Diseño web responsive

El objeto `screen` puede ser utilizado para adaptar dinámicamente el contenido o la disposición de la página según el tamaño de la pantalla del dispositivo.

```js
if (screen.width < 768) {
  console.log("Estás en un dispositivo móvil.");
} else {
  console.log("Estás en un dispositivo de escritorio.");
}
```

### Optimización de gráficos o imágenes

Para optimizar la carga de imágenes o gráficos, se puede utilizar `screen.width` o `screen.height` para cargar imágenes en tamaños apropiados según la resolución de la pantalla del usuario.

```js
let img = new Image();
if (screen.width > 1280) {
  img.src = "imagen-alta-resolucion.jpg";
} else {
  img.src = "imagen-baja-resolucion.jpg";
}
document.body.appendChild(img);
```

### Control de ventanas emergentes (pop-ups)

Si necesitas abrir una ventana emergente, `screen.availWidth` y `screen.availHeight` te permiten centrar esa ventana en la pantalla del usuario, calculando el tamaño y la posición disponibles.

```js
let popupWidth = 400;
let popupHeight = 300;
let left = (screen.availWidth - popupWidth) / 2;
let top = (screen.availHeight - popupHeight) / 2;

window.open(
  "https://www.ejemplo.com",
  "popup",
  `width=${popupWidth},height=${popupHeight},left=${left},top=${top}`
);
```

### Detección de resoluciones de pantalla

Es común en aplicaciones multimedia o de juegos detectar la resolución de pantalla para ofrecer diferentes configuraciones gráficas o adaptar la interfaz para mejorar la experiencia del usuario.

```js
if (screen.width >= 1920) {
  console.log("Resolución Full HD o superior.");
} else {
  console.log("Resolución inferior a Full HD.");
}
```

## Diferencias entre screen y el tamaño de la ventana (window.innerWidth)

Aunque tanto el objeto `screen` como window.innerWidth proporcionan información sobre el tamaño de la pantalla o ventana, hay una diferencia clave:

- `screen.width` y `screen.height` devuelven el tamaño de la pantalla completa.
- `window.innerWidth` y `window.innerHeight` devuelven el tamaño del área visible del contenido dentro de la ventana del navegador, excluyendo las barras de desplazamiento, bordes de la ventana y otros elementos de la interfaz.

```js
console.log(window.innerWidth); // Ancho del área visible de la ventana
console.log(screen.width); // Ancho total de la pantalla
```

Esta diferencia es útil cuando queremos distinguir entre el tamaño total de la pantalla del dispositivo y el tamaño del área donde realmente se está mostrando el contenido web.

## Limitaciones del objeto screen

A pesar de la utilidad del objeto `screen`, existen algunas limitaciones:

- El objeto `screen` no puede detectar si la página web está en pantalla completa o si hay múltiples monitores conectados.
- Aunque proporciona información sobre la pantalla, no permite interactuar con ella directamente (por ejemplo, no puedes cambiar la resolución o el brillo de la pantalla a través de `screen`).
- No todos los navegadores pueden manejar correctamente todos los valores de las propiedades del objeto `screen`.
