<h1 align='center'>DOM CSS</h1>

<h2>📑 Contenido</h2>

- [DOM CSS](#dom-css)
- [Editar y modificar](#editar-y-modificar)
  - [Modificar estilos en línea](#modificar-estilos-en-línea)
  - [Clases CSS](#clases-css)
- [Crear y añadir](#crear-y-añadir)
  - [Crear clases dinámicamente](#crear-clases-dinámicamente)
  - [Añadir estilos mediante una hoja de estilos dinámica](#añadir-estilos-mediante-una-hoja-de-estilos-dinámica)
- [Más métodos](#más-métodos)
  - [getComputedStyle()](#getcomputedstyle)
- [Manipular variables CSS (CSS custom properties)](#manipular-variables-css-css-custom-properties)
- [Crear clases y estilos dinámicamente](#crear-clases-y-estilos-dinámicamente)
- [Pseudo-elementos y pseudo-clases](#pseudo-elementos-y-pseudo-clases)
- [Buenas prácticas al modificar estilos](#buenas-prácticas-al-modificar-estilos)

## DOM CSS

El **DOM CSS** permite a los desarrolladores interactuar y manipular los estilos CSS aplicados a los elementos de una página web mediante JavaScript. Esto incluye la posibilidad de editar, modificar, crear y añadir nuevos estilos, así como acceder y gestionar los atributos relacionados con la presentación visual de los elementos.

## Editar y modificar

Existen diversas formas de modificar los estilos CSS de un elemento mediante JavaScript. La manera más directa es a través de la propiedad **style** de un elemento, que permite aplicar o modificar estilos en línea.

### Modificar estilos en línea

- **element.style**: Permite acceder y cambiar las propiedades CSS en línea de un elemento.

  ```javascript
  let elemento = document.getElementById("miElemento");
  elemento.style.color = "red"; // Cambia el color del texto
  elemento.style.backgroundColor = "blue"; // Cambia el color de fondo
  elemento.style.fontSize = "20px"; // Cambia el tamaño de la fuente
  ```

- **element.style.cssText**: Permite establecer múltiples estilos como una cadena de texto CSS.

  ```javascript
  elemento.style.cssText =
    "color: white; background-color: black; padding: 10px;";
  ```

### Clases CSS

En lugar de modificar los estilos directamente, a menudo es más eficiente cambiar o añadir clases CSS que ya tengan estilos definidos en una hoja de estilos.

- **element.classList.add()**: Añade una clase CSS a un elemento.

  ```javascript
  elemento.classList.add("nueva-clase");
  ```

- **element.classList.remove()**: Elimina una clase CSS de un elemento.

  ```javascript
  elemento.classList.remove("vieja-clase");
  ```

- **element.classList.toggle()**: Alterna la presencia de una clase CSS en un elemento (la añade si no está presente, o la elimina si ya está aplicada).

  ```javascript
  elemento.classList.toggle("activo");
  ```

---

## Crear y añadir

En lugar de modificar estilos individuales, es posible crear y añadir nuevos estilos a un elemento utilizando las clases CSS.

### Crear clases dinámicamente

- **element.className**: Permite establecer una lista de clases para un elemento. Sobrescribe todas las clases existentes.

  ```javascript
  elemento.className = "clase1 clase2"; // Asigna múltiples clases al elemento
  ```

### Añadir estilos mediante una hoja de estilos dinámica

Es posible crear una nueva hoja de estilos utilizando JavaScript y añadirla al documento.

```javascript
let estilo = document.createElement("style");
estilo.type = "text/css";
estilo.innerHTML =
  ".miClaseDinamica { color: green; background-color: yellow; }";
document.getElementsByTagName("head")[0].appendChild(estilo);
```

Esto añadirá una nueva clase llamada miClaseDinamica a la hoja de estilos de la página.

## Más métodos

Además de los métodos comunes como `style` y `classList`, existen otros métodos y propiedades útiles para manipular los estilos CSS mediante el DOM.

### getComputedStyle()

getComputedStyle(elemento): Devuelve los estilos calculados de un elemento (aquellos que se están aplicando actualmente, incluidos los valores heredados o de las hojas de estilo externas).

```javascript
let elemento = document.getElementById("miElemento");
let estilos = getComputedStyle(elemento);

// Obteniendo propiedades específicas
console.log(estilos.color); // Color de texto
console.log(estilos.margin); // Margen del elemento
```

Comparando valores calculados
Supongamos que tenemos un contenedor cuyo margen se define en porcentajes. Usando getComputedStyle, podemos obtener el margen en píxeles (ya calculado):

```javascript
let contenedor = document.getElementById("contenedor");
let margenCalculado = getComputedStyle(contenedor).margin;
console.log(`El margen calculado es: ${margenCalculado}`); // Ejemplo: "20px"
```

## Manipular variables CSS (CSS custom properties)

Definimos un tema claro y uno oscuro utilizando variables:

```css
:root {
  --color-fondo: white;
  --color-texto: black;
}

.tema-oscuro {
  --color-fondo: black;
  --color-texto: white;
}
```

Con JavaScript, podemos cambiar entre temas:

```javascript
let body = document.body;
body.classList.toggle("tema-oscuro"); // Alterna el tema

// Acceso dinámico a las variables
let fondo = getComputedStyle(body).getPropertyValue("--color-fondo");
console.log(`El color de fondo actual es: ${fondo}`);
```

## Crear clases y estilos dinámicamente

Esta técnica es útil para añadir nuevos estilos directamente desde JavaScript sin modificar el archivo CSS.

```javascript
let estilo = document.createElement("style");
document.head.appendChild(estilo);
estilo.sheet.insertRule(
  `
  .animacion {
    animation: girar 2s infinite;
  }
`,
  0
);

// Agregando keyframes para animación
estilo.sheet.insertRule(
  `
  @keyframes girar {
    0% { transform: rotate(0deg); }
    100% { transform: rotate(360deg); }
  }
`,
  1
);

let caja = document.getElementById("caja");
caja.classList.add("animacion");
```

## Pseudo-elementos y pseudo-clases

Si no puedes acceder directamente a un pseudo-elemento o pseudo-clase, puedes gestionarlos mediante estilos en JavaScript.

```javascript
let estilo = document.createElement("style");
document.head.appendChild(estilo);

estilo.sheet.insertRule(`
  #miElemento::after {
    content: " - Añadido dinámicamente";
    color: red;
  }
`);
```

Esto añade contenido y lo estiliza usando un pseudo-elemento `::after`

## Buenas prácticas al modificar estilos

Agregar estilos directamente al DOM puede ser necesario, pero también tiene implicaciones de rendimiento y mantenimiento.

- **Evita estilos en línea cuando sea posible:** Cambiar clases CSS es más limpio y facilita el mantenimiento.

- **Agrupa cambios al DOM:** Utiliza DocumentFragment cuando añadas muchos elementos o actualices varios estilos para mejorar el rendimiento.

- **Prefiere classList:** Es más eficiente y claro trabajar con clases en lugar de manipular directamente las propiedades style.

  ```javascript
  // Utiliza esto
  let elemento = document.getElementById("miElemento");
  elemento.classList.add("fondo-azul");

  // En lugar de esto
  elemento.style.backgroundColor = "blue";
  // Más difícil de mantener
  ```
