<h1 align="center">Pseudoelementos</h1>

<h2>📑 Contenido</h2>

- [Pseudoelementos](#pseudoelementos)
- [Contenido generado en CSS](#contenido-generado-en-css)
  - [::before y ::after](#before-y-after)
  - [::backdrop](#backdrop)
  - [::file-selector-button](#file-selector-button)
- [Pseudoelementos tipográficos](#pseudoelementos-tipográficos)
  - [::first-letter y ::first-line](#first-letter-y-first-line)
  - [::marker](#marker)
- [Pseudoelementos de resaltado](#pseudoelementos-de-resaltado)
  - [::placeholder](#placeholder)
  - [::selection](#selection)

## Pseudoelementos

Los pseudoelementos son partes específicas de un elemento que puedes seleccionar y estilizar de manera independiente. Se representan mediante dos puntos (::) y se utilizan para aplicar estilos a partes específicas de un elemento sin la necesidad de agregar elementos adicionales al markup HTML.

> [!NOTE]
>
> La diferencia de las pseudoclases y pseudoelementos es que los pseudoelementos suelen hacer referencia a determinadas partes de un elemento. Las pseudoclases suelen hacer referencia al estado del elemento.

## Contenido generado en CSS

### ::before y ::after

`::before` Este pseudoelemento crea un contenedor virtual antes del contenido real del elemento seleccionado. Puedes usar la propiedad content para especificar qué contenido debe aparecer antes del contenido real. Esto es útil para agregar decoraciones, iconos, o texto adicional.

`::after` Similar a ::before, este pseudoelemento crea un contenedor virtual después del contenido real del elemento seleccionado. También se usa con la propiedad content para agregar contenido adicional al final del elemento.

```html
<!-- HTML -->
<p>Texto del párrafo.</p>
```

```css
/* CSS */
p::before {
  content: "Inicio: ";
  font-weight: bold;
}

p::after {
  content: " Fin.";
  font-style: italic;
}
```

---

### ::backdrop

El pseudoelemento CSS ::backdrop crea un fondo que cubre toda la ventana gráfica y se representa inmediatamente debajo de un `<dialog>` o cualquier elemento que entre en modo de pantalla completa.

```html
<!-- HTML -->
<button popovertarget="mensaje" popovertargetaction="toggle">
  Mostrar Mensaje
</button>

<div id="mensaje" popover>
  <p>Esto es un mensaje de prueba</p>
</div>
```

```css
/* CSS */
[popover]::backdrop {
  background-color: darkorange;
  background-image: linear-gradient(
    130deg,
    #ff7a18,
    #af002d 41.07%,
    #319197 76.05%
  );
}

[popover]:popover-open {
  font-size: 2rem;
  padding: 20px;
}
```

---

### ::file-selector-button

Es un pseudoelemento que selecciona los elementos `<input type="file">` del HTML.

```html
<!-- HTML -->
<input type="file" />
```

```css
/* CSS */
input::file-selector-button {
  background-color: teal;
  color: greenyellow;
  padding: 20px;
  font-size: 16px;
}
```

---

## Pseudoelementos tipográficos

### ::first-letter y ::first-line

Los pseudoelementos ::first-letter y ::first-line en CSS se utilizan para seleccionar y aplicar estilos a la primera letra o la primera línea de un elemento, respectivamente.

```html
<!-- HTML -->
<p>
  Texto del párrafo.Texto del párrafo.Texto del párrafo.Texto del párrafo. Texto
  del párrafo.Texto del párrafo.Texto del párrafo.Texto del párrafo.
</p>
```

```css
/* CSS */
p {
  width: 200px;
}

p::first-letter {
  font-size: 1.5em;
  color: #3366cc;
}

p::first-line {
  font-weight: bold;
  color: #ff6600;
}
```

---

### ::marker

El pseudoelemento ::marker en CSS se utiliza para seleccionar y estilizar el marcador (o bullet point) de un elemento de lista, como `<li>` en HTML. Puedes aplicar estilos específicos al marcador sin afectar el contenido del elemento de la lista.

```html
<!-- HTML -->
<ol>
  <li>Lorem ipsum dolor sit amet.</li>
  <li>Corporis aliquam excepturi neque deleniti.</li>
  <li>Incidunt eos repellendus vitae deserunt!</li>
</ol>

<ul>
  <li>Lorem ipsum dolor sit amet.</li>
  <li>Laborum molestias consequuntur soluta ab.</li>
  <li>Et veniam suscipit quod qui.</li>
</ul>
```

```css
/* CSS */
ol li::marker {
  color: red;
  font-weight: bold;
}

ul li::marker {
  font-size: 150%;
  color: lightgreen;
}

body {
  line-height: 1.4;
  font-family: system-ui;
}
```

---

## Pseudoelementos de resaltado

### ::placeholder

Se utiliza para aplicar estilos al texto de marcador de posición en un campo de entrada `<input>` o área de texto `<textarea>`. El texto de marcador de posición es el texto que se muestra dentro del campo antes de que el usuario ingrese cualquier valor.

```html
<!-- HTML -->
<label for="username">Nombre de usuario:</label>
<input
  type="text"
  id="username"
  name="username"
  placeholder="Ingrese su usuario"
/>
```

```css
/* CSS */
input::placeholder {
  color: red;
  font-style: italic;
}
```

---

### ::selection

El pseudoelemento ::selection se utiliza en CSS para aplicar estilos al texto seleccionado por el usuario en una página web.

```html
<!-- HTML -->
<p>
  Texto del párrafo.Texto del párrafo.Texto del párrafo.Texto del párrafo. Texto
  del párrafo.Texto del párrafo.Texto del párrafo.Texto del párrafo.
</p>
```

```css
/* CSS */
p::selection {
  background-color: yellow;
}
```
