<h1 align="center">Arquitectura cliente-servidor</h1>

<h2>📑 Contenido</h2>

- [Arquitectura cliente-servidor](#arquitectura-cliente-servidor)
  - [Cliente](#cliente)
  - [Servidor](#servidor)
- [Comunicación entre cliente y servidor](#comunicación-entre-cliente-y-servidor)
- [Ventajas de la arquitectura cliente-servidor](#ventajas-de-la-arquitectura-cliente-servidor)
- [Consideraciones](#consideraciones)

## Arquitectura cliente-servidor

La arquitectura cliente-servidor es un modelo de diseño de software en el que las funcionalidades de una aplicación se dividen en dos partes principales: el cliente y el servidor. Estas dos partes se comunican entre sí a través de una red, como Internet, para realizar tareas específicas.

### Cliente

- **Interfaz de Usuario (UI):**

  - Es la parte de la aplicación con la que interactúa el usuario final.
  - Puede ser una aplicación de escritorio, una aplicación web, una aplicación móvil, o cualquier otro tipo de interfaz de usuario.

- **Lógica de Presentación:**
  - Se encarga de presentar la información al usuario de manera adecuada y de procesar las interacciones del usuario.
  - No realiza cálculos complejos ni accede directamente a la base de datos; simplemente envía solicitudes al servidor y muestra la respuesta al usuario.

### Servidor

- **Lógica de Negocio:**

  - Contiene la lógica de negocio de la aplicación, que implementa las reglas y procesos específicos del dominio de la aplicación.
  - Se encarga de realizar cálculos complejos, aplicar reglas de negocio y coordinar las operaciones entre diferentes partes de la aplicación.

- **Acceso a Datos:**

  - Se encarga de acceder y manipular los datos almacenados en la base de datos u otros sistemas de almacenamiento.
  - Proporciona interfaces para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la base de datos.

## Comunicación entre cliente y servidor

- **Solicitud-Respuesta (Request-Response):**

  - El cliente envía solicitudes al servidor para realizar operaciones específicas, como recuperar datos, enviar datos o realizar acciones.
  - El servidor procesa la solicitud, realiza las operaciones necesarias y envía una respuesta al cliente con los resultados.

- **Protocolos de Comunicación:**

  - Para la comunicación entre el cliente y el servidor, se utilizan protocolos estándar de la industria, como HTTP para aplicaciones web, TCP/IP para aplicaciones de red, o RPC (Remote Procedure Call) para aplicaciones distribuidas.

## Ventajas de la arquitectura cliente-servidor

- **Desacoplamiento:** La separación entre la lógica de presentación en el cliente y la lógica de negocio en el servidor permite cambios independientes en cada parte de la aplicación.

- **Escalabilidad:** La arquitectura cliente-servidor es escalable, ya que el servidor puede manejar múltiples solicitudes de clientes concurrentes.

- **Seguridad:** El servidor actúa como punto central de control, lo que facilita la implementación de medidas de seguridad y control de acceso a los datos.

- **Facilidad de Mantenimiento:** La separación de la lógica de presentación y la lógica de negocio facilita el mantenimiento y la actualización de la aplicación.

## Consideraciones

- **Latencia de Red:** La comunicación a través de una red puede introducir latencia, lo que puede afectar el rendimiento de la aplicación, especialmente en aplicaciones sensibles al tiempo de respuesta.

- **Complejidad de la Lógica de Negocio:** La lógica de negocio en el servidor puede volverse compleja y difícil de mantener en aplicaciones grandes y complejas.

- **Dependencia de la Conectividad de Red:** La disponibilidad y la velocidad de la red pueden afectar la experiencia del usuario y la funcionalidad de la aplicación.
