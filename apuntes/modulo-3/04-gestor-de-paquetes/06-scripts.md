<h1 align="center">Scripts y automatización (enfoque en npm)</h1>

<h2>📑 Contenido</h2>

- [Creación y uso de scripts con gestores de paquetes](#creación-y-uso-de-scripts-con-gestores-de-paquetes)
  - [Scripts en package.json](#scripts-en-packagejson)
  - [Scripts predefinidos](#scripts-predefinidos)
  - [Pasar argumentos a scripts](#pasar-argumentos-a-scripts)
- [Automatización de tareas comunes](#automatización-de-tareas-comunes)
  - [Scripts de construcción (build)](#scripts-de-construcción-build)
  - [Scripts de pruebas (test)](#scripts-de-pruebas-test)
  - [Scripts de despliegue (deploy)](#scripts-de-despliegue-deploy)
  - [Scripts de limpieza (clean)](#scripts-de-limpieza-clean)

## Creación y uso de scripts con gestores de paquetes

### Scripts en package.json

El archivo `package.json` permite definir scripts personalizados en la sección scripts. Estos scripts pueden ejecutar comandos de terminal, herramientas de construcción, pruebas, despliegues y más.

Ejemplo básico:

```json
"scripts": {
  "start": "node index.js",
  "dev": "nodemon index.js",
  "test": "jest",
  "build": "webpack --config webpack.config.js"
}
```

Para ejecutar un script, usa:

```bash
npm run nombre-del-script
```

### Scripts predefinidos

npm tiene algunos scripts predefinidos que se ejecutan automáticamente en ciertas situaciones:

- **prestart:** Se ejecuta antes de `start`.

- **postinstall:** Se ejecuta después de `npm install`.

- **pretest:** Se ejecuta antes de `test`.

- **postbuild:** Se ejecuta después de `build`.

Ejemplo:

```json
"scripts": {
  "prestart": "echo 'Preparando para iniciar...'",
  "start": "node index.js",
  "poststart": "echo 'Aplicación iniciada.'"
}
```

### Pasar argumentos a scripts

Puedes pasar argumentos a los scripts usando `--`:

```bash
npm run nombre-del-script -- --arg1 valor1 --arg2 valor2
```

## Automatización de tareas comunes

### Scripts de construcción (build)

Los scripts de construcción compilan o transpilan el código fuente en un formato listo para producción.

Ejemplo con Webpack:

```json
"scripts": {
  "build": "webpack --config webpack.config.js"
}
```

### Scripts de pruebas (test)

Los scripts de pruebas ejecutan suites de pruebas automatizadas.

Ejemplo con Jest:

```json
"scripts": {
  "test": "jest",
  "test:watch": "jest --watch"
}
```

### Scripts de despliegue (deploy)

Los scripts de despliegue automatizan el proceso de subir tu aplicación a un servidor o plataforma en la nube.

Ejemplo con Heroku:

```json
"scripts": {
  "deploy": "git push heroku main"
}
```

### Scripts de limpieza (clean)

Los scripts de limpieza eliminan archivos generados automáticamente, como carpetas `node_modules` o archivos de construcción.

Ejemplo:

```json
"scripts": {
  "clean": "rm -rf dist node_modules"
}
```
