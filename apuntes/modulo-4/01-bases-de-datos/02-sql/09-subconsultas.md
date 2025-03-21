<h1 align="center">Subconsultas</h1>

<h2>📑 Contenido</h2>

- [Subconsultas](#subconsultas)
- [¿Qué son las subconsultas?](#qué-son-las-subconsultas)
- [Tipos de subconsultas](#tipos-de-subconsultas)
  - [Subconsultas escalares](#subconsultas-escalares)
  - [Subconsultas de una fila](#subconsultas-de-una-fila)
  - [Subconsultas de múltiples filas](#subconsultas-de-múltiples-filas)
  - [Subconsultas correlacionadas](#subconsultas-correlacionadas)
- [Uso de subconsultas en diferentes cláusulas](#uso-de-subconsultas-en-diferentes-cláusulas)
  - [Subconsultas en la cláusula SELECT](#subconsultas-en-la-cláusula-select)
  - [Subconsultas en la cláusula FROM](#subconsultas-en-la-cláusula-from)
  - [Subconsultas en la cláusula WHERE](#subconsultas-en-la-cláusula-where)
  - [Subconsultas en la cláusula HAVING](#subconsultas-en-la-cláusula-having)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplos prácticos](#ejemplos-prácticos)

## Subconsultas

Las subconsultas son consultas SQL anidadas dentro de otras consultas. También conocidas como consultas internas o subselects, permiten realizar operaciones complejas al utilizar el resultado de una consulta como entrada para otra. Las subconsultas son una herramienta poderosa para filtrar, calcular o comparar datos de manera dinámica.

## ¿Qué son las subconsultas?

Una subconsulta es una consulta SQL que se encuentra dentro de otra consulta. Puede aparecer en varias partes de una consulta principal, como en la cláusula `SELECT`, `FROM`, `WHERE`, `HAVING` o `INSERT`. Las subconsultas se ejecutan primero, y su resultado se utiliza en la consulta externa.

## Tipos de subconsultas

### Subconsultas escalares

Devuelven un único valor (una fila y una columna). Se utilizan en lugares donde se espera un valor único, como en una comparación o en la cláusula `SELECT`.

```sql
SELECT nombre, salario
FROM Empleados
WHERE salario > (SELECT AVG(salario) FROM Empleados);
```

### Subconsultas de una fila

Devuelven una sola fila con múltiples columnas. Se utilizan en comparaciones que involucran múltiples valores.

```sql
SELECT nombre, salario
FROM Empleados
WHERE (salario, departamento_id) = (
    SELECT MAX(salario), departamento_id
    FROM Empleados
    GROUP BY departamento_id
    HAVING departamento_id = 1
);
```

---

### Subconsultas de múltiples filas

Devuelven múltiples filas y una o más columnas. Se utilizan con operadores como `IN`, `ANY`, `ALL` o `EXISTS`.

```sql
-- IN
SELECT nombre
FROM Empleados
WHERE departamento_id IN (
    SELECT id
    FROM Departamentos
    WHERE nombre_departamento = 'Ventas'
);

-- EXISTS
SELECT nombre
FROM Empleados E
WHERE EXISTS (
    SELECT 1
    FROM Departamentos D
    WHERE D.id = E.departamento_id
    AND D.nombre_departamento = 'Ventas'
);
```

---

### Subconsultas correlacionadas

Son subconsultas que hacen referencia a columnas de la consulta externa. Se ejecutan una vez por cada fila procesada por la consulta externa.

```sql
SELECT nombre, salario
FROM Empleados E1
WHERE salario > (
    SELECT AVG(salario)
    FROM Empleados E2
    WHERE E2.departamento_id = E1.departamento_id
);
```

---

## Uso de subconsultas en diferentes cláusulas

### Subconsultas en la cláusula SELECT

Se utilizan para devolver un valor calculado o derivado en cada fila del resultado.

```sql
SELECT nombre, salario, (
    SELECT AVG(salario)
    FROM Empleados
) AS salario_promedio
FROM Empleados;
```

### Subconsultas en la cláusula FROM

Se utilizan para crear una tabla temporal que puede ser consultada en la consulta principal.

```sql
SELECT AVG(salario) AS salario_promedio
FROM (
    SELECT salario
    FROM Empleados
    WHERE departamento_id = 1
) AS Empleados_Ventas;
```

### Subconsultas en la cláusula WHERE

Se utilizan para filtrar filas basadas en el resultado de la subconsulta.

```sql
SELECT nombre
FROM Empleados
WHERE departamento_id = (
    SELECT id
    FROM Departamentos
    WHERE nombre_departamento = 'Ventas'
);
```

### Subconsultas en la cláusula HAVING

Se utilizan para filtrar grupos basados en el resultado de la subconsulta.

```sql
SELECT departamento_id, AVG(salario) AS salario_promedio
FROM Empleados
GROUP BY departamento_id
HAVING AVG(salario) > (
    SELECT AVG(salario)
    FROM Empleados
);
```

## Buenas prácticas

- **Optimización:** Evita subconsultas innecesariamente complejas que puedan afectar el rendimiento.

- **Legibilidad:** Usa alias y formato claro para mejorar la comprensión del código.

- **Pruebas:** Verifica el resultado de la subconsulta por separado antes de integrarla en la consulta principal.

- **Alternativas:** Considera usar JOIN o funciones de ventana si son más eficientes para el caso.

## Ejemplos prácticos

```sql
--  Empleados con Salario Mayor al Promedio
SELECT nombre, salario
FROM Empleados
WHERE salario > (
    SELECT AVG(salario)
    FROM Empleados
);

-- Departamentos con Más de 5 Empleados
SELECT nombre_departamento
FROM Departamentos
WHERE id IN (
    SELECT departamento_id
    FROM Empleados
    GROUP BY departamento_id
    HAVING COUNT(*) > 5
);

-- Empleados que Trabajan en el Mismo Departamento que Juan
SELECT nombre
FROM Empleados
WHERE departamento_id = (
    SELECT departamento_id
    FROM Empleados
    WHERE nombre = 'Juan'
);
```
