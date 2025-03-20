<h1 align='center'>Location</h1>

<h2>📑 Contenido</h2>

- [Location](#location)
- [¿Qué es el objeto location?](#qué-es-el-objeto-location)
- [Propiedades principales del objeto location](#propiedades-principales-del-objeto-location)
  - [location.href](#locationhref)
  - [location.protocol](#locationprotocol)
  - [location.host](#locationhost)
  - [location.hostname](#locationhostname)
  - [location.pathname](#locationpathname)
  - [location.search](#locationsearch)
  - [location.hash](#locationhash)
- [Métodos del objeto location](#métodos-del-objeto-location)
  - [location.assign(url)](#locationassignurl)
  - [location.replace(url)](#locationreplaceurl)
  - [location.reload()](#locationreload)
- [Ejemplos de Uso del Objeto location](#ejemplos-de-uso-del-objeto-location)
  - [Redireccionar a otra página](#redireccionar-a-otra-página)
  - [Recargar la página](#recargar-la-página)
  - [Obtener parámetros de la cadena de consulta](#obtener-parámetros-de-la-cadena-de-consulta)
  - [Cambiar el fragmento de la URL](#cambiar-el-fragmento-de-la-url)

## Location

El objeto **`location`** en JavaScript es parte del **Browser Object Model (BOM)** y se utiliza para acceder y manipular la URL de la página web actual. A través del objeto `location`, puedes obtener información sobre la URL actual, redirigir al usuario a nuevas páginas, y modificar diferentes partes de la URL, como la cadena de consulta y el fragmento.

> [!WARNING]
>
> Aunque su nombre podría sugerir que se usa para obtener la ubicación geográfica, en realidad está diseñado para trabajar con la URL actual de la página web.

## ¿Qué es el objeto location?

El objeto **`location`** representa la ubicación de la URL del documento actual. Este objeto es útil para navegar entre diferentes páginas y gestionar el historial de navegación del usuario. Proporciona propiedades y métodos que permiten leer y modificar la URL actual de la ventana del navegador.

## Propiedades principales del objeto location

El objeto `location` tiene varias propiedades que proporcionan información sobre la URL actual y permiten manipularla.

### location.href

Devuelve la URL completa del documento actual.

```javascript
console.log(location.href); // Muestra la URL completa
```

### location.protocol

Devuelve el protocolo de la URL (por ejemplo, `http:` o `https:`).

```javascript
console.log(location.protocol); // Muestra el protocolo de la URL
```

### location.host

Devuelve el nombre de host y el puerto de la URL.

```javascript
console.log(location.host); // Muestra el nombre de host y el puerto
```

### location.hostname

Devuelve solo el nombre de host de la URL.

```javascript
console.log(location.hostname); // Muestra solo el nombre de host
```

### location.pathname

Devuelve la ruta del documento en la URL.

```javascript
console.log(location.pathname); // Muestra la ruta de la URL
```

### location.search

Devuelve la cadena de consulta (query string) de la URL, incluyendo el signo `?`.

```javascript
console.log(location.search); // Muestra la cadena de consulta
```

### location.hash

Devuelve el fragmento de la URL (lo que sigue al símbolo `#`).

```javascript
console.log(location.hash); // Muestra el fragmento de la URL
```

## Métodos del objeto location

El objeto `location` también proporciona métodos para manipular la URL actual y navegar entre páginas.

### location.assign(url)

Carga un nuevo documento en la ventana.

```javascript
location.assign("https://www.ejemplo.com"); // Redirige a una nueva URL
```

### location.replace(url)

Reemplaza la URL actual en el historial sin crear un nuevo registro. Esto significa que el usuario no podrá usar el botón "Atrás" para volver a la página anterior.

```javascript
location.replace("https://www.ejemplo.com"); // Redirige sin guardar el historial
```

### location.reload()

Recarga la página actual.

```javascript
location.reload(); // Recarga la página actual
```

## Ejemplos de Uso del Objeto location

Aquí algunos ejemplos que demuestran cómo se puede utilizar el objeto `location` para manipular la URL y navegar en la aplicación web.

### Redireccionar a otra página

```javascript
// Redirigir al usuario a una nueva página
location.href = "https://www.ejemplo.com";
```

### Recargar la página

```js
// Recargar la página actual
location.reload();
```

### Obtener parámetros de la cadena de consulta

```js
// Supongamos que la URL es https://www.ejemplo.com?usuario=Juan&edad=30
let queryParams = location.search; // Obtiene la cadena de consulta
console.log(queryParams); // Muestra '?usuario=Juan&edad=30'
```

### Cambiar el fragmento de la URL

```js
// Cambiar el fragmento de la URL
location.hash = "seccion1"; // Cambia la URL a algo como https://www.ejemplo.com#seccion1
```
