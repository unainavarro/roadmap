<h1 align='center'>DOM - Document Object Model</h1>

<h2>📑 Contenido</h2>

- [DOM](#dom)
- [¿Qué es el DOM?](#qué-es-el-dom)
- [Estructura del DOM](#estructura-del-dom)
  - [Ejemplo de Estructura del DOM](#ejemplo-de-estructura-del-dom)

## DOM

El **Document Object Model (DOM)** es una interfaz de programación para documentos HTML y XML. Representa la estructura del documento como un árbol de nodos, donde cada nodo corresponde a una parte del documento, como elementos, atributos y texto. JavaScript se utiliza comúnmente para interactuar y manipular el DOM, lo que permite a los desarrolladores crear páginas web dinámicas e interactivas.

## ¿Qué es el DOM?

El DOM es un modelo que permite a los programas acceder y manipular el contenido, la estructura y el estilo de los documentos web. A través del DOM, los elementos HTML son representados como objetos en la memoria, lo que permite a los desarrolladores modificar el contenido y la presentación de la página en tiempo real.

## Estructura del DOM

La estructura del DOM es jerárquica y se organiza en un árbol de nodos. Los tipos principales de nodos en el DOM son:

- **Nodos de Elemento**: Representan elementos HTML, como `<div>`, `<p>`, `<a>`, etc.
- **Nodos de Texto**: Representan el contenido textual de los elementos.
- **Nodos de Atributo**: Representan los atributos de los elementos HTML, aunque no se pueden manipular directamente como nodos en la mayoría de los contextos de JavaScript.

### Ejemplo de Estructura del DOM

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Ejemplo de DOM</title>
  </head>
  <body>
    <h1>Título Principal</h1>
    <p>Este es un párrafo de ejemplo.</p>
    <div class="contenedor">
      <p>Otro párrafo dentro de un contenedor.</p>
    </div>
  </body>
</html>
```

En este ejemplo, la estructura del DOM sería algo como:

```
- Document
  - html
    - head
      - title
    - body
      - h1
      - p
      - div
        - p
```
