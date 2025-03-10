<h1 align="center">Consultas de Unión</h1>

<h2>📑 Contenido</h2>

- [Consultas de unión](#consultas-de-unión)
- [¿Qué son las consultas de unión?](#qué-son-las-consultas-de-unión)
- [Sintaxis de las consultas de unión](#sintaxis-de-las-consultas-de-unión)
  - [UNION](#union)
  - [UNION ALL](#union-all)
- [Diferencias entre UNION y UNION ALL](#diferencias-entre-union-y-union-all)
- [Ordenamiento en consultas de unión](#ordenamiento-en-consultas-de-unión)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplos prácticos](#ejemplos-prácticos)
  - [Combinar listas de nombres](#combinar-listas-de-nombres)
  - [Combinar datos de múltiples tablas](#combinar-datos-de-múltiples-tablas)
  - [Combinar consultas con condiciones](#combinar-consultas-con-condiciones)

## Consultas de unión

Las consultas de unión son operaciones en SQL que permiten combinar los resultados de dos o más consultas en un solo conjunto de resultados. Estas consultas son útiles cuando se necesita consolidar datos de diferentes tablas o realizar operaciones complejas que involucran múltiples fuentes de datos.

## ¿Qué son las consultas de unión?

Las consultas de unión permiten combinar filas de dos o más tablas o consultas en un solo conjunto de resultados. Para que esto sea posible, las consultas deben cumplir con las siguientes condiciones:

- Deben tener el mismo número de columnas en el `SELECT`.

- Las columnas correspondientes deben tener tipos de datos compatibles.

Existen dos tipos principales de uniones en SQL:

- **UNION:** Combina los resultados de dos consultas, eliminando duplicados.

- **UNION ALL:** Combina los resultados de dos consultas, incluyendo duplicados.

## Sintaxis de las consultas de unión

### UNION

Combina los resultados de dos consultas y elimina filas duplicadas.

```sql
-- sintaxis
SELECT columna1, columna2, ...
FROM tabla1
UNION
SELECT columna1, columna2, ...
FROM tabla2;

-- ejemplo
SELECT nombre FROM Empleados
UNION
SELECT nombre FROM Clientes;
```

---

### UNION ALL

Combina los resultados de dos consultas, incluyendo filas duplicadas.

```sql
-- sintaxis
SELECT columna1, columna2, ...
FROM tabla1
UNION ALL
SELECT columna1, columna2, ...
FROM tabla2;

-- ejemplo
SELECT nombre FROM Empleados
UNION ALL
SELECT nombre FROM Clientes;
```

---

## Diferencias entre UNION y UNION ALL

| Característica  | UNION                                  | UNION ALL                           |
| --------------- | -------------------------------------- | ----------------------------------- |
| Duplicados      | Elimina filas duplicadas.              | Incluye filas duplicadas.           |
| Rendimiento     | Más lento (elimina duplicados).        | Más rápido (no elimina duplicados). |
| Uso recomendado | Cuando se necesitan resultados únicos. | Cuando se aceptan duplicados.       |

## Ordenamiento en consultas de unión

Puedes ordenar los resultados de una consulta de unión utilizando la cláusula ORDER BY al final de la consulta.

```sql
SELECT nombre FROM Empleados
UNION
SELECT nombre FROM Clientes
ORDER BY nombre;
```

## Buenas prácticas

- **Compatibilidad de columnas:** Asegúrate de que las consultas tengan el mismo número de columnas y tipos de datos compatibles.

- **Alias de columnas:** Usa alias para dar nombres descriptivos a las columnas resultantes.

- **Ordenamiento:** Si necesitas ordenar los resultados, usa ORDER BY al final de la consulta.

- **Rendimiento:** Prefiere UNION ALL si no necesitas eliminar duplicados, ya que es más eficiente.

## Ejemplos prácticos

### Combinar listas de nombres

Supongamos que tienes dos tablas: Empleados y Clientes, y deseas obtener una lista única de todos los nombres.

**Usando UNION:**

```sql
SELECT nombre FROM Empleados
UNION
SELECT nombre FROM Clientes;
```

**Usando UNION ALL:**

```sql
SELECT nombre FROM Empleados
UNION ALL
SELECT nombre FROM Clientes;
```

### Combinar datos de múltiples tablas

Supongamos que tienes dos tablas: Ventas2022 y Ventas2023, y deseas obtener una lista consolidada de todas las ventas.

**Usando UNION:**

```sql
SELECT producto, cantidad FROM Ventas2022
UNION
SELECT producto, cantidad FROM Ventas2023;
```

**Usando UNION ALL:**

```sql
SELECT producto, cantidad FROM Ventas2022
UNION ALL
SELECT producto, cantidad FROM Ventas2023;
```

### Combinar consultas con condiciones

Puedes combinar consultas con condiciones específicas.

```sql
SELECT nombre, 'Empleado' AS tipo FROM Empleados WHERE salario > 3000
UNION
SELECT nombre, 'Cliente' AS tipo FROM Clientes WHERE ciudad = 'Madrid';
```
