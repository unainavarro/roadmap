<h1 align='center'>Tabla semántica</h1>

<h2>📑 Contenido</h2>

- [Tabla semántica](#tabla-semántica)
- [Estructura de una tabla semántica](#estructura-de-una-tabla-semántica)

## Tabla semántica

Una tabla semántica en HTML se refiere a una tabla que está estructurada de manera que no solo proporciona datos visualmente, sino que también tiene un propósito claro y comprensible tanto para los usuarios como para los motores de búsqueda y tecnologías asistivas, como los lectores de pantalla.

Para lograr una tabla semántica, se deben utilizar las etiquetas adecuadas y aplicar principios de accesibilidad. A continuación te explico cómo construir una tabla semántica utilizando HTML.

## Estructura de una tabla semántica

Una tabla semántica debe incluir elementos que faciliten la comprensión del contenido tanto a usuarios humanos como a dispositivos de asistencia (lectores de pantalla, por ejemplo). Las siguientes etiquetas son importantes para garantizar la accesibilidad y la semántica de la tabla:

- **`<table>`:** Define la tabla.
- **`<caption>`:** Proporciona un título o descripción para la tabla, lo cual es útil para los usuarios y para la accesibilidad.
- **`<thead>`:** Agrupa los encabezados de las columnas, lo cual es útil para tecnologías de asistencia.
- **`<tbody>`:** Contiene el cuerpo de la tabla, donde se encuentran los datos.
- **`<tfoot>`:** Agrupa el pie de la tabla, que generalmente contiene resúmenes o totales.
- **`<th>`:** Define las celdas de encabezado, las cuales están generalmente en negrita y centradas por defecto.
- **`<tr>`:** Define una fila de la tabla.
- **`<td>`:** Define una celda de datos en una fila.

```html
<table>
  <caption>
    Lista de Empleados
  </caption>
  <thead>
    <tr>
      <th>Nombre</th>
      <th>Edad</th>
      <th>Cargo</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Alice</td>
      <td>29</td>
      <td>Desarrolladora</td>
    </tr>
    <tr>
      <td>Bob</td>
      <td>35</td>
      <td>Diseñador</td>
    </tr>
    <tr>
      <td>Charlie</td>
      <td>40</td>
      <td>Gerente</td>
    </tr>
  </tbody>
  <tfoot>
    <tr>
      <td colspan="3">Total de empleados: 3</td>
    </tr>
  </tfoot>
</table>
```
