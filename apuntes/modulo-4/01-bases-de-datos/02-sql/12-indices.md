<h1 align="center">Índices</h1>

<h2>📑 Contenido</h2>

- [Índices](#índices)
- [Tipos de índices](#tipos-de-índices)
- [Creación de un índice](#creación-de-un-índice)
- [Eliminación de un índice](#eliminación-de-un-índice)
  - [Ventajas de los índices](#ventajas-de-los-índices)
  - [Desventajas de los índices](#desventajas-de-los-índices)

## Índices

Los índices en bases de datos son estructuras que mejoran la velocidad de recuperación de datos. Funcionan como índices en un libro, permitiendo localizar registros de manera más eficiente sin necesidad de recorrer toda la tabla.

## Tipos de índices

Existen varios tipos de índices que optimizan diferentes operaciones:

- **Índices primarios:** Se crean automáticamente en la clave primaria de una tabla.

- **Índices únicos:** Aseguran que los valores de una columna sean únicos.

- **Índices compuestos:** Se crean sobre múltiples columnas.

- **Índices de texto completo:** Mejoran la búsqueda en campos de texto.

- **Índices hash:** Utilizados en bases de datos NoSQL para búsquedas rápidas.

## Creación de un índice

Podemos crear un índice utilizando la sentencia `CREATE INDEX`.

```sql
-- sintaxis
CREATE INDEX nombre_indice ON tabla (columna);

-- ejemplo
CREATE INDEX idx_nombre ON empleados (nombre);
```

Este índice acelera las búsquedas por el campo nombre en la tabla empleados.

## Eliminación de un índice

Si un índice ya no es necesario, podemos eliminarlo con `DROP INDEX`.

```sql
DROP INDEX idx_nombre;
```

### Ventajas de los índices

- Mejoran el rendimiento de las consultas `SELECT`.

- Aceleran las búsquedas en tablas grandes.

- Facilitan la ejecución de joins entre tablas.

### Desventajas de los índices

- Aumentan el uso de almacenamiento.

- Pueden ralentizar operaciones `INSERT`, `UPDATE` y `DELETE`.
