<h1 align="center">Restricciones de datos</h1>

<h2>📑 Contenido</h2>

- [Restricciones de datos](#restricciones-de-datos)
- [¿Qué son las restricciones de datos?](#qué-son-las-restricciones-de-datos)
- [Ventajas de las restricciones de datos](#ventajas-de-las-restricciones-de-datos)
- [Tipos de restricciones de datos](#tipos-de-restricciones-de-datos)
  - [PRIMARY KEY (clave primaria)](#primary-key-clave-primaria)
  - [FOREIGN KEY (clave foránea)](#foreign-key-clave-foránea)
- [UNIQUE (único)](#unique-único)
- [NOT NULL (no nulo)](#not-null-no-nulo)
- [CHECK (verificación)](#check-verificación)
- [DEFAULT (valor predeterminado)](#default-valor-predeterminado)
- [Aplicación de restricciones en SQL](#aplicación-de-restricciones-en-sql)
  - [Al crear una tabla](#al-crear-una-tabla)
  - [Al modificar una tabla](#al-modificar-una-tabla)
- [Ejemplo práctico: diseño de una base de datos con restricciones](#ejemplo-práctico-diseño-de-una-base-de-datos-con-restricciones)
  - [Validación de restricciones](#validación-de-restricciones)

## Restricciones de datos

Las restricciones de datos son reglas que se aplican a las columnas o tablas de una base de datos para garantizar la integridad, precisión y consistencia de los datos. Estas restricciones ayudan a prevenir errores, mantener la calidad de la información y asegurar que los datos cumplan con las reglas del negocio.

## ¿Qué son las restricciones de datos?

Las restricciones de datos son condiciones que se imponen sobre los datos almacenados en una base de datos para:

- Evitar la inserción de datos inválidos.

- Garantizar la unicidad de ciertos valores.

- Mantener relaciones entre tablas.

- Asegurar que los datos cumplan con reglas específicas.

Estas restricciones se definen al crear o modificar tablas y son aplicadas automáticamente por el sistema de gestión de bases de datos (SGBD).

## Ventajas de las restricciones de datos

- **Integridad de los datos:** Garantizan que los datos cumplan con reglas específicas.

- **Prevención de errores:** Evitan la inserción de datos inválidos.

- **Consistencia:** Mantienen relaciones y dependencias entre tablas.

- **Facilidad de mantenimiento:** Simplifican la gestión de la base de datos.

## Tipos de restricciones de datos

### PRIMARY KEY (clave primaria)

La restricción `PRIMARY KEY` identifica de manera única cada fila en una tabla. Una tabla solo puede tener una clave primaria, y sus valores no pueden ser nulos ni repetidos.

```sql
-- sintaxis
CREATE TABLE Empleados (
    id INT PRIMARY KEY,
    nombre VARCHAR(50)
);

-- Ejemplo con múltiples columnas (clave compuesta)
CREATE TABLE Matriculas (
    id_estudiante INT,
    id_curso INT,
    PRIMARY KEY (id_estudiante, id_curso)
);
```

### FOREIGN KEY (clave foránea)

La restricción `FOREIGN KEY` establece una relación entre dos tablas. Una clave foránea en una tabla hace referencia a una clave primaria en otra tabla, garantizando la integridad referencial.

```sql
-- sintaxis
CREATE TABLE Empleados (
    id INT PRIMARY KEY,
    departamento_id INT,
    FOREIGN KEY (departamento_id) REFERENCES Departamentos(id)
);

-- Ejemplo con acciones en cascada
CREATE TABLE Empleados (
    id INT PRIMARY KEY,
    departamento_id INT,
    FOREIGN KEY (departamento_id)
    REFERENCES Departamentos(id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);
```

## UNIQUE (único)

La restricción `UNIQUE` garantiza que todos los valores en una columna (o conjunto de columnas) sean únicos. A diferencia de la clave primaria, una tabla puede tener múltiples restricciones `UNIQUE`, y los valores pueden ser nulos (aunque solo un valor nulo está permitido por columna).

```sql
CREATE TABLE Usuarios (
    id INT PRIMARY KEY,
    email VARCHAR(100) UNIQUE
);
```

## NOT NULL (no nulo)

La restricción `NOT NULL` asegura que una columna no pueda contener valores nulos. Esto es útil para garantizar que ciertos campos siempre tengan un valor.

```sql
CREATE TABLE Empleados (
    id INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);
```

## CHECK (verificación)

La restricción `CHECK` permite definir una condición que debe cumplirse para los valores de una columna. Si la condición no se cumple, la operación (inserción o actualización) será rechazada.

```sql
-- sintaxis
CREATE TABLE Productos (
    id INT PRIMARY KEY,
    precio DECIMAL(10, 2) CHECK (precio > 0)
);

-- Ejemplo con múltiples condiciones
CREATE TABLE Empleados (
    id INT PRIMARY KEY,
    edad INT CHECK (edad >= 18 AND edad <= 65)
);
```

## DEFAULT (valor predeterminado)

La restricción `DEFAULT` asigna un valor predeterminado a una columna si no se proporciona un valor durante la inserción.

```sql
CREATE TABLE Empleados (
    id INT PRIMARY KEY,
    nombre VARCHAR(50),
    fecha_contratacion DATE DEFAULT CURRENT_DATE
);
```

## Aplicación de restricciones en SQL

### Al crear una tabla

Las restricciones pueden definirse al crear una tabla utilizando la sentencia `CREATE TABLE`.

```sql
CREATE TABLE Empleados (
    id INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    salario DECIMAL(10, 2) CHECK (salario > 0),
    departamento_id INT,
    FOREIGN KEY (departamento_id) REFERENCES Departamentos(id)
);
```

### Al modificar una tabla

Las restricciones también pueden agregarse o eliminarse después de crear una tabla utilizando la sentencia `ALTER TABLE`.

```sql
-- Agregar una Restricción:
ALTER TABLE Empleados
ADD CONSTRAINT chk_salario CHECK (salario > 0);

-- Eliminar una Restricción:
ALTER TABLE Empleados
DROP CONSTRAINT chk_salario;
```

## Ejemplo práctico: diseño de una base de datos con restricciones

```sql
-- Creación de Tablas con Restricciones
CREATE TABLE Departamentos (
    id INT PRIMARY KEY,
    nombre_departamento VARCHAR(50) NOT NULL
);

CREATE TABLE Empleados (
    id INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    salario DECIMAL(10, 2) CHECK (salario > 0),
    departamento_id INT,
    FOREIGN KEY (departamento_id) REFERENCES Departamentos(id)
);

--  Inserción de Datos
INSERT INTO Departamentos (id, nombre_departamento)
VALUES (1, 'Ventas'), (2, 'Marketing');

INSERT INTO Empleados (id, nombre, email, salario, departamento_id)
VALUES (1, 'Juan Pérez', 'juan@empresa.com', 3000.00, 1),
       (2, 'María Gómez', 'maria@empresa.com', 3500.00, 2);
```

### Validación de restricciones

- Intentar insertar un salario negativo generará un error debido a la restricción `CHECK`.

- Intentar insertar un correo electrónico duplicado generará un error debido a la restricción `UNIQUE`.
