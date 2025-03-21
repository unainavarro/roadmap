<h1 align="center">Modelo Vista Controlador (MVC)</h1>

<h2>📑 Contenido</h2>

- [Modelo Vista Controlador (MVC)](#modelo-vista-controlador-mvc)
  - [Modelo (Model)](#modelo-model)
  - [Vista (View)](#vista-view)
  - [Controlador (Controller)](#controlador-controller)
- [Principios y beneficios de MVC](#principios-y-beneficios-de-mvc)
- [Implementación de MVC](#implementación-de-mvc)

## Modelo Vista Controlador (MVC)

El Modelo Vista Controlador (MVC) es un patrón de arquitectura de software que separa los componentes de una aplicación en tres partes distintas, cada una con responsabilidades específicas:

### Modelo (Model)

- Representa los datos y la lógica de negocio de la aplicación.
- Es responsable de acceder y manipular los datos, así como de realizar cálculos y operaciones relacionadas con la lógica de negocio.
- El modelo no tiene conocimiento ni dependencia de la interfaz de usuario ni de cómo se presentan los datos al usuario.

### Vista (View)

- Es la interfaz de usuario que presenta los datos al usuario final y recibe las interacciones del usuario.
- Se encarga de mostrar los datos en un formato adecuado para su visualización, como HTML, XML, o interfaces gráficas de usuario.
- La vista no contiene lógica de negocio ni manipula datos directamente; simplemente muestra la información proporcionada por el modelo.

### Controlador (Controller)

- Actúa como intermediario entre el modelo y la vista.
- Gestiona las solicitudes del usuario, interpreta las acciones del usuario y coordina la interacción entre el modelo y la vista.
- Se encarga de actualizar el modelo en función de las acciones del usuario y de actualizar la vista con los datos proporcionados por el modelo.

## Principios y beneficios de MVC

**Separación de Responsabilidades:** MVC promueve una clara separación entre la lógica de negocio, la presentación de datos y la interacción con el usuario, lo que facilita la comprensión y mantenimiento del código.

**Reutilización de Componentes:** Al separar los componentes de la aplicación en modelos, vistas y controladores independientes, se facilita la reutilización de cada componente en diferentes partes de la aplicación o en aplicaciones diferentes.

**Facilidad para las Pruebas:** La separación de la lógica de negocio del código de presentación facilita la escritura de pruebas unitarias y de integración para cada componente de forma independiente.

**Flexibilidad y Escalabilidad:** MVC permite una mayor flexibilidad y escalabilidad en el desarrollo de aplicaciones, ya que cada componente puede ser modificado, reemplazado o ampliado sin afectar a los demás.

**Soporte para Desarrollo Paralelo:** Al dividir la aplicación en componentes independientes, varios desarrolladores pueden trabajar en diferentes partes de la aplicación de manera simultánea sin interferencias.

## Implementación de MVC

La implementación concreta de MVC puede variar dependiendo del lenguaje de programación y el framework utilizado. Sin embargo, en general, el flujo de trabajo típico en una aplicación MVC sigue estos pasos:

1. El usuario interactúa con la vista, por ejemplo, haciendo clic en un botón.
1. El controlador recibe la acción del usuario y la interpreta.
1. El controlador actualiza el modelo en función de la acción del usuario.
1. El modelo actualizado notifica a la vista.
1. La vista actualiza su interfaz de usuario en función de los cambios en el modelo.
