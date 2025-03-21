<h1 align="center">Conexión en JDBC</h1>

<h2>📑 Contenido</h2>

- [Conexión en JDBC](#conexión-en-jdbc)
- [Establecer una conexión con DriverManager](#establecer-una-conexión-con-drivermanager)
  - [URL de conexión](#url-de-conexión)
  - [Método getConnection](#método-getconnection)
- [La interfaz connection](#la-interfaz-connection)
  - [¿Qué es la interfaz connection?](#qué-es-la-interfaz-connection)
  - [Métodos principales de connection](#métodos-principales-de-connection)
    - [Gestionar transacciones](#gestionar-transacciones)
    - [Cerrar la conexión](#cerrar-la-conexión)
    - [Verificar el estado de la conexión](#verificar-el-estado-de-la-conexión)
- [Ejemplo de uso](#ejemplo-de-uso)

## Conexión en JDBC

La conexión a una base de datos es el primer paso para interactuar con ella desde una aplicación Java utilizando JDBC. Este proceso implica cargar el controlador JDBC adecuado y establecer una conexión mediante `DriverManager`, gestionando dicha conexión con la interfaz `Connection`.

## Establecer una conexión con DriverManager

### URL de conexión

La URL de conexión es una cadena que especifica la ubicación de la base de datos y otros parámetros de conexión. Su formato varía según el controlador JDBC utilizado.

Ejemplos de URL:

- **MySQL:** jdbc:mysql://localhost:3306/nombre_base_de_datos

- **PostgreSQL:** jdbc:postgresql://localhost:5432/nombre_base_de_datos

- **Oracle:** jdbc:oracle:thin:@localhost:1521:nombre_base_de_datos

### Método getConnection

El método `DriverManager.getConnection()` se utiliza para establecer una conexión a la base de datos. Acepta la URL de conexión, el nombre de usuario y la contraseña como parámetros.

```java
String url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
String usuario = "root";
String contraseña = "contraseña";

Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
```

## La interfaz connection

### ¿Qué es la interfaz connection?

La interfaz `Connection` representa una sesión activa con la base de datos. Proporciona métodos para gestionar transacciones, obtener metadatos de la base de datos y, eventualmente, crear sentencias SQL (aunque esto último se tratará en otro capítulo).

### Métodos principales de connection

#### Gestionar transacciones

- **setAutoCommit(boolean autoCommit):** Habilita o deshabilita el modo de autocommit.

  - Si `autoCommit` es `true`, cada sentencia SQL se confirma automáticamente.

  - Si `autoCommit` es `false`, las transacciones deben confirmarse manualmente con `commit()`.

- **commit():** Confirma la transacción actual.

- **rollback():** Revierte la transacción actual.

#### Cerrar la conexión

- **close():** Cierra la conexión y libera los recursos asociados.

#### Verificar el estado de la conexión

- **isClosed():** Devuelve true si la conexión está cerrada, `false` en caso contrario.

## Ejemplo de uso

```java
import java.sql.Connection;
import java.sql.DriverManager;

public class EjemploConexion {
    public static void main(String[] args) {
        // Datos de conexión
        String url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
        String usuario = "root";
        String contraseña = "contraseña";

        Connection conexion = null;

        try {
            // Paso 1: Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Paso 2: Establecer la conexión
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Paso 3: Configurar la conexión (opcional)
            conexion.setAutoCommit(false); // Deshabilitar autocommit

            System.out.println("Conexión establecida correctamente.");

            // Aquí se ejecutarían consultas (tratadas en otro capítulo).
            // Para no complicar más el tema.

            // Confirmar la transacción (si se deshabilitó autocommit)
            conexion.commit();
        } catch (Exception e) {
            e.printStackTrace();
            // Revertir la transacción en caso de error
            if (conexion != null) {
                try {
                    conexion.rollback();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            // Paso 4: Cerrar la conexión
            if (conexion != null) {
                try {
                    conexion.close();
                    System.out.println("Conexión cerrada.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```

No siempre es necesario usar `Class.forName("com.mysql.cj.jdbc.Driver");` cuando trabajas con JDBC en las versiones más recientes de Java. Desde JDBC 4.0 (introducido en Java 6), el cargador de servicios automático se encarga de cargar el controlador JDBC si está incluido en el classpath. Esto significa que, en la mayoría de los casos, ya no necesitas invocar manualmente `Class.forName()` para registrar el controlador.
