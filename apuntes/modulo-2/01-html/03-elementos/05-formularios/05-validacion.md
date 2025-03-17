<h1 align='center'>Validación</h1>

<h2>📑 Contenido</h2>

- [Validación](#validación)
- [Atributos de validación incorporados](#atributos-de-validación-incorporados)

## Validación

La validación de formularios en HTML es crucial para garantizar que los usuarios proporcionen datos correctos y completos antes de enviar un formulario. HTML5 ofrece tanto validación básica integrada en el navegador (validación del lado del cliente) como la posibilidad de añadir validaciones más avanzadas con JavaScript.

> [!CAUTION]
> Validar desde el lado servidor.
>
> Aunque la validación del lado del cliente (HTML5 y JavaScript) es útil para mejorar la experiencia del usuario y evitar errores inmediatos, no debe ser la única capa de validación. Los datos enviados desde el formulario siempre deben validarse nuevamente del lado del servidor (PHP, Node.js, Python, etc.) para asegurar que los datos sean correctos y seguros.

## Atributos de validación incorporados

- **required:** Obliga al usuario a rellenar el campo antes de enviar el formulario.
- **type:** Define el tipo de dato esperado, como correo electrónico o número.
- **minlength y maxlength:** Establecen la longitud mínima y máxima para los campos de texto.
- **pattern:** Permite definir una expresión regular que los datos deben cumplir. Útil para validar formatos específicos, como códigos postales o contraseñas.
- **min y max:** Definen valores mínimos y máximos para entradas numéricas o de tipo fecha.
- **step:** Establece los intervalos de valores aceptados para campos numéricos. Por ejemplo, si step="0.01", el valor puede ser decimal con dos lugares decimales.

```html
<h2>Formulario de Registro</h2>
<form action="/procesar.php" method="POST">
  <!-- Nombre (obligatorio) -->
  <label for="nombre">Nombre:</label>
  <input type="text" id="nombre" name="nombre" required /><br /><br />

  <!-- Correo electrónico (formato válido) -->
  <label for="correo">Correo Electrónico:</label>
  <input type="email" id="correo" name="correo" required /><br /><br />

  <!-- Edad (debe estar entre 18 y 99 años) -->
  <label for="edad">Edad:</label>
  <input
    type="number"
    id="edad"
    name="edad"
    min="18"
    max="99"
    required
  /><br /><br />

  <!-- Contraseña (mínimo 8 caracteres) -->
  <label for="password">Contraseña:</label>
  <input
    type="password"
    id="password"
    name="password"
    minlength="8"
    required
  /><br /><br />

  <!-- Teléfono (exactamente 10 dígitos) -->
  <label for="telefono">Teléfono:</label>
  <input
    type="text"
    id="telefono"
    name="telefono"
    pattern="[0-9]{10}"
    title="Debe tener 10 dígitos"
    required
  /><br /><br />

  <input type="submit" value="Enviar" />
</form>
```
