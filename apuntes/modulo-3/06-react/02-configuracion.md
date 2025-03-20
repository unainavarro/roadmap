<h1 align="center">Configuración del entorno</h1>

<h2>📑 Contenido</h2>

- [Instalación de Node.js y npm](#instalación-de-nodejs-y-npm)
  - [Pasos para instalar Node.js y npm:](#pasos-para-instalar-nodejs-y-npm)
- [Configuración de un proyecto React con Create React App](#configuración-de-un-proyecto-react-con-create-react-app)
  - [Instalar create React App](#instalar-create-react-app)
  - [Crear un nuevo proyecto](#crear-un-nuevo-proyecto)
  - [Iniciar el servidor de desarrollo](#iniciar-el-servidor-de-desarrollo)
- [Estructura de archivos en un proyecto React](#estructura-de-archivos-en-un-proyecto-react)
  - [Explicación de los archivos y carpetas principales](#explicación-de-los-archivos-y-carpetas-principales)
    - [node\_modules/](#node_modules)
    - [public/](#public)
    - [src/](#src)
    - [index.js](#indexjs)
    - [App.js](#appjs)
    - [App.css y index.css](#appcss-y-indexcss)
    - [package.json](#packagejson)
    - [README.md](#readmemd)

## Instalación de Node.js y npm

React se basa en Node.js y npm (Node Package Manager) para gestionar dependencias y ejecutar scripts. Node.js es un entorno de ejecución de JavaScript fuera del navegador, mientras que npm es el gestor de paquetes predeterminado para Node.js.

### Pasos para instalar Node.js y npm:

- **Descargar Node.js:**

  - Visita el sitio oficial de Node.js: https://nodejs.org.

  - Descarga la versión LTS (Long Term Support), que es la más estable y recomendada para la mayoría de los usuarios.

- **Instalar Node.js:**

  - Ejecuta el instalador descargado y sigue las instrucciones del asistente de instalación.

  - Asegúrate de marcar la opción para incluir npm durante la instalación.

- **Verificar la instalación:**

  - Abre una terminal o línea de comandos.

  - Ejecuta los siguientes comandos para verificar que Node.js y npm se hayan instalado correctamente:

    ```bash
    node -v
    npm -v
    ```

  - Estos comandos mostrarán las versiones instaladas de Node.js y npm, respectivamente.

## Configuración de un proyecto React con Create React App

Create React App (CRA) es una herramienta oficial de React que permite configurar rápidamente un nuevo proyecto con una estructura predefinida y todas las dependencias necesarias. Es ideal para principiantes y proyectos pequeños o medianos.

### Instalar create React App

Abre una terminal y ejecuta el siguiente comando para instalar Create React App globalmente (si no lo has hecho antes):

```bash
npm install -g create-react-app
```

### Crear un nuevo proyecto

Navega a la carpeta donde deseas crear tu proyecto y ejecuta:

```bash
npx create-react-app nombre-del-proyecto
```

### Iniciar el servidor de desarrollo

Una vez que se complete la instalación, navega a la carpeta del proyecto:

```bash
cd nombre-del-proyecto
```

Luego, inicia el servidor de desarrollo con:

```bash
npm start
```

Esto abrirá automáticamente tu aplicación en el navegador en http://localhost:3000.

## Estructura de archivos en un proyecto React

Al crear un proyecto con Create React App, se genera una estructura de archivos y carpetas predefinida. Esta estructura es una convención que facilita la organización del código y la escalabilidad del proyecto.

Estructura básica de un proyecto React:

```
nombre-del-proyecto/
├── node_modules/       # Contiene todas las dependencias instaladas
├── public/             # Archivos estáticos (HTML, imágenes, etc.)
│   ├── index.html      # Página principal de la aplicación
│   └── ...             # Otros archivos estáticos
├── src/                # Código fuente de la aplicación
│   ├── App.js          # Componente principal de la aplicación
│   ├── index.js        # Punto de entrada de la aplicación
│   ├── App.css         # Estilos del componente App
│   ├── index.css       # Estilos globales
│   └── ...             # Otros componentes y archivos
├── package.json        # Configuración del proyecto y dependencias
├── package-lock.json   # Versiones exactas de las dependencias
└── README.md           # Documentación del proyecto
```

### Explicación de los archivos y carpetas principales

#### node_modules/

Contiene todas las dependencias y bibliotecas instaladas en el proyecto. Esta carpeta no debe modificarse manualmente.

#### public/

Aquí se encuentran los archivos estáticos, como el archivo `index.html`, que es la plantilla base de la aplicación. También puedes almacenar imágenes, fuentes y otros recursos aquí.

#### src/

Es la carpeta principal donde se encuentra el código fuente de la aplicación. Aquí es donde trabajarás la mayor parte del tiempo.

- **index.js:** Es el punto de entrada de la aplicación. Aquí se renderiza el componente principal (App) en el DOM.

- **App.js:** Es el componente principal de la aplicación. Puedes modificarlo para construir tu interfaz de usuario.

- **App.css y index.css:** Contienen los estilos CSS para el componente App y los estilos globales, respectivamente.

#### index.js

Es el punto de entrada de la aplicación. Aquí se renderiza el componente principal (App) en el DOM.

#### App.js

Es el componente principal de la aplicación. Puedes modificarlo para construir tu interfaz de usuario.

#### App.css y index.css

Contienen los estilos CSS para el componente App y los estilos globales, respectivamente.

#### package.json

Contiene la configuración del proyecto, como las dependencias, scripts y metadatos. Aquí puedes agregar nuevas dependencias o configurar scripts personalizados.

#### README.md

Es un archivo de markdown que sirve como documentación del proyecto. Puedes personalizarlo para describir tu aplicación y cómo usarla.
