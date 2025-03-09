<h1 align="center">Modelo Entidad-Relación (ER)</h1>

<h2>📑 Contenido</h2>

- [Modelo entidad-relación (ER)](#modelo-entidad-relación-er)
- [¿Qué es el modelo entidad-relación?](#qué-es-el-modelo-entidad-relación)
- [Componentes del modelo ER](#componentes-del-modelo-er)
  - [Entidades](#entidades)
  - [Atributos](#atributos)
  - [Relaciones](#relaciones)
- [Notación del modelo ER](#notación-del-modelo-er)
- [Ejemplo práctico: sistema universitario](#ejemplo-práctico-sistema-universitario)
  - [Identificación de entidades y atributos](#identificación-de-entidades-y-atributos)
  - [Identificación de relaciones](#identificación-de-relaciones)
  - [Diagrama ER](#diagrama-er)
  - [Cardinalidades](#cardinalidades)
- [Ventajas del Modelo ER](#ventajas-del-modelo-er)

## Modelo entidad-relación (ER)

El Modelo Entidad-Relación (ER) es una herramienta conceptual utilizada en el diseño de bases de datos para representar la estructura y las relaciones de los datos de manera clara y comprensible. Desarrollado por Peter Chen en 1976, este modelo permite a los diseñadores visualizar los requisitos de un sistema y traducirlos en un esquema de base de datos eficiente.

## ¿Qué es el modelo entidad-relación?

El Modelo Entidad-Relación es una representación gráfica y conceptual de los datos que se almacenarán en una base de datos. Se centra en identificar las entidades, sus atributos y las relaciones entre ellas. Este modelo es independiente de la implementación técnica y sirve como puente entre los requisitos del negocio y el diseño físico de la base de datos.

## Componentes del modelo ER

El modelo ER se compone de tres elementos principales:

### Entidades

Una entidad es un objeto o concepto del mundo real que se puede distinguir de otros. Por ejemplo, en un sistema universitario, las entidades podrían ser Estudiante, Profesor o Curso.

- **Entidad fuerte:** No depende de otra entidad para existir (por ejemplo, Estudiante).

- **Entidad débil:** Depende de otra entidad para existir (por ejemplo, Dependiente de un Empleado).

### Atributos

Los atributos son propiedades o características de una entidad. Por ejemplo, un Estudiante puede tener atributos como id, nombre, fecha_nacimiento y dirección.

- **Atributo simple:** No se puede dividir en partes más pequeñas (por ejemplo, edad).

- **Atributo compuesto:** Se puede dividir en subpartes (por ejemplo, dirección puede dividirse en calle, ciudad, código postal).

- **Atributo clave:** Identifica de manera única una entidad (por ejemplo, id).

- **Atributo derivado:** Se calcula a partir de otros atributos (por ejemplo, edad a partir de fecha_nacimiento).

### Relaciones

Una relación describe cómo dos o más entidades están asociadas entre sí. Por ejemplo, un Estudiante puede estar matriculado en un Curso.

- **Grado de una relación:** Número de entidades participantes (binaria, ternaria, etc.).

- **Cardinalidad:** Define cuántas instancias de una entidad se relacionan con otra (por ejemplo, 1:1, 1:N, M:N).

## Notación del modelo ER

El modelo ER se representa gráficamente utilizando diagramas. A continuación, se describen los símbolos más comunes:

- **Entidad:** Rectángulo.

- **Atributo:** Elipse conectada a la entidad.

- **Relación:** Rombo conectado a las entidades participantes.

- **Líneas:** Conectan entidades con relaciones y atributos con entidades.

- **Cardinalidad:** Se indica con notaciones como (1,1), (0,N), (1,N), etc.

## Ejemplo práctico: sistema universitario

### Identificación de entidades y atributos

- **Estudiante:** id, nombre, fecha_nacimiento.

- **Curso:** codigo, nombre, creditos.

- **Profesor:** id, nombre, departamento.

### Identificación de relaciones

- Un Estudiante se matricula en un Curso.

- Un Profesor imparte un Curso.

### Diagrama ER

```
Estudiante (id, nombre, fecha_nacimiento)
    |
    | matricula
    |
Curso (codigo, nombre, creditos)
    |
    | imparte
    |
Profesor (id, nombre, departamento)
```

### Cardinalidades

- Un Estudiante puede matricularse en muchos Cursos (1:N).

- Un Curso puede ser impartido por un solo Profesor (1:1).

## Ventajas del Modelo ER

- **Claridad:** Facilita la comprensión de la estructura de los datos.

- **Comunicación:** Sirve como herramienta de comunicación entre diseñadores y stakeholders.

- **Diseño eficiente:** Ayuda a identificar problemas de diseño antes de la implementación.

- **Documentación:** Proporciona una documentación visual del sistema.
