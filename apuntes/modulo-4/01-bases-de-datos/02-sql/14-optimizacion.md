<h1 align="center">Optimización</h1>

<h2>📑 Contenido</h2>

- [Optimización](#optimización)
- [Uso de índices](#uso-de-índices)
- [Normalización y desnormalización](#normalización-y-desnormalización)
- [Optimización de consultas SQL](#optimización-de-consultas-sql)
- [Particionamiento de tablas](#particionamiento-de-tablas)
- [Caché de consultas](#caché-de-consultas)
- [Herramientas para la optimización](#herramientas-para-la-optimización)

## Optimización

La optimización en bases de datos busca mejorar el rendimiento de las consultas y la eficiencia del almacenamiento. Esto es clave para manejar grandes volúmenes de datos y garantizar tiempos de respuesta adecuados en aplicaciones empresariales.

## Uso de índices

Los índices mejoran la velocidad de búsqueda en tablas grandes. Se recomienda:

- Indexar columnas utilizadas en `WHERE`, `JOIN` y `ORDER BY`.

- Evitar índices en columnas con muchos valores repetidos.

```sql
CREATE INDEX idx_nombre ON empleados (nombre);
```

## Normalización y desnormalización

- **Normalización:** Reduce la redundancia y mejora la integridad de datos.

- **Desnormalización:** Aumenta el rendimiento en consultas complejas al reducir `JOIN`.

## Optimización de consultas SQL

- Seleccionar solo las columnas necesarias (`SELECT` columnas en lugar de `SELECT *`).

- Usar `JOIN` en lugar de subconsultas cuando sea posible.

- Evitar funciones en columnas indexadas dentro de `WHERE`.

```sql
SELECT nombre, salario FROM empleados WHERE departamento_id = 5;
```

## Particionamiento de tablas

El particionamiento divide grandes volúmenes de datos en fragmentos más manejables, lo que mejora el rendimiento de las consultas

```sql
CREATE TABLE empleados_2023 PARTITION OF empleados
FOR VALUES FROM ('2023-01-01') TO ('2023-12-31');
```

## Caché de consultas

Almacenar los resultados de consultas frecuentes en memoria ayuda a reducir la carga de la base de datos.

```sql
SET GLOBAL query_cache_size = 16777216;
```

## Herramientas para la optimización

Algunas herramientas ayudan a analizar y mejorar el rendimiento de la base de datos:

- **EXPLAIN (MySQL, PostgreSQL):** Analiza la ejecución de consultas.

- **Query Store (SQL Server):** Monitorea el rendimiento de las consultas.

- **pg_stat_statements (PostgreSQL):** Rastrea consultas lentas.

```sql
EXPLAIN SELECT * FROM empleados WHERE nombre = 'Juan';
```
