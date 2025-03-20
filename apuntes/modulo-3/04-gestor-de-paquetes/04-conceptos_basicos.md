<h1 align="center">Conceptos básicos (enfoque en npm)</h1>

<h2>📑 Contenido</h2>

- [Instalación de paquetes](#instalación-de-paquetes)
  - [Instalación local](#instalación-local)
  - [Instalación global](#instalación-global)
  - [Instalación como dependencia de desarrollo](#instalación-como-dependencia-de-desarrollo)
  - [Instalación de una versión específica](#instalación-de-una-versión-específica)
  - [Instalación de todas las dependencias de un proyecto](#instalación-de-todas-las-dependencias-de-un-proyecto)
- [Actualización de paquetes](#actualización-de-paquetes)
  - [Actualización de un paquete específico](#actualización-de-un-paquete-específico)
  - [Actualización de todos los paquetes](#actualización-de-todos-los-paquetes)
  - [Actualización global](#actualización-global)
  - [Actualización de npm](#actualización-de-npm)
- [Eliminación de paquetes](#eliminación-de-paquetes)
  - [Eliminación local](#eliminación-local)
  - [Eliminación global](#eliminación-global)
  - [Eliminación de dependencias de desarrollo](#eliminación-de-dependencias-de-desarrollo)
- [Búsqueda de paquetes en repositorios](#búsqueda-de-paquetes-en-repositorios)
  - [Búsqueda en la línea de comandos](#búsqueda-en-la-línea-de-comandos)
  - [Búsqueda en el sitio web de npm](#búsqueda-en-el-sitio-web-de-npm)
  - [Filtrado de resultados](#filtrado-de-resultados)

## Instalación de paquetes

### Instalación local

Para instalar un paquete localmente en tu proyecto, utiliza el siguiente comando:

```bash
npm install nombre-del-paquete
```

- Esto añadirá el paquete a la lista de dependencias en tu archivo package.json y lo instalará en la carpeta node_modules.

- Si el archivo package.json no existe, npm lo creará automáticamente.

### Instalación global

Si deseas instalar un paquete globalmente (disponible para todos los proyectos en tu sistema), usa:

```bash
npm install -g nombre-del-paquete
```

Los paquetes globales suelen ser herramientas de línea de comandos, como `nodemon` o `typescript`.

### Instalación como dependencia de desarrollo

Para instalar un paquete como una dependencia de desarrollo (solo necesaria durante el desarrollo, no en producción), usa:

```bash
npm install nombre-del-paquete --save-dev
```

Esto añadirá el paquete a la sección devDependencies en `package.json`

### Instalación de una versión específica

Si necesitas instalar una versión específica de un paquete, puedes hacerlo de la siguiente manera:

```bash
npm install nombre-del-paquete@versión

# Por ejemplo, para instalar la versión 1.2.3 de un paquete:
npm install nombre-del-paquete@1.2.3
```

Por ejemplo, para instalar la versión 1.2.3 de un paquete:

### Instalación de todas las dependencias de un proyecto

Si clonas un proyecto existente o necesitas instalar todas las dependencias listadas en `package.json`, simplemente ejecuta:

```bash
npm install
```

## Actualización de paquetes

### Actualización de un paquete específico

Para actualizar un paquete a la última versión compatible según `package.json`, usa:

```bash
npm update nombre-del-paquete
```

### Actualización de todos los paquetes

Para actualizar todas las dependencias del proyecto:

```bash
npm update
```

### Actualización global

Si deseas actualizar un paquete instalado globalmente:

```bash
npm update -g nombre-del-paquete
```

### Actualización de npm

Para asegurarte de que estás utilizando la última versión de npm, puedes actualizarlo globalmente:

```bash
npm install -g npm
```

## Eliminación de paquetes

### Eliminación local

Para eliminar un paquete instalado localmente:

```bash
npm uninstall nombre-del-paquete
```

### Eliminación global

Para eliminar un paquete instalado globalmente:

```bash
npm uninstall -g nombre-del-paquete
```

### Eliminación de dependencias de desarrollo

Si el paquete está listado como una dependencia de desarrollo, también se eliminará de `devDependencies` en `package.json`.

## Búsqueda de paquetes en repositorios

### Búsqueda en la línea de comandos

Para buscar paquetes en el registro de npm directamente desde la terminal, usa:

```bash
npm search nombre-del-paquete
```

Esto mostrará una lista de paquetes que coinciden con el término de búsqueda, junto con una breve descripción.

### Búsqueda en el sitio web de npm

- También puedes buscar paquetes directamente en el sitio web de npm.

- El sitio web ofrece una interfaz más amigable, con detalles como la popularidad, el mantenimiento y las dependencias de cada paquete.

### Filtrado de resultados

Si deseas filtrar los resultados de búsqueda por popularidad, mantenimiento o seguridad, puedes usar herramientas como **npms.io**, que proporciona métricas adicionales sobre los paquetes.
