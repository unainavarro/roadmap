CSS Media Features

<h1 align="center">Media query</h1>

<h2>📑 Contenido</h2>

- [Media query](#media-query)
- [Medidas estándar](#medidas-estándar)
- [Media features](#media-features)
  - [Ancho de la pantalla (width)](#ancho-de-la-pantalla-width)
  - [Orientación (orientation)](#orientación-orientation)
  - [Resolución de pantalla (resolution)](#resolución-de-pantalla-resolution)
  - [Relación de aspecto (aspect-ratio)](#relación-de-aspecto-aspect-ratio)
  - [Dispositivo táctil (pointer:coarse)](#dispositivo-táctil-pointercoarse)

## Media query

Las media query sirven para adaptar la web a diferentes tipos de dispositivos Movil,Tablet,Ordenador... Creamos diferentes bloque de propiedades CSS para cada determinada condición, se les llama puntos de ruptura. Con cada punto de ruptura establecemos un diseño diferente.
En el diseño web mobile first primero se diseñar la parte para móviles y se va subiendo para dispositivos más grandes. En cambio en el diseño web responsive es al revés de mayor tamaño al pequeño.

## Medidas estándar

Medidas orientativas, utiliza las medidas en función a tus necesidades. Las menciono pero lo ideal es que se ajusten al diseño concreto.

- **Pequeño:** min-width: 460px
- **Mediano:** min-width: 768px
- **Largo:** min-width: 768px
- **Largo-Plus:** min-width: 1280px

> [!IMPORTANT]
>
> NO usar valores estándar de tamaños para las media queries.
> La media query debe depender del **DISEÑO**, NO del tamaño estándar de ningún DISPOSITIVO.

Ejemplo: Cambiar el color en cada punto de ruptura

```html
<!-- HTML -->
<div class="wrapper">
  <h1>Texto Prueba</h1>
</div>
```

```css
/* CSS */

.wrapper {
  width: 500px;
  height: 250px;
  margin: 200px auto;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: grey;
}

/* Mobile */

@media (min-width: 460px) {
  h1 {
    color: teal;
  }
}

/* Tablet */

@media (min-width: 768px) {
  h1 {
    color: tomato;
  }
}

/* Desktop */

@media (min-width: 992px) {
  h1 {
    color: turquoise;
  }
}

/* Landscape */

@media (min-width: 1280px) {
  h1 {
    color: thistle;
  }
}
```

![Cambiar color en cada punto de ruptura](./img/media-query.gif)

## Media features

Las CSS Media Features (características de medios CSS) son una parte fundamental de las media queries en CSS. Permiten a los desarrolladores web aplicar estilos específicos a sus páginas según características específicas de los dispositivos o de la visualización.

### Ancho de la pantalla (width)

Permite aplicar estilos dependiendo del ancho de la ventana del navegador o del dispositivo.

```css
@media screen and (max-width: 768px) {
  /* Estilos aplicados cuando el ancho de la pantalla es igual o menor a 768px */
}
```

### Orientación (orientation)

Permite aplicar estilos basados en la orientación del dispositivo (horizontal o vertical).

```css
@media screen and (orientation: landscape) {
  /* Estilos aplicados cuando el dispositivo está en orientación horizontal */
}
```

### Resolución de pantalla (resolution)

Permite aplicar estilos basados en la densidad de píxeles de la pantalla.

```css
@media screen and (orientation: landscape) {
  /* Estilos aplicados cuando el dispositivo está en orientación horizontal */
}
```

### Relación de aspecto (aspect-ratio)

Permite aplicar estilos basados en la relación entre el ancho y la altura de la pantalla.

```css
@media screen and (aspect-ratio: 16/9) {
  /* Estilos aplicados cuando la relación de aspecto de la pantalla es de 16:9 */
}
```

### Dispositivo táctil (pointer:coarse)

Permite aplicar estilos específicos para dispositivos con entrada táctil.

```css
@media (pointer: coarse) {
  /* Estilos aplicados cuando el dispositivo tiene entrada táctil */
}
```
