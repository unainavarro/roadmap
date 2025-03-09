<h1 align="center">Conceptos</h1>

<h2>📑 Contenido</h2>

- [Conceptos](#conceptos)
- [Modelos de Datos](#modelos-de-datos)
- [Esquema e Instancia](#esquema-e-instancia)
- [Tablas, Filas y Columnas](#tablas-filas-y-columnas)
- [Claves y Relaciones](#claves-y-relaciones)
- [Integridad de los Datos](#integridad-de-los-datos)
- [Normalización](#normalización)
- [Lenguaje de Consulta Estructurado (SQL)](#lenguaje-de-consulta-estructurado-sql)
- [Transacciones y Control de Concurrencia](#transacciones-y-control-de-concurrencia)

## Conceptos

Conceptos fundamentales que forman la base de cualquier sistema de bases de datos. Estos conceptos son esenciales para entender cómo se estructuran, organizan y manipulan los datos en una base de datos.

## Modelos de Datos

Un modelo de datos es una colección de herramientas conceptuales para describir datos, sus relaciones, su semántica y sus restricciones. Los modelos de datos proporcionan una forma de representar la estructura lógica de una base de datos. Los modelos más comunes incluyen:

- **Modelo Relacional:** Representa los datos en forma de tablas (relaciones), donde cada tabla tiene filas (tuplas) y columnas (atributos). Es el modelo más utilizado en la actualidad.

- **Modelo Jerárquico:** Organiza los datos en una estructura de árbol, donde cada registro tiene un único padre y varios hijos.

- **Modelo de Red:** Similar al modelo jerárquico, pero permite que un registro tenga múltiples padres.

- **Modelo Orientado a Objetos:** Representa los datos como objetos, similares a los utilizados en la programación orientada a objetos.

- **Modelo NoSQL:** Incluye una variedad de modelos, como documentos, grafos, columnas y pares clave-valor, diseñados para manejar datos no estructurados o semi-estructurados.

## Esquema e Instancia

- **Esquema:** Es la estructura lógica de la base de datos. Define cómo se organizan los datos, incluyendo tablas, columnas, tipos de datos, relaciones y restricciones. El esquema es como un "plan" o "blueprint" de la base de datos.

  ```sql
  CREATE TABLE Clientes (
      ID INT PRIMARY KEY,
      Nombre VARCHAR(50),
      Email VARCHAR(100)
  );
  ```

- **Instancia:** Es el conjunto de datos almacenados en la base de datos en un momento dado. Mientras que el esquema es fijo (a menos que se modifique), la instancia cambia con el tiempo a medida que se insertan, actualizan o eliminan datos.

## Tablas, Filas y Columnas

- **Tabla:** Una colección de datos organizados en filas y columnas. Cada tabla representa una entidad (por ejemplo, "Clientes", "Productos").

- **Fila (Tupla):** Un registro individual en una tabla. Representa una instancia de la entidad (por ejemplo, un cliente específico).

- **Columna (Atributo):** Un campo específico en una tabla que almacena un tipo de dato particular (por ejemplo, "Nombre", "Email").

## Claves y Relaciones

- **Clave Primaria (Primary Key):** Un identificador único para cada fila en una tabla. No puede haber dos filas con la misma clave primaria. Ejemplo: `ID` en la tabla `Clientes`.

- **Clave Foránea (Foreign Key):** Un campo en una tabla que hace referencia a la clave primaria de otra tabla. Establece una relación entre dos tablas. Ejemplo: `ClienteID` en la tabla Pedidos que referencia `ID` en la tabla `Clientes`.

- **Relaciones:** Las tablas en una base de datos relacional están relacionadas entre sí mediante claves primarias y foráneas. Los tipos de relaciones más comunes son:

  - **Uno a Uno:** Una fila en una tabla se relaciona con una sola fila en otra tabla.

  - **Uno a Muchos:** Una fila en una tabla se relaciona con múltiples filas en otra tabla.

  - **Muchos a Muchos:** Múltiples filas en una tabla se relacionan con múltiples filas en otra tabla (requiere una tabla intermedia).

## Integridad de los Datos

La integridad de los datos se refiere a la precisión y consistencia de los datos en una base de datos. Se mantiene mediante reglas y restricciones, como:

- **Integridad de Entidad:** Asegura que cada fila en una tabla sea única (mediante la clave primaria).

- **Integridad Referencial:** Asegura que las relaciones entre tablas sean válidas (mediante claves foráneas).

- **Integridad de Dominio:** Asegura que los datos en una columna cumplan con un conjunto específico de reglas (por ejemplo, un campo de "Edad" debe ser un número positivo).

## Normalización

La normalización es un proceso de diseño de bases de datos que organiza los datos para reducir la redundancia y mejorar la integridad. Consiste en aplicar una serie de reglas (formas normales) para dividir las tablas en estructuras más pequeñas y eficientes.

- **Primera Forma Normal (1NF):** Elimina grupos repetidos y asegura que cada columna contenga valores atómicos (indivisibles).

- **Segunda Forma Normal (2NF):** Elimina dependencias parciales, asegurando que todos los atributos no clave dependan de la clave primaria completa.

- **Tercera Forma Normal (3NF):** Elimina dependencias transitivas, asegurando que los atributos no clave no dependan de otros atributos no clave.

## Lenguaje de Consulta Estructurado (SQL)

El SQL (Structured Query Language) es el lenguaje estándar para interactuar con bases de datos relacionales. Permite realizar operaciones como:

- **Consultas:** Recuperar datos de una base de datos (SELECT).

- **Inserción:** Agregar nuevos datos a una tabla (INSERT).

- **Actualización:** Modificar datos existentes (UPDATE).

- **Eliminación:** Eliminar datos de una tabla (DELETE).

- **Definición de Datos:** Crear y modificar la estructura de la base de datos (CREATE, ALTER, DROP).

```sql
-- Consulta
SELECT Nombre, Email FROM Clientes WHERE Ciudad = 'Madrid';
```

## Transacciones y Control de Concurrencia

- **Transacción:** Es una secuencia de operaciones que se ejecutan como una sola unidad de trabajo. Las transacciones deben cumplir con las propiedades ACID:

  - **Atomicidad:** La transacción se completa en su totalidad o no se realiza en absoluto.

  - **Consistencia:** La transacción lleva la base de datos de un estado válido a otro estado válido.

  - **Aislamiento:** Las transacciones concurrentes no interfieren entre sí.

  - **Durabilidad:** Una vez completada, la transacción persiste incluso en caso de fallos del sistema.

- **Control de Concurrencia:** Mecanismos que aseguran que múltiples transacciones puedan ejecutarse simultáneamente sin afectar la integridad de los datos.
