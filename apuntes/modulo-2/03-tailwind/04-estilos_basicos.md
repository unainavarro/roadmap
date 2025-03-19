<h1 align="center">Estilos básicos</h1>

<h2>📑 Contenido</h2>

- [Manejo de tipografía](#manejo-de-tipografía)
  - [Tamaño de la fuente](#tamaño-de-la-fuente)
  - [Grosor de la fuente](#grosor-de-la-fuente)
  - [Alineación del texto](#alineación-del-texto)
  - [Otras utilidades de tipografía](#otras-utilidades-de-tipografía)
- [Colores y fondo](#colores-y-fondo)
  - [Colores de texto](#colores-de-texto)
  - [Colores de fondo](#colores-de-fondo)
  - [Opacidad](#opacidad)
- [Bordes y sombras](#bordes-y-sombras)
  - [Bordes](#bordes)
  - [Sombras](#sombras)
- [Espaciado (margin y padding)](#espaciado-margin-y-padding)
  - [Margin](#margin)
  - [Padding](#padding)
- [Flexbox y Grid](#flexbox-y-grid)
  - [Flexbox](#flexbox)
  - [Grid](#grid)

## Manejo de tipografía

Tailwind CSS proporciona una amplia gama de utilidades para controlar la tipografía, como el tamaño de la fuente, el peso, la alineación y más.

### Tamaño de la fuente

Tailwind incluye clases predefinidas para tamaños de fuente, desde `text-xs` (extra pequeño) hasta` text-6xl` (extra grande).

```html
<p class="text-sm">Texto pequeño</p>
<p class="text-lg">Texto grande</p>
<p class="text-2xl">Texto extra grande</p>
```

### Grosor de la fuente

Puedes controlar el grosor de la fuente con clases como `font-thin`, `font-bold`, o `font-black`.

```html
<p class="font-light">Texto ligero</p>
<p class="font-bold">Texto en negrita</p>
```

### Alineación del texto

Tailwind ofrece clases para alinear texto, como `text-left`, `text-center`, y `text-right`.

```html
<p class="text-center">Texto centrado</p>
```

### Otras utilidades de tipografía

- **Interlineado:** `leading-tight`, `leading-loose`.

- **Decoración:** `underline`, `line-through`.

- **Transformación:** `uppercase`, `lowercase`, `capitalize`.

```html
<p class="text-xl font-bold text-center uppercase underline">
  Título destacado
</p>
```

## Colores y fondo

Tailwind incluye una paleta de colores predefinida que puedes usar para texto, fondos, bordes y más.

### Colores de texto

Usa clases como `text-red-500` o `text-blue-700` para aplicar colores al texto.

```html
<p class="text-green-600">Texto verde</p>
```

### Colores de fondo

Aplica colores de fondo con clases como `bg-yellow-300` o `bg-gray-800`.

```html
<div class="bg-purple-500 p-4">Fondo morado</div>
```

### Opacidad

Puedes controlar la opacidad de los colores con clases como `text-opacity-50` o `bg-opacity-25`.

```html
<div class="bg-blue-500 bg-opacity-50 p-4">Fondo azul semitransparente</div>
```

## Bordes y sombras

Tailwind ofrece utilidades para agregar bordes y sombras a los elementos.

### Bordes

- **Ancho del borde:** `border`, `border-2`, `border-4`.

- **Color del borde:** `border-red-500`, `border-gray-300`.

- **Radio del borde:** `rounded`, `rounded-lg`, `rounded-full`.

```html
<div class="border-2 border-blue-500 rounded-lg p-4">Caja con borde azul</div>
```

### Sombras

- **Sombras pequeñas:** `shadow-sm`.

- **Sombras grandes:** `shadow-lg`.

- **Sombras personalizadas:** `shadow-xl`.

```html
<div class="shadow-lg p-4">Caja con sombra</div>
```

## Espaciado (margin y padding)

Tailwind utiliza un sistema de espaciado basado en una escala predefinida (desde `0` hasta `96`).

### Margin

- **Clases:** `m-4` (margin en todos los lados), `mx-2` (margin horizontal), `mt-8` (margin superior).

- **Valores negativos:** `-m-4`, `-mt-8`.

```html
<div class="m-4 p-4">Caja con margin y padding</div>
```

### Padding

- **Clases:** `p-4` (padding en todos los lados), `px-2` (padding horizontal), `pt-8` (padding superior).

```html
<div class="p-6">Caja con padding</div>
```

## Flexbox y Grid

Tailwind facilita la creación de layouts complejos con utilidades para Flexbox y Grid.

### Flexbox

- **Contenedor flex:** flex.

- **Dirección:** flex-row, flex-col.

- **Alineación:** justify-center, items-center.

- **Espaciado:** gap-4.

```html
<div class="flex justify-between items-center gap-4">
  <div class="p-4 bg-blue-500">Elemento 1</div>
  <div class="p-4 bg-green-500">Elemento 2</div>
</div>
```

### Grid

- **Contenedor grid:** grid.

- **Columnas:** grid-cols-3 (3 columnas).

- **Filas:** grid-rows-2 (2 filas).

- **Espaciado:** gap-4.

```html
<div class="grid grid-cols-3 gap-4">
  <div class="p-4 bg-red-500">1</div>
  <div class="p-4 bg-yellow-500">2</div>
  <div class="p-4 bg-green-500">3</div>
</div>
```
