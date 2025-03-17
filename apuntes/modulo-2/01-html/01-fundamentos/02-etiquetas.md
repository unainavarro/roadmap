<h1 align='center'>Etiquetas</h1>

<h2>📑 Contenido</h2>

- [¿Qué son las etiquetas?](#qué-son-las-etiquetas)
- [Estructura de un documento HTML](#estructura-de-un-documento-html)
- [Etiquetas de cabecera(Head)](#etiquetas-de-cabecerahead)
- [Etiquetas semánticas](#etiquetas-semánticas)
- [Etiquetas para texto](#etiquetas-para-texto)
- [Etiquetas para listas](#etiquetas-para-listas)
- [Etiquetas para tablas](#etiquetas-para-tablas)
- [Etiquetas para formularios](#etiquetas-para-formularios)
- [Etiquetas para multimedia](#etiquetas-para-multimedia)

## ¿Qué son las etiquetas?

Las etiquetas en HTML son comandos utilizados para definir la estructura y el contenido de un documento web. Cada etiqueta está compuesta por un nombre que se coloca entre corchetes angulares `< >`, y la mayoría de las veces viene en un par: una etiqueta de apertura y una de cierre. La etiqueta de apertura inicia el elemento, y la de cierre, que incluye una barra inclinada `</nombre>`, indica el final del elemento.

```html
<p>Este es un párrafo de texto.</p>
```

En este caso, la etiqueta `<p>` abre un párrafo, y `</p>` lo cierra.

Las etiquetas son esenciales para definir cómo se debe presentar el contenido en el navegador. Pueden contener texto, imágenes, videos y otros elementos que forman la base de una página web. Además, algunas etiquetas, como `<img>` o `<br>`, son etiquetas auto cerradas, lo que significa que no requieren una etiqueta de cierre.

## Estructura de un documento HTML

Un documento HTML básico sigue una estructura general que permite a los navegadores interpretar y mostrar el contenido correctamente. Esta estructura generalmente incluye las siguientes etiquetas principales:

- `<!DOCTYPE html>`: Es una declaración que indica al navegador que el documento está escrito en HTML5.
- `<html>`: Es el elemento raíz que envuelve todo el contenido de la página.
- `<head>`: Contiene información que no se muestra directamente en la página, como el título, metadatos y enlaces a recursos externos como hojas de estilo.
- `<title>`: Define el título que aparecerá en la pestaña del navegador.
- `<body>`: Es el contenedor principal de todo el contenido visible en la página, como texto, imágenes, enlaces y formularios.

```html
<!-- Ejemplo de la anatomía básica de un documento HTML -->

<!DOCTYPE html>
<html lang="es">
  <!-- lang => Atributo para definir el lenguaje  -->
  <head>
    <meta charset="UTF-8" />
    <!-- charset => el tipo de codificación -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <!-- http-equiv => Los servidores HTTP utilizan este atributo para obtener información sobre los encabezados del mensaje de respuesta HTTP -->
    <!-- content="IE=edge => permiten al navegador mostrar las páginas web que no cumplen con los estándares -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- con este metadato se define qué área de pantalla está disponible al renderizar un documento, nivel de escalado y el zoom que debe mostrar inicialmente-->
    <title>Titulo de la Pagina</title>
  </head>
  <body></body>
</html>
```

> [!NOTE]
>
> Dentro del body también se puede incluir código en linea por ejemplo de JavaScript o PHP.

## Etiquetas de cabecera(Head)

`<Head>` es un elemento que contiene información (metadatos) sobre el documento, como su título, scripts y hojas de estilo. Esta información es principalmente para el procesamiento por parte de las máquinas, no para la lectura por parte de los humanos.

- `<meta>` Establece un metadato específico en el documento actual.
- `<title>` Indica el título de la página.
- `<link>` Establece una relación del documento actual con otro externo.
- `<style>` Crea estilos CSS que afectarán únicamente al documento actual.
- `<script>` Indica un script a cargar o ejecutar en la página actual.
- `<base>` URL base de los enlaces (usado para gestionar rutas relativas).

## Etiquetas semánticas

Las etiquetas semánticas son elementos que definen el significado y la estructura de una página web.

- `<header>` Se utiliza para definir la cabecera la página web. Suele contener el menú de navegación y el logotipo.
- `<nav>` Se utiliza para definir la navegación de la web.
- `<main>` Se usa para definir el contenido principal del documento
- `<section>` Se utiliza para representar una sección genérica de un documento.
- `<article>` Se utiliza para representar secciones que no sean genéricas, a modo de artículos independientes como en las revistas.
- `<aside>` Se utiliza para alojar el contenido que tiene menos importancia de la web.
- `<footer>` Se utiliza para definir el pie de la pagina.
- `<div>` Crea un contenedor genérico para agrupar todo tipo de contenido.
- `<hr>` Crea una linea horizontal como separador de secciones.
- `<br>` Crea una salto de linea.
- `<h1>,<h2>,<h3>,<h4>,<h5>,<h6>` Encabezados, van de mayor a menor importancia (h1>h6).

> [!TIP]
>
> - Procurar utilizar solo un `<main>` y un `<h1>` por documento. <br>
> - Las etiquetas de encabezados tienen un orden de importancia, procurar no saltarse esa jerarquía.
> - Normalmente el `<header>` y el `<footer>` están arriba y abajo del documento,
>   no siempre tiene que ser así. Se pueden utilizar para introducir una sección
>   en el caso de `<header>` y para agregar información menos relevante en el caso del `<footer>`.

## Etiquetas para texto

Las etiquetas HTML de texto son elementos que sirven para dar formato, estructura o significado al texto de una página.

- `<p>` Etiqueta para escribir párrafos de texto. Puede contener otras etiquetas de texto como `<span>,<strong>,<small>,<cite>,<mark>...`
- `<strong>` Dar importancia al texto.
- `<small>` Quitar importancia al texto.
- `<cite>` Para citar el titulo de la obra.
- `<span>` Se usa para atribuir atributos a un texto.
- `<mark>` Marcar y resaltar texto.
- `<blockquote>` Para indicar que el contenido es texto citado.
- `<pre>` Conservar el formateo del texto.
- `<sub>` Añadir un subíndice.
- `<sup>` Añadir un superíndice.
- `<a>` Agregar un enlace a un texto. También se puede añadir enlaces a imágenes.

## Etiquetas para listas

Elementos que se usan para crear listas de elementos en una página web.

- `<ol>` Crear una lista ordenada.
- `<ul>` Crear una lista des-ordenada.
- `<li>` Recogen el contenido de un elemento de una lista, ya sea una lista ordenada o des-ordenada.
- `<dl>` Crear una lista de definiciones.
- `<dt>` Especificar el termino.
- `<dd>` Añadir detalles de la descripción.

## Etiquetas para tablas

Elementos que se usan para crear tablas de datos en una página web. Las tablas permiten organizar y presentar la información de forma estructurada y visual.

- `<table>` Para insertar una tabla.
- `<thead>` Define la sección del encabezado de la table.
- `<tbody>` Define la sección del cuerpo de la tabla.
- `<tfoot>` Define la sección del pie de la tabla..
- `<tr>` Para insertar filas en la tabla.
- `<td>` Para insertar columnas en la tabla.
- `<th>` Para insertar el encabezado de las celdas de la tabla.
- `<caption>` Para insertar el título de la tabla.
- `<colgroup>` Para agrupar las columnas de la tabla.

## Etiquetas para formularios

Elementos que se usan para crear formularios interactivos en una página web. Los formularios permiten al usuario introducir datos, seleccionar opciones, enviar información, etc.

- `<form>` Para insertar una formulario.
- `<input>` Inserta un campo para introducir datos.
- `<label>` Para definir el nombre de los campos.
- `<select>` Para mostrar un conjunto de opciones.
- `<option>` Se usa dentro del `<select>` para insertar las opciones que mostrar.
- `<fieldset>` Agrupa los elementos de un formulario pintando un recuadro al rededor de ellos.
- `<legend>` Para insertar un titulo en el `<fieldset>`.
- `<button>` Para insertar un botón que envié el formulario `<fieldset>`.

## Etiquetas para multimedia

Elementos que se usan para incluir contenido multimedia en una página web, como imágenes, audio o video.

- `<img>` Para insertar imágenes.
- `<picture>` Agrupar imágenes con distintas extensiones o distintas imágenes.
- `<figure>` Para insertar imágenes con un pie de imagen que van juntos en el mismo elemento.
- `<video>` Para insertar videos.
- `<audio>` Para insertar audios.
- `<embed>` Para insertar contenido de otras web-aplicaciones.
- `<svg>` Para insertar imágenes vectorizadas.
- `<source>` Para insertar recursos alternativos a videos y audios.

> [!IMPORTANT]
> Esto es solo una introducción a las etiquetas, en su bloque están más desarrollados los temas.
