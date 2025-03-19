<h1 align="center">Optimización</h1>

<h2>📑 Contenido</h2>

- [Purga de CSS no utilizado](#purga-de-css-no-utilizado)
  - [Configuración de PurgeCSS](#configuración-de-purgecss)
  - [¿Cómo funciona PurgeCSS?](#cómo-funciona-purgecss)
- [Optimización para producción](#optimización-para-producción)
  - [Minificación del CSS](#minificación-del-css)
  - [Uso de CDN](#uso-de-cdn)

## Purga de CSS no utilizado

Tailwind CSS genera una gran cantidad de clases utilitarias, pero no todas se utilizan en tu proyecto. Para reducir el tamaño del archivo CSS final, Tailwind utiliza PurgeCSS, una herramienta que elimina las clases no utilizadas.

### Configuración de PurgeCSS

Tailwind incluye PurgeCSS de forma predeterminada en su configuración. Solo necesitas especificar los archivos que Tailwind debe escanear para encontrar clases utilizadas.

Ejemplo: Configurar PurgeCSS en `tailwind.config.js`

```javascript
module.exports = {
  purge: {
    enabled: process.env.NODE_ENV === "production", // Solo en producción
    content: ["./src/**/*.{html,js,jsx,ts,tsx,vue}"],
  },
  theme: {
    extend: {},
  },
  plugins: [],
};
```

### ¿Cómo funciona PurgeCSS?

PurgeCSS escanea los archivos especificados en `content` y elimina las clases de Tailwind que no se encuentran en esos archivos. Esto reduce drásticamente el tamaño del archivo CSS final.

**Ejemplo: Antes y después de PurgeCSS**

- **Antes:** Archivo CSS de ~2MB (con todas las clases de Tailwind).

- **Después:** Archivo CSS de ~10KB (solo las clases utilizadas).

**Consideraciones adicionales**

- **Clases dinámicas:** Si usas clases generadas dinámicamente (por ejemplo, en JavaScript), asegúrate de agregarlas en la configuración de PurgeCSS usando la opción `safelist`.

- **Modo JIT:** Tailwind CSS JIT (Just-In-Time) genera solo las clases que usas, lo que elimina la necesidad de PurgeCSS en muchos casos.

## Optimización para producción

Además de purgar el CSS no utilizado, hay otras técnicas para optimizar tu proyecto Tailwind CSS para producción.

### Minificación del CSS

Minificar el CSS reduce su tamaño al eliminar espacios, comentarios y caracteres innecesarios.

1. Instala cssnano:

   ```bash
   npm install cssnano
   ```

2. Configura cssnano en postcss.config.js:

   ```javascript
   module.exports = {
     plugins: {
       tailwindcss: {},
       autoprefixer: {},
       ...(process.env.NODE_ENV === "production" ? { cssnano: {} } : {}),
     },
   };
   ```

### Uso de CDN

Si usas Tailwind CSS mediante CDN, asegúrate de que el archivo CSS esté en caché para mejorar el rendimiento.

Ejemplo: Agregar caché en el encabezado HTTP

```http
Cache-Control: public, max-age=31536000
```
