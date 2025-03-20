<h1 align='center'>DOM HTML</h1>

<h2>📑 Contenido</h2>

- [DOM HTML](#dom-html)
- [Editar y modificar](#editar-y-modificar)
  - [Modificar contenido](#modificar-contenido)
  - [Modificar estilos](#modificar-estilos)
- [Crear y añadir](#crear-y-añadir)
  - [Crear un elemento](#crear-un-elemento)
  - [Añadir un elemento](#añadir-un-elemento)
- [Más métodos](#más-métodos)
  - [replaceChild()](#replacechild)
  - [removeChild()](#removechild)
- [Atributos](#atributos)
  - [getAttribute()](#getattribute)
  - [setAttribute()](#setattribute)
  - [Atributos comunes](#atributos-comunes)

## DOM HTML

El **DOM HTML** es una representación en forma de árbol de un documento HTML que permite la interacción y manipulación de los elementos de la página web mediante JavaScript. A través del DOM, los desarrolladores pueden editar, modificar, crear y añadir elementos, así como gestionar sus atributos.

## Editar y modificar

Los desarrolladores pueden modificar el contenido y las propiedades de los elementos HTML utilizando varias técnicas en JavaScript.

### Modificar contenido

- **innerHTML**: Permite cambiar el contenido HTML de un elemento.

  ```javascript
  let elemento = document.getElementById("miElemento");
  elemento.innerHTML = "<strong>Contenido Nuevo</strong>";
  ```

- **textContent**: Cambia el contenido de texto de un elemento, ignorando cualquier HTML.
  ```javascript
  elemento.textContent = "Texto solo sin HTML.";
  ```

### Modificar estilos

- **style**: Permite aplicar estilos CSS en línea a un elemento.
  ```javascript
  elemento.style.color = "blue"; // Cambia el color del texto a azul
  elemento.style.backgroundColor = "lightgray"; // Cambia el color de fondo
  ```

## Crear y añadir

JavaScript también permite crear nuevos elementos y añadirlos al DOM.

### Crear un elemento

- **document.createElement()**: Crea un nuevo elemento HTML.
  ```javascript
  let nuevoElemento = document.createElement("div");
  nuevoElemento.textContent = "Soy un nuevo div!";
  ```

### Añadir un elemento

- **appendChild()**: Añade un nuevo hijo al final de la lista de hijos de un elemento.

  ```javascript
  let contenedor = document.getElementById("miContenedor");
  contenedor.appendChild(nuevoElemento); // Añade el nuevo div al contenedor
  ```

- **insertBefore()**: Inserta un nuevo nodo antes de un nodo existente.
  ```javascript
  contenedor.insertBefore(nuevoElemento, contenedor.firstChild); // Inserta al principio
  ```

## Más métodos

Además de los métodos anteriores, hay otras funciones útiles para manipular el DOM.

### replaceChild()

- **replaceChild()**: Reemplaza un nodo hijo existente con un nuevo nodo.
  ```javascript
  let viejoElemento = document.getElementById("viejoElemento");
  contenedor.replaceChild(nuevoElemento, viejoElemento); // Reemplaza viejoElemento
  ```

### removeChild()

- **removeChild()**: Elimina un nodo hijo de un elemento.
  ```javascript
  contenedor.removeChild(viejoElemento); // Elimina el viejoElemento
  ```

---

## Atributos

Los atributos son propiedades de los elementos HTML que proporcionan información adicional. Se pueden acceder y modificar mediante los métodos `getAttribute()` y `setAttribute()`.

### getAttribute()

- **getAttribute(name)**: Devuelve el valor del atributo especificado.
  ```javascript
  let enlace = document.getElementById("miEnlace");
  let href = enlace.getAttribute("href"); // Obtiene el valor del atributo href
  console.log(href);
  ```

### setAttribute()

- **setAttribute(name, value)**: Establece el valor de un atributo en un elemento.
  ```javascript
  enlace.setAttribute("href", "https://www.nueva-url.com"); // Cambia el href
  enlace.setAttribute("target", "_blank"); // Añade el atributo target
  ```

### Atributos comunes

- **href**: Especifica la URL de un enlace.
- **src**: Especifica la URL de una imagen o un script.
- **alt**: Proporciona un texto alternativo para las imágenes.
