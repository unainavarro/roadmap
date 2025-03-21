<h1 align="center">Funciones avanzadas</h1>

<h2>📑 Contenido</h2>

- [Funciones avanzadas](#funciones-avanzadas)
- [Funciones de ventana (window functions)](#funciones-de-ventana-window-functions)
  - [ROW\_NUMBER()](#row_number)
  - [RANK() y DENSE\_RANK()](#rank-y-dense_rank)
- [Funciones de cadena (string functions)](#funciones-de-cadena-string-functions)
  - [CONCAT()](#concat)
  - [SUBSTRING()](#substring)
  - [REPLACE()](#replace)
  - [LENGTH()](#length)
- [Funciones de fecha y hora (date and time functions)](#funciones-de-fecha-y-hora-date-and-time-functions)
  - [NOW()](#now)
  - [DATEADD() o DATE\_ADD()](#dateadd-o-date_add)
  - [DATEDIFF()](#datediff)
  - [EXTRACT()](#extract)
- [Funciones condicionales (conditional functions)](#funciones-condicionales-conditional-functions)
  - [CASE](#case)
  - [COALESCE()](#coalesce)
  - [NULLIF()](#nullif)
- [Funciones matemáticas](#funciones-matemáticas)
  - [ABS()](#abs)
  - [ROUND()](#round)
  - [CEIL() o CEILING()](#ceil-o-ceiling)
  - [FLOOR()](#floor)
  - [STDDEV() y VARIANCE()](#stddev-y-variance)
  - [SUM() y AVG() acumulativos](#sum-y-avg-acumulativos)
  - [POWER()](#power)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplos prácticos](#ejemplos-prácticos)

## Funciones avanzadas

Las funciones avanzadas en SQL son herramientas que permiten realizar operaciones complejas y análisis detallados sobre conjuntos de datos. Estas funciones van más allá de las operaciones básicas de consulta y manipulación, ofreciendo capacidades como cálculos acumulativos, particionamiento de datos, manejo de fechas y texto, y más.

## Funciones de ventana (window functions)

Las funciones de ventana permiten realizar cálculos sobre un conjunto de filas relacionadas con la fila actual, sin agrupar los resultados en una sola fila. Son ideales para análisis acumulativos, rankings y comparaciones.

```sql
-- sintaxis
SELECT columna1, columna2,
       FUNCIÓN() OVER (PARTITION BY columna ORDER BY columna)
FROM tabla;
```

### ROW_NUMBER()

Asigna un número único a cada fila dentro de una partición.

```sql
SELECT nombre, salario,
       ROW_NUMBER() OVER (ORDER BY salario DESC) AS ranking
FROM Empleados;
```

---

### RANK() y DENSE_RANK()

Asignan un rango a las filas, con manejo diferente de empates.

```sql
SELECT nombre, salario,
       RANK() OVER (ORDER BY salario DESC) AS rank,
       DENSE_RANK() OVER (ORDER BY salario DESC) AS dense_rank
FROM Empleados;
```

---

## Funciones de cadena (string functions)

Las funciones de cadena permiten manipular y analizar datos de tipo texto.

### CONCAT()

Combina dos o más cadenas.

```sql
SELECT CONCAT(nombre, ' ', apellido) AS nombre_completo
FROM Empleados;
```

---

### SUBSTRING()

Extrae una parte de una cadena.

```sql
SELECT SUBSTRING(nombre, 1, 3) AS iniciales
FROM Empleados;
```

---

### REPLACE()

Reemplaza una subcadena por otra.

```sql
SELECT REPLACE(descripcion, 'viejo', 'nuevo') AS descripcion_actualizada
FROM Productos;
```

---

### LENGTH()

Devuelve la longitud de una cadena.

```sql
SELECT nombre, LENGTH(nombre) AS longitud_nombre
FROM Empleados;
```

## Funciones de fecha y hora (date and time functions)

Las funciones de fecha y hora permiten manipular y calcular valores relacionados con fechas y horas.

### NOW()

Devuelve la fecha y hora actual.

```sql
SELECT NOW() AS fecha_actual;
```

---

### DATEADD() o DATE_ADD()

Agrega un intervalo a una fecha.

```sql
SELECT DATE_ADD(fecha_contratacion, INTERVAL 1 YEAR) AS fecha_aniversario
FROM Empleados;
```

---

### DATEDIFF()

Calcula la diferencia entre dos fechas.

```sql
SELECT DATEDIFF(NOW(), fecha_contratacion) AS dias_contratado
FROM Empleados;
```

---

### EXTRACT()

Extrae una parte específica de una fecha (año, mes, día, etc.).

```sql
SELECT EXTRACT(YEAR FROM fecha_contratacion) AS año_contratacion
FROM Empleados;
```

## Funciones condicionales (conditional functions)

Las funciones condicionales permiten realizar operaciones basadas en condiciones.

### CASE

Evalúa condiciones y devuelve un valor basado en el resultado.

```sql
SELECT nombre, salario,
       CASE
           WHEN salario > 5000 THEN 'Alto'
           WHEN salario BETWEEN 3000 AND 5000 THEN 'Medio'
           ELSE 'Bajo'
       END AS categoria_salario
FROM Empleados;
```

---

### COALESCE()

Devuelve el primer valor no nulo de una lista.

```sql
SELECT nombre, COALESCE(telefono, 'No disponible') AS telefono
FROM Empleados;
```

---

### NULLIF()

Devuelve `NULL` si dos valores son iguales; de lo contrario, devuelve el primer valor.

```sql
SELECT nombre, NULLIF(salario, 0) AS salario_ajustado
FROM Empleados;
```

## Funciones matemáticas

### ABS()

Devuelve el valor absoluto de un número.

```sql
SELECT ABS(-10) AS valor_absoluto;  -- Resultado: 10
```

---

### ROUND()

Redondea un número a un número específico de decimales.

```sql
SELECT ROUND(15.789, 2) AS redondeado;  -- Resultado: 15.79
```

---

### CEIL() o CEILING()

Redondea un número hacia arriba al entero más cercano.

```sql
SELECT CEIL(15.2) AS redondeo_hacia_arriba;  -- Resultado: 16
```

---

### FLOOR()

Redondea un número hacia abajo al entero más cercano.

```sql
SELECT FLOOR(15.9) AS redondeo_hacia_abajo;  -- Resultado: 15
```

---

### STDDEV() y VARIANCE()

Calculan la desviación estándar y la varianza de un conjunto de valores.

```sql
SELECT STDDEV(salario) AS desviacion_estandar, VARIANCE(salario) AS varianza
FROM Empleados;
```

### SUM() y AVG() acumulativos

Calculan sumas o promedios acumulativos.

```sql
-- SUM
SELECT nombre, salario,
       SUM(salario) OVER (ORDER BY fecha_contratacion) AS salario_acumulado
FROM Empleados;

-- AVG
SELECT AVG(salario) AS salario_promedio
FROM Empleados;
```

---

### POWER()

Eleva un número a una potencia específica.

```sql
SELECT POWER(2, 3) AS potencia;  -- Resultado: 8
```

## Buenas prácticas

- **Optimización:** Evita el uso excesivo de funciones en consultas grandes para no afectar el rendimiento.

- **Legibilidad:** Usa alias y formato claro para mejorar la comprensión del código.

- **Pruebas:** Verifica el resultado de las funciones en datos de prueba antes de aplicarlas en producción.

- **Documentación:** Consulta la documentación del SGBD para conocer las funciones específicas y sus parámetros.

## Ejemplos prácticos

```sql
-- Ranking de Empleados por Salario
SELECT nombre, salario,
       RANK() OVER (ORDER BY salario DESC) AS ranking
FROM Empleados;

-- Suma Acumulativa de Ventas por Mes
SELECT mes, ventas,
       SUM(ventas) OVER (ORDER BY mes) AS ventas_acumuladas
FROM Ventas;

--  Formateo de Nombres
SELECT CONCAT(UPPER(SUBSTRING(nombre, 1, 1)), LOWER(SUBSTRING(nombre, 2))) AS nombre_formateado
FROM Empleados;

-- Cálculo de Edad
SELECT nombre, fecha_nacimiento,
       EXTRACT(YEAR FROM NOW()) - EXTRACT(YEAR FROM fecha_nacimiento) AS edad
FROM Empleados;
```
