<h1 align="center">Formularios</h1>

<h2>📑 Contenido</h2>

- [Formularios](#formularios)
- [Manejar eventos de formularios](#manejar-eventos-de-formularios)
  - [Evento submit](#evento-submit)
  - [Evento input](#evento-input)
- [Capturar y procesar datos de formularios](#capturar-y-procesar-datos-de-formularios)
- [Implementar formularios dinámicos](#implementar-formularios-dinámicos)

## Formularios

Los formularios son una parte fundamental de las aplicaciones web, ya que permiten a los usuarios interactuar con el sitio, enviar datos y realizar acciones.

## Manejar eventos de formularios

JavaScript nos permite manejar eventos relacionados con formularios, como el envío del formulario (`submit`), la entrada de datos (`input`), el cambio de valor (`change`), entre otros. Estos eventos son clave para crear formularios interactivos.

### Evento submit

El evento submit se activa cuando el usuario intenta enviar el formulario. Podemos usar este evento para validar los datos antes de enviarlos o para evitar el envío predeterminado y procesar los datos con JavaScript.

HTML

```html
<form id="miFormulario">
  <label for="nombre">Nombre:</label>
  <input type="text" id="nombre" name="nombre" required />

  <label for="email">Correo electrónico:</label>
  <input type="email" id="email" name="email" required />

  <label for="contraseña">Contraseña:</label>
  <input type="password" id="contraseña" name="contraseña" required />

  <button type="submit">Enviar</button>
</form>
```

JavaScript

```Javascript
const formulario = document.getElementById('miFormulario');

formulario.addEventListener('submit', function(evento) {
  evento.preventDefault(); // Evita el envío predeterminado del formulario

  const nombre = document.getElementById('nombre').value;
  const email = document.getElementById('email').value;

  console.log(`Nombre: ${nombre}, Email: ${email}`);
  alert('Formulario enviado correctamente');
});
```

En este ejemplo, evitamos que el formulario se envíe de manera predeterminada usando `evento.preventDefault()`. Luego, capturamos los valores de los campos y los mostramos en la consola.

---

### Evento input

El evento `input` se activa cada vez que el usuario escribe en un campo. Esto es útil para validaciones en tiempo real o para actualizar dinámicamente otros elementos de la página.

```javascript
const campoNombre = document.getElementById("nombre");

campoNombre.addEventListener("input", function (evento) {
  console.log(`Valor actual: ${evento.target.value}`);
});
```

## Capturar y procesar datos de formularios

Una vez que el usuario ha ingresado los datos, es importante capturarlos y procesarlos. Podemos acceder a los valores de los campos usando `document.getElementById` o `formulario.elements`.

```javascript
const formulario = document.getElementById("miFormulario");

formulario.addEventListener("submit", function (evento) {
  evento.preventDefault();

  const datos = {
    nombre: formulario.elements.nombre.value,
    email: formulario.elements.email.value,
    contraseña: formulario.elements.contraseña.value,
  };

  console.log("Datos del formulario:", datos);
});
```

En este ejemplo, accedemos a los valores de los campos usando `formulario.elements`, lo que nos permite obtener los datos de manera estructurada.

## Implementar formularios dinámicos

JavaScript nos permite crear formularios dinámicos que se adaptan a las necesidades del usuario. Por ejemplo, podemos agregar campos adicionales basados en la entrada del usuario.

```javascript
const formulario = document.getElementById("miFormulario");
const contenedor = document.createElement("div");

formulario.addEventListener("change", function (evento) {
  if (evento.target.id === "opcionEspecial" && evento.target.checked) {
    const nuevoCampo = document.createElement("input");
    nuevoCampo.type = "text";
    nuevoCampo.placeholder = "Ingrese información adicional";
    contenedor.appendChild(nuevoCampo);
    formulario.insertBefore(contenedor, formulario.lastElementChild);
  }
});
```

En este ejemplo, si el usuario selecciona una opción especial, se agrega un nuevo campo de texto al formulario.
