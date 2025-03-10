<h1 align="center">Vistas</h1>

<h2>📑 Contenido</h2>

- [Vistas](#vistas)
- [Creación de una vista](#creación-de-una-vista)
- [Uso de vistas](#uso-de-vistas)
- [Modificación de vistas](#modificación-de-vistas)
- [Eliminación de vistas](#eliminación-de-vistas)
- [Ventajas de las Vistas](#ventajas-de-las-vistas)

## Vistas

Las vistas en bases de datos son estructuras virtuales que representan el resultado de una consulta almacenada. No contienen datos por sí mismas, sino que muestran información basada en las tablas subyacentes. Son útiles para simplificar consultas, mejorar la seguridad y facilitar la administración de datos.

## Creación de una vista

Para crear una vista en SQL, se usa la sentencia `CREATE VIEW`.

```sql
-- sintaxis
CREATE VIEW nombre_vista AS
SELECT columna1, columna2
FROM tabla
WHERE condición;

-- ejemplo
CREATE VIEW empleados_activos AS
SELECT id, nombre, departamento
FROM empleados
WHERE estado = 'activo';
```

Esta vista permite consultar solo los empleados activos sin acceder directamente a la tabla empleados.

## Uso de vistas

Las vistas pueden ser consultadas de la misma forma que una tabla normal.

```sql
SELECT * FROM empleados_activos;
```

## Modificación de vistas

Podemos modificar una vista con `ALTER VIEW`.

```sql
ALTER VIEW empleados_activos AS
SELECT id, nombre, departamento, salario
FROM empleados
WHERE estado = 'activo';
```

## Eliminación de vistas

Para eliminar una vista, se usa `DROP VIEW`.

```sql
DROP VIEW empleados_activos;
```

## Ventajas de las Vistas

Seguridad: Se pueden ocultar columnas sensibles restringiendo el acceso directo a las tablas.

- **Simplicidad:** Facilita la consulta de datos sin escribir consultas complejas repetitivamente.

- **Independencia de Datos:** Permite realizar cambios en la estructura de las tablas sin afectar las consultas de los usuarios.
