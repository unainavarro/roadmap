<h1 align="center">Consumo de APIs</h1>

<h2>📑 Contenido</h2>

- [Consumo de APIs](#consumo-de-apis)
- [Uso de herramientas como Postman para probar APIs](#uso-de-herramientas-como-postman-para-probar-apis)
  - [Instalación y configuración](#instalación-y-configuración)
  - [Enviar solicitudes HTTP](#enviar-solicitudes-http)
  - [Ejemplo de uso](#ejemplo-de-uso)
  - [Características avanzadas](#características-avanzadas)

## Consumo de APIs

Una vez que comprendes los conceptos básicos de las APIs, el siguiente paso es aprender a consumirlas. Esto implica probar APIs, conectarlas con aplicaciones utilizando lenguajes de programación y manejar adecuadamente las respuestas y errores.

## Uso de herramientas como Postman para probar APIs

Postman es una de las herramientas más populares para probar y desarrollar APIs. Permite enviar solicitudes HTTP, inspeccionar respuestas y automatizar pruebas. A continuación, se describe cómo usarla:

### Instalación y configuración

- Descarga e instala Postman desde https://www.postman.com/downloads/.

- Crea una cuenta para sincronizar tus colecciones y configuraciones.

### Enviar solicitudes HTTP

- Abre Postman y crea una nueva solicitud.

- Selecciona el método HTTP (GET, POST, PUT, DELETE, etc.).

- Ingresa la URL del endpoint de la API.

- Añade cabeceras (headers) y parámetros si es necesario.

- Envía la solicitud y observa la respuesta en la interfaz de Postman.

### Ejemplo de uso

- Solicitud GET:

  - Método: GET

  - URL: https://jsonplaceholder.typicode.com/posts/1

  - Cabeceras: Content-Type: application/json

  - Respuesta:

    ```json
    {
      "userId": 1,
      "id": 1,
      "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
      "body": "quia et suscipit..."
    }
    ```

### Características avanzadas

- **Colecciones:** Organiza y guarda solicitudes relacionadas.

- **Entornos:** Define variables para diferentes entornos (desarrollo, producción, etc.).

- **Pruebas automatizadas:** Escribe scripts para validar respuestas automáticamente.
