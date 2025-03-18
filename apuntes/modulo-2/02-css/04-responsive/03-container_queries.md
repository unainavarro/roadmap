<h1 align="center">Container queries</h1>

<h2>📑 Contenido</h2>

- [Container queries](#container-queries)
- [Concepto hipotético](#concepto-hipotético)
- [Ejemplo: cambiar el diseño según el ancho del contenedor](#ejemplo-cambiar-el-diseño-según-el-ancho-del-contenedor)

## Container queries

Las "container queries" (consultas de contenedor) son una característica muy esperada en el mundo del diseño web y CSS. A diferencia de las "media queries", que permiten aplicar estilos basados en las características del dispositivo, las "container queries" permiten aplicar estilos basados en las características del contenedor en el que se encuentra un elemento HTML.

Por ejemplo, supongamos que tienes un componente de tarjeta en tu página web que se utiliza en diferentes secciones con diferentes anchos de contenedor. Con las "container queries", podrías escribir reglas de estilo que se apliquen dependiendo del ancho específico del contenedor que contiene cada tarjeta, en lugar del ancho de la ventana del navegador.

Las "container queries" permitirían un mayor nivel de modularidad y reutilización en el diseño web, ya que los componentes podrían ser más autosuficientes y adaptarse mejor a su entorno sin necesidad de conocer el contexto global de la página.

Actualmente, las "container queries" están en desarrollo y no están ampliamente disponibles en los navegadores web. Sin embargo, hay algunos experimentos y propuestas en curso en la comunidad de CSS para abordar esta necesidad. Una de las propuestas más prometedoras es el uso de la función @container en CSS, que permitiría escribir estilos basados en el contenedor padre de un elemento.

## Concepto hipotético

Ejemplo de cómo podrían funcionar si estuvieran disponibles. Por ahora, esto sería un concepto hipotético:

```html
<div class="container">
  <div class="element">
    <!-- Contenido del elemento -->
  </div>
</div>
```

```css
.container {
  width: 50%; /* Ancho del contenedor */
}

.element {
  /* Estilos base del elemento */
}

@container (min-width: 400px) {
  .element {
    /* Estilos aplicados al elemento cuando el contenedor es al menos 400px de ancho */
    background-color: yellow;
  }
}

@container (min-width: 800px) {
  .element {
    /* Estilos aplicados al elemento cuando el contenedor es al menos 800px de ancho */
    background-color: lightblue;
  }
}
```

## Ejemplo: cambiar el diseño según el ancho del contenedor

```html
<div class="container">
  <div class="item">Elemento 1</div>
  <div class="item">Elemento 2</div>
  <div class="item">Elemento 3</div>
</div>
```

```css
/* Habilitar el modo de contenedor para consultas */
.container {
  container-type: inline-size; /* Estilo en función del ancho */
  container-name: layout-container;
  display: flex;
  gap: 10px;
  padding: 20px;
  border: 2px solid #333;
  background-color: #f3f3f3;
}

/* Estilos para los elementos */
.item {
  flex: 1;
  background-color: #937dc2;
  color: white;
  padding: 15px;
  text-align: center;
  border-radius: 8px;
}

/* Query basada en el tamaño del contenedor */
@container layout-container (min-width: 400px) {
  .item {
    background-color: #9fc9f3;
  }
}

@container layout-container (min-width: 600px) {
  .item {
    background-color: #ff9494;
    font-size: 1.2em;
  }
}
```
