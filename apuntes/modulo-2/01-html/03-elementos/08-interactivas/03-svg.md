<h1 align="center">SVG (Scalable Vector Graphics)</h1>

<h2>📑 Contenido</h2>

- [SVG](#svg)
- [¿Qué es SVG?](#qué-es-svg)
  - [Características principales de SVG](#características-principales-de-svg)
- [Ventajas de usar SVG](#ventajas-de-usar-svg)
  - [Calidad en cualquier resolución](#calidad-en-cualquier-resolución)
  - [Reducción de solicitudes HTTP](#reducción-de-solicitudes-http)
  - [Control total con CSS y JavaScript](#control-total-con-css-y-javascript)
  - [Compatibilidad](#compatibilidad)
- [Creando gráficos SVG](#creando-gráficos-svg)
  - [Sintaxis básica de SVG](#sintaxis-básica-de-svg)
  - [Formas comunes en SVG](#formas-comunes-en-svg)
- [Rutas (Paths)](#rutas-paths)
- [Integrando SVG en proyectos web](#integrando-svg-en-proyectos-web)
  - [Inserción directa en HTML](#inserción-directa-en-html)
  - [Uso de SVG como imagen](#uso-de-svg-como-imagen)
  - [Uso de SVG como fondo en CSS](#uso-de-svg-como-fondo-en-css)
- [Animación e interactividad en SVG](#animación-e-interactividad-en-svg)
  - [Animaciones con CSS](#animaciones-con-css)
  - [Manipulación con JavaScript](#manipulación-con-javascript)
- [Buenas prácticas](#buenas-prácticas)

## SVG

En el mundo del desarrollo web y el diseño gráfico, la necesidad de crear gráficos que se vean nítidos en cualquier dispositivo y resolución es fundamental. Aquí es donde entra en juego SVG (Scalable Vector Graphics), un formato de imagen vectorial basado en XML que permite crear gráficos escalables y de alta calidad. A diferencia de las imágenes rasterizadas (como JPEG o PNG), los gráficos SVG no pierden calidad al ser redimensionados, lo que los hace ideales para iconos, logotipos, ilustraciones y más.

## ¿Qué es SVG?

SVG es un estándar abierto desarrollado por el W3C (World Wide Web Consortium) para representar gráficos vectoriales en dos dimensiones. A diferencia de las imágenes rasterizadas, que están compuestas por píxeles, los gráficos SVG están definidos por formas geométricas como líneas, círculos, rectángulos y curvas, lo que permite que se escalen sin perder calidad.

### Características principales de SVG

- **Escalabilidad:** Los gráficos SVG pueden redimensionarse sin perder calidad.

- **Interactividad:** SVG admite eventos de usuario, como clics y desplazamientos.

- **Animación:** Se pueden animar elementos SVG usando CSS o JavaScript.

- **Accesibilidad:** El texto en SVG es seleccionable y puede ser leído por lectores de pantalla.

- **Ligero:** Los archivos SVG suelen ser más pequeños que sus equivalentes en rasterizado.

## Ventajas de usar SVG

### Calidad en cualquier resolución

Al ser vectoriales, los gráficos SVG se adaptan a cualquier tamaño de pantalla, desde dispositivos móviles hasta monitores 4K, sin perder nitidez.

### Reducción de solicitudes HTTP

SVG puede incrustarse directamente en el código HTML, lo que reduce el número de solicitudes HTTP y mejora el rendimiento de la página.

### Control total con CSS y JavaScript

Los elementos SVG pueden ser estilizados con CSS y manipulados dinámicamente con JavaScript, lo que permite crear experiencias interactivas y animaciones complejas.

### Compatibilidad

SVG es compatible con todos los navegadores modernos y se integra perfectamente con tecnologías web como HTML5 y CSS3.

## Creando gráficos SVG

### Sintaxis básica de SVG

Un archivo SVG es un documento XML que define formas geométricas. Aquí tienes un ejemplo básico de un círculo en SVG:

```xml
<svg width="100" height="100" xmlns="http://www.w3.org/2000/svg">
  <circle cx="50" cy="50" r="40" fill="blue" />
</svg>
```

- `<svg>`: Es el contenedor principal que define el lienzo SVG.

- `<circle>`: Define un círculo con atributos como cx (centro en el eje X), cy (centro en el eje Y), r (radio) y fill (color de relleno).

### Formas comunes en SVG

- **Rectángulo:** `<rect x="10" y="10" width="80" height="60" fill="green" />`

- **Línea:** `<line x1="10" y1="10" x2="90" y2="90" stroke="black" />`

- **Polígono:** `<polygon points="50,5 90,90 10,90" fill="yellow" />`

- **Texto:** `<text x="10" y="20" font-family="Arial" font-size="14">Hola, SVG!</text>`

## Rutas (Paths)

Las rutas son una de las herramientas más poderosas en SVG. Permiten crear formas complejas usando comandos como `M` (moveto), `L` (lineto), `C` (curveto), etc. Ejemplo:

## Integrando SVG en proyectos web

### Inserción directa en HTML

Puedes incrustar SVG directamente en tu código HTML:

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <title>Ejemplo SVG</title>
  </head>
  <body>
    <svg width="100" height="100">
      <circle cx="50" cy="50" r="40" fill="red" />
    </svg>
  </body>
</html>
```

### Uso de SVG como imagen

Puedes usar SVG como una imagen en una etiqueta `<img>`:

```html
<img src="imagen.svg" alt="Descripción de la imagen" />
```

### Uso de SVG como fondo en CSS

SVG también puede usarse como fondo en CSS:

```css
.elemento {
  background-image: url("imagen.svg");
}
```

## Animación e interactividad en SVG

### Animaciones con CSS

Puedes animar elementos SVG usando CSS.

**Por ejemplo, para animar un círculo:**

```css
@keyframes mover {
  0% {
    transform: translateX(0);
  }
  100% {
    transform: translateX(100px);
  }
}

circle {
  animation: mover 2s infinite alternate;
}
```

### Manipulación con JavaScript

Puedes manipular SVG dinámicamente con JavaScript.

**Por ejemplo, cambiar el color de un círculo al hacer clic:**

```js
document.querySelector("circle").addEventListener("click", function () {
  this.setAttribute("fill", "purple");
});
```

## Buenas prácticas

- **Optimiza tus archivos:** Usa herramientas como SVGOMG para reducir el tamaño de los archivos SVG.

- **Usa etiquetas semánticas:** Aprovecha elementos como `<title>` y `<desc>` para mejorar la accesibilidad.

- **Evita SVG complejos:** Los gráficos demasiado complejos pueden afectar el rendimiento.
