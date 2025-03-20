<h1 align='center'>Nodos</h1>

<h2>📑 Contenido</h2>

- [Nodos](#nodos)
- [Tipos de nodos](#tipos-de-nodos)
- [Traversing DOM](#traversing-dom)
  - [Propiedades de traversing](#propiedades-de-traversing)
  - [Ejemplo de traversing](#ejemplo-de-traversing)
  - [Propiedades Avanzadas](#propiedades-avanzadas)
- [NodeList](#nodelist)
- [Diferencias entre NodeList y HTMLCollection](#diferencias-entre-nodelist-y-htmlcollection)
  - [NodeList](#nodelist-1)
  - [HTMLCollection](#htmlcollection)
- [Propiedad childNodes](#propiedad-childnodes)
  - [Notas sobre childNodes](#notas-sobre-childnodes)
- [Métodos útiles para manipular nodos](#métodos-útiles-para-manipular-nodos)
- [Buenas prácticas](#buenas-prácticas)

## Nodos

En el contexto del **Document Object Model (DOM)**, un **nodo** es una unidad fundamental de la estructura de un documento. Cada parte de un documento HTML o XML es representada como un nodo en el DOM, que puede ser un nodo de elemento, nodo de texto, nodo de atributo, entre otros. La manipulación de estos nodos es crucial para crear aplicaciones web dinámicas.

## Tipos de nodos

Los tipos más comunes de nodos en el DOM son:

- **Nodos de Elemento**: Representan elementos HTML, como `<div>`, `<p>`, `<span>`, etc.
- **Nodos de Texto**: Representan el contenido textual dentro de los nodos de elemento.
- **Nodos de Comentario**: Representan comentarios dentro del documento.
- **Nodos de Documento**: Representan el documento en sí mismo.

## Traversing DOM

**Traversing DOM** se refiere al proceso de navegar a través de los nodos del DOM. Esto permite a los desarrolladores acceder a nodos específicos y manipular su contenido o atributos. Hay varias propiedades y métodos que facilitan este recorrido.

### Propiedades de traversing

- **parentNode**: Devuelve el nodo padre de un nodo específico.
- **firstChild**: Devuelve el primer hijo de un nodo.
- **lastChild**: Devuelve el último hijo de un nodo.
- **nextSibling**: Devuelve el siguiente hermano del nodo.
- **previousSibling**: Devuelve el hermano anterior del nodo.

### Ejemplo de traversing

```javascript
let elemento = document.getElementById("miElemento");

// Obtiene el nodo padre
let padre = elemento.parentNode;

// Obtiene el primer hijo
let primerHijo = padre.firstChild;

// Obtiene el siguiente hermano
let siguienteHermano = elemento.nextSibling;
```

### Propiedades Avanzadas

- **children:** Devuelve una lista de los nodos hijos de tipo elemento.
- **closest(selector):** Encuentra el ancestro más cercano que coincida con el selector dado.
- **contains(node):** Comprueba si un nodo es descendiente de otro nodo.

```javascript
const elemento = document.getElementById("miElemento");

// Obtener solo elementos hijos
const hijosElementos = elemento.children;
console.log(hijosElementos.length);

// Buscar un ancestro específico
const contenedor = elemento.closest(".contenedor");
console.log(contenedor);

// Verificar relación entre nodos
if (document.body.contains(elemento)) {
  console.log("El elemento pertenece al documento.");
}
```

## NodeList

Un NodeList es una colección de nodos devuelta por ciertos métodos del DOM, como `querySelectorAll(), childNodes y getElementsByClassName()`. A diferencia de los arrays, los NodeLists no tienen métodos como `map()`, `forEach()`, etc., pero se pueden recorrer con un bucle `for`.

```js
let nodos = document.querySelectorAll("p"); // Obtiene todos los párrafos
nodos.forEach(function (nodo) {
  console.log(nodo.innerHTML); // Muestra el contenido de cada párrafo
});
```

## Diferencias entre NodeList y HTMLCollection

### NodeList

Contiene cualquier tipo de nodo (incluyendo nodos de texto y comentario). Es más flexible en navegadores modernos, ya que admite métodos como forEach.

### HTMLCollection

Contiene exclusivamente elementos HTML y actualiza automáticamente sus elementos si el DOM cambia (es live).

```javascript
// Ejemplo de NodeList
const nodos = document.querySelectorAll("p"); // Devuelve un NodeList estático
nodos.forEach((nodo) => console.log(nodo.innerText));

// Ejemplo de HTMLCollection
const hijos = document.getElementById("contenedor").children; // Devuelve un HTMLCollection dinámico
for (let hijo of hijos) {
  console.log(hijo.tagName);
}
```

## Propiedad childNodes

La propiedad childNodes devuelve una colección (NodeList) de todos los nodos hijos de un nodo específico, incluyendo nodos de texto, elementos y comentarios. Esta colección puede incluir nodos que no son elementos, como nodos de texto.

```js
let contenedor = document.getElementById("miContenedor");
let hijos = contenedor.childNodes; // Obtiene todos los nodos hijos

for (let i = 0; i < hijos.length; i++) {
  console.log(hijos[i].nodeName); // Muestra el nombre de cada nodo hijo
}
```

### Notas sobre childNodes

L- a propiedad `childNodes` incluye todos los tipos de nodos, no solo elementos. Por lo tanto, es común que la colección contenga nodos de texto (por ejemplo, espacios en blanco entre etiquetas).

- Para obtener solo los nodos de elementos hijos, se puede utilizar la propiedad `children`, que devuelve una colección HTMLCollection de nodos de elemento.

## Métodos útiles para manipular nodos

- **appendChild():** Añade un nodo como hijo.

- **removeChild():** Elimina un nodo hijo.

- **cloneNode():** Crea una copia de un nodo (opcionalmente, con todos sus hijos).

- **replaceChild():** Reemplaza un nodo hijo.

```javascript
const contenedor = document.getElementById("contenedor");

// Crear un nuevo nodo
const nuevoParrafo = document.createElement("p");
nuevoParrafo.textContent = "Soy un nuevo párrafo";

// Agregar el nodo al contenedor
contenedor.appendChild(nuevoParrafo);

// Clonar el nodo y agregarlo
const clon = nuevoParrafo.cloneNode(true);
contenedor.appendChild(clon);

// Eliminar el nodo original
contenedor.removeChild(nuevoParrafo);
```

## Buenas prácticas

Esta sección puede ser breve pero valiosa, enfocándose en evitar errores comunes y optimizar el rendimiento.

- **Evita el uso excesivo de `innerHTML`:**

  - Es poderoso pero puede introducir vulnerabilidades de XSS (Cross-Site Scripting) si no se valida correctamente.

  - En su lugar, usa métodos como textContent o appendChild.

- **Usa DocumentFragment para eficiencia:**

  - Cuando agregas múltiples nodos al DOM, DocumentFragment es más eficiente porque reduce las re-renderizaciones.

  ```javascript
  const fragmento = document.createDocumentFragment();

  for (let i = 0; i < 5; i++) {
    const item = document.createElement("p");
    item.textContent = `Párrafo ${i + 1}`;
    fragmento.appendChild(item);
  }

  document.body.appendChild(fragmento);
  ```

- **Selecciona nodos de forma específica:**

  - Usa `querySelector` o `querySelectorAll` para mayor flexibilidad al seleccionar nodos.

  ```javascript
  const primerElemento = document.querySelector(".clase");
  const todosElementos = document.querySelectorAll(".clase");
  ```
