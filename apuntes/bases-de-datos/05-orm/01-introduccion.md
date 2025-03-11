<h1 align="center">ORM (Object-Relational Mapping)</h1>

<h2>📑 Contenido</h2>

- [ORM (Object-Relational Mapping)](#orm-object-relational-mapping)
- [¿Qué es un ORM?](#qué-es-un-orm)
  - [Ventajas del ORM](#ventajas-del-orm)
- [Frameworks ORM en Java](#frameworks-orm-en-java)
  - [Hibernate](#hibernate)
  - [JPA (Java Persistence API)](#jpa-java-persistence-api)
- [Buenas prácticas](#buenas-prácticas)

## ORM (Object-Relational Mapping)

El ORM (Object-Relational Mapping) es una técnica de programación que permite mapear objetos de un lenguaje de programación (como Java) a tablas de una base de datos relacional. Esta técnica simplifica el acceso a la base de datos al eliminar la necesidad de escribir consultas SQL manuales y gestionar la conversión entre objetos y registros de la base de datos.

## ¿Qué es un ORM?

Un ORM es una herramienta que facilita la interacción entre una aplicación y una base de datos relacional. Convierte automáticamente los objetos de la aplicación en registros de la base de datos y viceversa, permitiendo a los desarrolladores trabajar con objetos en lugar de escribir consultas SQL manuales.

### Ventajas del ORM

- **Productividad:** Reduce la cantidad de código repetitivo al automatizar el mapeo entre objetos y tablas.

- **Mantenibilidad:** Facilita el mantenimiento del código al separar la lógica de negocio de las operaciones de base de datos.

- **Portabilidad:** Permite cambiar de base de datos sin modificar el código de la aplicación.

- **Seguridad:** Reduce el riesgo de inyecciones SQL al usar consultas parametrizadas automáticamente.

## Frameworks ORM en Java

### Hibernate

Hibernate es uno de los frameworks ORM más populares en Java. Proporciona un mapeo robusto entre objetos y tablas, soporte para consultas avanzadas y gestión de transacciones.

### JPA (Java Persistence API)

JPA es una especificación estándar de Java para ORM. Define un conjunto de interfaces y anotaciones para mapear objetos a tablas. Hibernate es una de las implementaciones más conocidas de JPA.

## Buenas prácticas

- **Diseño de entidades:** Define entidades claras y bien estructuradas que reflejen las tablas de la base de datos.

- **Transacciones:** Gestiona las transacciones adecuadamente para garantizar la integridad de los datos.

- **Consultas eficientes:** Utiliza consultas optimizadas y evita el problema de "N+1 selects".

- **Cierre de recursos:** Cierra `EntityManager` y `EntityManagerFactory` para liberar recursos.
