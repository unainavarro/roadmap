<h1 align="center"> Manejar eventos</h1>

<h2>📑 Contenido</h2>

- [Manejar eventos](#manejar-eventos)
- [¿Qué son los eventos?](#qué-son-los-eventos)
- [Tipos de eventos comunes](#tipos-de-eventos-comunes)
  - [Eventos del mouse](#eventos-del-mouse)
  - [Eventos del teclado](#eventos-del-teclado)
  - [Eventos del formulario](#eventos-del-formulario)
  - [Eventos de la ventana](#eventos-de-la-ventana)
- [Asignar eventos en el HTML](#asignar-eventos-en-el-html)
- [Manejar eventos con JavaScript](#manejar-eventos-con-javascript)
  - [Ejemplo con addEventListener](#ejemplo-con-addeventlistener)
- [Buenas prácticas](#buenas-prácticas)

## Manejar eventos

En el desarrollo web, la interacción del usuario con una página es fundamental para crear experiencias dinámicas y atractivas. Los eventos son la forma en que JavaScript responde a las acciones del usuario, como hacer clic en un botón, mover el mouse, presionar una tecla o incluso cargar una página. Manejar eventos de manera efectiva es esencial para construir aplicaciones web interactivas y responsivas.

## ¿Qué son los eventos?

Un evento es una acción o ocurrencia que sucede en el navegador, como resultado de la interacción del usuario o de cambios en el estado de la página. Algunos ejemplos comunes de eventos incluyen:

- Clics del mouse (click).

- Movimiento del mouse (`mouseover`, `mouseout`).

- Presión de teclas (`keydown`, `keyup`).

- Carga de la página (`load`).

- Envío de formularios (`submit`).

Cuando ocurre un evento, el navegador genera un objeto que contiene información sobre el evento, como el tipo de evento, el elemento que lo desencadenó y otros detalles relevantes. JavaScript puede "escuchar" estos eventos y ejecutar código en respuesta.

## Tipos de eventos comunes

### Eventos del mouse

- **click:** Ocurre cuando el usuario hace clic en un elemento.

- **mouseover:** Ocurre cuando el mouse se mueve sobre un elemento.

- **mouseout:** Ocurre cuando el mouse sale de un elemento.

```javascript
// click
const boton = document.getElementById("miBoton");
boton.addEventListener("click", () => {
  console.log("¡Botón clickeado!");
});

// mouseover
const imagen = document.getElementById("miImagen");
imagen.addEventListener("mouseover", () => {
  imagen.style.border = "2px solid red";
});

// mouseout
imagen.addEventListener("mouseout", () => {
  imagen.style.border = ""; // Elimina el borde
});
```

### Eventos del teclado

- **keydown:** Ocurre cuando el usuario presiona una tecla.

- **keyup:** Ocurre cuando el usuario suelta una tecla.

```javascript
// keydown
document.addEventListener("keydown", (evento) => {
  console.log(`Tecla presionada: ${evento.key}`);
});

// keyup
document.addEventListener("keyup", (evento) => {
  console.log(`Tecla soltada: ${evento.key}`);
});
```

### Eventos del formulario

- **submit:** Ocurre cuando se envía un formulario.

- **change:** Ocurre cuando el valor de un campo de formulario cambia.

```javascript
// submit
const formulario = document.getElementById("miFormulario");
formulario.addEventListener("submit", (evento) => {
  evento.preventDefault(); // Previene el envío por defecto
  console.log("Formulario enviado");
});

// change
const seleccion = document.getElementById("miSelect");
seleccion.addEventListener("change", (evento) => {
  console.log(`Nuevo valor seleccionado: ${evento.target.value}`);
});
```

### Eventos de la ventana

- **load:** Ocurre cuando la página ha terminado de cargarse.

- **resize:** Ocurre cuando se cambia el tamaño de la ventana del navegador.

```javascript
// load
window.addEventListener("load", () => {
  console.log("Página completamente cargada");
});

// resize
window.addEventListener("resize", () => {
  console.log(`Tamaño actual: ${window.innerWidth}x${window.innerHeight}`);
});
```

## Asignar eventos en el HTML

Una forma sencilla de manejar eventos es asignarlos directamente en el HTML utilizando atributos como `onclick`, `onmouseover`, o `onkeydown`. Aunque este enfoque es fácil de implementar, **no es la mejor práctica**, ya que mezcla la lógica de JavaScript con la estructura HTML.

```html
<button onclick="alert('¡Hiciste clic!')">Haz clic</button>
```

## Manejar eventos con JavaScript

Una mejor práctica es manejar los eventos directamente en JavaScript. Esto permite separar la lógica del código de la estructura HTML, lo que hace que el código sea más modular y fácil de mantener.

### Ejemplo con addEventListener

El método `addEventListener` es la forma recomendada de manejar eventos en JavaScript. Permite asignar múltiples eventos a un mismo elemento y es más flexible que los atributos HTML.

```html
<button id="miBoton">Haz clic</button>
```

```javascript
const boton = document.getElementById("miBoton");

boton.addEventListener("click", () => {
  alert("¡Hiciste clic!");
});
```

## Buenas prácticas

- **Separar la Lógica del HTML:**
  Evita usar atributos como `onclick` en el HTML. En su lugar, maneja los eventos en archivos JavaScript separados.

- **Usar addEventListener:**
  Este método permite asignar múltiples eventos a un mismo elemento y es más flexible que los atributos HTML.

- **Mantener el Código Modular:**
  Organiza tu código en funciones reutilizables y asigna eventos de manera dinámica. Por ejemplo:

  ```javascript
  function manejarClic() {
    console.log("Botón clickeado");
  }
  const boton = document.getElementById("miBoton");
  boton.addEventListener("click", manejarClic);
  ```

- **Evitar el Uso Excesivo de Eventos:**
  Asigna eventos solo a los elementos que los necesitan y evita duplicar funcionalidades.

- **Remover Eventos cuando sea Necesario:**
  Si un evento ya no es necesario, usa `removeEventListener` para eliminarlo y liberar recursos.

  ```javascript
  boton.removeEventListener("click", manejarClic);
  ```
