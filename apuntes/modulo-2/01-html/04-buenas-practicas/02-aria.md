<h1 align='center'>ARIA (Accessible Rich Internet Applications)</h1>

<h2>📑 Contenido</h2>

- [ARIA](#aria)
- [Tipos de atributos ARIA](#tipos-de-atributos-aria)
- [Roles ARIA](#roles-aria)
- [Propiedades de estado](#propiedades-de-estado)
  - [aria-pressed](#aria-pressed)
  - [aria-expanded](#aria-expanded)
  - [aria-checked](#aria-checked)
  - [aria-disabled](#aria-disabled)
- [Propiedades de propósito](#propiedades-de-propósito)
  - [aria-label](#aria-label)
  - [aria-labelledby](#aria-labelledby)
  - [aria-describedby](#aria-describedby)
- [Ejemplo práctico](#ejemplo-práctico)
- [ARIA y accesibilidad nativa en HTML5](#aria-y-accesibilidad-nativa-en-html5)
- [Buenas prácticas](#buenas-prácticas)

## ARIA

ARIA (Accessible Rich Internet Applications) es un conjunto de atributos definidos por el W3C que mejora la accesibilidad de las aplicaciones web para personas con discapacidades. Los atributos ARIA permiten a los desarrolladores proporcionar información adicional sobre la funcionalidad y la estructura de los elementos de la interfaz web, especialmente cuando se usan componentes dinámicos o personalizados que no son reconocidos de manera nativa por las tecnologías de asistencia (como los lectores de pantalla).

El uso de atributos ARIA es esencial para crear aplicaciones web accesibles, asegurando que todas las personas, incluidas aquellas con discapacidades, puedan interactuar adecuadamente con las interfaces web.

## Tipos de atributos ARIA

Los atributos ARIA se dividen en tres categorías principales:

1. Roles
1. Propiedades de Estado
1. Propiedades de Propósito

## Roles ARIA

Los roles ARIA proporcionan un significado adicional a un elemento HTML, ayudando a describir su propósito en la página para las tecnologías de asistencia. Son especialmente útiles cuando se crean componentes personalizados (por ejemplo, botones o menús hechos con `<div>` o `<span>`, que de otro modo no tendrían semántica significativa).

Ejemplos comunes de roles ARIA:

- **role="button":** Indica que un elemento actúa como un botón.
- **role="navigation":** Define una sección de navegación, útil cuando no se usa el elemento `<nav>`.
- **role="banner":** Indica un encabezado global para la página o el sitio, equivalente al `<header>`.
- **role="main":** Indica el contenido principal de la página, similar al `<main>`.
- **role="dialog":** Define una ventana emergente o modal.

```html
<div role="button" tabindex="0" aria-pressed="false" onclick="accion()">
  Clic aquí
</div>
```

## Propiedades de estado

Las propiedades de estado ARIA proporcionan información sobre el estado de un elemento interactivo, como si está activado, seleccionado, expandido o deshabilitado.

### aria-pressed

Indica si un botón de alternancia (toggle button) está presionado o no (true, false, mixed).

```html
<button aria-pressed="false">Botón de alternancia</button>
```

### aria-expanded

Indica si un elemento colapsable (como un menú o acordeón) está expandido (true) o colapsado (false).

```html
<button aria-expanded="false" aria-controls="menu">Abrir Menú</button>
<div id="menu" hidden>Contenido del menú</div>
```

### aria-checked

Indica si un elemento de selección, como una casilla de verificación, está seleccionada (true), no seleccionada (false) o indeterminada (mixed).

```html
<input type="checkbox" aria-checked="false" /> Opción
```

### aria-disabled

Indica si un elemento interactivo está deshabilitado (true) o habilitado (false).

```html
<button aria-disabled="true">No disponible</button>
```

## Propiedades de propósito

Las propiedades de propósito ARIA describen la relación de un elemento con otros elementos, su propósito y cómo interactuar con él. Estas propiedades complementan o reemplazan la semántica nativa de HTML cuando no es suficiente o no existe.

### aria-label

Proporciona una etiqueta accesible para un elemento, que es leída por los lectores de pantalla. Esto es útil cuando un elemento no tiene texto visible, pero necesita una descripción.

```html
<button aria-label="Buscar">🔍</button>
```

### aria-labelledby

Asocia un elemento con un identificador de otro elemento que actúa como su etiqueta (por ejemplo, relacionar una entrada de formulario con un título).

```html
<h2 id="titulo-form">Formulario de Contacto</h2>
<form aria-labelledby="titulo-form">
  <!-- Campos del formulario -->
</form>
```

### aria-describedby

Asocia un elemento con la descripción proporcionada por otro elemento. Esto es útil para asociar mensajes de ayuda o errores con campos de formulario.

```html
<input type="text" aria-describedby="ayuda-nombre" />
<p id="ayuda-nombre">Por favor, introduzca su nombre completo.</p>
```

## Ejemplo práctico

Supongamos que creamos un botón personalizado con un `<div>`, ya que queremos aplicar estilos avanzados que no son posibles con un `<button>` normal. Con ARIA, podemos hacerlo accesible:

```html
<div
  role="button"
  tabindex="0"
  aria-pressed="false"
  aria-label="Botón personalizado"
  onclick="togglePresionado(this)"
>
  Personalizado
</div>

<script>
  function togglePresionado(elemento) {
    const isPressed = elemento.getAttribute("aria-pressed") === "true";
    elemento.setAttribute("aria-pressed", !isPressed);
  }
</script>
```

## ARIA y accesibilidad nativa en HTML5

Es importante mencionar que muchos de los elementos semánticos de HTML5 ya son accesibles de forma nativa. Por ejemplo, elementos como `<button>, <header>, <nav>, y <main>` tienen semántica incorporada que las tecnologías de asistencia comprenden automáticamente.

## Buenas prácticas

**Usa ARIA solo cuando sea necesario:** Si puedes usar elementos semánticos nativos de HTML5, es mejor que depender de ARIA. Por ejemplo, en lugar de agregar role="button" a un `<div>`, utiliza simplemente el elemento `<button>`.

**Prueba la accesibilidad:** Después de agregar atributos ARIA, verifica el comportamiento de tu aplicación con un lector de pantalla para asegurarte de que todo funcione como esperas.

**No abuses de ARIA:** Evita la tentación de añadir roles y atributos ARIA a todos los elementos. Solo añádelos cuando sea necesario para mejorar la accesibilidad.
