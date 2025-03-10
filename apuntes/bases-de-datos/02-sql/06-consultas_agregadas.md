<h1 align="center">Consultas Agregadas</h1>

<h2>📑 Contenido</h2>

- [Consultas agregadas](#consultas-agregadas)
- [¿Qué son las consultas agregadas?](#qué-son-las-consultas-agregadas)
- [Funciones agregadas](#funciones-agregadas)
  - [COUNT()](#count)
  - [SUM()](#sum)
  - [AVG()](#avg)
  - [MIN()](#min)
  - [MAX()](#max)
- [Agrupación de datos con GROUP BY](#agrupación-de-datos-con-group-by)
- [Filtrado de grupos con HAVING](#filtrado-de-grupos-con-having)
- [Combinación](#combinación)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplos prácticos](#ejemplos-prácticos)

## Consultas agregadas

Las consultas agregadas son operaciones en SQL que permiten realizar cálculos sobre un conjunto de filas para obtener un único valor resumen. Estas consultas son fundamentales para el análisis de datos, ya que permiten calcular totales, promedios, contar registros y mucho más.

## ¿Qué son las consultas agregadas?

Las consultas agregadas son consultas que operan sobre un conjunto de filas para devolver un único valor resumen. Estas consultas utilizan funciones agregadas, que realizan cálculos sobre los datos de una columna. Las funciones agregadas más comunes son:

- **COUNT():** Cuenta el número de filas.

- **SUM():** Suma los valores de una columna.

- **AVG():** Calcula el promedio de los valores de una columna.

- **MIN():** Encuentra el valor mínimo en una columna.

- **MAX():** Encuentra el valor máximo en una columna.

## Funciones agregadas

### COUNT()

Cuenta el número de filas que coinciden con una condición.

```sql
SELECT COUNT(*) AS total_empleados
FROM Empleados;

-- con condición
SELECT COUNT(*) AS empleados_ventas
FROM Empleados
WHERE departamento_id = 1;
```

---

### SUM()

Suma los valores de una columna numérica.

```sql
SELECT SUM(salario) AS total_salarios
FROM Empleados;

---con condición
SELECT SUM(salario) AS salarios_ventas
FROM Empleados
WHERE departamento_id = 1;
```

---

### AVG()

Calcula el promedio de los valores de una columna numérica.

```sql
SELECT AVG(salario) AS salario_promedio
FROM Empleados;

-- con condición
SELECT AVG(salario) AS salario_promedio_ventas
FROM Empleados
WHERE departamento_id = 1;
```

---

### MIN()

Encuentra el valor mínimo en una columna.

```sql
SELECT MIN(salario) AS salario_minimo
FROM Empleados;

--con condición
SELECT MIN(salario) AS salario_minimo_ventas
FROM Empleados
WHERE departamento_id = 1;
```

---

### MAX()

Encuentra el valor máximo en una columna.

```sql
SELECT MAX(salario) AS salario_maximo
FROM Empleados;

-- con condición
SELECT MAX(salario) AS salario_maximo_ventas
FROM Empleados
WHERE departamento_id = 1;
```

---

## Agrupación de datos con GROUP BY

La cláusula `GROUP BY` se utiliza para agrupar filas que tienen los mismos valores en una o más columnas. Esto es útil cuando se desea aplicar funciones agregadas a grupos específicos de datos.

```sql
SELECT departamento_id, AVG(salario) AS salario_promedio
FROM Empleados
GROUP BY departamento_id;

-- agrupación multiple
SELECT departamento_id, genero, AVG(salario) AS salario_promedio
FROM Empleados
GROUP BY departamento_id, genero;
```

## Filtrado de grupos con HAVING

La cláusula `HAVING` se utiliza para filtrar grupos después de aplicar `GROUP BY`. A diferencia de `WHERE`, que filtra filas individuales, `HAVING` filtra grupos completos.

```sql
SELECT departamento_id, AVG(salario) AS salario_promedio
FROM Empleados
GROUP BY departamento_id
HAVING AVG(salario) > 3000;
```

## Combinación

Es posible combinar varias funciones agregadas en una sola consulta para obtener múltiples resúmenes.

```sql
SELECT
    COUNT(*) AS total_empleados,
    AVG(salario) AS salario_promedio,
    MIN(salario) AS salario_minimo,
    MAX(salario) AS salario_maximo
FROM Empleados;
```

## Buenas prácticas

- **Usar alias:** Asigna nombres descriptivos a las columnas resultantes para facilitar la lectura.

- **Filtrar antes de agrupar:** Utiliza `WHERE` para filtrar filas antes de aplicar `GROUP BY`.

- **Optimizar consultas:** Evita agrupar por columnas innecesarias para mejorar el rendimiento.

- **Validar datos:** Asegúrate de que los datos estén limpios y sean consistentes antes de aplicar funciones agregadas.

## Ejemplos prácticos

```sql
-- Número de Empleados por Departamento
SELECT departamento_id, COUNT(*) AS total_empleados
FROM Empleados
GROUP BY departamento_id;

--  Salario Promedio por Género
SELECT genero, AVG(salario) AS salario_promedio
FROM Empleados
GROUP BY genero;

-- Total de Salarios por Departamento
SELECT departamento_id, SUM(salario) AS total_salarios
FROM Empleados
GROUP BY departamento_id;

-- Departamentos con Salario Promedio Mayor a 3000
SELECT departamento_id, AVG(salario) AS salario_promedio
FROM Empleados
GROUP BY departamento_id
HAVING AVG(salario) > 3000;
```
