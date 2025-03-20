<h1 align="center">Conceptos básicos</h1>

<h2>📑 Contenido</h2>

- [Conceptos básicos](#conceptos-básicos)
- [Solicitudes y respuestas HTTP](#solicitudes-y-respuestas-http)
  - [Solicitud HTTP](#solicitud-http)
- [Respuesta HTTP](#respuesta-http)
- [Métodos HTTP (GET, POST, PUT, DELETE)](#métodos-http-get-post-put-delete)
  - [GET](#get)
  - [POST](#post)
  - [PUT](#put)
  - [DELETE](#delete)
- [Códigos de estado HTTP (200, 404, 500, etc.)](#códigos-de-estado-http-200-404-500-etc)
  - [Respuestas informativas (100-199)](#respuestas-informativas-100-199)
  - [Respuestas exitosas (200-299)](#respuestas-exitosas-200-299)
  - [Redirecciones (300-399)](#redirecciones-300-399)
  - [Errores del cliente (400-499)](#errores-del-cliente-400-499)
  - [Errores del servidor (500-599)](#errores-del-servidor-500-599)

## Conceptos básicos

Para comprender cómo funcionan las APIs, es fundamental familiarizarse con algunos conceptos básicos que forman la base de la comunicación entre clientes y servidores.

## Solicitudes y respuestas HTTP

Las APIs modernas, especialmente las basadas en REST, utilizan el protocolo HTTP (Hypertext Transfer Protocol) para la comunicación entre el cliente (por ejemplo, una aplicación móvil o un navegador web) y el servidor (donde se aloja la API). Esta comunicación se realiza mediante solicitudes (requests) y respuestas (responses).

### Solicitud HTTP

Una solicitud HTTP es un mensaje que el cliente envía al servidor para solicitar una acción o recurso. Está compuesta por:

- **Método HTTP:** Indica la acción que se desea realizar (por ejemplo, GET, POST, PUT, DELETE).

- **URL (Uniform Resource Locator):** Es la dirección del recurso en el servidor (por ejemplo, https://api.ejemplo.com/usuarios).

- **Cabeceras (Headers):** Proporcionan información adicional sobre la solicitud, como el tipo de contenido (Content-Type) o tokens de autenticación.

- **Cuerpo (Body):** Contiene los datos que se envían al servidor, generalmente en formatos como JSON o XML (por ejemplo, al crear un nuevo usuario).

```http
GET /usuarios/1 HTTP/1.1
Host: api.ejemplo.com
Authorization: Bearer token123
```

## Respuesta HTTP

Una respuesta HTTP es el mensaje que el servidor devuelve al cliente después de procesar la solicitud. Está compuesta por:

- **Código de estado HTTP:** Indica el resultado de la solicitud (por ejemplo, 200 para éxito, 404 para recurso no encontrado).

- **Cabeceras (Headers):** Proporcionan información adicional sobre la respuesta, como el tipo de contenido o la fecha de la respuesta.

- **Cuerpo (Body):** Contiene los datos devueltos por el servidor, generalmente en formatos como JSON o XML.

```http
HTTP/1.1 200 OK
Content-Type: application/json
{
    "id": 1,
    "nombre": "Juan Pérez",
    "email": "juan@ejemplo.com"
}
```

## Métodos HTTP (GET, POST, PUT, DELETE)

Los métodos HTTP definen la acción que el cliente desea realizar sobre un recurso en el servidor. Los métodos más comunes son:

### GET

- **Descripción:** Solicita datos de un recurso específico.

- **Uso:** Se utiliza para recuperar información sin modificar el recurso.

- **Ejemplo:** Obtener la lista de usuarios o los detalles de un usuario específico.

- **Solicitud:**

  ```http
  GET /usuarios HTTP/1.1
  Host: api.ejemplo.com
  ```

### POST

- **Descripción:** Envía datos al servidor para crear un nuevo recurso.

- **Uso:** Se utiliza para enviar datos que se almacenarán en el servidor.

- **Ejemplo:** Crear un nuevo usuario.

- **Solicitud:**

  ```http
  POST /usuarios HTTP/1.1
  Host: api.ejemplo.com
  Content-Type: application/json
  {
      "nombre": "Ana López",
      "email": "ana@ejemplo.com"
  }
  ```

### PUT

- **Descripción:** Actualiza un recurso existente o lo crea si no existe.

- **Uso:** Se utiliza para modificar un recurso específico.

- **Ejemplo:** Actualizar la información de un usuario.

- **Solicitud:**

  ```http
  PUT /usuarios/1 HTTP/1.1
  Host: api.ejemplo.com
  Content-Type: application/json
  {
      "nombre": "Juan Pérez",
      "email": "juan.nuevo@ejemplo.com"
  }
  ```

### DELETE

- **Descripción:** Elimina un recurso específico.

- **Uso:** Se utiliza para borrar datos del servidor.

- **Ejemplo:** Eliminar un usuario.

- **Solicitud:**

  ```http
  DELETE /usuarios/1 HTTP/1.1
  Host: api.ejemplo.com
  ```

## Códigos de estado HTTP (200, 404, 500, etc.)

Los códigos de estado HTTP son números de tres dígitos que indican el resultado de una solicitud. Se dividen en cinco categorías principales:

### Respuestas informativas (100-199)

Indican que la solicitud ha sido recibida y se está procesando.

- Ejemplo: `100 Continue` (el servidor ha recibido la solicitud y el cliente puede continuar).

### Respuestas exitosas (200-299)

Indican que la solicitud se ha procesado correctamente.

- Ejemplos:

  - `200 OK` (la solicitud fue exitosa).

  - `201 Created` (un nuevo recurso ha sido creado).

  - `204 No Content` (la solicitud fue exitosa, pero no hay contenido para devolver).

### Redirecciones (300-399)

Indican que el cliente debe realizar una acción adicional para completar la solicitud.

- Ejemplo: `301 Moved Permanently` (el recurso ha sido movido permanentemente a otra URL).

### Errores del cliente (400-499)

Indican que hubo un error por parte del cliente.

- Ejemplos:

  - `400 Bad Request` (la solicitud es inválida o está mal formada).

  - `401 Unauthorized `(el cliente no está autenticado).

  - `404 Not Found` (el recurso solicitado no existe).

### Errores del servidor (500-599)

Indican que hubo un error en el servidor al procesar la solicitud.

- Ejemplos:

  - `500 Internal Server Error` (el servidor encontró un error inesperado).

  - `503 Service Unavailable` (el servidor no está disponible temporalmente).
