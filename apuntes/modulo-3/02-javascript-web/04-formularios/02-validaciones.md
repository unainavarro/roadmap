<h1 align="center">Validaciones</h1>

<h2>📑 Contenido</h2>

- [Validaciones](#validaciones)
- [Validación del lado del cliente vs. validación del lado del servidor](#validación-del-lado-del-cliente-vs-validación-del-lado-del-servidor)
  - [Validación del lado del cliente](#validación-del-lado-del-cliente)
  - [Validación del lado del servidor](#validación-del-lado-del-servidor)
- [Implementar validaciones básicas](#implementar-validaciones-básicas)
- [Mensajes de error personalizados y retroalimentación al usuario](#mensajes-de-error-personalizados-y-retroalimentación-al-usuario)
- [Utilizar expresiones regulares para validación avanzada](#utilizar-expresiones-regulares-para-validación-avanzada)
- [Herramientas y bibliotecas para la validación de formularios](#herramientas-y-bibliotecas-para-la-validación-de-formularios)
- [Utilizar la API de validación de formularios](#utilizar-la-api-de-validación-de-formularios)
  - [Ejemplo: validar un formulario con la constraint validation API](#ejemplo-validar-un-formulario-con-la-constraint-validation-api)

## Validaciones

La validación es un paso crucial para garantizar que los datos ingresados por los usuarios sean precisos, seguros y cumplan con los requisitos necesarios antes de ser procesados.

## Validación del lado del cliente vs. validación del lado del servidor

### Validación del lado del cliente

La validación del lado del cliente se realiza directamente en el navegador antes de que los datos se envíen al servidor. Es rápida y mejora la experiencia del usuario al proporcionar retroalimentación inmediata. Sin embargo, no es suficiente por sí sola, ya que puede ser eludida por usuarios malintencionados.

### Validación del lado del servidor

La validación del lado del servidor se realiza después de que los datos se envían al servidor. Es esencial para garantizar la seguridad y la integridad de los datos, ya que no puede ser eludida por los usuarios. Ambas validaciones son complementarias y deben usarse juntas para una solución robusta.

## Implementar validaciones básicas

JavaScript nos permite implementar validaciones básicas como campos requeridos, longitud mínima o máxima, y formatos específicos. Aquí tienes un ejemplo de cómo validar un formulario:

HTML

```html
<form id="miFormulario">
  <label for="nombre">Nombre:</label>
  <input type="text" id="nombre" name="nombre" required minlength="3" />

  <label for="email">Correo electrónico:</label>
  <input type="email" id="email" name="email" required />

  <label for="contraseña">Contraseña:</label>
  <input
    type="password"
    id="contraseña"
    name="contraseña"
    required
    minlength="6"
  />

  <button type="submit">Enviar</button>
</form>

<p id="mensajeError" style="color: red;"></p>
```

JavaScript

```javascript
const formulario = document.getElementById("miFormulario");
const mensajeError = document.getElementById("mensajeError");

formulario.addEventListener("submit", function (evento) {
  evento.preventDefault();

  const nombre = formulario.elements.nombre.value;
  const email = formulario.elements.email.value;
  const contraseña = formulario.elements.contraseña.value;

  if (nombre.length < 3) {
    mensajeError.textContent = "El nombre debe tener al menos 3 caracteres.";
    return;
  }

  if (!email.includes("@")) {
    mensajeError.textContent =
      "Por favor, ingresa un correo electrónico válido.";
    return;
  }

  if (contraseña.length < 6) {
    mensajeError.textContent =
      "La contraseña debe tener al menos 6 caracteres.";
    return;
  }

  mensajeError.textContent = "";
  alert("Formulario enviado correctamente");
});
```

En este ejemplo, validamos que el nombre tenga al menos 3 caracteres, que el correo electrónico contenga un "@" y que la contraseña tenga al menos 6 caracteres. Si alguna validación falla, mostramos un mensaje de error.

## Mensajes de error personalizados y retroalimentación al usuario

Proporcionar mensajes de error claros y específicos es esencial para una buena experiencia del usuario. Podemos personalizar estos mensajes y mostrarlos cerca del campo correspondiente.

```javascript
formulario.addEventListener("submit", function (evento) {
  evento.preventDefault();

  const nombre = formulario.elements.nombre.value;
  const email = formulario.elements.email.value;
  const contraseña = formulario.elements.contraseña.value;

  if (nombre.length < 3) {
    mostrarError("nombre", "El nombre debe tener al menos 3 caracteres.");
    return;
  }

  if (!email.includes("@")) {
    mostrarError("email", "Por favor, ingresa un correo electrónico válido.");
    return;
  }

  if (contraseña.length < 6) {
    mostrarError(
      "contraseña",
      "La contraseña debe tener al menos 6 caracteres."
    );
    return;
  }

  alert("Formulario enviado correctamente");
});

function mostrarError(campoId, mensaje) {
  const campo = document.getElementById(campoId);
  const errorSpan = document.createElement("span");
  errorSpan.style.color = "red";
  errorSpan.textContent = mensaje;
  campo.parentNode.insertBefore(errorSpan, campo.nextSibling);
}
```

En este ejemplo, la función `mostrarError` agrega un mensaje de error específico junto al campo correspondiente.

## Utilizar expresiones regulares para validación avanzada

Las expresiones regulares (regex) son una herramienta poderosa para validar formatos complejos, como números de teléfono, códigos postales, etc. Aquí tienes un ejemplo de cómo validar un número de teléfono:

```javascript
formulario.addEventListener("submit", function (evento) {
  evento.preventDefault();

  const telefono = formulario.elements.telefono.value;
  const regexTelefono = /^\d{10}$/;

  if (!regexTelefono.test(telefono)) {
    mostrarError(
      "telefono",
      "Por favor, ingresa un número de teléfono válido (10 dígitos)."
    );
    return;
  }

  alert("Formulario enviado correctamente");
});
```

En este ejemplo, usamos una expresión regular para validar que el número de teléfono tenga exactamente 10 dígitos.

## Herramientas y bibliotecas para la validación de formularios

Existen varias bibliotecas y herramientas que facilitan la validación de formularios. Algunas de las más populares son:

- **HTML5 Validation:** Usa atributos como `required`, `minlength`, `maxlength`, `pattern`, etc.

- **Constraint Validation API:** Proporciona métodos y propiedades para validar formularios de manera programática.

- **Bibliotecas de terceros:**

  - **Validator.js:** Una biblioteca ligera para validaciones comunes.

  - **Yup:** Una biblioteca para validación de esquemas, ideal para formularios complejos.

  - **Formik:** Una biblioteca que combina manejo de formularios y validación en React

## Utilizar la API de validación de formularios

La Forms API también incluye métodos y propiedades para validar formularios de manera programática. Podemos usar la Constraint Validation API para verificar si los campos cumplen con las reglas de validación y mostrar mensajes de error personalizados.

Métodos clave de la Constraint Validation API

- **checkValidity():** Verifica si el formulario o un campo específico es válido.

- **setCustomValidity(mensaje):** Establece un mensaje de error personalizado para un campo.

### Ejemplo: validar un formulario con la constraint validation API

HTML

```html
<form id="miFormulario">
  <label for="nombre">Nombre:</label>
  <input type="text" id="nombre" name="nombre" required />

  <label for="email">Correo electrónico:</label>
  <input type="email" id="email" name="email" required />

  <button type="submit">Enviar</button>
</form>

<p id="mensajeError" style="color: red;"></p>
```

JavaScript

```javascript
const formulario = document.getElementById("miFormulario");
const mensajeError = document.getElementById("mensajeError");

formulario.addEventListener("submit", function (evento) {
  if (!formulario.checkValidity()) {
    evento.preventDefault();

    // Mostrar mensajes de error personalizados
    if (!formulario.elements.nombre.validity.valid) {
      mensajeError.textContent = "El nombre es requerido.";
    } else if (!formulario.elements.email.validity.valid) {
      mensajeError.textContent =
        "Por favor, ingresa un correo electrónico válido.";
    }
  } else {
    alert("Formulario enviado correctamente");
  }
});
```

En este ejemplo, usamos `checkValidity()` para verificar si el formulario es válido. Si no lo es, mostramos mensajes de error personalizados.
