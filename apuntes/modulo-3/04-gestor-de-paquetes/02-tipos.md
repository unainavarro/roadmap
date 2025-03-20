<h1 align="center">Tipos de gestores de paquetes</h1>

<h2>📑 Contenido</h2>

- [Gestores de paquetes para sistemas operativos](#gestores-de-paquetes-para-sistemas-operativos)
  - [APT (Advanced Package Tool)](#apt-advanced-package-tool)
  - [YUM (Yellowdog Updater Modified) y DNF (Dandified YUM)](#yum-yellowdog-updater-modified-y-dnf-dandified-yum)
  - [Homebrew](#homebrew)
- [Gestores de paquetes para lenguajes de programación](#gestores-de-paquetes-para-lenguajes-de-programación)
  - [npm (Node Package Manager)](#npm-node-package-manager)
  - [Maven](#maven)
  - [Composer](#composer)

## Gestores de paquetes para sistemas operativos

Los gestores de paquetes para sistemas operativos están diseñados para administrar software a nivel del sistema. Estos permiten instalar, actualizar y eliminar aplicaciones y bibliotecas necesarias para el funcionamiento del sistema operativo.

### APT (Advanced Package Tool)

- **Sistema operativo:** Distribuciones de Linux basadas en Debian (Ubuntu, Debian, etc.).

- **Características:**

  - Utiliza repositorios centralizados para descargar paquetes.

  - Comandos comunes: apt-get, apt-cache, apt.

  - Resuelve dependencias automáticamente.

- **Ejemplo de uso:**

  ```bash
  sudo apt update
  sudo apt install nombre-del-paquete
  ```

### YUM (Yellowdog Updater Modified) y DNF (Dandified YUM)

- **Sistema operativo:** Distribuciones de Linux basadas en Red Hat (CentOS, Fedora, etc.).

- **Características:**

  - YUM fue el gestor predeterminado en versiones antiguas, mientras que DNF es su sucesor moderno.

  - Soporta transacciones atómicas y resolución de dependencias avanzada.

- **Ejemplo de uso:**

  ```bash
  sudo yum install nombre-del-paquete
  sudo dnf install nombre-del-paquete
  ```

### Homebrew

- **Sistema operativo:** macOS.

- **Características:**

  - Simplifica la instalación de herramientas de línea de comandos y aplicaciones en macOS.

  - Utiliza fórmulas (scripts) para definir cómo se instala cada paquete.

- **Ejemplo de uso:**

  ```bash
  brew install nombre-del-paquete
  ```

## Gestores de paquetes para lenguajes de programación

Los gestores de paquetes para lenguajes de programación están diseñados para gestionar dependencias específicas de un proyecto en un entorno de desarrollo. Estos son esenciales para mantener un flujo de trabajo eficiente y reproducible. Algunos de los más populares son:

### npm (Node Package Manager)

- **Lenguaje:** JavaScript (Node.js).

- **Características:**

  - Es el gestor de paquetes más grande del mundo, con una amplia colección de bibliotecas.

  - Utiliza el archivo `package.json` para definir dependencias y scripts.

- **Ejemplo de uso:**

  ```bash
  npm install nombre-del-paquete
  ```

### Maven

- **Lenguaje:** Java.

- **Características:**

  - Además de gestionar dependencias, Maven se utiliza para construir y gestionar proyectos Java.

  - Utiliza el archivo `pom.xml` para definir dependencias y configuraciones.

- **Ejemplo de uso:**

  ```xml
  <dependency>
      <groupId>grupo-del-paquete</groupId>
      <artifactId>nombre-del-paquete</artifactId>
      <version>versión</version>
  </dependency>
  ```

### Composer

- **Lenguaje:** PHP.

- **Características:**

- Gestiona dependencias para proyectos PHP.

  - Utiliza el archivo `composer.json` para definir dependencias.

- **Ejemplo de uso:**

  ```bash
  composer require nombre-del-paquete
  ```
