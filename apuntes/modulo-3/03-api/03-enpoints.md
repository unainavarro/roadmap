<h1 align="center">Endpoints</h1>

<h2>📑 Contenido</h2>

- [Endpoints](#endpoints)
- [¿Qué es un endpoint?](#qué-es-un-endpoint)
- [Diseño de endpoints](#diseño-de-endpoints)
  - [Usar sustantivos en plural](#usar-sustantivos-en-plural)
  - [Mantener una estructura jerárquica](#mantener-una-estructura-jerárquica)
  - [Evitar verbos en las rutas](#evitar-verbos-en-las-rutas)
  - [Usar versionado](#usar-versionado)
  - [Mantener las rutas cortas y descriptivas](#mantener-las-rutas-cortas-y-descriptivas)
- [Métodos HTTP y endpoints](#métodos-http-y-endpoints)
  - [GET](#get)
  - [POST](#post)
  - [PUT](#put)
  - [DELETE](#delete)
  - [PATCH](#patch)
  - [Ejemplos de endpoints en una API RESTful](#ejemplos-de-endpoints-en-una-api-restful)
  - [Gestión de usuarios](#gestión-de-usuarios)
  - [Gestión de pedidos](#gestión-de-pedidos)
- [Validación y manejo de errores en endpoints](#validación-y-manejo-de-errores-en-endpoints)
  - [Validación de datos (Express.js)](#validación-de-datos-expressjs)

## Endpoints

Los endpoints son uno de los componentes más importantes de una API, ya que representan los puntos de acceso a los recursos y funcionalidades que la API ofrece. Un diseño adecuado de los endpoints es clave para garantizar que la API sea intuitiva, eficiente y fácil de usar.

## ¿Qué es un endpoint?

Un endpoint es una URL específica a la que un cliente puede enviar solicitudes para interactuar con un recurso o servicio proporcionado por la API. Cada endpoint está asociado a un método HTTP (GET, POST, PUT, DELETE, etc.) y realiza una acción específica sobre un recurso.

**Ejemplo de un endpoint:**

```
GET /usuarios/1
```

**Detalles:**

- **Método HTTP:** GET

- **Ruta:** /usuarios/1

- **Acción:** Obtener los detalles del usuario con ID 1.

## Diseño de endpoints

El diseño de endpoints debe seguir principios claros y consistentes para garantizar que la API sea fácil de entender y usar. A continuación, se describen las mejores prácticas para diseñar endpoints:

### Usar sustantivos en plural

Los nombres de los recursos deben ser sustantivos en plural, ya que representan colecciones.

- **Ejemplo:** `/usuarios`, `/productos`, `/pedidos`.

### Mantener una estructura jerárquica

Organiza los endpoints de manera jerárquica para reflejar las relaciones entre los recursos.

- **Ejemplo:** `/usuarios/1/pedidos` (pedidos del usuario con ID 1).

### Evitar verbos en las rutas

Los verbos (acciones) ya están representados por los métodos HTTP, por lo que no es necesario incluirlos en las rutas.

- **Correcto:** `POST /usuarios` (crear un usuario).

- **Incorrecto:** `POST /crearUsuario`.

### Usar versionado

Incluye la versión de la API en la ruta para garantizar la compatibilidad con versiones anteriores.

- **Ejemplo:** `/v1/usuarios`.

### Mantener las rutas cortas y descriptivas

Las rutas deben ser fáciles de leer y entender.

- **Ejemplo:** `/usuarios/1` es mejor que `/u/1`.

## Métodos HTTP y endpoints

Cada método HTTP tiene un propósito específico en el contexto de los endpoints. A continuación, se describe cómo se relacionan:

### GET

Obtener datos de un recurso.

```
GET /usuarios → Obtener la lista de usuarios.
GET /usuarios/1 → Obtener detalles del usuario con ID 1.
```

### POST

Crear un nuevo recurso.

```
POST /usuarios → Crear un nuevo usuario.
```

### PUT

Actualizar un recurso existente o crearlo si no existe.

```
PUT /usuarios/1 → Actualizar el usuario con ID 1.
```

### DELETE

Eliminar un recurso.

```
DELETE /usuarios/1 → Eliminar el usuario con ID 1.
```

### PATCH

Actualizar parcialmente un recurso.

```
PATCH /usuarios/1 → Actualizar solo el correo electrónico del usuario con ID 1.
```

### Ejemplos de endpoints en una API RESTful

A continuación, se presenta un ejemplo completo de una API RESTful con endpoints para gestionar usuarios y sus pedidos:

### Gestión de usuarios

`GET /usuarios` → Obtener la lista de usuarios.

`GET /usuarios/1` → Obtener detalles del usuario con ID 1.

`POST /usuarios` → Crear un nuevo usuario.

`PUT /usuarios/1` → Actualizar el usuario con ID 1.

`DELETE /usuarios/1` → Eliminar el usuario con ID 1.

### Gestión de pedidos

`GET /usuarios/1/pedidos` → Obtener la lista de pedidos del usuario con ID 1.

`GET /usuarios/1/pedidos/101` → Obtener detalles del pedido con ID 101 del usuario con ID 1.

`POST /usuarios/1/pedidos` → Crear un nuevo pedido para el usuario con ID 1.

`DELETE /usuarios/1/pedidos/101` → Eliminar el pedido con ID 101 del usuario con ID 1.

## Validación y manejo de errores en endpoints

La validación de datos y el manejo de errores son esenciales para garantizar que los endpoints funcionen correctamente y proporcionen respuestas útiles.

### Validación de datos (Express.js)

Valida los datos de entrada antes de procesarlos.

```javascript
const { body, validationResult } = require("express-validator");

app.post(
  "/usuarios",
  [body("nombre").notEmpty(), body("email").isEmail()],
  (req, res) => {
    const errors = validationResult(req);
    if (!errors.isEmpty()) {
      return res.status(400).json({ errors: errors.array() });
    }
    // Lógica para crear un nuevo usuario
  }
);
```
