<h1 align="center">Navegadores</h1>

<h2>📑 Contenido</h2>

- [Navegadores](#navegadores)
- [Arquitectura de los navegadores web](#arquitectura-de-los-navegadores-web)
  - [Interfaz de usuario](#interfaz-de-usuario)
  - [Motor de navegador](#motor-de-navegador)
  - [Motor de renderizado](#motor-de-renderizado)
  - [Redes](#redes)
  - [Intérprete de JavaScript](#intérprete-de-javascript)
  - [Backend de la interfaz de usuario](#backend-de-la-interfaz-de-usuario)
  - [Almacenamiento/persistencia de datos](#almacenamientopersistencia-de-datos)
- [Función del motor de renderizado](#función-del-motor-de-renderizado)
  - [Cuatro pasos básicos](#cuatro-pasos-básicos)

## Navegadores

Los navegadores web son aplicaciones de software que permiten a los usuarios acceder, navegar y visualizar contenido en la World Wide Web. Funcionan interpretando y mostrando el contenido de las páginas web escrito en lenguajes como HTML, CSS y JavaScript. Los navegadores web modernos también proporcionan diversas herramientas y características para mejorar la experiencia del usuario y la seguridad.

## Arquitectura de los navegadores web

Los navegadores están construidos con FrontEnd y BackEnd. Mientras que el FrontEnd garantiza cómo aparece la página web en el navegador, el backend maneja las solicitudes y es el portador de la información. Sus diferentes componentes trabajan en coordinación para ofrecer una experiencia web perfecta.

**Cada navegador se compone de 7 componentes diferentes:**

### Interfaz de usuario

Este componente permite a los usuarios finales interactuar con todos los elementos visuales disponibles en la página web. Los elementos visuales incluyen la barra de direcciones, el botón de inicio, el botón de siguiente y todos los demás elementos que buscan y muestran la página web solicitada por el usuario final.

### Motor de navegador

Es un componente central de cada navegador web. El motor del navegador funciona como intermediario o puente entre la interfaz de usuario y el motor de renderizado. Consulta y maneja el motor de renderizado según las entradas recibidas desde la interfaz de usuario.

El rendimiento y las características de un motor de navegador pueden afectar en gran medida la experiencia del usuario de un navegador web. Un motor de navegador rápido y eficiente puede ayudar a que las páginas web se carguen rápidamente y sin problemas, mientras que un motor más lento o menos capaz puede tener dificultades para representar páginas complejas o brindar una experiencia de navegación fluida.

### Motor de renderizado

Como sugiere el nombre, este componente es responsable de mostrar una página web específica solicitada por el usuario en su pantalla. Interpreta documentos HTML y XML junto con imágenes diseñadas o formateadas mediante CSS, y se genera un diseño final, que se muestra en la interfaz de usuario.

> [!NOTE]
>
> Cada navegador tiene su propio motor de renderizado exclusivo. Los motores de renderizado también pueden diferir según las diferentes versiones del navegador.

- Google Chrome and Opera v.15+: **Blink**
- Internet Explorer: **Trident**
- Mozilla Firefox: **Gecko**
- Chrome for iOS and Safari: **WebKit**

### Redes

Este componente es responsable de gestionar las llamadas de red utilizando protocolos estándar como HTTP o FTP. También se ocupa de los problemas de seguridad asociados con la comunicación por Internet.

### Intérprete de JavaScript

Como sugiere el nombre, es responsable de analizar y ejecutar el código JavaScript incrustado en un sitio web. Una vez que se generan los resultados interpretados, se envían al motor de renderizado para mostrarlos en la interfaz de usuario.

### Backend de la interfaz de usuario

Este componente utiliza los métodos de interfaz de usuario del sistema operativo subyacente. Se utiliza principalmente para dibujar widgets básicos (ventanas y cuadros combinados).

### Almacenamiento/persistencia de datos

Es una capa persistente. Un navegador web necesita almacenar varios tipos de datos localmente, por ejemplo, cookies. Como resultado, los navegadores deben ser compatibles con mecanismos de almacenamiento de datos como WebSQL, IndexedDB, FileSystem, etc.

## Función del motor de renderizado

Una vez que un usuario solicita un documento en particular, el motor de renderizado comienza a buscar el contenido del documento solicitado. Esto se hace a través de la capa de red. El motor de renderizado comienza a recibir el contenido de ese documento específico en fragmentos de 8 KB desde la capa de red. Después de esto, comienza el flujo básico del motor de renderizado.

### Cuatro pasos básicos

1. El motor de renderizado analiza la página HTML solicitada en fragmentos, incluidos los archivos CSS externos y los elementos de estilo. Luego, los elementos HTML se convierten en nodos DOM para formar un "árbol de contenido" o "árbol DOM".

2. Al mismo tiempo, el navegador también crea un árbol de renderizado. Este árbol incluye tanto la información de estilo como las instrucciones visuales que definen el orden en el que se mostrarán los elementos. El árbol de renderizado garantiza que el contenido se muestre en el orden deseado.

3. Además, el árbol de renderizado pasa por el proceso de diseño. Cuando se crea un árbol de renderizado, los valores de posición o tamaño no se asignan. Todo el proceso de cálculo de valores para evaluar la posición deseada se denomina proceso de diseño. En este proceso, a cada nodo se le asignan las coordenadas exactas. Esto garantiza que cada nodo aparezca en una posición precisa en la pantalla.

4. El último paso es pintar la pantalla, donde se recorre el árbol de renderizado y se invoca el método paint() del renderizador, que pinta cada nodo en la pantalla usando la capa backend de la interfaz de usuario.

> [!NOTE]
>
> Cada navegador tiene su propio motor de renderizado único. Naturalmente, cada navegador tiene su propia forma de interpretar las páginas web en la pantalla de un usuario. Aquí es donde surge un desafío para los desarrolladores web con respecto a la compatibilidad de su sitio web entre navegadores.
