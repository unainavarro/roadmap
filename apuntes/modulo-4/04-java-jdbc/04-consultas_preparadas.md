<h1 align="center">Consultas Preparadas</h1>

<h2>📑 Contenido</h2>

- [Consultas preparadas](#consultas-preparadas)
- [¿Qué es PreparedStatement?](#qué-es-preparedstatement)
  - [Definición](#definición)
  - [Ventajas de PreparedStatement](#ventajas-de-preparedstatement)
- [Creación y uso de PreparedStatement](#creación-y-uso-de-preparedstatement)
  - [Crear un PreparedStatement](#crear-un-preparedstatement)
  - [Establecer parámetros](#establecer-parámetros)
  - [Ejecutar la consulta](#ejecutar-la-consulta)
- [Ejemplo completo de PreparedStatement](#ejemplo-completo-de-preparedstatement)

## Consultas preparadas

Las consultas preparadas son una característica poderosa de JDBC que permite ejecutar consultas SQL de manera segura y eficiente. A diferencia de las consultas estáticas con `Statement`, las consultas preparadas utilizan `PreparedStatement`, que ofrece ventajas como la prevención de inyecciones SQL, la reutilización de consultas y un mejor rendimiento.

## ¿Qué es PreparedStatement?

### Definición

`PreparedStatement` es una interfaz en JDBC que extiende `Statement`. Permite ejecutar consultas SQL precompiladas, donde los parámetros se representan con marcadores de posición (`?`). Esto mejora la seguridad y el rendimiento, especialmente cuando se ejecuta la misma consulta múltiples veces con diferentes valores.

### Ventajas de PreparedStatement

- **Prevención de inyecciones SQL:** Al usar parámetros, se evita que los valores ingresados por el usuario se interpreten como parte de la consulta SQL.

- **Reutilización de consultas:** La consulta se compila una vez y se puede ejecutar múltiples veces con diferentes parámetros.

- **Mejor rendimiento:** La precompilación reduce el tiempo de ejecución en consultas repetidas.

## Creación y uso de PreparedStatement

### Crear un PreparedStatement

Para crear un `PreparedStatement`, se utiliza el método `prepareStatement()` de la interfaz `Connection`. La consulta SQL incluye marcadores de posición (`?`) para los parámetros.

```java
String sql = "SELECT * FROM Empleados WHERE salario > ?";
PreparedStatement preparedStatement = conexion.prepareStatement(sql);
```

### Establecer parámetros

Los parámetros en un `PreparedStatement` se establecen utilizando métodos como `setInt`, `setString`, `setDouble`, etc., según el tipo de dato.

Métodos Comunes:

- **setInt(int parameterIndex, int value):** Para valores enteros.

- **setString(int parameterIndex, String value):** Para cadenas de texto.

- **setDouble(int parameterIndex, double value):** Para valores decimales.

- **setDate(int parameterIndex, Date value):** Para fechas.

```java
preparedStatement.setDouble(1, 3000.00); // Establece el primer parámetro (salario > 3000)
```

### Ejecutar la consulta

Una vez establecidos los parámetros, la consulta se ejecuta utilizando métodos como `executeQuery()` (para consultas que devuelven resultados) o `executeUpdate()` (para consultas que modifican datos).

```java
// Ejemplo de executeQuery():
ResultSet resultado = preparedStatement.executeQuery();

// Ejemplo de executeUpdate():
String sql = "UPDATE Empleados SET salario = ? WHERE id = ?";
PreparedStatement preparedStatement = conexion.prepareStatement(sql);
preparedStatement.setDouble(1, 3500.00); // Nuevo salario
preparedStatement.setInt(2, 1);         // ID del empleado
int filasAfectadas = preparedStatement.executeUpdate();
```

## Ejemplo completo de PreparedStatement

Consulta con Parámetros

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EjemploPreparedStatement {
    public static void main(String[] args) {
        // Datos de conexión
        String url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
        String usuario = "root";
        String contraseña = "contraseña";

        Connection conexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultado = null;

        try {
            // Paso 1: Establecer la conexión
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Paso 2: Crear un PreparedStatement
            String sql = "SELECT * FROM Empleados WHERE salario > ?";
            preparedStatement = conexion.prepareStatement(sql);

            // Paso 3: Establecer parámetros
            preparedStatement.setDouble(1, 3000.00);

            // Paso 4: Ejecutar la consulta
            resultado = preparedStatement.executeQuery();

            // Paso 5: Procesar los resultados
            while (resultado.next()) {
                System.out.println("ID: " + resultado.getInt("id") +
                                   ", Nombre: " + resultado.getString("nombre") +
                                   ", Salario: " + resultado.getDouble("salario"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Paso 6: Cerrar recursos
            try {
                if (resultado != null) resultado.close();
                if (preparedStatement != null) preparedStatement.close();
                if (conexion != null) conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
```
