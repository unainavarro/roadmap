<h1 align="center">Normalización</h1>

<h2>📑 Contenido</h2>

- [Normalización](#normalización)
- [¿Qué es la normalización?](#qué-es-la-normalización)
- [Objetivos de la normalización](#objetivos-de-la-normalización)
- [Ventajas](#ventajas)
- [Desventajas](#desventajas)
- [Formas normales](#formas-normales)
  - [Primera forma normal (1FN)](#primera-forma-normal-1fn)
  - [Segunda forma normal (2FN)](#segunda-forma-normal-2fn)
  - [Tercera forma normal (3FN)](#tercera-forma-normal-3fn)
  - [Forma normal de Boyce-Codd (FNBC)](#forma-normal-de-boyce-codd-fnbc)
  - [Cuarta forma normal (4FN)](#cuarta-forma-normal-4fn)

## Normalización

La normalización es un proceso fundamental en el diseño de bases de datos relacionales que consiste en organizar los datos de manera eficiente y estructurada. Su objetivo principal es eliminar redundancias, evitar anomalías en la inserción, actualización y eliminación de datos, y garantizar la integridad de la información

## ¿Qué es la normalización?

La normalización es un proceso sistemático que consiste en descomponer una base de datos en tablas más pequeñas y bien estructuradas, siguiendo un conjunto de reglas llamadas formas normales. Estas reglas ayudan a organizar los datos de manera que se minimice la duplicación y se maximice la integridad.

## Objetivos de la normalización

- **Eliminar redundancias:** Evitar la duplicación innecesaria de datos.

- **Prevenir anomalías:**

  - **Inserción:** Dificultad para agregar datos sin información relacionada.

  - **Actualización:** Inconsistencias al modificar datos duplicados.

  - **Eliminación:** Pérdida de información no deseada al eliminar datos.

- **Mejorar la integridad:** Garantizar que los datos sean precisos y consistentes.

- **Facilitar el mantenimiento:** Simplificar la gestión y modificación de la base de datos.

## Ventajas

- **Reducción de redundancias:** Menos duplicación de datos.

- **Consistencia:** Menos riesgo de inconsistencias.

- **Facilidad de mantenimiento:** Modificaciones más sencillas.

- **Optimización de consultas:** Mejor rendimiento en consultas complejas.

## Desventajas

- **Complejidad:** Mayor número de tablas y relaciones.

- **Rendimiento:** En algunos casos, puede afectar el rendimiento de consultas simples.

- **Diseño inicial:** Requiere un análisis detallado al inicio.

## Formas normales

La normalización se realiza en etapas, cada una de las cuales corresponde a una forma normal.

### Primera forma normal (1FN)

Una tabla está en Primera Forma Normal (1FN) si cumple con las siguientes condiciones:

- Cada columna contiene valores atómicos (indivisibles).

- No hay grupos repetidos o arrays en las columnas.

- Cada fila es única, identificada por una clave primaria.

**Tabla no normalizada:**

| id  | nombre | cursos              |
| --- | ------ | ------------------- |
| 1   | Juan   | Matemáticas, Física |
| 2   | María  | Química             |

**Tabla en 1FN:**

| id  | nombre | curso       |
| --- | ------ | ----------- |
| 1   | Juan   | Matemáticas |
| 1   | Juan   | Física      |
| 2   | María  | Química     |

---

### Segunda forma normal (2FN)

Una tabla está en Segunda Forma Normal (2FN) si:

- Ya está en 1FN.

- Todos los atributos no clave dependen completamente de la clave primaria (no hay dependencias parciales).

**Tabla en 1FN:**

| id_estudiante | id_curso | nombre_estudiante | nombre_curso |
| ------------- | -------- | ----------------- | ------------ |
| 1             | 101      | Juan              | Matemáticas  |
| 1             | 102      | Juan              | Física       |
| 2             | 103      | María             | Química      |

**Tabla en 2FN:**

Estudiantes:

| id_estudiante | nombre_estudiante |
| ------------- | ----------------- |
| 1             | Juan              |
| 2             | María             |

Cursos:

| id_curso | nombre_curso |
| -------- | ------------ |
| 101      | Matemáticas  |
| 102      | Física       |
| 103      | Química      |

Matriculas:

| id_estudiante | id_curso |
| ------------- | -------- |
| 1             | 101      |
| 1             | 102      |
| 2             | 103      |

---

### Tercera forma normal (3FN)

Una tabla está en Tercera Forma Normal (3FN) si:

- Ya está en 2FN.

- No hay dependencias transitivas (los atributos no clave no dependen de otros atributos no clave).

**Tabla en 2FN:**

| id_empleado | nombre | departamento | jefe_departamento |
| ----------- | ------ | ------------ | ----------------- |
| 1           | Juan   | Ventas       | Carlos            |
| 2           | María  | Marketing    | Ana               |

**Tabla en 3FN:**

Empleados:

| id_empleado | nombre | departamento |
| ----------- | ------ | ------------ |
| 1           | Juan   | Ventas       |
| 2           | María  | Marketing    |

Departamentos:

| departamento | jefe_departamento |
| ------------ | ----------------- |
| Ventas       | Carlos            |
| Marketing    | Ana               |

---

### Forma normal de Boyce-Codd (FNBC)

Una tabla está en Forma Normal de Boyce-Codd (FNBC) si:

- Ya está en 3FN.

- No hay dependencias funcionales donde un atributo no clave determine parte de la clave primaria.

**Tabla en 3FN:**

| id_estudiante | id_curso | profesor |
| ------------- | -------- | -------- |
| 1             | 101      | Carlos   |
| 1             | 102      | Ana      |

**Tabla en FNBC:**

Cursos:

| id_curso | profesor |
| -------- | -------- |
| 101      | Carlos   |
| 102      | Ana      |

Matriculas:

| id_estudiante | id_curso |
| ------------- | -------- |
| 1             | 101      |
| 1             | 102      |

---

### Cuarta forma normal (4FN)

Una tabla está en Cuarta Forma Normal (4FN) si:

- Ya está en FNBC.

- No hay dependencias multivaluadas independientes.

**Tabla en FNBC:**

| id_estudiante | curso       | hobby  |
| ------------- | ----------- | ------ |
| 1             | Matemáticas | Fútbol |
| 1             | Física      | Fútbol |
| 1             | Matemáticas | Música |

**Tabla en 4FN:**
Cursos:

| id_estudiante | curso       |
| ------------- | ----------- |
| 1             | Matemáticas |
| 1             | Física      |

Hobbies:

| id_estudiante | hobby  |
| ------------- | ------ |
| 1             | Fútbol |
| 1             | Música |

---
