<h1 align="center">Seguridad en APIs</h1>

<h2>📑 Contenido</h2>

- [Seguridad en APIs](#seguridad-en-apis)
- [Prácticas de seguridad para APIs](#prácticas-de-seguridad-para-apis)
  - [Autenticación y autorización](#autenticación-y-autorización)
  - [Validación de datos](#validación-de-datos)
  - [Limitación de tasa (rate limiting)](#limitación-de-tasa-rate-limiting)
  - [Manejo seguro de errores](#manejo-seguro-de-errores)
  - [Registro y monitoreo](#registro-y-monitoreo)
- [Protección contra ataques comunes (SQL Injection, XSS, CSRF)](#protección-contra-ataques-comunes-sql-injection-xss-csrf)
  - [SQL Injection:](#sql-injection)
  - [Cross-Site Scripting (XSS)](#cross-site-scripting-xss)
  - [Cross-Site Request Forgery (CSRF)](#cross-site-request-forgery-csrf)

## Seguridad en APIs

La seguridad es un aspecto crítico en el desarrollo y mantenimiento de APIs. Una API insegura puede exponer datos sensibles, permitir accesos no autorizados y ser vulnerable a ataques maliciosos.

## Prácticas de seguridad para APIs

Implementar prácticas de seguridad desde el diseño inicial de la API es esencial para prevenir vulnerabilidades. A continuación, se describen algunas de las mejores prácticas:

### Autenticación y autorización

- Utiliza mecanismos robustos como OAuth 2.0 o JWT (JSON Web Tokens) para autenticar y autorizar a los usuarios.

- Asegúrate de que los tokens de acceso tengan un tiempo de expiración y se renueven periódicamente.

### Validación de datos

- Valida y sanitiza todos los datos de entrada para evitar inyecciones de código o ataques de manipulación de datos.

- Usa bibliotecas de validación como `express-validator` (Node.js) o `marshmallow` (Python).

### Limitación de tasa (rate limiting)

Implementa límites en la cantidad de solicitudes que un cliente puede hacer en un período de tiempo para prevenir ataques de denegación de servicio (DoS).

### Manejo seguro de errores

- Evita revelar detalles internos del servidor en los mensajes de error.

- Usa códigos de estado HTTP adecuados y mensajes de error genéricos.

### Registro y monitoreo

- Registra todas las solicitudes y respuestas para detectar actividades sospechosas.

- Monitorea el tráfico de la API en tiempo real para identificar posibles ataques.

## Protección contra ataques comunes (SQL Injection, XSS, CSRF)

Las APIs son vulnerables a varios tipos de ataques. A continuación, se describen los más comunes y cómo protegerse contra ellos:

### SQL Injection:

Ocurre cuando un atacante inserta código SQL malicioso en una consulta, permitiéndole acceder o manipular la base de datos.

**Protección:**

- Usa consultas parametrizadas o ORMs (Object-Relational Mappers) para evitar la concatenación directa de cadenas en las consultas SQL.

- Ejemplo en Node.js con sequelize:

  ```javascript
  const { Op } = require("sequelize");
  Usuario.findAll({ where: { nombre: { [Op.eq]: req.query.nombre } } });
  ```

### Cross-Site Scripting (XSS)

Ocurre cuando un atacante inyecta scripts maliciosos en una página web, que luego se ejecutan en el navegador de la víctima.

**Protección:**

- Sanitiza y escapa todos los datos de entrada y salida.

- Usa cabeceras HTTP como `Content-Security-Policy` para restringir la ejecución de scripts no autorizados.

### Cross-Site Request Forgery (CSRF)

Ocurre cuando un atacante engaña a un usuario para que realice acciones no deseadas en una aplicación web en la que está autenticado.

**Protección:**

- Implementa tokens CSRF en formularios y solicitudes.

- Usa cabeceras HTTP como `SameSite` en las cookies para prevenir solicitudes cruzadas.
