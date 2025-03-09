<h1 align="center">Lenguaje de Definición (DDL)</h1>

<h2>📑 Contenido</h2>

- [Lenguaje de definición(DDL)](#lenguaje-de-definiciónddl)
- [¿Qué es DDL?](#qué-es-ddl)
- [Comandos principales del DDL](#comandos-principales-del-ddl)
  - [CREATE](#create)
    - [Crear una tabla](#crear-una-tabla)
    - [Crear un índice](#crear-un-índice)
    - [Crear una vista](#crear-una-vista)
  - [ALTER](#alter)
    - [Agregar una columna](#agregar-una-columna)
    - [Modificar una columna](#modificar-una-columna)
    - [Eliminar una columna](#eliminar-una-columna)
    - [Agregar una restricción](#agregar-una-restricción)
  - [DROP](#drop)
    - [Eliminar tabla](#eliminar-tabla)
    - [Eliminar índice](#eliminar-índice)
    - [Eliminar vista](#eliminar-vista)
  - [TRUNCATE](#truncate)
- [Restricciones](#restricciones)
  - [PRIMARY KEY](#primary-key)
  - [FOREIGN KEY](#foreign-key)
  - [UNIQUE](#unique)
  - [NOT NULL](#not-null)
  - [CHECK](#check)
- [Tipos de datos](#tipos-de-datos)
- [Ejemplo práctico: creación de una base de datos](#ejemplo-práctico-creación-de-una-base-de-datos)

## Lenguaje de definición(DDL)

El DDL (Data Definition Language) es un conjunto de comandos SQL utilizados para definir, modificar y eliminar la estructura de una base de datos y sus objetos, como tablas, índices, vistas y restricciones. A diferencia del DML (Data Manipulation Language), que se enfoca en manipular datos, el DDL se centra en la estructura y organización de la base de datos.

## ¿Qué es DDL?

El DDL es un sublenguaje de SQL que permite:

Crear objetos de la base de datos (tablas, índices, vistas, etc.).

Modificar la estructura de objetos existentes.

Eliminar objetos de la base de datos.

Los comandos DDL son esenciales en las fases iniciales del diseño de una base de datos, ya que definen cómo se organizarán y almacenarán los datos.

## Comandos principales del DDL

### CREATE

El comando `CREATE` se utiliza para crear nuevos objetos en la base de datos, como tablas, índices, vistas y más.

#### Crear una tabla

```sql
CREATE TABLE Empleados (
    id INT PRIMARY KEY,
    nombre VARCHAR(50),
    salario DECIMAL(10, 2),
    departamento_id INT,
    FOREIGN KEY (departamento_id) REFERENCES Departamentos(id)
);
```

#### Crear un índice

```sql
CREATE INDEX idx_nombre ON Empleados (nombre);
```

#### Crear una vista

```sql
CREATE VIEW Vista_Empleados AS
SELECT nombre, salario
FROM Empleados
WHERE salario > 3000;
```

---

### ALTER

El comando `ALTER` permite modificar la estructura de un objeto existente, como agregar, modificar o eliminar columnas en una tabla.

#### Agregar una columna

```sql
ALTER TABLE Empleados ADD COLUMN fecha_contratacion DATE;
```

#### Modificar una columna

```sql
ALTER TABLE Empleados MODIFY COLUMN nombre VARCHAR(100);
```

#### Eliminar una columna

```sql
ALTER TABLE Empleados DROP COLUMN fecha_contratacion;
```

#### Agregar una restricción

```sql
ALTER TABLE Empleados ADD CONSTRAINT fk_departamento
FOREIGN KEY (departamento_id) REFERENCES Departamentos(id);
```

---

### DROP

El comando `DROP` se utiliza para eliminar objetos de la base de datos, como tablas, índices o vistas.

#### Eliminar tabla

```sql
DROP TABLE Empleados;
```

#### Eliminar índice

```sql
DROP INDEX idx_nombre;
```

#### Eliminar vista

```sql
DROP VIEW Vista_Empleados;
```

---

### TRUNCATE

El comando `TRUNCATE` elimina todos los datos de una tabla, pero mantiene su estructura.

```sql
TRUNCATE TABLE Empleados;
```

## Restricciones

Las restricciones son reglas que se aplican a las columnas de una tabla para garantizar la integridad de los datos. Las más comunes son:

### PRIMARY KEY

Identifica de manera única cada fila en una tabla.

```sql
CREATE TABLE Empleados (
    id INT PRIMARY KEY,
    nombre VARCHAR(50)
);
```

### FOREIGN KEY

Establece una relación entre dos tablas.

```sql
CREATE TABLE Empleados (
    id INT PRIMARY KEY,
    departamento_id INT,
    FOREIGN KEY (departamento_id) REFERENCES Departamentos(id)
);
```

### UNIQUE

Garantiza que todos los valores en una columna sean únicos.

```sql
CREATE TABLE Usuarios (
    id INT PRIMARY KEY,
    email VARCHAR(100) UNIQUE
);
```

### NOT NULL

Impide que una columna tenga valores nulos.

```sql
CREATE TABLE Empleados (
    id INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);
```

### CHECK

Aplica una condición a los valores de una columna.

```sql
CREATE TABLE Productos (
    id INT PRIMARY KEY,
    precio DECIMAL(10, 2) CHECK (precio > 0)
);
```

## Tipos de datos

Al definir tablas, es importante especificar el tipo de dato de cada columna. Algunos de los tipos de datos más comunes son:

**INT:** Números enteros.

**VARCHAR(n):** Cadena de caracteres de longitud variable (hasta n caracteres).

- **CHAR(n):** Cadena de caracteres de longitud fija (n caracteres).

- **DECIMAL(p, s):** Números decimales con precisión p y escala s.

- **DATE:** Fechas (AAAA-MM-DD).

- **TIMESTAMP:** Fecha y hora.

- **BOOLEAN:** Valores verdadero o falso.

```sql
CREATE TABLE Productos (
    id INT PRIMARY KEY,
    nombre VARCHAR(100),
    precio DECIMAL(10, 2),
    disponible BOOLEAN
);
```

## Ejemplo práctico: creación de una base de datos

```sql
-- Crear la Base de Datos
CREATE DATABASE Empresa;
USE Empresa;

-- Crear Tabla
CREATE TABLE Departamentos (
    id INT PRIMARY KEY,
    nombre_departamento VARCHAR(50) NOT NULL
);

CREATE TABLE Empleados (
    id INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    salario DECIMAL(10, 2) CHECK (salario > 0),
    departamento_id INT,
    FOREIGN KEY (departamento_id) REFERENCES Departamentos(id)
);

--Modificar tabla Empleados
ALTER TABLE Empleados ADD COLUMN fecha_contratacion DATE;

--Eliminar Tabla Empleados
DROP TABLE Empleados;
```
