<h1 align="center">Commits</h1>

<h2>📑 Contenido</h2>

- [¿Que son los commits?](#que-son-los-commits)
- [¿Que hacen los commits?](#que-hacen-los-commits)
  - [Registro de cambios](#registro-de-cambios)
  - [Identificación única](#identificación-única)
  - [Mensaje descriptivo](#mensaje-descriptivo)
  - [Autor y fecha](#autor-y-fecha)
  - [Historial de versiones](#historial-de-versiones)
  - [Revertir cambios](#revertir-cambios)
- [Head](#head)
- [Commits convencionales](#commits-convencionales)
  - [Tipos](#tipos)

## ¿Que son los commits?

En Git, un commit **es una acción que registra un conjunto de cambios realizados en los archivos de tu repositorio.** Cada commit captura un punto específico en la historia del proyecto y almacena información sobre quién hizo el cambio, cuándo se realizó y un mensaje descriptivo que explica qué cambios se realizaron. Los commits son fundamentales en el sistema de control de versiones de Git y son la base para rastrear y administrar la historia de versiones de tu proyecto.

Con el comando **git commit** se pasan los archivos del área de ensayo al repositorio global. En este repositorio se crea el respaldo de los archivos.

> [!IMPORTANT]
>
> Si los archivos no están siendo monitorizados no se puede hacer un commit.

## ¿Que hacen los commits?

**Los commits en Git hacen instantáneas de los cambios realizados en tu proyecto en un punto específico en el tiempo.** Estas instantáneas se registran con un mensaje descriptivo y forman la base de la historia de versiones de tu proyecto, lo que permite un control preciso de los cambios, la colaboración efectiva y la gestión de proyectos en el desarrollo de software y otros campos.

### Registro de cambios

Cada commit registra un conjunto de cambios realizados en uno o varios archivos. Estos cambios pueden incluir adiciones, modificaciones o eliminaciones de código, texto o cualquier otro tipo de contenido en el proyecto.

### Identificación única

Cada commit tiene un identificador único llamado "hash" (o "SHA-1 hash") que se calcula a partir de los cambios y la información asociada al commit. Este identificador se utiliza para referirse a un commit de manera única.

### Mensaje descriptivo

Cada commit debe incluir un mensaje descriptivo que explique de manera clara y concisa los cambios realizados. Estos mensajes son útiles para comprender la razón detrás de un cambio específico y para rastrear la evolución del proyecto.

```bash
git commit -m "mensaje descriptivo"
```

### Autor y fecha

Cada commit registra el nombre del autor y la fecha en que se realizó. Esto proporciona información sobre quién hizo el cambio y cuándo lo hizo.

### Historial de versiones

Los commits se organizan en una secuencia cronológica para formar la historia de versiones del proyecto. Puedes navegar por esta historia para ver cómo ha evolucionado el proyecto con el tiempo.

Con el comando `git log`, te mostrará una lista de todos los commits realizados en el proyecto, junto con detalles como el autor, la fecha y la hora de la confirmación, y el mensaje de la confirmación. Puedes usar las teclas de flecha para desplazarte hacia arriba y hacia abajo, y q para salir del registro.

Con el comando `git diff` puedes ver los cambios entre dos commits o entre un commit y el directorio de trabajo actual. Puedes usar `git diff <commit1> <commit2> `para ver los cambios entre dos commits específicos, o` git diff <commit>` para ver los cambios entre un commit y el directorio de trabajo actual.

> [!TIP]
>
> Con el comando `gitk` se puede ver el historial de versiones de manera gráfica.
> `gitk` es una herramienta gráfica incluida en Git.

### Revertir cambios

Si surge un problema o se detecta un error, es posible revertir un commit para deshacer los cambios realizados en ese punto específico de la historia del proyecto.

```bash
#Puedes encontrar el hash del commit utilizando el comando git log
git revert <hash-del-commit>
```

## Head

HEAD es una referencia especial que apunta al último commit de la rama actual en tu repositorio. En otras palabras, HEAD representa el commit más reciente en la rama en la que te encuentras. Es una forma de identificar en qué punto de la historia del proyecto te encuentras en ese momento.

**Aspectos importantes:**

- **Apunta al Último Commit:** HEAD apunta al último commit de la rama actual, lo que significa que refleja la última versión del proyecto en esa rama.
- **Puede Cambiar:** Cuando realizas un nuevo commit en la rama actual, HEAD se actualiza automáticamente para apuntar al nuevo commit, convirtiéndolo en el commit más reciente.
- **Utilidades de HEAD:** Puedes usar HEAD para realizar varias operaciones en tu repositorio, como ver el historial de commits, crear nuevas ramas a partir del commit actual, desplazarte por la historia del proyecto y más.

En resumen, HEAD es una referencia dinámica en Git que te permite interactuar con el commit más reciente en la rama actual de tu proyecto. Es una parte fundamental de la navegación y el flujo de trabajo en Git.

## Commits convencionales

La especificación de Commits Convencionales es una convención ligera sobre los mensajes de commits. Proporciona un conjunto sencillo de reglas para crear un historial de commits explícito; lo que hace más fácil escribir herramientas automatizadas encima del historial. Esta convención encaja con SemVer, al describir en los mensajes de los commits las funcionalidades, arreglos, y cambios de ruptura hechos.

### Tipos

|     Tipo     | Short                     | Descripción                                                                                                                |
| :----------: | ------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
|   **feat**   | Funciones                 | Una nueva característica                                                                                                   |
|   **fix**    | Correcciones              | Una corrección de errores                                                                                                  |
|   **docs**   | Documentación             | Cambios en la documentación                                                                                                |
|  **style**   | Estilos                   | Cambios que no afectan al significado del código (espacio en blanco, formato, falta de punto y coma, etc.)                 |
| **refactor** | Refactorización de código | Un cambio de código que no corrige un error ni agrega una característica                                                   |
|   **perf**   | Mejoras de rendimiento    | Un cambio de código que mejora el rendimiento                                                                              |
|   **test**   | Pruebas                   | Agregar pruebas que faltan o corregir pruebas existentes                                                                   |
|  **build**   | Compilación               | Cambios que afectan al sistema de compilación o dependencias externas (ámbitos de ejemplo: gulp, broccoli, npm)            |
|    **ci**    | Integraciones continuas   | Cambios en nuestros archivos de configuración y scripts de CI (ámbitos de ejemplo: Travis, Circle, BrowserStack SauceLabs) |
|  **chore**   | chore                     | Otros cambios que no modifican src o archivos de prueba                                                                    |
|  **revert**  | Revertir                  | Revierte una confirmación anterior                                                                                         |

**Ejemplo:**

```bash
### Commit:
docs(readme): Añadido un nuevo enlace al glosario.
```
