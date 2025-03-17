<h1 align='center'>HTML</h1>

<h2>📑 Contenido</h2>

- [¿Qué es HTML?](#qué-es-html)
- [¿Para qué sirve HTML?](#para-qué-sirve-html)
- [HTML y el navegador](#html-y-el-navegador)

## ¿Qué es HTML?

HTML, o Lenguaje de Marcado de Hipertexto (por sus siglas en inglés: HyperText Markup Language), es el estándar fundamental para la creación de páginas web. Este lenguaje está basado en una serie de etiquetas (tags) que estructuran el contenido que será mostrado en un navegador. HTML no es un lenguaje de programación, ya que no tiene la capacidad de ejecutar lógica ni realizar cálculos. En cambio, su propósito principal es proporcionar una estructura coherente y organizada para los diferentes elementos que conforman una página web, como títulos, párrafos, imágenes, enlaces y formularios.

HTML está compuesto por elementos y atributos. Los elementos son las diferentes piezas de contenido que se muestran en la página, como un encabezado (`<h1>`), un párrafo (`<p>`) o una imagen (`<img>`). Los atributos proporcionan información adicional sobre los elementos, como el tamaño o la fuente de una imagen.

## ¿Para qué sirve HTML?

El objetivo de HTML es estructurar el contenido de una página web para que los navegadores puedan interpretarlo y mostrarlo de manera adecuada al usuario final. Aunque HTML por sí solo no controla el estilo o la interactividad de la página, se complementa con otros lenguajes como `CSS (para estilos visuales)` y `JavaScript (para interactividad)`.

Las páginas HTML sirven para presentar:

- **Texto**: Organizar títulos, subtítulos, párrafos, listas y tablas.
- **Multimedia**: Insertar imágenes, videos y sonidos.
- **Enlaces**: Conectar distintas páginas web entre sí, formando una red navegable, lo que se conoce como "hipertexto".
- **Formularios**: Permitir la entrada de datos por parte de los usuarios, como en el caso de formularios de contacto, encuestas o compras en línea.

HTML, junto con CSS y JavaScript, es uno de los tres pilares fundamentales del desarrollo web. Cada uno cumple una función específica, pero HTML es la base sobre la cual se construyen todas las páginas web.

## HTML y el navegador

El navegador web (como Google Chrome, Firefox, o Safari) es el software encargado de interpretar y renderizar los documentos HTML, mostrando el contenido de forma visual a los usuarios. Cuando un navegador recibe un archivo HTML desde un servidor web, lo procesa y convierte las etiquetas en elementos visuales como texto, imágenes, botones, y enlaces, que son interactivos.

El navegador sigue una serie de pasos para interpretar HTML:

- **Solicitar el documento**: El navegador envía una petición HTTP al servidor para obtener el archivo HTML.
- **Parsear el HTML**: El archivo es leído de arriba a abajo. Durante este proceso, el navegador identifica las etiquetas y las organiza en un modelo de estructura llamado "Árbol DOM" (Document Object Model).
- **Renderizado**: Una vez que el documento es interpretado y estructurado, el navegador comienza a dibujar los elementos visuales en pantalla.
- **Solicitar recursos adicionales**: Si el documento HTML hace referencia a otros archivos, como imágenes, hojas de estilo CSS o scripts de JavaScript, el navegador realiza nuevas solicitudes para obtenerlos y completar el renderizado de la página.

> [!IMPORTANT]
> Es importante destacar que el HTML por sí solo no determina el diseño visual ni la interactividad de una página. Para ello, el navegador utiliza otras tecnologías como CSS (que define cómo debe verse cada elemento) y JavaScript (que agrega funcionalidad e interacción dinámica).
