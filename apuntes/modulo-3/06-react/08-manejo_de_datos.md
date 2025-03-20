<h1 align="center">Manejo de datos</h1>

<h2>📑 Contenido</h2>

- [Llamadas a API y manejo de datos](#llamadas-a-api-y-manejo-de-datos)
- [Fetch API y Axios para hacer solicitudes HTTP](#fetch-api-y-axios-para-hacer-solicitudes-http)
  - [Fetch API](#fetch-api)
- [Axios](#axios)
- [Manejo de respuestas y errores](#manejo-de-respuestas-y-errores)
  - [Manejo de respuestas](#manejo-de-respuestas)
  - [Manejo de errores](#manejo-de-errores)

## Llamadas a API y manejo de datos

En aplicaciones modernas, es común interactuar con APIs para obtener, enviar o actualizar datos. React, al ser una biblioteca centrada en la interfaz de usuario, no incluye herramientas nativas para manejar solicitudes HTTP. Sin embargo, puedes usar Fetch API, Axios o bibliotecas especializadas para integrar APIs RESTful o GraphQL.

## Fetch API y Axios para hacer solicitudes HTTP

### Fetch API

Fetch API es una interfaz nativa de JavaScript para hacer solicitudes HTTP. Es compatible con la mayoría de los navegadores modernos y no requiere dependencias adicionales.

```javascript
import React, { useEffect, useState } from "react";

function ListaPosts() {
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => response.json())
      .then((data) => setPosts(data))
      .catch((error) => console.error("Error:", error));
  }, []);

  return (
    <ul>
      {posts.map((post) => (
        <li key={post.id}>{post.title}</li>
      ))}
    </ul>
  );
}
```

## Axios

Axios es una biblioteca popular para hacer solicitudes HTTP. Ofrece una API más amigable y características adicionales, como la transformación automática de datos y la cancelación de solicitudes.

```javascript
import React, { useEffect, useState } from "react";
import axios from "axios";

function ListaPosts() {
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    axios
      .get("https://jsonplaceholder.typicode.com/posts")
      .then((response) => setPosts(response.data))
      .catch((error) => console.error("Error:", error));
  }, []);

  return (
    <ul>
      {posts.map((post) => (
        <li key={post.id}>{post.title}</li>
      ))}
    </ul>
  );
}
```

## Manejo de respuestas y errores

### Manejo de respuestas

Tanto Fetch API como Axios devuelven una respuesta que contiene los datos solicitados. Es importante verificar el estado de la respuesta antes de procesar los datos.

Con Fetch API:

```javascript
fetch("https://jsonplaceholder.typicode.com/posts")
  .then((response) => {
    if (!response.ok) {
      throw new Error("Error en la solicitud");
    }
    return response.json();
  })
  .then((data) => console.log(data))
  .catch((error) => console.error("Error:", error));
```

Con Axios:

```javascript
axios
  .get("https://jsonplaceholder.typicode.com/posts")
  .then((response) => {
    if (response.status === 200) {
      console.log(response.data);
    }
  })
  .catch((error) => console.error("Error:", error));
```

### Manejo de errores

Es crucial manejar errores para evitar que la aplicación falle silenciosamente. Puedes usar `try/catch` con `async/await` para un manejo más limpio.

Ejemplo con Fetch API:

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
```

Ejemplo con Axios:

```javascript
async function obtenerDatos() {
  try {
    const response = await axios.get(
      "https://jsonplaceholder.typicode.com/posts"
    );
    console.log(response.data);
  } catch (error) {
    console.error("Error:", error);
  }
}
```
