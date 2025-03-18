<h1 align="center">Grid implícito</h1>

<h2>📑 Contenido</h2>

- [Grid implícito](#grid-implícito)
- [grid-auto-rows y grid-auto-columns](#grid-auto-rows-y-grid-auto-columns)
- [Grid auto flow](#grid-auto-flow)
  - [Valores de grid-auto-flow](#valores-de-grid-auto-flow)

## Grid implícito

En CSS Grid, el diseño implícito se refiere a la creación automática de filas o columnas adicionales por el navegador cuando los elementos colocados exceden el número de filas o columnas definidas explícitamente. Esto es útil para manejar situaciones en las que el contenido dinámico puede variar en cantidad y no siempre se puede anticipar el número exacto de elementos que se necesitarán.

## grid-auto-rows y grid-auto-columns

Estas propiedades definen el tamaño de las filas o columnas generadas implícitamente cuando los elementos de la cuadrícula exceden la cantidad de filas o columnas definidas explícitamente.

- **grid-auto-rows:** Define el tamaño de las filas creadas implícitamente.
- **grid-auto-columns:** Define el tamaño de las columnas creadas implícitamente.

## Grid auto flow

La propiedad grid-auto-flow en CSS Grid controla cómo los elementos se colocan automáticamente dentro de una cuadrícula cuando la cantidad de elementos excede el número de celdas definidas explícitamente.

### Valores de grid-auto-flow

- **row (valor predeterminado):** Los elementos se colocan en filas adicionales conforme se van llenando las celdas de cada fila. Si se alcanza el número máximo de filas, los elementos se colocan en nuevas filas a la derecha.

- **column:** Los elementos se colocan en columnas adicionales conforme se van llenando las celdas de cada columna. Si se alcanza el número máximo de columnas, los elementos se colocan en nuevas columnas debajo.

- **row dense:** Los elementos se colocan en filas adicionales como en row, pero si hay huecos vacíos en las filas anteriores, los elementos se pueden colocar en esos huecos.

- **column dense:** Los elementos se colocan en columnas adicionales como en column, pero si hay huecos vacíos en las columnas anteriores, los elementos se pueden colocar en esos huecos.

```html
<div class="grid-container">
  <div class="grid-item">1</div>
  <div class="grid-item">2</div>
  <div class="grid-item">3</div>
  <div class="grid-item">4</div>
  <div class="grid-item">5</div>
  <div class="grid-item">6</div>
  <div class="grid-item">7</div>
  <div class="grid-item">8</div>
  <div class="grid-item">9</div>
  <div class="grid-item">10</div>
  <div class="grid-item">11</div>
</div>
```

```css
.grid-container {
  display: grid;
  grid-template-columns: 100px 100px;
  grid-auto-flow: row; /* Los elementos se colocan en filas adicionales */
  grid-gap: 10px;
}

.grid-item {
  width: 50px;
  height: 50px;
  background-color: lightblue;
  padding: 5px;
  text-align: center;
  line-height: 50px;
}
```
