<h1 align="center">Conceptos básicos de modelado</h1>

<h2>📑 Contenido</h2>

- [Conceptos básicos de modelado](#conceptos-básicos-de-modelado)
- [Entidades y atributos](#entidades-y-atributos)
  - [Entidades](#entidades)
  - [Atributos](#atributos)
  - [Tipos de atributos](#tipos-de-atributos)

## Conceptos básicos de modelado

En el proceso de diseño de bases de datos, es fundamental comprender los conceptos básicos que forman la base del modelado. Estos conceptos nos permiten representar de manera precisa y estructurada la información que se almacenará en la base de datos.

## Entidades y atributos

### Entidades

Una entidad es un objeto o concepto del mundo real que se representa en la base de datos. Puede ser algo tangible (como una persona o un producto) o intangible (como un evento o una transacción).

- **Ejemplos:** En un sistema de biblioteca, las entidades podrían ser Libro, Autor, Usuario y Préstamo.

- **Representación:** En un diagrama Entidad-Relación (ERD), las entidades se representan como rectángulos.

### Atributos

Los atributos son las propiedades o características que describen una entidad. Cada atributo tiene un tipo de dato asociado (como texto, número, fecha, etc.).

- **Ejemplos:** Para la entidad Libro, los atributos podrían ser ISBN, Título, AñoPublicación y Género.

### Tipos de atributos

- **Simples:** No pueden dividirse en partes más pequeñas (ej. ISBN).

- **Compuestos:** Están formados por varios componentes (ej. Dirección podría dividirse en Calle, Ciudad, CódigoPostal).

- **Derivados:** Se calculan a partir de otros atributos (ej. Edad a partir de FechaNacimiento).

- **Multivaluados:** Pueden tener múltiples valores (ej. Teléfonos de un usuario).
