<h1 align="center">Estados</h1>

<h2>📑 Contenido</h2>

- [Manejo de estados (hover, focus, active)](#manejo-de-estados-hover-focus-active)
- [Hover](#hover)
- [Focus](#focus)
- [Active](#active)
- [Otros estados](#otros-estados)

## Manejo de estados (hover, focus, active)

Tailwind CSS permite aplicar estilos en diferentes estados de los elementos, como hover, focus, active, y más, utilizando prefijos como hover:, focus:, y active:.

## Hover

Aplica estilos cuando el usuario pasa el cursor sobre un elemento.

```html
<button class="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600">
  Haz clic aquí
</button>
```

## Focus

Aplica estilos cuando un elemento está enfocado (por ejemplo, un input).

```html
<input
  class="border border-gray-300 p-2 rounded focus:border-blue-500 focus:ring-2 focus:ring-blue-200"
  placeholder="Escribe algo"
/>
```

## Active

Aplica estilos cuando un elemento está activo (por ejemplo, un botón presionado).

```html
<button class="bg-blue-500 text-white px-4 py-2 rounded active:bg-blue-700">
  Haz clic aquí
</button>
```

## Otros estados

- **Disabled:** `disabled:opacity-50`.

- **Group hover:** `group-hover:bg-red-500` (útil en combinación con el grupo de elementos).

```html
<div class="group">
  <div class="p-4 bg-blue-500 group-hover:bg-red-500">Pasa el cursor aquí</div>
</div>
```
