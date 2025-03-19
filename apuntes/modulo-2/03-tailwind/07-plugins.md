<h1 align="center">Plugins</h1>

<h2>📑 Contenido</h2>

- [Instalación y uso de plugins oficiales](#instalación-y-uso-de-plugins-oficiales)
  - [Plugins oficiales disponibles](#plugins-oficiales-disponibles)
  - [Instalación de plugins oficiales](#instalación-de-plugins-oficiales)
- [Creación de plugins personalizados](#creación-de-plugins-personalizados)
  - [Ejemplo: crear un plugin para rotar elementos](#ejemplo-crear-un-plugin-para-rotar-elementos)

## Instalación y uso de plugins oficiales

Tailwind CSS ofrece una serie de plugins oficiales que agregan funcionalidades adicionales, como formularios, tipografías, y más. Estos plugins son fáciles de instalar y configura

### Plugins oficiales disponibles

- **@tailwindcss/forms:** Estilos predeterminados para elementos de formulario.

- **@tailwindcss/typography:** Estilos para contenido tipográfico (como artículos o blogs).

- **@tailwindcss/line-clamp:** Limita el número de líneas de texto.

- **@tailwindcss/aspect-ratio:** Controla la relación de aspecto de los elementos.

### Instalación de plugins oficiales

Para instalar un plugin oficial, primero debes agregarlo como dependencia en tu proyecto.

**Ejemplo:** Instalar el plugin de formularios (`@tailwindcss/forms`)

1. Instala el plugin:

   ```bash
   npm install @tailwindcss/typography
   ```

2. Agrega el plugin en tailwind.config.js:

   ```javascript
   module.exports = {
     plugins: [require("@tailwindcss/typography")],
   };
   ```

3. Usa las clases en tu HTML:

   ```html
   <article class="prose">
     <h1>Este es un título</h1>
     <p>Este es un párrafo de ejemplo con estilos tipográficos.</p>
   </article>
   ```

## Creación de plugins personalizados

Si necesitas funcionalidades específicas que no están cubiertas por los plugins oficiales, puedes crear tus propios plugins personalizados.

### Ejemplo: crear un plugin para rotar elementos

1. Crea un archivo rotatePlugin.js:

```javascript
const plugin = require("tailwindcss/plugin");

module.exports = plugin(function ({ addUtilities }) {
  const newUtilities = {
    ".rotate-45": {
      transform: "rotate(45deg)",
    },
    ".rotate-90": {
      transform: "rotate(90deg)",
    },
    ".rotate-180": {
      transform: "rotate(180deg)",
    },
  };
  addUtilities(newUtilities);
});
```

2. Agrega el plugin en tailwind.config.js:

```javascript
module.exports = {
  plugins: [require("./rotatePlugin")],
};
```

3. Usa las nuevas clases en tu HTML:

```html
<div class="rotate-45">Este elemento está rotado 45 grados.</div>
```
