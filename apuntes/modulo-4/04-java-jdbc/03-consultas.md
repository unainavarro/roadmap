<h1 align="center">Consultas y recuperación de resultados</h1>

<h2>📑 Contenido</h2>

- [Consultas y recuperación de resultados](#consultas-y-recuperación-de-resultados)
- [Uso de Statement para consultas SQL](#uso-de-statement-para-consultas-sql)
  - [Creación de un Statement](#creación-de-un-statement)
  - [Ejecución de una consulta SELECT](#ejecución-de-una-consulta-select)
- [Recuperación de resultados con ResultSet](#recuperación-de-resultados-con-resultset)
  - [Recorrer los datos con next()](#recorrer-los-datos-con-next)
  - [Acceso a datos por índice o nombre de columna](#acceso-a-datos-por-índice-o-nombre-de-columna)
- [Cierre de recursos](#cierre-de-recursos)
- [Ejemplo](#ejemplo)

## Consultas y recuperación de resultados

JDBC (Java Database Connectivity) permite a las aplicaciones Java interactuar con bases de datos. Para ejecutar consultas y recuperar resultados, se utilizan las clases `Statement` y `ResultSet`.

## Uso de Statement para consultas SQL

La clase `Statement` permite ejecutar consultas SQL dinámicas. Es adecuada para sentencias que no requieren parámetros.

### Creación de un Statement

```java
Connection conn = DriverManager.getConnection(url, usuario, contraseña);
Statement stmt = conn.createStatement();
```

---

### Ejecución de una consulta SELECT

```java
ResultSet rs = stmt.executeQuery("SELECT * FROM empleados");
```

## Recuperación de resultados con ResultSet

La clase `ResultSet` permite recorrer los resultados de una consulta.

### Recorrer los datos con next()

```java
while (rs.next()) {
    int id = rs.getInt("id");
    String nombre = rs.getString("nombre");
    System.out.println("ID: " + id + ", Nombre: " + nombre);
}
```

### Acceso a datos por índice o nombre de columna

```java
int id = rs.getInt(1);  // Por índice
String nombre = rs.getString("nombre");  // Por nombre
```

## Cierre de recursos

Es importante cerrar `ResultSet`, `Statement` y `Connection` para liberar recursos.

```java
rs.close();
stmt.close();
conn.close();
```

## Ejemplo

A continuación, se muestra un programa completo en Java que se conecta a una base de datos, ejecuta una consulta `SELECT`, inserta un nuevo registro y muestra los resultados.

```java
import java.sql.*;

public class ConexionJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/empresa";
        String usuario = "root";
        String contraseña = "password";

        try {
            // Establecer conexión
            Connection conn = DriverManager.getConnection(url, usuario, contraseña);
            Statement stmt = conn.createStatement();

            // Insertar un nuevo empleado
            String insertSQL = "INSERT INTO empleados (nombre, edad) VALUES ('Ana', 28)";
            int filasInsertadas = stmt.executeUpdate(insertSQL);
            System.out.println("Filas insertadas: " + filasInsertadas);

            // Ejecutar consulta SELECT
            String selectSQL = "SELECT * FROM empleados";
            ResultSet rs = stmt.executeQuery(selectSQL);

            // Mostrar resultados
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad);
            }

            // Cerrar recursos
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```
