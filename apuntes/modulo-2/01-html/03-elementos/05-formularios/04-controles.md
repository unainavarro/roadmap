<h1 align='center'>Controles</h1>

<h2>📑 Contenido</h2>

- [Etiquetado de controles](#etiquetado-de-controles)
- [Agrupación de controles](#agrupación-de-controles)
  - [Agrupar select](#agrupar-select)

## Etiquetado de controles

Las etiquetas de controles sirven para asociar una descripción corta para los campos.

- El atributo `for` asocia la etiqueta `<label>` con el `id` del campo.
- El `for` y el `id` tienen que coincidir.
- Al hacer click en el `<label>` hace autofocus en el campo.

```HTML
<!-- Ejemplo -->
    <label for="nombre">Nombre</label>
    <input type="text" id="nombre" name="nombre" />
```

> [!TIP]
>
> Otra forma de asociar con label sin **for** ni **id**:
>
> ```html
> <label>
>   Nombre:
>   <input type="text" name="nombre" />
> </label>
> ```

## Agrupación de controles

Para agrupar los campos de un formulario en grupos y tener una mejor organización HTML dispone de la etiqueta `<fieldset>`. Mediante es uso de la etiqueta `<legend>` podemos asignar un titulo a la agrupación del `<fieldset>`.

```html
<!-- Ejemplo -->
<fieldset>
  <legend>Información Personal</legend>
  Nombre: <input name="nombre" type="text" />
  <br />
  <br />
  Apellidos: <input name="apellidos" type="text" />
</fieldset>
```

### Agrupar select

Para agrupar en diferentes categorías las opciones de un select podemos hacer uso del elemento `<optgroup label="NombreCategoría">`

```html
<!-- Ejemplo -->
<select>
  <option value="">Elija una opción</option>
  <optgroup label="Frontend">
    <option value="">HTML</option>
    <option value="">CSS</option>
    <option value="">JavaScript</option>
  </optgroup>
  <optgroup label="Backend">
    <option value="">Java</option>
    <option value="">PHP</option>
    <option value="">SQL</option>
  </optgroup>
</select>
```
