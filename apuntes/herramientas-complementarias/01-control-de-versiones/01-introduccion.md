<h1 align="center">Introducción</h1>

<h2>📑 Contenido</h2>

- [¿Que son los sistemas de control de versiones?](#que-son-los-sistemas-de-control-de-versiones)
- [¿Por qué es importante?](#por-qué-es-importante)
- [Otros VCS aparte de Git](#otros-vcs-aparte-de-git)
- [Conceptos clave(orientado a GIT/GitHub)](#conceptos-claveorientado-a-gitgithub)
- [Alojamiento de control de versiones](#alojamiento-de-control-de-versiones)

## ¿Que son los sistemas de control de versiones?

Un sistema de control de versiones(VCS), es una herramienta o software utilizado en desarrollo de software y gestión de proyectos para rastrear y gestionar cambios en el código fuente y otros archivos de un proyecto a lo largo del tiempo. **Su principal función es mantener un historial de versiones de los archivos**, lo que permite a los desarrolladores colaborar de manera efectiva, controlar los cambios realizados, y revertir a versiones anteriores si es necesario.

Existen multiples softwares de control de versiones,GIT, SVN, Mercurial, CSV, Azure DevOps...
De todos el más popular es GIT, una de las mejores opciones en cuanto a rapidez y eficacia.

## ¿Por qué es importante?

Usar un sistema de control de versiones (VCS) es fundamental en el desarrollo de software y en la gestión de proyectos, mejorar la colaboración, la eficiencia y la gestión de proyectos en el desarrollo de software y otros campos. Ayuda a mantener un registro completo y organizado de los cambios, lo que facilita el desarrollo y la gestión efectiva de proyectos de cualquier tamaño.

Permite:

- Registrar un historial completo de todas las versiones de archivos y documentos en un proyecto.
- La colaboración entre múltiples desarrolladores en un proyecto. Cada desarrollador puede trabajar en su propia rama de desarrollo sin interferir con los demás para después unirlas.
- Resolver conflictos de manera más eficiente.
- Tener una copia de seguridad efectiva de los archivos y documentos del proyecto. Si algo sale mal, como la pérdida de datos o un error importante, es posible restaurar versiones anteriores o recuperar todo el proyecto desde el historial.
- Llevar una documentación viva, mediante los comentarios(commits) y las descripciones de las ramas se puede comprender la evolución del proyecto.

## Otros VCS aparte de Git

## Conceptos clave(orientado a GIT/GitHub)

- **Repositorio:** Es un lugar centralizado donde se almacenan todos los archivos del proyecto y su historial de versiones. Puede ser local (en la máquina de un desarrollador) o remoto (en un servidor compartido).
- **Commit (confirmación):** Es una acción en la que un desarrollador registra los cambios realizados en uno o varios archivos en el repositorio. Cada confirmación se acompaña de un mensaje descriptivo que explica los cambios realizados.
- **Branch (Rama):** Una rama en Git es una copia independiente del código fuente que permite a los desarrolladores trabajar en funcionalidades o cambios de manera aislada. La rama principal suele llamarse "master" o "main".
- **Merge (Fusionar):** Fusionar en Git es la acción de combinar los cambios realizados en una rama con otra, generalmente para integrar nuevas características en la rama principal.
- **Conflictos (Conflicts):** Cuando dos o más desarrolladores modifican la misma parte de un archivo de manera simultánea en diferentes ramas, puede surgir un conflicto que debe resolverse manualmente.
- **Pull Request (Solicitud de extracción):** Una Pull Request es una característica de Git utilizada en plataformas como GitHub y GitLab para proponer cambios en un repositorio. Los cambios propuestos se revisan antes de fusionarlos en la rama principal.
- **Clone (Clonar):** Clonar un repositorio Git implica crear una copia completa del repositorio en tu máquina local, lo que te permite trabajar en el proyecto de manera independiente.
- **Remote (Remoto):** Un repositorio remoto es una copia del repositorio Git que se encuentra en un servidor. Los desarrolladores pueden colaborar y sincronizar sus cambios con el repositorio remoto.
- **Pull (Tirar):** En Git, "pull" significa obtener los cambios del repositorio remoto y aplicarlos a tu copia local.
- **Push (Empujar):** "Push" en Git se refiere a enviar tus cambios locales al repositorio remoto, actualizando así el historial de versiones en el servidor.
- **Tag (Etiqueta):** Una etiqueta en Git es una referencia a un commit específico que se utiliza para marcar versiones importantes o hitos en el proyecto. Las etiquetas son estáticas y no cambian con el tiempo.

## Alojamiento de control de versiones

El término "alojamiento de control de versiones" se refiere a los servicios o plataformas en línea que ofrecen la capacidad de almacenar, gestionar y colaborar en repositorios de control de versiones. Estas plataformas permiten a los equipos de desarrollo y a los colaboradores trabajar en proyectos de software y otros proyectos que requieran control de versiones de manera eficiente y colaborativa.

La elección de una plataforma de alojamiento de control de versiones dependerá de las necesidades específicas de tu proyecto, tu equipo y tus preferencias. Cada plataforma tiene sus propias características y precios, por lo que es importante evaluar cuál se adapta mejor a tus requerimientos antes de comenzar un proyecto.

Algunos de los alojamientos de control de versiones más conocidos son:
Github, GitLab, Bitbucket, Azure DevOps, SourceForge...

> [!WARNING]
>
> Los apuntes van enfocados/orientados principalmente para GIT y Github.
