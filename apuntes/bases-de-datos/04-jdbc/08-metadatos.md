<h1 align="center">Metadatos en JDBC (DatabaseMetaData y ResultSetMetaData)</h1>

<h2>📑 Contenido</h2>

- [Metadatos en JDBC (DatabaseMetaData y ResultSetMetaData)](#metadatos-en-jdbc-databasemetadata-y-resultsetmetadata)
- [¿Qué son los metadatos en JDBC?](#qué-son-los-metadatos-en-jdbc)
  - [Interfaces principales](#interfaces-principales)
- [DatabaseMetaData](#databasemetadata)
  - [¿Qué es DatabaseMetaData?](#qué-es-databasemetadata)
  - [Obtener DatabaseMetaData](#obtener-databasemetadata)
  - [Métodos comunes de DatabaseMetaData](#métodos-comunes-de-databasemetadata)
    - [Información General](#información-general)
    - [Información sobre Tablas](#información-sobre-tablas)
    - [Información sobre Procedimientos Almacenados](#información-sobre-procedimientos-almacenados)
  - [Ejemplo de uso de DatabaseMetaData](#ejemplo-de-uso-de-databasemetadata)
- [ResultSetMetaData](#resultsetmetadata)
  - [¿Qué es ResultSetMetaData?](#qué-es-resultsetmetadata)
  - [Obtener ResultSetMetaData](#obtener-resultsetmetadata)
  - [Métodos Comunes de ResultSetMetaData](#métodos-comunes-de-resultsetmetadata)
  - [Ejemplo de uso de ResultSetMetaData](#ejemplo-de-uso-de-resultsetmetadata)
- [Buenas Prácticas en el uso de Metadatos](#buenas-prácticas-en-el-uso-de-metadatos)

## Metadatos en JDBC (DatabaseMetaData y ResultSetMetaData)

Los metadatos son datos que describen la estructura y las propiedades de otros datos. En JDBC, los metadatos son esenciales para obtener información sobre la base de datos (como tablas, columnas y procedimientos almacenados) y sobre los resultados de las consultas (como nombres de columnas y tipos de datos).

## ¿Qué son los metadatos en JDBC?

Los metadatos en JDBC proporcionan información sobre:

- La estructura de la base de datos (tablas, columnas, índices, etc.).

- Los resultados de las consultas (nombres de columnas, tipos de datos, etc.).

### Interfaces principales

- **DatabaseMetaData:** Proporciona información sobre la base de datos.

- **ResultSetMetaData:** Proporciona información sobre los resultados de una consulta.

## DatabaseMetaData

### ¿Qué es DatabaseMetaData?

`DatabaseMetaData` es una interfaz que proporciona información detallada sobre la base de datos, como:

- Lista de tablas y vistas.

- Columnas de una tabla.

- Procedimientos almacenados.

- Información sobre el soporte de características (transacciones, tipos de datos, etc.).

### Obtener DatabaseMetaData

Se obtiene a través de la conexión a la base de datos.

```java
DatabaseMetaData metaData = conexion.getMetaData();
```

### Métodos comunes de DatabaseMetaData

#### Información General

- **getDatabaseProductName():** Devuelve el nombre del producto de la base de datos (por ejemplo, "MySQL").

- **getDatabaseProductVersion():** Devuelve la versión de la base de datos.

#### Información sobre Tablas

- **getTables(String catalog, String schemaPattern, String tableNamePattern, String[] types):** Devuelve un `ResultSet` con información sobre las tablas que coinciden con los criterios.

- **getColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern):** Devuelve un `ResultSet` con información sobre las columnas de una tabla.

#### Información sobre Procedimientos Almacenados

- **getProcedures(String catalog, String schemaPattern, String procedureNamePattern):** Devuelve un ResultSet con información sobre los procedimientos almacenados.

### Ejemplo de uso de DatabaseMetaData

```java
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class EjemploDatabaseMetaData {
    public static void main(String[] args) {
        // Datos de conexión
        String url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
        String usuario = "root";
        String contraseña = "contraseña";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            // Obtener DatabaseMetaData
            DatabaseMetaData metaData = conexion.getMetaData();

            // Información general
            System.out.println("Nombre de la base de datos: " + metaData.getDatabaseProductName());
            System.out.println("Versión de la base de datos: " + metaData.getDatabaseProductVersion());

            // Listar tablas
            ResultSet tablas = metaData.getTables(null, null, "%", new String[]{"TABLE"});
            System.out.println("\nTablas en la base de datos:");
            while (tablas.next()) {
                System.out.println("Nombre de la tabla: " + tablas.getString("TABLE_NAME"));
            }

            // Listar columnas de una tabla
            ResultSet columnas = metaData.getColumns(null, null, "Empleados", "%");
            System.out.println("\nColumnas de la tabla Empleados:");
            while (columnas.next()) {
                System.out.println("Nombre de la columna: " + columnas.getString("COLUMN_NAME") +
                                   ", Tipo de dato: " + columnas.getString("TYPE_NAME"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

## ResultSetMetaData

### ¿Qué es ResultSetMetaData?

`ResultSetMetaData` es una interfaz que proporciona información sobre las columnas de un `ResultSet`, como:

- Nombres de columnas.

- Tipos de datos.

- Precisión y escala (para tipos numéricos).

- Si una columna permite valores nulos.

### Obtener ResultSetMetaData

Se obtiene a través de un `ResultSet`.

```java
ResultSetMetaData metaData = resultado.getMetaData();
```

### Métodos Comunes de ResultSetMetaData

Información sobre Columnas

- **getColumnCount():** Devuelve el número de columnas en el `ResultSet`.

- **getColumnName(int column):** Devuelve el nombre de la columna en la posición especificada.

- **getColumnTypeName(int column):** Devuelve el tipo de dato de la columna.

- **isNullable(int column):** Indica si la columna permite valores nulos.

### Ejemplo de uso de ResultSetMetaData

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class EjemploResultSetMetaData {
    public static void main(String[] args) {
        // Datos de conexión
        String url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
        String usuario = "root";
        String contraseña = "contraseña";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             ResultSet resultado = statement.executeQuery("SELECT * FROM Empleados")) {

            // Obtener ResultSetMetaData
            ResultSetMetaData metaData = resultado.getMetaData();

            // Información sobre columnas
            int columnCount = metaData.getColumnCount();
            System.out.println("Número de columnas: " + columnCount);

            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Columna " + i + ":");
                System.out.println("  Nombre: " + metaData.getColumnName(i));
                System.out.println("  Tipo de dato: " + metaData.getColumnTypeName(i));
                System.out.println("  Permite nulos: " + (metaData.isNullable(i) == ResultSetMetaData.columnNullable ? "Sí" : "No"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

## Buenas Prácticas en el uso de Metadatos

- **Optimización:** Usar metadatos solo cuando sea necesario, ya que su obtención puede ser costosa en términos de rendimiento.

- **Validación:** Utilizar metadatos para validar la estructura de la base de datos antes de ejecutar consultas.

- **Documentación:** Documentar el uso de metadatos en el código para facilitar su mantenimiento.
