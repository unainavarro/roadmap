<h1 align="center">Instalación y configuración</h1>

<h2>📑 Contenido</h2>

- [Instalación y configuración](#instalación-y-configuración)
  - [Instalación mediante npm (recomendado)](#instalación-mediante-npm-recomendado)
  - [Instalación mediante CDN (para prototipos rápidos)](#instalación-mediante-cdn-para-prototipos-rápidos)
    - [Limitaciones del CDN](#limitaciones-del-cdn)
- [Configuración inicial en un proyecto](#configuración-inicial-en-un-proyecto)
  - [Personalización del archivo tailwind.config.js](#personalización-del-archivo-tailwindconfigjs)
  - [Configuración de PurgeCSS](#configuración-de-purgecss)

## Instalación y configuración

> [!IMPORTANT]
> Esto lo hago como repaso para fortalecer conceptos básicos, MEJOR LEER LA DOCUMENTACIÓN.

### Instalación mediante npm (recomendado)

La instalación mediante npm es el método más común y recomendado para proyectos profesionales, ya que permite aprovechar todas las características de Tailwind, como la personalización y la optimización del CSS.

**Pasos para instalar Tailwind CSS con npm:**

1. Crear un proyecto nuevo (si no tienes uno):

   ```bash
   mkdir mi-proyecto-tailwind
   cd mi-proyecto-tailwind
   npm init -y
   ```

2. Instalar Tailwind CSS y sus dependencias:

   ```bash
   npm install tailwindcss postcss autoprefixer
   ```

3. Crear el archivo de configuración de Tailwind:

   ```bash
    npx tailwindcss init
   ```

   Esto generará un archivo tailwind.config.js en la raíz de tu proyecto.

4. Configurar PostCSS:
   Crea un archivo `postcss.config.js` en la raíz de tu proyecto y agrega lo siguiente:

   ```javascript
   module.exports = {
     plugins: {
       tailwindcss: {},
       autoprefixer: {},
     },
   };
   ```

5. Agregar las directivas de Tailwind a tu CSS:
   Crea un archivo CSS (por ejemplo, `src/styles.css`) y agrega lo siguiente:

   ```css
   @tailwind base;
   @tailwind components;
   @tailwind utilities;
   ```

6. Compilar el CSS:
   Si estás usando una herramienta de construcción como Webpack o Vite, asegúrate de que tu archivo CSS esté siendo procesado por PostCSS. Por ejemplo, en Webpack, puedes usar postcss-loader.

7. Importar el CSS en tu proyecto:
   Finalmente, importa el archivo CSS compilado en tu archivo HTML o JavaScript:

   ```html
   <link href="/dist/styles.css" rel="stylesheet" />
   ```

### Instalación mediante CDN (para prototipos rápidos)

Si estás creando un prototipo rápido o no quieres configurar un entorno de desarrollo complejo, puedes usar Tailwind CSS directamente desde un CDN.

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Mi Proyecto con Tailwind CSS</title>
    <link
      href="https://cdn.jsdelivr.net/npm/tailwindcss@3.3.2/dist/tailwind.min.css"
      rel="stylesheet"
    />
  </head>
  <body>
    <h1 class="text-3xl font-bold text-center text-blue-500">
      ¡Hola, Tailwind CSS!
    </h1>
  </body>
</html>
```

#### Limitaciones del CDN

- No puedes personalizar Tailwind (como cambiar colores o fuentes).

- No puedes usar PurgeCSS para optimizar el tamaño del CSS.

- No es recomendable para proyectos en producción.

## Configuración inicial en un proyecto

Una vez que Tailwind CSS está instalado, es importante configurarlo correctamente para aprovechar al máximo sus características.

### Personalización del archivo tailwind.config.js

El archivo `tailwind.config.js` te permite personalizar casi todos los aspectos de Tailwind, como colores, fuentes, espaciados y más.

Ejemplo de personalización básica:

```javascript
module.exports = {
  content: ["./src/**/*.{html,js}"],
  theme: {
    extend: {
      colors: {
        "mi-color": "#FF6347",
      },
      fontFamily: {
        "mi-fuente": ["Roboto", "sans-serif"],
      },
    },
  },
  plugins: [],
};
```

### Configuración de PurgeCSS

Para optimizar el tamaño del CSS en producción, Tailwind utiliza PurgeCSS para eliminar las clases no utilizadas. Puedes configurar esto en el archivo `tailwind.config.js`:

```javascript
module.exports = {
  purge: {
    enabled: process.env.NODE_ENV === "production",
    content: ["./src/**/*.{html,js}"],
  },
  // Otras configuraciones...
};
```
