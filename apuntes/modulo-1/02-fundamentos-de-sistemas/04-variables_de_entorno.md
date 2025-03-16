<h1 align="center">Variables de entorno</h1>

<h2>📑 Contenido</h2>

- [Variables de entorno](#variables-de-entorno)
- [¿Qué son las variables de entorno?](#qué-son-las-variables-de-entorno)
- [Funciones principales de las variables de entorno](#funciones-principales-de-las-variables-de-entorno)
- [Variables de entorno comunes](#variables-de-entorno-comunes)
- [Cómo establecer y usar variables de entorno](#cómo-establecer-y-usar-variables-de-entorno)
  - [Linux y macOS](#linux-y-macos)
  - [Windows](#windows)
- [En scripts](#en-scripts)
- [Buenas prácticas](#buenas-prácticas)
- [Bonus Java](#bonus-java)
  - [Localización de ejecutables](#localización-de-ejecutables)
  - [Especificar la ruta del JDK/JRE](#especificar-la-ruta-del-jdkjre)
  - [Compatibilidad con herramientas de desarrollo](#compatibilidad-con-herramientas-de-desarrollo)
  - [Facilitar el mantenimiento del sistema](#facilitar-el-mantenimiento-del-sistema)
  - [Consistencia y automatización](#consistencia-y-automatización)

## Variables de entorno

Las variables de entorno son un concepto fundamental en los sistemas operativos, especialmente en entornos de desarrollo y administración de sistemas. Son valores dinámicos que afectan el comportamiento de los procesos y aplicaciones en un sistema. Estas variables almacenan información como rutas de archivos, configuraciones de usuario o preferencias del sistema, y pueden ser accedidas por programas y scripts durante su ejecución.

Las variables de entorno son esenciales porque permiten personalizar y controlar el entorno en el que se ejecutan las aplicaciones. Por ejemplo, pueden definir la ubicación de archivos de configuración, establecer idiomas predeterminados o especificar rutas de acceso a herramientas clave.

## ¿Qué son las variables de entorno?

Una variable de entorno es un par clave-valor almacenado en el sistema operativo. La clave es el nombre de la variable, y el valor es la información que contiene. Por ejemplo, la variable `PATH` en sistemas Unix-like (Linux, macOS) contiene una lista de directorios donde el sistema busca ejecutables.

Las variables de entorno pueden ser:

- **Globales:** Afectan a todos los usuarios y procesos del sistema.

- **Locales:** Solo están disponibles para el usuario o proceso que las define.

## Funciones principales de las variables de entorno

Las variables de entorno cumplen varias funciones clave:

- Configuración del Sistema:

  - Definen rutas de acceso a archivos y directorios importantes.

  - Ejemplo: La variable `HOME` en Linux y macOS almacena la ruta del directorio personal del usuario.

- Personalización del Entorno:

  - Permiten ajustar el comportamiento de aplicaciones y scripts.

  - Ejemplo: La variable `LANG` define el idioma predeterminado del sistema.

- Facilitan la Portabilidad:

  - Permiten que aplicaciones y scripts funcionen en diferentes entornos sin modificaciones.

  - Ejemplo: Usar `DATABASE_URL` para definir la conexión a una base de datos en diferentes entornos (desarrollo, producción).

- Control de Procesos:

  - Afectan cómo se ejecutan los programas y scripts.

  - Ejemplo: La variable `PYTHONPATH` en Python define dónde buscar módulos y librerías.

## Variables de entorno comunes

Aquí hay algunas variables de entorno comunes y su propósito:

- PATH:

  - Contiene una lista de directorios donde el sistema busca ejecutables.

  - Ejemplo: En Linux, `echo $PATH` muestra los directorios en la variable.

- HOME:

  - Almacena la ruta del directorio personal del usuario.

  - Ejemplo: En Linux, `echo $HOME` muestra /home/usuario.

- USER:

  - Contiene el nombre del usuario actual.

  - Ejemplo: En Linux, `echo $USER` muestra el nombre del usuario.

- LANG:

  - Define el idioma y la configuración regional del sistema.

  - Ejemplo: export `LANG=es_ES.UTF-8` establece el idioma a español.

- JAVA_HOME:

  - Especifica la ubicación de la instalación de Java.

  - Ejemplo: export `JAVA_HOME=/usr/lib/jvm/java-11-openjdk`.

- DATABASE_URL:

  - Define la URL de conexión a una base de datos.

  - Ejemplo: `export DATABASE_URL=postgres://usuario:contraseña@localhost:5432/mibase`.

## Cómo establecer y usar variables de entorno

La forma de establecer y usar variables de entorno varía según el sistema operativo:

### Linux y macOS

Para establecer una variable temporal (solo en la sesión actual):

```bash
export NOMBRE_VARIABLE=valor
```

Para establecer una variable permanente, agrega la línea al archivo de configuración del shell (`~/.bashrc`, `~/.zshrc`, etc.).

### Windows

Para establecer una variable temporal en Command Prompt:

```cmd
REM Para establecer una variable temporal en Command Prompt:
set NOMBRE_VARIABLE=valor

REM Para establecer una variable permanente, usa la interfaz gráfica o el comando setx:
setx NOMBRE_VARIABLE "valor"
```

## En scripts

Las variables de entorno pueden ser accedidas y modificadas en scripts. Por ejemplo, en Bash:

```bash
# Establecer una variable
export MI_VARIABLE=HolaMundo
# Acceder a la variable
echo $MI_VARIABLE
```

## Buenas prácticas

- **No Almacenar Información Sensible:**

  - Evita almacenar contraseñas o claves directamente en variables de entorno. Usa herramientas como **dotenv** o gestores de secretos.

- **Documentar las Variables:**

  - Proporciona una lista de las variables de entorno necesarias para tu aplicación en un archivo `README` o `.env.example`.

- **Usar Archivos .env:**

  - En aplicaciones, es común usar archivos .env para definir variables de entorno

  ```
    DATABASE_URL=postgres://usuario:contraseña@localhost:5432/mibase
  SECRET_KEY=miclave_secreta
  ```

- **Mantener las Variables Organizadas:**

  - Usa nombres descriptivos y consistentes para las variables.

## Bonus Java

Las variables de entorno son fundamentales al instalar Java porque permiten que el sistema operativo y otras aplicaciones encuentren y utilicen los componentes de Java correctamente.

### Localización de ejecutables

Las variables de entorno, como `PATH`, permiten que el sistema operativo localice los ejecutables de Java (por ejemplo, `java` y `javac`) desde cualquier ubicación en la línea de comandos. Al añadir el directorio `bin` de Java al `PATH`, puedes ejecutar estos comandos sin necesidad de especificar la ruta completa.

### Especificar la ruta del JDK/JRE

La variable de entorno `JAVA_HOME` especifica la ruta de instalación del JDK (Java Development Kit) o JRE (Java Runtime Environment). Muchas herramientas de desarrollo y servidores de aplicaciones utilizan `JAVA_HOME` para localizar los archivos de Java.

### Compatibilidad con herramientas de desarrollo

Muchas herramientas de desarrollo, como Apache Maven, Gradle y servidores de aplicaciones como Apache Tomcat, dependen de `JAVA_HOME` para compilar y ejecutar aplicaciones Java. Sin `JAVA_HOME` configurado, estas herramientas no podrán encontrar los archivos necesarios de Java.

### Facilitar el mantenimiento del sistema

El uso de variables de entorno facilita la administración y mantenimiento del sistema. Si en el futuro necesitas actualizar Java, solo tendrás que cambiar la ruta en `JAVA_HOME` y `PATH` en lugar de actualizar manualmente cada referencia en scripts y configuraciones.

### Consistencia y automatización

En entornos de desarrollo y producción, configurar las variables de entorno de manera uniforme garantiza que todos los desarrolladores y servidores utilicen la misma configuración de Java. Esto también facilita la automatización de scripts de despliegue y construcción de proyectos.
