<h1 align="center">Diseño físico</h1>

<h2>📑 Contenido</h2>

- [Diseño físico](#diseño-físico)
- [Consideraciones para el diseño físico](#consideraciones-para-el-diseño-físico)
  - [Selección del SGBD](#selección-del-sgbd)
  - [Optimización del rendimiento](#optimización-del-rendimiento)
  - [Seguridad y acceso](#seguridad-y-acceso)
  - [Escalabilidad](#escalabilidad)
  - [Backup y recuperación](#backup-y-recuperación)
- [Creación de índices](#creación-de-índices)
  - [Tipos de índices](#tipos-de-índices)
  - [Consideraciones para la creación de índices](#consideraciones-para-la-creación-de-índices)
  - [Ejemplo](#ejemplo)
- [Particionamiento y almacenamiento](#particionamiento-y-almacenamiento)
  - [Particionamiento](#particionamiento)
    - [Tipos de particionamiento](#tipos-de-particionamiento)
    - [Beneficios](#beneficios)
    - [Ejemplo](#ejemplo-1)
  - [Almacenamiento](#almacenamiento)
    - [Consideraciones](#consideraciones)

## Diseño físico

El diseño físico es la etapa final en el proceso de desarrollo de una base de datos, donde se lleva a cabo la implementación real del modelo lógico en un sistema de gestión de bases de datos (SGBD). En esta fase, se toman decisiones técnicas que afectan el rendimiento, la escalabilidad y la eficiencia del sistema.

## Consideraciones para el diseño físico

El diseño físico implica adaptar el modelo lógico a las características específicas del SGBD y del hardware subyacente. Algunas de las consideraciones más importantes incluyen:

### Selección del SGBD

Elegir el sistema de gestión de bases de datos más adecuado para las necesidades del proyecto (por ejemplo, MySQL, PostgreSQL, Oracle, SQL Server, MongoDB).

Considerar factores como el tipo de datos (estructurados, no estructurados), el volumen de datos, la concurrencia y los requisitos de rendimiento.

### Optimización del rendimiento

Asegurar que las consultas se ejecuten de manera eficiente mediante la creación de índices, la optimización de consultas y el uso de técnicas de particionamiento.

Considerar el uso de cachés y balanceadores de carga para mejorar el rendimiento en sistemas de alta concurrencia.

### Seguridad y acceso

Implementar medidas de seguridad, como autenticación, autorización y cifrado de datos.

Definir roles y permisos para controlar el acceso a los datos.

### Escalabilidad

Diseñar la base de datos para que pueda crecer en tamaño y capacidad sin afectar el rendimiento.

Considerar el uso de técnicas como la replicación y el sharding (fragmentación) para distribuir la carga de trabajo.

### Backup y recuperación

Establecer políticas de backup y recuperación para proteger los datos en caso de fallos o desastres.

Considerar la frecuencia de los backups, el almacenamiento de copias de seguridad y los tiempos de recuperación.

## Creación de índices

Los índices son estructuras que mejoran la velocidad de las operaciones de búsqueda y recuperación de datos en una base de datos. Sin embargo, también pueden afectar el rendimiento de las operaciones de inserción, actualización y eliminación, por lo que es importante usarlos de manera estratégica.

### Tipos de índices

**Índices Únicos:** Garantizan que no haya valores duplicados en la columna indexada.

- **Índices Compuestos:** Se crean sobre múltiples columnas.

- **Índices de Texto Completo:** Permiten búsquedas eficientes en columnas de texto.

- **Índices Espaciales:** Optimizan las consultas sobre datos geográficos.

### Consideraciones para la creación de índices

- **Columnas Candidatas:** Indexar columnas que se utilizan frecuentemente en cláusulas WHERE, JOIN y ORDER BY.

- **Impacto en el Rendimiento:** Evaluar el equilibrio entre la mejora en las consultas de lectura y el impacto en las operaciones de escritura.

- **Mantenimiento:** Los índices requieren mantenimiento, por lo que es importante monitorear su uso y eficiencia.

### Ejemplo

En una tabla Ventas, se podría crear un índice en la columna FechaVenta para acelerar las consultas que filtran por fecha.

```sql
CREATE INDEX idx_fecha_venta ON Ventas(FechaVenta);
```

## Particionamiento y almacenamiento

El particionamiento y el almacenamiento son técnicas que permiten gestionar grandes volúmenes de datos de manera eficiente, mejorando el rendimiento y la mantenibilidad de la base de datos.

### Particionamiento

Dividir una tabla en partes más pequeñas y manejables, llamadas particiones, que se almacenan y gestionan por separado.

#### Tipos de particionamiento

- **Particionamiento Horizontal:** Divide las filas de una tabla en función de un criterio (por ejemplo, por rango de fechas o por región).

- **Particionamiento Vertical:** Divide las columnas de una tabla en diferentes tablas o particiones.

#### Beneficios

- Mejora el rendimiento de las consultas al reducir la cantidad de datos que se deben escanear.

- Facilita la gestión y el mantenimiento de grandes volúmenes de datos.

#### Ejemplo

Particionar la tabla Ventas por año para mejorar el rendimiento de las consultas históricas.

```sql
CREATE TABLE Ventas (
    ID_Venta INT PRIMARY KEY,
    FechaVenta DATE,
    Monto DECIMAL(10, 2)
) PARTITION BY RANGE (YEAR(FechaVenta)) (
    PARTITION p2020 VALUES LESS THAN (2021),
    PARTITION p2021 VALUES LESS THAN (2022),
    PARTITION p2022 VALUES LESS THAN (2023)
);
```

### Almacenamiento

Se refiere a cómo se almacenan físicamente los datos en el disco y cómo se gestionan los recursos de almacenamiento.

#### Consideraciones

- **Tipo de Almacenamiento:** Elegir entre discos duros (HDD), unidades de estado sólido (SSD) o almacenamiento en la nube, según los requisitos de rendimiento y costo.

- **Estrategias de Almacenamiento:** Utilizar técnicas como RAID (Redundant Array of Independent Disks) para mejorar la redundancia y el rendimiento.

- **Compresión de Datos:** Reducir el tamaño de los datos almacenados para ahorrar espacio y mejorar el rendimiento de las operaciones de lectura/escritura.
