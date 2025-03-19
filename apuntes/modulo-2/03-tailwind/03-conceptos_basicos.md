<h1 align="center">Conceptos básicos</h1>

<h2>📑 Contenido</h2>

- [Clases utilitarias](#clases-utilitarias)
  - [Ejemplos de clases utilitarias](#ejemplos-de-clases-utilitarias)
  - [Ventajas de las clases utilitarias](#ventajas-de-las-clases-utilitarias)
- [Filosofía "utility-first"](#filosofía-utility-first)
  - [¿Por qué "utility-first"?](#por-qué-utility-first)
- [Creación de un archivo de configuración (tailwind.config.js)](#creación-de-un-archivo-de-configuración-tailwindconfigjs)
  - [Generar el archivo de configuración](#generar-el-archivo-de-configuración)
  - [Estructura básica del archivo](#estructura-básica-del-archivo)
  - [Configurar el contenido](#configurar-el-contenido)
- [Personalización y extendido de Tailwind](#personalización-y-extendido-de-tailwind)
  - [Extender el tema predeterminado](#extender-el-tema-predeterminado)
    - [Ejemplo: agregar un color personalizado](#ejemplo-agregar-un-color-personalizado)
  - [Ejemplo: agregar una fuente personalizada](#ejemplo-agregar-una-fuente-personalizada)
  - [Sobrescribir valores predeterminados](#sobrescribir-valores-predeterminados)
    - [Ejemplo: cambiar el espaciado predeterminado](#ejemplo-cambiar-el-espaciado-predeterminado)

## Clases utilitarias

Tailwind CSS se basa en el uso de clases utilitarias, que son clases predefinidas que aplican estilos específicos a los elementos HTML. Cada clase representa una propiedad CSS, como `margin`, `padding`, `color`, `font-size`, etc.

### Ejemplos de clases utilitarias

- **Espaciado:** m-4 (`margin` de 1rem), p-2 (`padding` de 0.5rem).

- **Texto:** `text-center` (alineación centrada), `text-xl` (tamaño de texto extra grande).

- **Colores:** `bg-blue-500` (fondo azul), `text-red-600` (texto rojo).

- **Flexbox:** `flex`, `justify-center`, `items-center`.

- **Grid:** `grid`, `grid-cols-3`, `gap-4`.

### Ventajas de las clases utilitarias

- **Rapidez:** No necesitas escribir CSS personalizado; simplemente aplicas las clases en tu HTML.

- **Consistencia:** Las clases siguen un sistema de diseño unificado, lo que garantiza coherencia en todo el proyecto.

- **Flexibilidad:** Puedes combinar clases para crear diseños únicos sin limitarte a componentes predefinidos.

## Filosofía "utility-first"

La filosofía "utility-first" es el núcleo de Tailwind CSS. En lugar de usar componentes predefinidos (como en Bootstrap), Tailwind te anima a construir interfaces combinando clases utilitarias directamente en tu HTML.

### ¿Por qué "utility-first"?

- **Control total:** Tienes control absoluto sobre el diseño, sin necesidad de sobrescribir estilos.

- **Menos CSS personalizado:** Al usar clases utilitarias, reduces la necesidad de escribir CSS adicional.

- **Facilita el mantenimiento:** Al seguir un sistema de diseño unificado, es más fácil mantener y escalar el proyecto.

```html
<div class="bg-white p-6 rounded-lg shadow-md">
  <h2 class="text-2xl font-bold text-gray-800 mb-4">Título de la tarjeta</h2>
  <p class="text-gray-600">
    Este es un ejemplo de una tarjeta creada con clases utilitarias de Tailwind
    CSS.
  </p>
</div>
```

## Creación de un archivo de configuración (tailwind.config.js)

El archivo `tailwind.config.js` es el corazón de la personalización en Tailwind CSS. Aquí puedes definir colores, fuentes, espaciados, breakpoints y más.

### Generar el archivo de configuración

Ejecuta el siguiente comando en tu terminal:

```bash
npx tailwindcss init
```

Esto creará un archivo `tailwind.config.js` en la raíz de tu proyecto.

### Estructura básica del archivo

```javascript
module.exports = {
  content: ["./src/**/*.{html,js}"],
  theme: {
    extend: {},
  },
  plugins: [],
};
```

### Configurar el contenido

El campo `content` define los archivos que Tailwind debe escanear para encontrar clases utilitarias. Esto es esencial para que PurgeCSS funcione correctamente.

## Personalización y extendido de Tailwind

Tailwind CSS es altamente personalizable. Puedes extender su configuración predeterminada para adaptarlo a las necesidades de tu proyecto.

### Extender el tema predeterminado

Puedes agregar nuevos valores o sobrescribir los existentes en el objeto theme de `tailwind.config.js`.

#### Ejemplo: agregar un color personalizado

```javascript
module.exports = {
  theme: {
    extend: {
      colors: {
        "mi-color": "#FF6347",
      },
    },
  },
};
```

Ahora puedes usar `bg-mi-color` o `text-mi-color` en tu HTML.

### Ejemplo: agregar una fuente personalizada

```javascript
module.exports = {
  theme: {
    extend: {
      fontFamily: {
        "mi-fuente": ["Roboto", "sans-serif"],
      },
    },
  },
};
```

### Sobrescribir valores predeterminados

Si deseas cambiar un valor predeterminado, simplemente agrégalo directamente en el objeto theme (**sin usar extend**).

#### Ejemplo: cambiar el espaciado predeterminado

```javascript
module.exports = {
  theme: {
    spacing: {
      1: "0.25rem",
      2: "0.5rem",
      3: "0.75rem",
      4: "1rem",
    },
  },
};
```
