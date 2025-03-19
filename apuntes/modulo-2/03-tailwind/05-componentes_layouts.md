<h1 align="center">Componentes y layouts</h1>

<h2>📑 Contenido</h2>

- [Crear y reutilizar componentes](#crear-y-reutilizar-componentes)
  - [Opción básica: usando clases utilitarias](#opción-básica-usando-clases-utilitarias)
  - [Opción avanzada: crear clases reutilizables](#opción-avanzada-crear-clases-reutilizables)
  - [Opción extra: modificadores en variantes](#opción-extra-modificadores-en-variantes)
- [Diseño responsivo con Tailwind](#diseño-responsivo-con-tailwind)
  - [Ejemplo: diseño responsivo](#ejemplo-diseño-responsivo)
  - [Ejemplo: ocultar elementos en diferentes pantallas](#ejemplo-ocultar-elementos-en-diferentes-pantallas)
- [Grillas y alineación de elementos](#grillas-y-alineación-de-elementos)
  - [Ejemplo: grilla responsiva](#ejemplo-grilla-responsiva)

## Crear y reutilizar componentes

Tailwind CSS fomenta la creación de componentes reutilizables directamente en el HTML utilizando clases utilitarias. Sin embargo, también puedes combinar Tailwind con herramientas como React, Vue, o JavaScript moderno para crear componentes más dinámicos.

Si quieres estilizar un botón utilizando Tailwind CSS y hacerlo reutilizable en todo tu proyecto, puedes definir una clase base directamente en el archivo HTML o hacerlo más elegante con las herramientas de configuración de Tailwind.

### Opción básica: usando clases utilitarias

Puedes aplicar varias clases a un botón directamente en tu código HTML.

```html
<button
  class="bg-blue-500 text-white font-bold py-2 px-4 rounded hover:bg-blue-600"
>
  Botón primario
</button>
```

### Opción avanzada: crear clases reutilizables

Si necesitas usar el mismo diseño en varios botones, puedes extender la funcionalidad con `@layer` y definir una clase reutilizable en tu archivo CSS de Tailwind. Por ejemplo:

1. Crea un archivo CSS o utiliza el existente.

2. Añade el siguiente código:

```css
@layer components {
  .btn {
    @apply bg-blue-500 text-white font-bold py-2 px-4 rounded hover:bg-blue-600;
  }
}
```

3. Ahora puedes usar la clase personalizada btn en tus botones:

```html
<button class="btn">Botón reutilizable</button>
```

### Opción extra: modificadores en variantes

Si necesitas diferentes estilos (por ejemplo, botones primarios y secundarios), puedes aprovechar modificadores con Tailwind:

```css
@layer components {
  .btn {
    @apply py-2 px-4 font-bold rounded;
  }
  .btn-primary {
    @apply bg-blue-500 text-white hover:bg-blue-600;
  }
  .btn-secondary {
    @apply bg-gray-500 text-white hover:bg-gray-600;
  }
}
```

Esto permite usar variantes fácilmente:

```html
<button class="btn btn-primary">Primario</button>
<button class="btn btn-secondary">Secundario</button>
```

## Diseño responsivo con Tailwind

Tailwind CSS facilita la creación de diseños responsivos mediante el uso de breakpoints. Los breakpoints se aplican utilizando prefijos como `sm:`, `md:`, `lg:`, y `xl:`.

**Breakpoints predeterminados:**

- **sm:** 640px

- **md:** 768px

- **lg:** 1024px

- **xl:** 1280px

- **2xl:** 1536px

### Ejemplo: diseño responsivo

```html
<div
  class="text-center sm:text-left md:text-right lg:text-center xl:text-justify"
>
  Este texto cambia de alineación según el tamaño de la pantalla.
</div>
```

### Ejemplo: ocultar elementos en diferentes pantallas

```html
<div class="hidden sm:block">
  Visible solo en pantallas pequeñas y superiores.
</div>
```

## Grillas y alineación de elementos

Tailwind CSS ofrece utilidades para trabajar con CSS Grid y Flexbox, lo que te permite crear layouts complejos y bien alineados.

### Ejemplo: grilla responsiva

```html
<div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-4">
  <div class="p-4 bg-blue-500">1</div>
  <div class="p-4 bg-green-500">2</div>
  <div class="p-4 bg-red-500">3</div>
</div>
```
