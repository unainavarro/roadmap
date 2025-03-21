<h1 align="center">Diseño lógico</h1>

<h2>📑 Contenido</h2>

- [Diseño lógico](#diseño-lógico)
- [Convertir el diseño conceptual en un diseño lógico](#convertir-el-diseño-conceptual-en-un-diseño-lógico)
  - [Identificar entidades y atributos](#identificar-entidades-y-atributos)
  - [Definir claves primarias](#definir-claves-primarias)
  - [Establecer relaciones](#establecer-relaciones)
  - [Normalizar las tablas](#normalizar-las-tablas)
- [Definición de esquemas y tablas](#definición-de-esquemas-y-tablas)
  - [Esquemas](#esquemas)
  - [Tablas](#tablas)
  - [Tipos de datos](#tipos-de-datos)
- [Integridad referencial](#integridad-referencial)
  - [Claves foráneas](#claves-foráneas)
  - [Reglas de integridad referencial](#reglas-de-integridad-referencial)
  - [Beneficios de la integridad referencial](#beneficios-de-la-integridad-referencial)

## Diseño lógico

El diseño lógico es una fase crucial en el proceso de desarrollo de bases de datos, donde se transforma el modelo conceptual en una estructura que puede ser implementada en un sistema de gestión de bases de datos (SGBD). En esta etapa, se definen esquemas, tablas, relaciones y reglas de integridad referencial que garantizan la consistencia y eficiencia de la base de datos.

## Convertir el diseño conceptual en un diseño lógico

El diseño conceptual, representado comúnmente mediante diagramas Entidad-Relación (ERD), proporciona una visión general de las entidades, atributos y relaciones del sistema. Para convertirlo en un diseño lógico, seguimos estos pasos:

### Identificar entidades y atributos

- Cada entidad en el modelo conceptual se convierte en una tabla en el diseño lógico.

- Los atributos de la entidad se convierten en columnas de la tabla.

### Definir claves primarias

- Seleccionar un atributo o conjunto de atributos que identifiquen de manera única cada fila en la tabla.

- Si no existe un identificador natural, se puede agregar una clave artificial (por ejemplo, un ID numérico).

### Establecer relaciones

- Las relaciones entre entidades se traducen en claves foráneas en el diseño lógico.

- Dependiendo del tipo de relación (1:1, 1:N, N:M), se definen las restricciones y tablas adicionales necesarias.

### Normalizar las tablas

Aplicar las reglas de normalización para eliminar redundancias y garantizar la integridad de los datos.

## Definición de esquemas y tablas

### Esquemas

Un esquema es la estructura lógica que define cómo se organizan los datos en la base de datos. Incluye tablas, columnas, tipos de datos, relaciones y restricciones.

- **Objetivo:** Proporcionar un marco para la organización y gestión de los datos.

- **Ejemplo:** En un sistema de biblioteca, el esquema podría incluir tablas como Libros, Autores, Usuarios y Préstamos.

### Tablas

Una tabla es una colección de datos organizados en filas y columnas. Cada fila representa un registro, y cada columna representa un atributo.

- **Componentes:**

  - **Columnas:** Representan los atributos de la entidad. Cada columna tiene un nombre, un tipo de dato y restricciones (como NOT NULL o UNIQUE).

  - **Filas:** Representan instancias de la entidad.

- **Ejemplo:** La tabla Libros podría tener las siguientes columnas:

  - ISBN (clave primaria, tipo VARCHAR).

  - Título (tipo VARCHAR).

  - AñoPublicación (tipo INT).

  - Género (tipo VARCHAR).

### Tipos de datos

Especifican el tipo de información que se almacenará en cada columna (por ejemplo, INT para números enteros, VARCHAR para texto, DATE para fechas).

## Integridad referencial

La integridad referencial es un concepto fundamental en el diseño de bases de datos que garantiza la consistencia y validez de las relaciones entre tablas. Se implementa mediante claves foráneas y reglas que definen cómo se manejan las operaciones de inserción, actualización y eliminación.

### Claves foráneas

Una clave foránea es una columna o conjunto de columnas en una tabla que hace referencia a la clave primaria de otra tabla.

- **Objetivo:** Establecer y mantener relaciones entre tablas.

- **Ejemplo:** En la tabla Préstamos, la columna ID_Usuario es una clave foránea que referencia la clave primaria ID_Usuario en la tabla Usuarios.

### Reglas de integridad referencial

Garantiza que no se puedan insertar valores en una clave foránea que no existan en la clave primaria referenciada.

- **Acciones en Cascada:**

  - **ON DELETE CASCADE:** Si se elimina un registro en la tabla principal, se eliminan automáticamente los registros relacionados en la tabla secundaria.

  - **ON UPDATE CASCADE:** Si se actualiza un valor en la clave primaria, se actualizan automáticamente las claves foráneas correspondientes.

- **Ejemplo:** Si un Usuario es eliminado de la tabla Usuarios, todos sus Préstamos relacionados en la tabla Préstamos también se eliminarán si se define ON DELETE CASCADE.

### Beneficios de la integridad referencial

- Evita datos huérfanos (registros en una tabla secundaria que no tienen correspondencia en la tabla principal).

- Mantiene la consistencia de los datos en toda la base de datos.

- Facilita la gestión de relaciones complejas.
