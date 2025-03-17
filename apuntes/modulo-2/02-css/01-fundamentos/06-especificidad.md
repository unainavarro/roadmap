<h1 align="center">Especificidad</h1>

<h2>📑 Contenido</h2>

- [¿Qué es especificidad?](#qué-es-especificidad)
- [Puntuaciones para cada selector](#puntuaciones-para-cada-selector)
  - [Selectores universales](#selectores-universales)
  - [Selector de elementos o pseudoelementos](#selector-de-elementos-o-pseudoelementos)
  - [Selector de clase, pseudoclases o atributo](#selector-de-clase-pseudoclases-o-atributo)
  - [Selector de id](#selector-de-id)
  - [Atributo de estilo en línea](#atributo-de-estilo-en-línea)
  - [Regla !important](#regla-important)
- [Ejemplo practico](#ejemplo-practico)
  - [Respuestas](#respuestas)

## ¿Qué es especificidad?

Piensa en especificidad como un sistema de puntuación, el selector con más puntuación se mostrara en el navegador.

## Puntuaciones para cada selector

- **Selectores Universales:** 0 puntos
- **Selector de elementos o pseudoelementos:** 1 puntos
- **Selector de clase, pseudoclases o atributo:** 0 puntos
- **Selector de ID:** 100 puntos
- **Atributo de estilo en línea:** 1.000 puntos
- **Regla !important:** 10.000 puntos

### Selectores universales

Un selector universal (\*) no tiene especificidad y obtiene **0 puntos**. Esto significa que cualquier regla con 1 o más puntos lo anulará.

### Selector de elementos o pseudoelementos

Un selector de elemento (tipo) o pseudoelemento obtiene **1 punto** de especificidad. div{} ::selection{}

### Selector de clase, pseudoclases o atributo

Un selector de clase, pseudoclase o atributo obtiene **10 puntos** de especificidad. .clase{} :hover{} [href='#']{}

### Selector de id

Un selector de ID obtiene **100 puntos** de especificidad, siempre que use un selector de ID (#myID) y no un selector de atributo ([id="myID"]).

### Atributo de estilo en línea

El CSS aplicado directamente al atributo style del elemento HTML, obtiene una puntuación de especificidad de **1.000 puntos**. Esto significa que para anularlo en CSS, debe escribir un selector extremadamente específico

### Regla !important

Por último, escribir !important al final de un valor de CSS obtiene una puntuación de especificidad de **10.000 puntos**. Esta es la mayor especificidad que puede obtener un objeto individual.

## Ejemplo practico

Dada las siguientes reglas CSS que color crees que se aplicaría al elemento:

(1) Ejercicio:

```html
<h1>Título de la Página</h1>
```

```css
* {
  color: green;
}

h1 {
  color: yellow;
}
```

<hr>

(2) Ejercicio:

```html
<h1 class="encabezadoClase" id="encabezadoID">Título de la Página</h1>
```

```css
* {
  color: green;
}

h1 {
  color: yellow;
}

.encabezadoClase {
  color: pink;
}

#encabezadoID {
  color: blue;
}
```

<hr>

(3) Ejercicio:

```html
<h1 class="encabezadoClase" id="encabezadoID" style="color: purple">
  Título de la Página
</h1>
```

```css
* {
  color: green;
}

h1 {
  color: yellow;
}

.encabezadoClase {
  color: pink;
}

#encabezadoID {
  color: blue;
}
```

<hr>

(4) Ejercicio:

```html
<h1 class="encabezadoClase" id="encabezadoID" style="color: purple">
  Título de la Página
</h1>
```

```css
h1 {
  color: red !important;
}

* {
  color: green;
}

h1 {
  color: yellow;
}

.encabezadoClase {
  color: pink;
}

#encabezadoID {
  color: blue;
}
```

### Respuestas

- (1) Ejercicio: **yellow**
- (2) Ejercicio: **blue**
- (3) Ejercicio: **purple**
- (4) Ejercicio: **red**
