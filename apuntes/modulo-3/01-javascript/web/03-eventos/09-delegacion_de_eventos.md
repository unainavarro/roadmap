<h1 align="center">Delegación de eventos</h1>

<h2>📑 Contenido</h2>

- [Delegación de eventos](#delegación-de-eventos)
- [¿Qué es la delegación de eventos?](#qué-es-la-delegación-de-eventos)
- [Ventajas de la delegación de eventos](#ventajas-de-la-delegación-de-eventos)
- [Cómo funciona la delegación de eventos](#cómo-funciona-la-delegación-de-eventos)
- [Ejemplos prácticos](#ejemplos-prácticos)
  - [Ejemplo1: manejar clics en una lista dinámica](#ejemplo1-manejar-clics-en-una-lista-dinámica)
  - [Ejemplo2: identificar elementos específicos con event.target](#ejemplo2-identificar-elementos-específicos-con-eventtarget)

## Delegación de eventos

La delegación de eventos es una técnica en JavaScript que permite manejar eventos de múltiples elementos utilizando un único controlador de eventos en su contenedor padre. Esto es especialmente útil cuando trabajas con elementos dinámicos (como listas que se actualizan frecuentemente) o cuando tienes muchos elementos que comparten el mismo comportamiento.

## ¿Qué es la delegación de eventos?

La delegación de eventos se basa en el concepto de propagación de eventos (bubbling), donde un evento que ocurre en un elemento hijo se propaga hacia arriba a través de sus ancestros en el DOM. En lugar de asignar un controlador de eventos a cada elemento hijo, puedes asignar un solo controlador al contenedor padre y manejar los eventos de todos los hijos desde allí.

## Ventajas de la delegación de eventos

- **Eficiencia:** Reduce el número de controladores de eventos en la página, lo que mejora el rendimiento.

- **Manejo de elementos dinámicos:** Funciona perfectamente con elementos que se agregan o eliminan dinámicamente.

- **Código más limpio:** Evita la necesidad de asignar eventos individuales a cada elemento.

## Cómo funciona la delegación de eventos

- **Asignar el controlador al contenedor padre:** En lugar de asignar un controlador a cada elemento hijo, se asigna un solo controlador al contenedor padre.

- **Usar event.target para identificar el elemento:** Dentro del controlador, se utiliza `event.target` para determinar qué elemento hijo desencadenó el evento.

- **Filtrar eventos según el elemento:** Si es necesario, se puede verificar el tipo de elemento o sus atributos para manejar el evento de manera específica.

## Ejemplos prácticos

### Ejemplo1: manejar clics en una lista dinámica

Supongamos que tienes una lista de elementos que se actualiza dinámicamente y deseas manejar clics en cada elemento.

HTML

```html
<ul id="lista">
  <li>Elemento 1</li>
  <li>Elemento 2</li>
  <li>Elemento 3</li>
</ul>
<button id="agregarElemento">Agregar Elemento</button>
```

Javascript

```javascript
const lista = document.getElementById("lista");
const botonAgregar = document.getElementById("agregarElemento");

// Delegación de eventos: Manejar clics en la lista
lista.addEventListener("click", (evento) => {
  if (evento.target.tagName === "LI") {
    console.log(`Clic en: ${evento.target.textContent}`);
  }
});

// Agregar elementos dinámicamente
botonAgregar.addEventListener("click", () => {
  const nuevoElemento = document.createElement("li");
  nuevoElemento.textContent = `Elemento ${lista.children.length + 1}`;
  lista.appendChild(nuevoElemento);
});
```

Explicación

- **Delegación de eventos:** El controlador de eventos está asignado al contenedor `<ul>`, pero maneja clics en cualquier `<li>`.

- **Elementos dinámicos:** Al agregar nuevos elementos a la lista, no es necesario asignarles eventos individuales, ya que el controlador del contenedor los maneja automáticamente.

---

### Ejemplo2: identificar elementos específicos con event.target

En este ejemplo, se manejan clics en una lista de botones y se identifica cuál botón fue presionado.

HTML

```html
<div id="contenedor">
  <button class="boton" data-accion="guardar">Guardar</button>
  <button class="boton" data-accion="eliminar">Eliminar</button>
  <button class="boton" data-accion="editar">Editar</button>
</div>
```

Javascript

```javascript
const contenedor = document.getElementById("contenedor");

contenedor.addEventListener("click", (evento) => {
  if (evento.target.classList.contains("boton")) {
    const accion = evento.target.getAttribute("data-accion");
    console.log(`Botón presionado: ${accion}`);
  }
});
```

Explicación

- **Delegación de eventos:** El controlador está asignado al contenedor `<div>`, pero maneja clics en cualquier botón con la clase `boton`.

- **Identificación del botón:** Se usa `event.target` para obtener el botón específico que se presionó y su atributo `data-accion`.
