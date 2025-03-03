<h1 align="center">Instalación y Configuración</h1>

<h2>📑 Contenido</h2>

- [Introducción](#introducción)
- [Guía básica (Windows)](#guía-básica-windows)
  - [Descarga del JDK](#descarga-del-jdk)
  - [Configuración de Variables de Entorno](#configuración-de-variables-de-entorno)
  - [Verifica la instalación](#verifica-la-instalación)
- [Instalación de un Entorno de Desarrollo Integrado (IDE)](#instalación-de-un-entorno-de-desarrollo-integrado-ide)
  - [IntelliJ IDEA](#intellij-idea)
  - [Eclipse](#eclipse)
  - [NetBeans](#netbeans)
  - [Visual Studio Code](#visual-studio-code)

## Introducción

Antes de comenzar a programar en Java, es necesario instalar y configurar el entorno de desarrollo adecuado. En este capítulo, explicaremos paso a paso la instalación del Java Development Kit (JDK), la configuración de variables de entorno y la instalación de un Entorno de Desarrollo Integrado (IDE) para facilitar la escritura y ejecución de código Java.

## Guía básica (Windows)

### Descarga del JDK

Oracle proporciona una versión oficial del JDK, pero también existen alternativas como OpenJDK, que es una implementación de código abierto. Puedes descargar el JDK desde los siguientes enlaces:

- [OpenJDK](https://jdk.java.net/)
- [Oracle JDK](https://www.oracle.com/java/technologies/downloads/?er=221886)
- [Adoptium Temurin JDK](https://adoptium.net/es/)

> Tanto un ejecutable como un binario son métodos posibles para instalar Java, y la elección depende de tus necesidades y el sistema operativo que estés utilizando.

### Configuración de Variables de Entorno

Para garantizar que Java funcione correctamente desde cualquier terminal, es necesario configurar la variable de entorno `JAVA_HOME`.

1. Abre el Explorador de archivos y copia la ruta donde instalaste Java (por ejemplo, `C:\Program Files\Java\jdk-17`).

1. Ve a Panel de Control > Sistema > Configuración avanzada del sistema.

1. En la pestaña Opciones avanzadas, haz clic en Variables de entorno.

1. Crea una nueva variable de sistema llamada `JAVA_HOME` y pega la ruta copiada.

1. Agrega %JAVA_HOME%\bin a la variable Path `C:\Program Files\Java\jdk-17\bin`.

1. Guarda los cambios y verifica con java -version en la terminal.

### Verifica la instalación

Una vez instalado, abre una terminal (CMD o PowerShell) y verifica la instalación con:

```bash
java -version
javac -version
```

## Instalación de un Entorno de Desarrollo Integrado (IDE)

Un IDE facilita la escritura de código proporcionando resaltado de sintaxis, depuración y herramientas de desarrollo. Algunas opciones recomendadas son:

### IntelliJ IDEA

Descarga IntelliJ IDEA desde JetBrains.

Instala y configura el JDK en File > Project Structure > SDKs.

### Eclipse

Descarga Eclipse desde eclipse.org.

Instala y abre Eclipse, luego configura el JDK en Preferences > Java > Installed JREs.

### NetBeans

Descarga NetBeans desde netbeans.apache.org.

Instálalo y selecciona el JDK durante la configuración inicial.

### Visual Studio Code

Descarga VS Code desde code.visualstudio.com.

Instala la extensión **Java Extension Pack**.
