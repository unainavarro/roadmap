<h1 align="center">Procedimientos Almacenados en JDBC (CallableStatement)</h1>

<h2>📑 Contenido</h2>

- [Procedimientos almacenados en JDBC (CallableStatement)](#procedimientos-almacenados-en-jdbc-callablestatement)
- [¿Qué es un procedimiento almacenado?](#qué-es-un-procedimiento-almacenado)
  - [Ventajas de los procedimientos almacenados](#ventajas-de-los-procedimientos-almacenados)
- [Uso de CallableStatement](#uso-de-callablestatement)
  - [¿Qué es CallableStatement?](#qué-es-callablestatement)
  - [Sintaxis para llamar a un procedimiento almacenado](#sintaxis-para-llamar-a-un-procedimiento-almacenado)
- [Ejecución de procedimientos almacenados](#ejecución-de-procedimientos-almacenados)
  - [Crear un CallableStatement](#crear-un-callablestatement)
  - [Establecer parámetros de entrada](#establecer-parámetros-de-entrada)
  - [Registrar parámetros de salida](#registrar-parámetros-de-salida)
  - [Ejecutar el procedimiento](#ejecutar-el-procedimiento)
  - [Obtener parámetros de salida](#obtener-parámetros-de-salida)
- [Ejemplo completo de CallableStatement](#ejemplo-completo-de-callablestatement)

## Procedimientos almacenados en JDBC (CallableStatement)

Los procedimientos almacenados son bloques de código SQL almacenados en la base de datos que pueden ser invocados desde una aplicación. En JDBC, la interfaz `CallableStatement` se utiliza para ejecutar procedimientos almacenados.

## ¿Qué es un procedimiento almacenado?

Un procedimiento almacenado es un conjunto de sentencias SQL precompiladas y almacenadas en la base de datos. Puede aceptar parámetros de entrada, realizar operaciones y devolver resultados.

### Ventajas de los procedimientos almacenados

- **Reutilización:** El código SQL se escribe una vez y se puede ejecutar múltiples veces.

- **Seguridad:** Limita el acceso directo a las tablas, ya que los usuarios solo pueden ejecutar procedimientos.

- **Rendimiento:** Al estar precompilados, los procedimientos almacenados suelen ejecutarse más rápido que las consultas dinámicas.

## Uso de CallableStatement

### ¿Qué es CallableStatement?

CallableStatement es una interfaz en JDBC que extiende `PreparedStatement`. Se utiliza para ejecutar procedimientos almacenados en la base de datos. Los procedimientos pueden tener parámetros de entrada, salida o ambos.

### Sintaxis para llamar a un procedimiento almacenado

La sintaxis para llamar a un procedimiento almacenado varía según la base de datos, pero generalmente sigue este formato:

```sql
{call nombre_procedimiento(?, ?, ...)}
```

## Ejecución de procedimientos almacenados

### Crear un CallableStatement

Para crear un `CallableStatement`, se utiliza el método `prepareCall()` de la interfaz `Connection`.

```java
String sql = "{call obtener_empleados_por_salario(?)}";
CallableStatement callableStatement = conexion.prepareCall(sql);
```

### Establecer parámetros de entrada

Los parámetros de entrada se establecen utilizando métodos como `setInt`, `setString`, `setDouble`, etc., similares a `PreparedStatement`.

### Registrar parámetros de salida

Si el procedimiento almacenado devuelve parámetros de salida, se deben registrar utilizando el método `registerOutParameter()`.

```java
callableStatement.registerOutParameter(2, Types.INTEGER); // Registra el segundo parámetro como salida (tipo INTEGER)
```

### Ejecutar el procedimiento

El procedimiento se ejecuta utilizando el método `execute()` o `executeQuery()` (si devuelve un conjunto de resultados).

```java
callableStatement.execute();
```

### Obtener parámetros de salida

Después de ejecutar el procedimiento, los parámetros de salida se pueden recuperar utilizando métodos como `getInt`, `getString`, etc.

```java
int totalEmpleados = callableStatement.getInt(2); // Obtiene el segundo parámetro (salida)
```

## Ejemplo completo de CallableStatement

Procedimiento Almacenado en MySQL

Supongamos que tenemos el siguiente procedimiento almacenado en MySQL:

```java
CREATE PROCEDURE obtener_empleados_por_salario(IN salario_minimo DOUBLE, OUT total INT)
BEGIN
    SELECT COUNT(*) INTO total FROM Empleados WHERE salario > salario_minimo;
END;
```

Llamada al procedimiento desde JDBC

```java
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class EjemploCallableStatement {
    public static void main(String[] args) {
        // Datos de conexión
        String url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
        String usuario = "root";
        String contraseña = "contraseña";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            // Paso 1: Crear un CallableStatement
            String sql = "{call obtener_empleados_por_salario(?, ?)}";
            CallableStatement callableStatement = conexion.prepareCall(sql);

            // Paso 2: Establecer parámetros de entrada
            callableStatement.setDouble(1, 3000.00); // salario_minimo = 3000

            // Paso 3: Registrar parámetros de salida
            callableStatement.registerOutParameter(2, Types.INTEGER); // total (salida)

            // Paso 4: Ejecutar el procedimiento
            callableStatement.execute();

            // Paso 5: Obtener parámetros de salida
            int totalEmpleados = callableStatement.getInt(2);
            System.out.println("Total de empleados con salario > 3000: " + totalEmpleados);

            // Paso 6: Cerrar el CallableStatement
            callableStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
