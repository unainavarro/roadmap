<h1 align="center">Sistemas de Gestión de Bases de Datos</h1>

<h2>📑 Contenido</h2>

- [Sistemas de gestión de bases de datos](#sistemas-de-gestión-de-bases-de-datos)
- [¿Qué es un sistema de gestión de bases de datos (SGBD)?](#qué-es-un-sistema-de-gestión-de-bases-de-datos-sgbd)
- [Componentes de un SGBD](#componentes-de-un-sgbd)
  - [Motor de almacenamiento](#motor-de-almacenamiento)
  - [Procesador de consultas](#procesador-de-consultas)
  - [Lenguaje de definición de datos (DDL)](#lenguaje-de-definición-de-datos-ddl)
  - [Lenguaje de manipulación de datos (DML)](#lenguaje-de-manipulación-de-datos-dml)
  - [Módulo de control de concurrencia](#módulo-de-control-de-concurrencia)
  - [Módulo de seguridad](#módulo-de-seguridad)
  - [Módulo de respaldo y recuperación](#módulo-de-respaldo-y-recuperación)
- [Funciones de un SGBD](#funciones-de-un-sgbd)

## Sistemas de gestión de bases de datos

En el mundo actual, donde los datos son uno de los activos más valiosos, los Sistemas de Gestión de Bases de Datos (SGBD) se han convertido en herramientas esenciales para almacenar, organizar, recuperar y gestionar información de manera eficiente. Un SGBD es un software que actúa como intermediario entre los usuarios, las aplicaciones y la base de datos, permitiendo un manejo estructurado y seguro de los datos.

## ¿Qué es un sistema de gestión de bases de datos (SGBD)?

Un Sistema de Gestión de Bases de Datos (SGBD) es un conjunto de programas que permiten crear, mantener y manipular bases de datos de manera eficiente. Su principal objetivo es proporcionar un entorno conveniente y eficaz para almacenar y recuperar información. Algunos ejemplos populares de SGBD son MySQL, Oracle, PostgreSQL, Microsoft SQL Server y MongoDB.

Un SGBD no solo almacena datos, sino que también garantiza su integridad, seguridad y consistencia, además de facilitar el acceso concurrente a múltiples usuarios.

## Componentes de un SGBD

Un SGBD está compuesto por varios módulos que trabajan en conjunto para gestionar la base de datos. Los principales componentes son:

### Motor de almacenamiento

Es el responsable de gestionar cómo se almacenan físicamente los datos en el disco. Incluye mecanismos para la creación, lectura, actualización y eliminación de datos (operaciones CRUD).

### Procesador de consultas

Este componente interpreta las consultas enviadas por los usuarios o aplicaciones, las optimiza y las ejecuta. Transforma las consultas en instrucciones que el motor de almacenamiento puede entender.

### Lenguaje de definición de datos (DDL)

Permite definir la estructura de la base de datos, incluyendo tablas, índices, vistas y restricciones. Ejemplos de comandos DDL son `CREATE TABLE`, `ALTER TABLE` y `DROP TABLE`.

### Lenguaje de manipulación de datos (DML)

Facilita la manipulación de los datos almacenados. Incluye operaciones como `INSERT`, `UPDATE`, `DELETE` y `SELECT`.

### Módulo de control de concurrencia

Gestiona el acceso simultáneo a la base de datos por parte de múltiples usuarios, evitando conflictos y garantizando la consistencia de los datos.

### Módulo de seguridad

Protege la base de datos mediante mecanismos de autenticación, autorización y cifrado, asegurando que solo usuarios autorizados puedan acceder a la información.

### Módulo de respaldo y recuperación

Proporciona herramientas para realizar copias de seguridad (backups) y restaurar la base de datos en caso de fallos o pérdida de datos.

## Funciones de un SGBD

Un SGBD desempeña varias funciones clave para garantizar el correcto funcionamiento de una base de datos:

- **Almacenamiento de datos:** Permite guardar grandes volúmenes de información de manera estructurada.

- **Recuperación de datos:** Facilita la búsqueda y obtención de datos de forma rápida y eficiente.

- **Integridad de datos:** Asegura que los datos cumplan con reglas y restricciones definidas (por ejemplo, claves primarias, únicas o valores no nulos).

- **Seguridad:** Controla el acceso a los datos mediante permisos y roles.

- **Concurrencia:** Gestiona el acceso simultáneo de múltiples usuarios sin comprometer la consistencia de los datos.

- **Respaldo y recuperación:** Proporciona mecanismos para proteger los datos ante fallos del sistema o desastres.
