<h1 align="center">Repositorios</h1>

<h2>📑 Contenido</h2>

- [¿Que son los repositorios?](#que-son-los-repositorios)
- [Repositorios locales y remotos](#repositorios-locales-y-remotos)
  - [Repositorio local](#repositorio-local)
  - [Repositorio remoto](#repositorio-remoto)
- [Inicializar repositorio](#inicializar-repositorio)
- [Hacer seguimiento de los archivos](#hacer-seguimiento-de-los-archivos)

## ¿Que son los repositorios?

Los repositorios en Git son almacenamientos virtuales de tu proyecto que te permiten guardar y acceder a versiones del código. Los repositorios pueden ser locales o remotos, y son independientes entre sí.

Para crear un repositorio se utiliza el comando **git init**. Solo se ejecuta una vez, nada mas iniciar el proyecto.

Al crear el repositorio, git crea dos áreas:

- **Área de ensayo(staging area):** es temporal, sirve para ver el estado en el que se encuentran los archivos de un proyecto.

  - Cuando haces un `git add`

- **Repositorio Local:** es permanente, donde se almacenan las diferentes versiones de los archivos que componen el código fuente del proyecto.
  - Cuando haces el `git commit`

## Repositorios locales y remotos

En Git, los repositorios se pueden clasificar en dos categorías principales: repositorios locales y repositorios remotos. Estos conceptos son fundamentales para entender cómo funciona la colaboración y el control de versiones en Git.

Los repositorios locales son copias individuales del proyecto en las computadoras de los desarrolladores, mientras que los repositorios remotos son copias compartidas en servidores en línea que facilitan la colaboración y la sincronización de cambios entre desarrolladores. La combinación de repositorios locales y remotos es esencial para el flujo de trabajo de desarrollo de software colaborativo.

### Repositorio local

Un repositorio local es una copia completa del proyecto Git que se encuentra en la máquina de un desarrollador. Cada desarrollador que trabaja en un proyecto tiene su propio repositorio local en su ordenador.

**Funciones:**

- Permite a los desarrolladores trabajar en el proyecto de manera independiente en sus máquinas locales.
- Proporciona acceso rápido y eficiente a los archivos y al historial de versiones del proyecto sin necesidad de una conexión a Internet.
- Los desarrolladores pueden crear y cambiar ramas, realizar commits, revertir cambios, etc., en su propio repositorio local.

### Repositorio remoto

Un repositorio remoto es una copia del proyecto Git que se encuentra en un servidor remoto, generalmente alojado en línea. Los repositorios remotos son compartidos por varios desarrolladores y se utilizan para colaborar en el proyecto.

**Funciones:**

- Sirve como punto central para que varios desarrolladores colaboren en un proyecto. Todos pueden acceder a este repositorio compartido.
- Permite sincronizar los cambios entre los desarrolladores. Los desarrolladores pueden enviar (push) sus cambios al repositorio remoto y recibir (pull) los cambios de otros desarrolladores.
- Proporciona una copia segura del proyecto, lo que garantiza que no se pierdan datos importantes si se daña o pierde la máquina local de un desarrollador.

## Inicializar repositorio

Para inicializar un repositorio, se utiliza el comando `git init` en el directorio que deseas rastrear.

## Hacer seguimiento de los archivos

Para iniciar el seguimiento de los archivos se utiliza **git add**.
git add pasa los archivos del director de trabajo al área de ensayo.

- **git add nombre-del-archivo :** Hace un seguimiento a un único archivo.
- **git add . :** Este comando agrega al área de preparación (staging area) todos los archivos nuevos y modificados en el directorio de trabajo (working directory), pero no elimina los archivos eliminados. Es decir, solo agrega los cambios en los archivos que están bajo control de versiones de Git.
- **git add -A (o) git add --all :** Este comando agrega al área de preparación todos los cambios en el directorio de trabajo, incluyendo archivos nuevos, modificados y eliminados. Es una forma abreviada de agregar todos los cambios, incluyendo los cambios en archivos eliminados.

> [!NOTE]
>
> Es importante tener en cuenta las diferencias entre estos comandos, especialmente si tienes archivos eliminados que deseas que también sean eliminados del repositorio en la próxima confirmación.
>
> `git add .` agrega solo los cambios en los archivos que están siendo seguidos por Git, `git add -A` agrega todos los cambios, incluyendo los cambios en archivos eliminados, al área de preparación.
