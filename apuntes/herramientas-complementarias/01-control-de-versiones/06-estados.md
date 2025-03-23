<h1 align="center">Estados</h1>

<h2>📑 Contenido</h2>

- [Estados del directorio](#estados-del-directorio)
- [Ver estado del directorio](#ver-estado-del-directorio)
  - [Letras y espacios](#letras-y-espacios)
  - [Colores](#colores)

## Estados del directorio

En Git, los archivos y directorios de tu repositorio local pueden encontrarse en varios estados diferentes a medida que trabajas en ellos y realizas cambios. Estos estados se utilizan para rastrear y gestionar el proceso de control de versiones. Los estados principales son los siguientes:

- **Untracked (No rastreado):** Los archivos o directorios que no están siendo rastreados por Git se consideran no rastreados. Esto significa que Git no está siguiendo cambios en estos elementos y no los incluirá en los commits a menos que los añadas explícitamente.
- **Unmodified (No modificado):** Los archivos que están en su versión actual en el repositorio, sin cambios recientes, se consideran no modificados. Git está al tanto de estos archivos, pero no se han realizado cambios desde la última confirmación.
- **Modified (Modificado):** Cuando realizas cambios en un archivo que está siendo rastreado por Git, el archivo pasa al estado modificado. Esto significa que has realizado modificaciones desde la última confirmación, pero aún no has confirmado esos cambios.
- **Staged (Preparado o en el área de preparación):** Antes de confirmar tus cambios, debes prepararlos o "etiquetarlos" para su inclusión en el próximo commit. Los archivos que están en el estado preparado se encuentran en el área de preparación (también conocida como "staging area" o "index"). Estos archivos están listos para ser confirmados en el próximo commit.
- **Committed (Confirmado):** Cuando confirmas los cambios, los archivos pasan al estado confirmado. En este estado, los cambios se han registrado de manera permanente en la historia de versiones de Git.

> [!NOTE]
>
> El flujo típico de trabajo en Git implica mover archivos a través de estos estados:
>
> - Comienzas con archivos no rastreados.
> - Luego, agregas los archivos que deseas confirmar al área de preparación.
> - Confirmas los cambios preparados, lo que los lleva al estado confirmado.
> - Repites este proceso a medida que trabajas en tu proyecto.

## Ver estado del directorio

El comando **git status** Permite ver qué archivos están modificados, almacenados provisionalmente o confirmados. También muestra algunos consejos básicos sobre cómo mover archivos entre estas etapas. El comando **git status** no muestra información relativa al historial del proyecto.

La salida de `git status -s` te proporciona una vista rápida y resumida del estado de tus archivos, lo que facilita la identificación de los archivos modificados y preparados para el próximo commit, así como de cualquier conflicto o cambio en el seguimiento de archivos. Esto es especialmente útil para mantener un control preciso de tu proyecto en Git.

### Letras y espacios

- **Espacio (o ningún espacio):** Un espacio en blanco antes del nombre del archivo indica que el archivo está en el estado "no preparado" o "modificado", lo que significa que has realizado cambios en el archivo pero aún no los has preparado para un commit.

- **M:** La letra "M" indica que el archivo ha sido modificado desde la última confirmación y está en el estado "modificado". Esto significa que tienes cambios sin confirmar en el archivo.

- **A:** La letra "A" indica que el archivo ha sido agregado al área de preparación (staging area) y está en el estado "preparado" para ser confirmado en el próximo commit.

- **D:** La letra "D" indica que el archivo ha sido eliminado o eliminado del directorio de trabajo, pero aún no se ha confirmado esta eliminación.

- **R:** La letra "R" indica que el archivo ha sido renombrado y está en el estado "preparado" para ser confirmado como parte de un cambio de nombre.

- **C:** La letra "C" indica que el archivo ha sido copiado y está en el estado "preparado" para ser confirmado como parte de una copia.

- **U:** La letra "U" indica un conflicto en el archivo. Esto ocurre cuando se intenta fusionar cambios en un archivo y Git no puede hacerlo automáticamente debido a conflictos en los cambios realizados por diferentes personas.

- **??:** Dos signos de interrogación antes del nombre del archivo indican que el archivo es desconocido para Git, es decir, no se encuentra rastreado ni en el área de preparación. Estos son archivos no rastreados. Suelen ser archivos creados recientemente.

### Colores

- **Rojo:** Por lo general, los archivos en estado "modificado" (cambios sin preparar) se resaltan en rojo. Esto indica que se han realizado cambios en el archivo, pero aún no se han preparado para ser confirmados.
- **Verde:** Los archivos en estado "preparado" (staged) se resaltan en verde. Esto indica que los cambios en el archivo se han agregado al área de preparación y están listos para ser confirmados en el próximo commit.
- **Blanco o gris:** Los archivos en estado "no rastreado" (untracked) o que no han tenido cambios se muestran en blanco o gris. Estos archivos no están siendo seguidos por Git o no han experimentado cambios recientes.
- **Cyan o azul:** En algunos casos, los archivos renombrados, copiados o con conflictos pueden resaltarse en azul o cyan. Esto ayuda a identificar situaciones especiales, como cambios de nombre o conflictos.
