<h1 align="center">Fetch </h1>

<h2>📑 Contenido</h2>

- [Fetch](#fetch)
- [¿Qué es Fetch API?](#qué-es-fetch-api)
- [Ventajas de Fetch API](#ventajas-de-fetch-api)
- [Realizar una solicitud básica con Fetch](#realizar-una-solicitud-básica-con-fetch)
  - [Solicitud GET](#solicitud-get)
  - [Solicitud POST](#solicitud-post)
  - [Solicitud PUT](#solicitud-put)
  - [Solicitud DELETE](#solicitud-delete)
- [Configuración de cabeceras](#configuración-de-cabeceras)
- [Manejo de errores](#manejo-de-errores)
- [Uso de async/await con Fetch](#uso-de-asyncawait-con-fetch)
- [Fetch en Node.js](#fetch-en-nodejs)

## Fetch

En el desarrollo web moderno, la comunicación con servidores es una parte esencial de cualquier aplicación. Ya sea para obtener datos, enviar formularios o interactuar con APIs, necesitamos una forma eficiente y confiable de realizar solicitudes HTTP. Durante años, `XMLHttpRequest` fue la herramienta estándar para esto en JavaScript, pero su API era complicada y propensa a errores.

Con la llegada de Fetch API, los desarrolladores obtuvieron una forma más moderna y poderosa de realizar solicitudes HTTP.

## ¿Qué es Fetch API?

Fetch API es una interfaz basada en promesas que permite realizar solicitudes HTTP de manera sencilla y eficiente. Proporciona una forma más limpia y flexible de trabajar con solicitudes y respuestas HTTP en comparación con XMLHttpRequest.

## Ventajas de Fetch API

- **Basado en promesas:**
  Fetch devuelve una promesa, lo que facilita el manejo de operaciones asíncronas y evita el "callback hell".

- **API más simple y consistente:**
  La sintaxis de Fetch es más intuitiva y fácil de usar que la de XMLHttpRequest.

- **Soporte nativo en navegadores modernos:**
  Fetch está disponible en la mayoría de los navegadores modernos sin necesidad de bibliotecas externas.

- **Flexibilidad:**
  Permite configurar cabeceras, métodos HTTP y cuerpos de solicitud de manera sencilla

## Realizar una solicitud básica con Fetch

Fetch soporta todos los métodos HTTP comunes, como GET, POST, PUT, DELETE, etc. Aquí te muestro cómo usar algunos de ellos:

### Solicitud GET

El método más común para obtener datos de un servidor es mediante una solicitud `GET`.

```javascript
fetch("https://jsonplaceholder.typicode.com/posts")
  .then((response) => response.json()) // Convertir la respuesta a JSON
  .then((data) => console.log(data)) // Mostrar los datos en la consola
  .catch((error) => console.error("Error:", error)); // Manejar errores
```

### Solicitud POST

Para enviar datos al servidor, puedes usar una solicitud `POST`:

```javascript
fetch("https://jsonplaceholder.typicode.com/posts", {
  method: "POST",
  headers: {
    "Content-Type": "application/json",
  },
  body: JSON.stringify({
    title: "Nuevo post",
    body: "Contenido del post",
    userId: 1,
  }),
})
  .then((response) => response.json())
  .then((data) => console.log(data))
  .catch((error) => console.error("Error:", error));
```

### Solicitud PUT

Para actualizar un recurso existente, usa una solicitud `PUT`:

```javascript
fetch("https://jsonplaceholder.typicode.com/posts/1", {
  method: "PUT",
  headers: {
    "Content-Type": "application/json",
  },
  body: JSON.stringify({
    id: 1,
    title: "Post actualizado",
    body: "Contenido actualizado",
    userId: 1,
  }),
})
  .then((response) => response.json())
  .then((data) => console.log(data))
  .catch((error) => console.error("Error:", error));
```

### Solicitud DELETE

Para eliminar un recurso, usa una solicitud `DELETE`:

```javascript
fetch("https://jsonplaceholder.typicode.com/posts/1", {
  method: "DELETE",
})
  .then((response) => {
    if (response.ok) {
      console.log("Recurso eliminado");
    }
  })
  .catch((error) => console.error("Error:", error));
```

## Configuración de cabeceras

Puedes personalizar las cabeceras de una solicitud usando el objeto `headers`. Esto es útil para enviar tokens de autenticación, especificar el tipo de contenido, etc.

```javascript
fetch("https://api.ejemplo.com/datos", {
  method: "GET",
  headers: {
    Authorization: "Bearer tu-token",
    "Content-Type": "application/json",
  },
})
  .then((response) => response.json())
  .then((data) => console.log(data))
  .catch((error) => console.error("Error:", error));
```

## Manejo de errores

Fetch no rechaza la promesa en caso de errores HTTP (como 404 o 500). En su lugar, debes verificar la propiedad `ok` de la respuesta:

```javascript
fetch("https://jsonplaceholder.typicode.com/invalid-url")
  .then((response) => {
    if (!response.ok) {
      throw new Error("Error en la solicitud: " + response.status);
    }
    return response.json();
  })
  .then((data) => console.log(data))
  .catch((error) => console.error("Error:", error));
```

## Uso de async/await con Fetch

Para un código más limpio y legible, puedes usar async/await con Fetch:

```javascript
async function obtenerDatos() {
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/posts");
    if (!response.ok) {
      throw new Error("Error en la solicitud");
    }
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.error("Error:", error);
  }
}

obtenerDatos();
```

## Fetch en Node.js

En las versiones modernas de Node.js (v18 y posteriores), ya no es necesario usar polyfills para fetch, ya que esta API ahora está implementada de forma nativa. Esto significa que puedes usar fetch en Node.js de la misma manera que lo harías en un entorno de navegador.

Sin embargo, si estás utilizando una versión anterior de Node.js (v17 o anteriores), fetch no está integrado. En ese caso, deberías instalar un polyfill como node-fetch para poder utilizar esta funcionalidad.

```bash
npm install node-fetch
```

```javascript
import fetch from "node-fetch";

async function obtenerDatos() {
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/posts");
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.error("Error:", error);
  }
}

obtenerDatos();
```
