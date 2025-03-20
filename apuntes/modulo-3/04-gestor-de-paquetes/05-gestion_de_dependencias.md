<h1 align="center">Gestión de Dependencias (enfoque en npm)</h1>

<h2>📑 Contenido</h2>

- [Manejo de versiones y actualizaciones](#manejo-de-versiones-y-actualizaciones)
  - [Sistema de versiones semántico (SemVer)](#sistema-de-versiones-semántico-semver)
  - [Especificación de versiones en package.json](#especificación-de-versiones-en-packagejson)
  - [Actualización de dependencias](#actualización-de-dependencias)
  - [Verificación de dependencias obsoletas](#verificación-de-dependencias-obsoletas)
- [Solución de conflictos de dependencias](#solución-de-conflictos-de-dependencias)
  - [Conflictos comunes](#conflictos-comunes)
  - [Uso de npm dedupe](#uso-de-npm-dedupe)
  - [Resolución manual](#resolución-manual)
  - [Eliminación y reinstalación](#eliminación-y-reinstalación)
  - [Uso de archivos de configuración (package.json)](#uso-de-archivos-de-configuración-packagejson)
  - [Dependencias y devDependencies](#dependencias-y-devdependencies)
  - [Scripts personalizados](#scripts-personalizados)
  - [Bloqueo de versiones con package-lock.json](#bloqueo-de-versiones-con-package-lockjson)

## Manejo de versiones y actualizaciones

### Sistema de versiones semántico (SemVer)

npm utiliza el sistema de versiones semántico (SemVer) para gestionar versiones de paquetes. Una versión se compone de tres números: `MAYOR.MENOR.PARCHE`:

- **MAYOR:** Cambios incompatibles con versiones anteriores.

- **MENOR:** Nuevas funcionalidades compatibles con versiones anteriores.

- **PARCHE:** Correcciones de errores compatibles con versiones anteriores.

**Ejemplo:** `1.2.3` (MAYOR=1, MENOR=2, PARCHE=3).

### Especificación de versiones en package.json

En el archivo `package.json`, las dependencias pueden especificarse de varias formas:

- **Versión exacta:** `"1.2.3"` (solo esta versión).

- **Compatibilidad con parches:** `~1.2.3` (actualiza solo parches, por ejemplo, `1.2.4`).

- **Compatibilidad con menores:** `^1.2.3` (actualiza menores y parches, por ejemplo, `1.3.0`).

- **Última versión:** `*` (cualquier versión, no recomendado).

### Actualización de dependencias

Para actualizar todas las dependencias a sus últimas versiones compatibles:

```bash
npm update
```

Para actualizar una dependencia específica:

```bash
npm update nombre-del-paquete
```

Para actualizar a una versión específica:

```bash
npm install nombre-del-paquete@versión
```

### Verificación de dependencias obsoletas

Para verificar si hay paquetes obsoletos en tu proyecto:

```bash
npm outdated
```

Esto mostrará una lista de paquetes con sus versiones actuales, deseadas y más recientes.

## Solución de conflictos de dependencias

### Conflictos comunes

Los conflictos de dependencias ocurren cuando dos o más paquetes requieren versiones diferentes de una misma dependencia.

npm intenta resolver estos conflictos automáticamente, pero a veces es necesario intervenir manualmente.

---

### Uso de npm dedupe

Si hay duplicados de paquetes en `node_modules`, puedes intentar eliminarlos con:

```bash
npm dedupe
```

Esto optimiza la estructura de node_modules y reduce el tamaño del proyecto.

---

### Resolución manual

Si npm no puede resolver un conflicto, puedes:

Especificar una versión compatible en `package.json`.

Usar `resolutions` (en proyectos con Yarn) o `overrides` (en npm 8.3+) para forzar una versión específica.

Ejemplo de `overrides` en `package.json`:

```bash
{
  "overrides": {
    "nombre-del-paquete": "versión-específica"
  }
}
```

---

### Eliminación y reinstalación

Si los conflictos persisten, puedes eliminar `node_modules` y el archivo `package-lock.json`, y luego reinstalar las dependencias:

```bash
rm -rf node_modules package-lock.json
npm install
```

### Uso de archivos de configuración (package.json)

Estructura básica de package.json:

El archivo **package.json** es el corazón de un proyecto Node.js. Contiene metadatos y configuraciones del proyecto, incluyendo dependencias y scripts.

Ejemplo básico:

```json
{
  "name": "mi-proyecto",
  "version": "1.0.0",
  "description": "Un proyecto de ejemplo",
  "main": "index.js",
  "scripts": {
    "start": "node index.js",
    "test": "echo \"Error: no test specified\" && exit 1"
  },
  "dependencies": {
    "express": "^4.17.1"
  },
  "devDependencies": {
    "nodemon": "^2.0.7"
  }
}
```

### Dependencias y devDependencies

- **dependencies:** Paquetes necesarios para la ejecución del proyecto en producción.

- **devDependencies:** Paquetes necesarios solo durante el desarrollo (por ejemplo, herramientas de testing o compilación).

### Scripts personalizados

Los scripts definidos en `package.json` pueden ejecutarse con npm run `<nombre-del-script>`.

Ejemplo:

```json
"scripts": {
  "start": "node index.js",
  "dev": "nodemon index.js",
  "build": "webpack --config webpack.config.js"
}
```

Para ejecutar el script dev:

```bash
npm run dev
```

### Bloqueo de versiones con package-lock.json

El archivo `package-lock.json` asegura que todas las instalaciones futuras usen las mismas versiones de las dependencias.

No debe modificarse manualmente, ya que es generado automáticamente por npm.
