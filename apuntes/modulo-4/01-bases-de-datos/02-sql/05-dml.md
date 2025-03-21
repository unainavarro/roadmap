<h1 align="center">Lenguaje de manipulación de datos (DML)</h1>

<h2>📑 Contenido</h2>

- [Lenguaje de manipulación de datos (DML)](#lenguaje-de-manipulación-de-datos-dml)
- [¿Qué es DML?](#qué-es-dml)
- [Comandos principales del DML](#comandos-principales-del-dml)
  - [INSERT](#insert)
  - [UPDATE](#update)
  - [DELETE](#delete)
  - [SELECT](#select)
- [Ejemplo práctico: gestión de datos en una base de datos](#ejemplo-práctico-gestión-de-datos-en-una-base-de-datos)
- [Buenas prácticas](#buenas-prácticas)

## Lenguaje de manipulación de datos (DML)

El DML (Data Manipulation Language) es un conjunto de comandos SQL que permite interactuar con los datos almacenados en una base de datos. A diferencia del DDL (Data Definition Language), que se enfoca en la estructura de la base de datos, el DML se centra en la manipulación de los datos, incluyendo operaciones como inserción, actualización, eliminación y consulta.

## ¿Qué es DML?

El DML es un sublenguaje de SQL que permite:

- **Insertar** nuevos registros en una tabla.

- **Actualizar** registros existentes.

- **Eliminar** registros de una tabla.

- **Consultar** datos almacenados en una o más tablas.

Los comandos DML son esenciales para gestionar la información en una base de datos y son utilizados frecuentemente en aplicaciones y sistemas que interactúan con datos.

## Comandos principales del DML

### INSERT

El comando `INSERT` se utiliza para agregar nuevos registros a una tabla.

```sql
-- Sintaxis
INSERT INTO nombre_tabla (columna1, columna2, ...)
VALUES (valor1, valor2, ...);

--Ejemplo
INSERT INTO Empleados (id, nombre, salario, departamento_id)
VALUES (1, 'Juan Pérez', 3000.00, 1);

-- Inserción multiple
INSERT INTO Empleados (id, nombre, salario, departamento_id)
VALUES (2, 'María Gómez', 3500.00, 2),
       (3, 'Carlos López', 4000.00, 1);
```

### UPDATE

El comando `UPDATE` permite modificar registros existentes en una tabla.

```sql
-- Sintaxis
UPDATE nombre_tabla
SET columna1 = valor1, columna2 = valor2, ...
WHERE condición;

-- Ejemplo
UPDATE Empleados
SET salario = 3200.00
WHERE id = 1;

-- Actualización multiple
UPDATE Empleados
SET salario = salario * 1.10
WHERE departamento_id = 1;

```

### DELETE

El comando `DELETE` se utiliza para eliminar registros de una tabla.

```sql
-- Sintaxis
DELETE FROM nombre_tabla
WHERE condición;

-- Ejemplo
DELETE FROM Empleados
WHERE id = 3;

-- Eliminar todos los registros
DELETE FROM Empleados;
```

### SELECT

El comando `SELECT` permite consultar datos almacenados en una o más tablas. Aunque a menudo se asocia con DQL (Data Query Language), también se considera parte del DML.

```sql
-- Sintaxis
SELECT columna1, columna2, ...
FROM nombre_tabla
WHERE condición;

-- Ejemplo
SELECT nombre, salario
FROM Empleados
WHERE salario > 3000;

-- Unir tablas
SELECT E.nombre, D.nombre_departamento
FROM Empleados E
JOIN Departamentos D ON E.departamento_id = D.id;
```

## Ejemplo práctico: gestión de datos en una base de datos

```sql
-- Inserción de Datos
INSERT INTO Departamentos (id, nombre_departamento)
VALUES (1, 'Ventas'), (2, 'Marketing');

INSERT INTO Empleados (id, nombre, salario, departamento_id)
VALUES (1, 'Juan Pérez', 3000.00, 1),
       (2, 'María Gómez', 3500.00, 2);

-- Actualización de Datos
UPDATE Empleados
SET salario = 3200.00
WHERE id = 1;

-- Eliminación de Datos
DELETE FROM Empleados
WHERE id = 2;

-- Consulta de Datos
SELECT E.nombre, D.nombre_departamento
FROM Empleados E
JOIN Departamentos D ON E.departamento_id = D.id;
```

## Buenas prácticas

- **Usar WHERE con cuidado:** En `UPDATE` y `DELETE`, siempre especifica una condición para evitar modificar o eliminar todos los registros.

- **Validar datos antes de insertar:** Asegúrate de que los datos cumplan con las restricciones de la tabla.

- **Utilizar transacciones:** Agrupa operaciones relacionadas en transacciones para garantizar la integridad de los datos.

- **Optimizar consultas:** Evita consultas innecesariamente complejas que puedan afectar el rendimiento
