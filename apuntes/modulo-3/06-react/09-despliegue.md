<h1 align="center">Despliegue de aplicaciones React</h1>

<h2>📑 Contenido</h2>

- [Despliegue de aplicaciones React](#despliegue-de-aplicaciones-react)
- [Preparación para producción (build, minificación)](#preparación-para-producción-build-minificación)
  - [Crear un build de producción](#crear-un-build-de-producción)
  - [Minificación y optimización](#minificación-y-optimización)
  - [Verificar el build](#verificar-el-build)
- [Despliegue en servicios de hosting (Netlify, Vercel, GitHub Pages)](#despliegue-en-servicios-de-hosting-netlify-vercel-github-pages)
  - [Netlify](#netlify)
  - [Vercel](#vercel)
  - [GitHub pages](#github-pages)

## Despliegue de aplicaciones React

Una vez que has desarrollado tu aplicación React, el siguiente paso es desplegarla en un entorno de producción para que los usuarios puedan acceder a ella.

## Preparación para producción (build, minificación)

Antes de desplegar tu aplicación, es crucial prepararla para producción. Esto implica optimizar el código, reducir el tamaño de los archivos y asegurarte de que todo funcione correctamente en un entorno real.

### Crear un build de producción

React ofrece un comando para generar una versión optimizada de tu aplicación:

```bash
npm run build
```

Este comando crea una carpeta llamada `build` que contiene todos los archivos necesarios para desplegar tu aplicación. Estos archivos están minificados y optimizados para mejorar el rendimiento.

### Minificación y optimización

Durante el proceso de build, React realiza varias optimizaciones:

- **Minificación:** Reduce el tamaño de los archivos JavaScript y CSS eliminando espacios, comentarios y acortando nombres de variables.

- **Tree Shaking:** Elimina código no utilizado para reducir el tamaño del bundle.

- **Code Splitting:** Divide el código en chunks más pequeños para cargar solo lo necesario.

### Verificar el build

Antes de desplegar, es recomendable verificar que el `build` funciona correctamente. Puedes servir la carpeta `build` localmente usando un servidor estático:

```bash
npx serve -s build
```

Esto te permitirá probar tu aplicación en un entorno similar al de producción.

## Despliegue en servicios de hosting (Netlify, Vercel, GitHub Pages)

Existen varios servicios de hosting que facilitan el despliegue de aplicaciones React. A continuación, te mostramos cómo desplegar en tres de los más populares: Netlify, Vercel y GitHub Pages.

### Netlify

Netlify es una plataforma popular para desplegar aplicaciones web estáticas. Ofrece integración con GitHub, GitLab y Bitbucket para despliegues automáticos.

### Vercel

Vercel es otra plataforma popular para desplegar aplicaciones React. Es especialmente conocida por su integración con Next.js, pero también funciona perfectamente con React.

### GitHub pages

GitHub Pages es una opción gratuita para desplegar aplicaciones estáticas directamente desde un repositorio de GitHub.
