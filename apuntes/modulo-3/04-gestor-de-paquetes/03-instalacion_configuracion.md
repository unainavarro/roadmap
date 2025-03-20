<h1 align="center"> Instalación y configuración</h1>

<h2>📑 Contenido</h2>

- [Instalación y configuración (enfoque en npm)](#instalación-y-configuración-enfoque-en-npm)
  - [npm (Node Package Manager)](#npm-node-package-manager)
- [Configuración inicial y ajustes](#configuración-inicial-y-ajustes)
  - [Configuración del registro](#configuración-del-registro)
  - [Archivo package.json](#archivo-packagejson)
  - [Instalación global vs local](#instalación-global-vs-local)

## Instalación y configuración (enfoque en npm)

En este capítulo, nos centraremos exclusivamente en la instalación y configuración de tres gestores de paquetes ampliamente utilizados en el desarrollo de software: npm para Node.js, Maven para Java y Composer para PHP. Estos gestores son esenciales para gestionar dependencias en proyectos modernos, y su correcta configuración es clave para un flujo de trabajo eficiente.

### npm (Node Package Manager)

npm viene incluido con Node.js, por lo que instalar Node.js automáticamente instala npm.

**Pasos para instalar npm:**

- Descarga Node.js desde el sitio oficial.

- Ejecuta el instalador y sigue las instrucciones.

- Verifica la instalación

  ```bash
  node -v  # Verifica la versión de Node.js
  npm -v   # Verifica la versión de npm
  ```

## Configuración inicial y ajustes

### Configuración del registro

npm utiliza el registro público de npm por defecto. Si necesitas usar un registro privado, puedes cambiarlo:

```bash
npm config set registry https://registry.npmjs.org/
```

### Archivo package.json

Este archivo define las dependencias y scripts de tu proyecto. Puedes generarlo con:

```bash
npm init
```

### Instalación global vs local

Los paquetes pueden instalarse globalmente (disponibles para todos los proyectos) o localmente (solo para el proyecto actual):

```bash
npm install -g nombre-del-paquete  # Global
npm install nombre-del-paquete     # Local
```
