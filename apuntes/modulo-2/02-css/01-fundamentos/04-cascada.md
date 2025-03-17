<h1 align="center">Cascada</h1>

<h2>📑 Contenido</h2>

- [Cascada](#cascada)
- [Etapas](#etapas)
- [Ejemplo](#ejemplo)

## Cascada

CSS lee la información en cascada. Si aplicas dos estilos distintos al mismo elemento se aplicara el ultimo estilo.

## Etapas

El algoritmo en cascada se divide en varias etapas:

- **Posición y orden de aparición:** Es el orden en el que aparecen tus reglas CSS.
- **Especificidad:** Un algoritmo que determina qué selector de CSS tiene la puntuación más fuerte.
- **Origen:** El orden y la procedencia en el que se importa.
- **Importancia:** Dependiendo la puntuación que tengan algunas reglas CSS tienen más peso que otras.

## Ejemplo

```html
<!-- HTML -->
<h1>Título de la Página</h1>
```

```css
/* CSS */
h1 {
  color: blue;
}

h1 {
  color: red;
}
```

**Resultado**

![Resultado CSS Interno](./img/AgregarCSS.png)
