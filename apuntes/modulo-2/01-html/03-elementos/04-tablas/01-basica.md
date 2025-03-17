<h1 align='center'>Tablas básicas</h1>

<h2>📑 Contenido</h2>

- [Tablas básicas](#tablas-básicas)
- [Atributos comunes](#atributos-comunes)
  - [border](#border)
  - [cellpadding](#cellpadding)
  - [cellspacing](#cellspacing)
  - [width](#width)
- [Caption](#caption)
  - [Uso en accesibilidad](#uso-en-accesibilidad)

## Tablas básicas

Las tablas en HTML se utilizan para representar datos organizados en filas y columnas. La estructura básica de una tabla se compone de las siguientes etiquetas:

- `<table>`: Define la tabla.
- `<tr>`: Define una fila dentro de la tabla.
- `<td>`: Define una celda de datos dentro de una fila.
- `<th>`: Define una celda de encabezado, que se utiliza generalmente para los títulos de las columnas.

```html
<table border="1">
  <tr>
    <th>Nombre</th>
    <th>Edad</th>
    <th>Ciudad</th>
  </tr>
  <tr>
    <td>Alice</td>
    <td>24</td>
    <td>Madrid</td>
  </tr>
  <tr>
    <td>Bob</td>
    <td>30</td>
    <td>Barcelona</td>
  </tr>
</table>
```

## Atributos comunes

### border

Se utiliza para definir un borde alrededor de las celdas de la tabla. El valor puede ser un número que indique el grosor del borde (por ejemplo, border="1").

```html
<table border="1"></table>
```

### cellpadding

Define el espacio dentro de las celdas de la tabla (entre el borde de la celda y el contenido).

```html
<table cellpadding="10"></table>
```

### cellspacing

Define el espacio entre las celdas de la tabla.

```html
<table cellspacing="5"></table>
```

### width

Define el ancho de la tabla.

```html
<table width="500"></table>
```

## Caption

La etiqueta `<caption>` se utiliza para definir un título o encabezado para una tabla en HTML. Este título se muestra generalmente en la parte superior de la tabla. Es una forma de proporcionar contexto a la tabla, describiendo su propósito o el tipo de información que contiene.

```html
<table>
  <caption>
    Lista de Empleados
  </caption>
  <tr>
    <th>Nombre</th>
    <th>Edad</th>
    <th>Cargo</th>
  </tr>
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
</table>
```

### Uso en accesibilidad

El `<caption>` también ayuda a mejorar la accesibilidad en una página web, proporcionando a los usuarios que utilizan lectores de pantalla una descripción clara de lo que contiene la tabla.
