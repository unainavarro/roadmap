<h1 align="center">Transacciones en JDBC</h1>

<h2>📑 Contenido</h2>

- [Transacciones en JDBC](#transacciones-en-jdbc)
- [Gestión de transacciones en JDBC](#gestión-de-transacciones-en-jdbc)
  - [AutoCommit](#autocommit)
  - [Commit](#commit)
  - [Rollback](#rollback)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplo completo de transacción en JDBC](#ejemplo-completo-de-transacción-en-jdbc)

## Transacciones en JDBC

Las transacciones son un concepto fundamental en bases de datos que garantizan que una serie de operaciones se ejecuten de manera atómica, es decir, todas se completen con éxito o ninguna se aplique. En JDBC, las transacciones se gestionan mediante los métodos `commit`, `rollback` y `setAutoCommit`.

## Gestión de transacciones en JDBC

### AutoCommit

Por defecto, JDBC opera en modo autoCommit, donde cada sentencia SQL se confirma automáticamente después de su ejecución. Esto significa que cada operación es una transacción independiente.

Desactivar AutoCommit

Para gestionar transacciones manualmente, es necesario desactivar autoCommit:

```java
conexion.setAutoCommit(false);
```

### Commit

El método `commit()` confirma todas las operaciones realizadas desde el último `commit` o `rollback`. Una vez confirmadas, los cambios son permanentes.

```java
conexion.commit();
```

### Rollback

El método `rollback()` deshace todas las operaciones realizadas desde el último `commit` o `rollback`. Esto es útil en caso de errores para restaurar la base de datos a un estado consistente.

```java
conexion.rollback();
```

## Buenas prácticas

- **Desactivar autoCommit:** Siempre desactiva `autoCommit` cuando gestiones transacciones manualmente.

- **Confirmar o revertir:** Asegúrate de confirmar (`commit`) o revertir (`rollback`) la transacción en función del resultado de las operaciones.

- **Manejo de excepciones:** Captura `SQLException` para manejar errores y revertir la transacción si es necesario.

- **Cierre de recursos:** Cierra `Connection`, `Statement` y `ResultSet` en un bloque `finally` o usa `try-with-resources`.

- **Restaurar autoCommit:** Después de una transacción, restaura `autoCommit` a su valor original (`true`).

## Ejemplo completo de transacción en JDBC

Escenario: Transferencia Bancaria

Supongamos que tenemos una tabla Cuentas con las columnas id, nombre y saldo. Queremos transferir $100 de la cuenta A a la cuenta B.

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EjemploTransaccion {
    public static void main(String[] args) {
        // Datos de conexión
        String url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
        String usuario = "root";
        String contraseña = "contraseña";

        Connection conexion = null;

        try {
            // Paso 1: Establecer la conexión
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Paso 2: Desactivar autoCommit
            conexion.setAutoCommit(false);

            // Paso 3: Preparar las sentencias SQL
            String sqlRetirar = "UPDATE Cuentas SET saldo = saldo - ? WHERE id = ?";
            String sqlDepositar = "UPDATE Cuentas SET saldo = saldo + ? WHERE id = ?";

            PreparedStatement retirar = conexion.prepareStatement(sqlRetirar);
            PreparedStatement depositar = conexion.prepareStatement(sqlDepositar);

            // Paso 4: Establecer parámetros
            retirar.setDouble(1, 100.00); // Monto a retirar
            retirar.setInt(2, 1);         // ID de la cuenta A

            depositar.setDouble(1, 100.00); // Monto a depositar
            depositar.setInt(2, 2);         // ID de la cuenta B

            // Paso 5: Ejecutar las operaciones
            retirar.executeUpdate();
            depositar.executeUpdate();

            // Paso 6: Confirmar la transacción
            conexion.commit();
            System.out.println("Transferencia realizada con éxito.");
        } catch (SQLException e) {
            // Paso 7: Revertir la transacción en caso de error
            if (conexion != null) {
                try {
                    conexion.rollback();
                    System.out.println("Transacción revertida debido a un error.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            // Paso 8: Cerrar la conexión
            if (conexion != null) {
                try {
                    conexion.setAutoCommit(true); // Restaurar autoCommit
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```
