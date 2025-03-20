<h1 align="center">Creación de APIs</h1>

<h2>📑 Contenido</h2>

- [Creación de APIs](#creación-de-apis)
- [Diseño y planificación de una API](#diseño-y-planificación-de-una-api)
  - [Definir el propósito y los casos de uso](#definir-el-propósito-y-los-casos-de-uso)
  - [Identificar los recursos y las operaciones](#identificar-los-recursos-y-las-operaciones)
  - [Diseñar la estructura de las rutas](#diseñar-la-estructura-de-las-rutas)
  - [Documentar la API](#documentar-la-api)
  - [Planificar la seguridad](#planificar-la-seguridad)
- [Frameworks para crear APIs (Express.js para Node.js, SpringBoot para Java)](#frameworks-para-crear-apis-expressjs-para-nodejs-springboot-para-java)
  - [Express.js (Node.js)](#expressjs-nodejs)
  - [Spring Boot (Java)](#spring-boot-java)

## Creación de APIs

Crear una API es un proceso que requiere una planificación cuidadosa, la elección de las herramientas adecuadas y la implementación de buenas prácticas..

## Diseño y planificación de una API

Antes de escribir una sola línea de código, es crucial planificar y diseñar la API. Esto asegura que la API sea escalable, mantenible y fácil de usar.

### Definir el propósito y los casos de uso

- ¿Qué problema resuelve la API?

- ¿Quiénes serán los usuarios de la API (desarrolladores, aplicaciones móviles, etc.)?

- ¿Qué funcionalidades debe ofrecer?

### Identificar los recursos y las operaciones

- Lista los recursos principales (por ejemplo, usuarios, productos, pedidos).

- Define las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para cada recurso.

### Diseñar la estructura de las rutas

- Usa nombres descriptivos y consistentes para las rutas.

- Sigue las convenciones RESTful (por ejemplo, `/usuarios`, `/usuarios/{id}`).

### Documentar la API

- Crea una documentación clara y detallada que incluya ejemplos de solicitudes y respuestas.

- Utiliza herramientas como Swagger/OpenAPI para generar documentación interactiva.

### Planificar la seguridad

- Decide cómo se manejará la autenticación y autorización (por ejemplo, OAuth, JWT).

- Considera la implementación de HTTPS para cifrar las comunicaciones.

## Frameworks para crear APIs (Express.js para Node.js, SpringBoot para Java)

Elegir el framework adecuado es esencial para desarrollar una API de manera eficiente

### Express.js (Node.js)

Descripción: Express.js es un framework minimalista y flexible para Node.js que facilita la creación de APIs RESTful.

```bash
npm install express
```

```javascript
const express = require("express");
const app = express();
const port = 3000;

app.get("/usuarios", (req, res) => {
  res.json([{ id: 1, nombre: "Juan Pérez" }]);
});

app.listen(port, () => {
  console.log(`API corriendo en http://localhost:${port}`);
});
```

### Spring Boot (Java)

Primero, crea un nuevo proyecto de Spring Boot utilizando **Spring Initializr**. Selecciona las siguientes dependencias: `Spring Web`.

Estructura del Proyecto

Asegúrate de tener una estructura de proyecto similar a esta:

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── ejemplo/
│   │           └── demo/
│   │               ├── DemoApplication.java
│   │               └── UsuarioController.java
│   └── resources/
│       └── application.properties

```

**DemoApplication.java**

```java
package com.ejemplo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

```

**UsuarioController.java**

```java
package com.ejemplo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
public class UsuarioController {

    @GetMapping("/usuarios")
    public List<Usuario> obtenerUsuarios() {
        return Arrays.asList(new Usuario(1, "Juan Pérez"));
    }
}

class Usuario {
    private int id;
    private String nombre;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}

```
