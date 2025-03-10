<h1 align="center">Excepciones en JDBC</h1>

<h2>📑 Contenido</h2>

- [Excepciones en JDBC](#excepciones-en-jdbc)
- [¿Qué es SQLException?](#qué-es-sqlexception)
  - [Causas comunes de SQLException](#causas-comunes-de-sqlexception)
- [Métodos de SQLException](#métodos-de-sqlexception)
  - [getMessage()](#getmessage)
  - [getErrorCode()](#geterrorcode)
  - [getSQLState()](#getsqlstate)
  - [getNextException()](#getnextexception)
- [Manejo de SQLException](#manejo-de-sqlexception)
  - [Bloque try-catch](#bloque-try-catch)
  - [Bloque finally](#bloque-finally)
  - [try-with-resources](#try-with-resources)
- [Buenas Prácticas](#buenas-prácticas)
- [Ejemplo: manejo de SQLException](#ejemplo-manejo-de-sqlexception)

## Excepciones en JDBC

En el desarrollo de aplicaciones que interactúan con bases de datos, es fundamental manejar adecuadamente los errores que pueden ocurrir durante la ejecución de operaciones. En JDBC, la clase `SQLException` es la principal excepción que se lanza cuando ocurre un problema relacionado con la base de datos.

## ¿Qué es SQLException?

`SQLException` es una excepción verificada que se lanza cuando ocurre un error al interactuar con una base de datos. Esta excepción proporciona información detallada sobre el problema, como un mensaje de error, un código de error y un estado SQL.

### Causas comunes de SQLException

- Errores de conexión (por ejemplo, base de datos no disponible).

- Errores de sintaxis en consultas SQL.

- Violaciones de restricciones (por ejemplo, claves primarias duplicadas).

- Problemas de permisos (por ejemplo, acceso denegado a una tabla).

## Métodos de SQLException

La clase `SQLException` proporciona varios métodos para obtener información sobre el error:

### getMessage()

Devuelve un mensaje descriptivo del error.

```java
try {
    // Operación JDBC
} catch (SQLException e) {
    System.out.println("Error: " + e.getMessage());
}
```

---

### getErrorCode()

Devuelve un código de error específico del proveedor de la base de datos.

```java
try {
    // Operación JDBC
} catch (SQLException e) {
    System.out.println("Código de error: " + e.getErrorCode());
}
```

---

### getSQLState()

Devuelve el estado SQL (una cadena de 5 caracteres) que sigue el estándar X/Open SQL.

```java
try {
    // Operación JDBC
} catch (SQLException e) {
    System.out.println("Estado SQL: " + e.getSQLState());
}
```

---

### getNextException()

Devuelve la siguiente excepción en la cadena de excepciones (útil cuando hay múltiples errores).

```java
try {
    // Operación JDBC
} catch (SQLException e) {
    while (e != null) {
        System.out.println("Error: " + e.getMessage());
        e = e.getNextException();
    }
}
```

## Manejo de SQLException

### Bloque try-catch

El manejo de `SQLException` se realiza utilizando bloques `try-catch`. Esto permite capturar la excepción y tomar acciones adecuadas, como registrar el error, notificar al usuario o intentar una recuperación.

```java
try {
    Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
    Statement statement = conexion.createStatement();
    ResultSet resultado = statement.executeQuery("SELECT * FROM Empleados");
    // Procesar resultados
} catch (SQLException e) {
    System.err.println("Error de base de datos: " + e.getMessage());
    System.err.println("Código de error: " + e.getErrorCode());
    System.err.println("Estado SQL: " + e.getSQLState());
}
```

---

### Bloque finally

El bloque `finally` se utiliza para liberar recursos (como conexiones, statements y result sets) independientemente de si ocurrió una excepción o no.

```java
Connection conexion = null;
Statement statement = null;
ResultSet resultado = null;

try {
    conexion = DriverManager.getConnection(url, usuario, contraseña);
    statement = conexion.createStatement();
    resultado = statement.executeQuery("SELECT * FROM Empleados");
    // Procesar resultados
} catch (SQLException e) {
    System.err.println("Error de base de datos: " + e.getMessage());
} finally {
    try {
        if (resultado != null) resultado.close();
        if (statement != null) statement.close();
        if (conexion != null) conexion.close();
    } catch (SQLException e) {
        System.err.println("Error al cerrar recursos: " + e.getMessage());
    }
}
```

---

### try-with-resources

En Java 7 o superior, se puede usar `try-with-resources` para garantizar el cierre automático de recursos que implementan `AutoCloseable` (como `Connection`, `Statement` y `ResultSet`).

```java
try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
     Statement statement = conexion.createStatement();
     ResultSet resultado = statement.executeQuery("SELECT * FROM Empleados")) {
    // Procesar resultados
} catch (SQLException e) {
    System.err.println("Error de base de datos: " + e.getMessage());
}
```

## Buenas Prácticas

- **Registrar errores:** Usar un sistema de logging (como Log4j o SLF4J) para registrar errores en lugar de imprimirlos en la consola.

- **Mensajes claros:** Proporcionar mensajes de error descriptivos y útiles para el usuario o el administrador.

- **Recuperación:** Implementar estrategias de recuperación, como reintentar la operación o revertir transacciones.

- **Cierre de recursos:** Asegurarse de cerrar todos los recursos en un bloque `finally` o usar `try-with-resources`.

- **Evitar excepciones genéricas:** Capturar `SQLException` específicamente en lugar de usar `Exception` para manejar solo errores relacionados con la base de datos.

## Ejemplo: manejo de SQLException

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class EjemploSQLException {
    public static void main(String[] args) {
        // Datos de conexión
        String url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
        String usuario = "root";
        String contraseña = "contraseña";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             ResultSet resultado = statement.executeQuery("SELECT * FROM Empleados")) {

            // Procesar resultados
            while (resultado.next()) {
                System.out.println("ID: " + resultado.getInt("id") +
                                   ", Nombre: " + resultado.getString("nombre") +
                                   ", Salario: " + resultado.getDouble("salario"));
            }
        } catch (SQLException e) {
            System.err.println("Error de base de datos:");
            System.err.println("Mensaje: " + e.getMessage());
            System.err.println("Código de error: " + e.getErrorCode());
            System.err.println("Estado SQL: " + e.getSQLState());

            // Manejar excepciones encadenadas
            while (e.getNextException() != null) {
                e = e.getNextException();
                System.err.println("Excepción adicional:");
                System.err.println("Mensaje: " + e.getMessage());
                System.err.println("Código de error: " + e.getErrorCode());
                System.err.println("Estado SQL: " + e.getSQLState());
            }
        }
    }
}
```
