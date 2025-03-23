<h1 align="center">Áreas de trabajo</h1>

<h2>📑 Contenido</h2>

- [¿Que son las áreas de trabajo?](#que-son-las-áreas-de-trabajo)
- [Directorio de trabajo (working directory)](#directorio-de-trabajo-working-directory)
- [Área de preparación (staging area / index area)](#área-de-preparación-staging-area--index-area)
- [Repositorio (repository)](#repositorio-repository)
- [Área temporal(stash)](#área-temporalstash)
- [Ejemplo de flujo de trabajo comun de Git (en local)](#ejemplo-de-flujo-de-trabajo-comun-de-git-en-local)

## ¿Que son las áreas de trabajo?

En Git, el término "áreas de trabajo" se refiere a las diferentes partes o secciones de tu flujo de trabajo donde gestionas los cambios en tu proyecto.

Git distingue principalmente cuatro áreas de trabajo:

- Directorio de Trabajo (Working Directory)
- Área de Preparación (Staging Area)
- Repositorio (Repository)
- Área Temporal(Stash).

## Directorio de trabajo (working directory)

El directorio de trabajo es el espacio donde tienes tus archivos y carpetas del proyecto en su estado actual. Estos archivos son visibles y editable en tu sistema de archivos local. Cuando realizas cambios en tus archivos, estos se consideran "modificados" en el directorio de trabajo.

## Área de preparación (staging area / index area)

El área de preparación, también conocida como "index" o "staging area," es una etapa intermedia entre tu directorio de trabajo y el repositorio Git. En esta área, seleccionas y preparas los cambios que deseas incluir en tu próximo commit. Puedes agregar archivos al área de preparación utilizando el comando `git add`.

## Repositorio (repository)

El repositorio Git es donde se almacena la historia completa de tu proyecto, incluyendo todos los commits y versiones anteriores. Es una estructura interna de Git que reside en la carpeta .git en el directorio raíz de tu proyecto. Cuando realizas un commit, los cambios preparados en el área de preparación se guardan en el repositorio como una nueva versión del proyecto. Los repositorios pueden ser locales o Remotos.

> [!WARNING]
>
> La carpeta .git suele estar oculta. Tendrás que habilitar la opción de "Mostrar elementos ocultos".

## Área temporal(stash)

El área "stash" en Git es un espacio especial donde puedes temporalmente guardar cambios no confirmados en tu directorio de trabajo cuando necesitas cambiar de rama o lidiar con otras tareas sin confirmar tus cambios. Esta característica es útil cuando tienes cambios sin terminar en tu directorio de trabajo y deseas trabajar en una rama diferente o simplemente mantener tus cambios guardados en un lugar seguro temporalmente.

## Ejemplo de flujo de trabajo comun de Git (en local)

El flujo de trabajo típico en Git implica la manipulación de los archivos en estas áreas de trabajo:

1. Trabajas en tus archivos en el directorio de trabajo.
2. Utilizas `git add `para mover los cambios deseados al área de preparación.
3. Realizas una confirmación (commit) con git commit para guardar los cambios en el repositorio.

> [!NOTE]
>
> Este ciclo te permite tener un control preciso sobre qué cambios en local.
