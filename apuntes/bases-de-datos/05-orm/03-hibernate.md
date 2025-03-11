<h1 align="center">Hibernate</h1>

<h2>📑 Contenido</h2>

- [Hibernate](#hibernate)
- [¿Qué es Hibernate?](#qué-es-hibernate)
  - [Características principales](#características-principales)
- [Instalación de Hibernate](#instalación-de-hibernate)
  - [Requisitos previos](#requisitos-previos)
  - [Agregar dependencias de Hibernate](#agregar-dependencias-de-hibernate)
- [Configuración de Hibernate](#configuración-de-hibernate)
  - [Archivo de configuración (hibernate.cfg.xml)](#archivo-de-configuración-hibernatecfgxml)
  - [Propiedades comunes de configuración](#propiedades-comunes-de-configuración)
- [Definición de entidades](#definición-de-entidades)
  - [Crear una entidad](#crear-una-entidad)
- [Uso Básico de Hibernate](#uso-básico-de-hibernate)
  - [Inicializar Hibernate](#inicializar-hibernate)

## Hibernate

Hibernate es uno de los frameworks ORM (Object-Relational Mapping) más populares en el mundo Java. Permite mapear objetos Java a tablas de una base de datos relacional y facilita las operaciones de persistencia sin necesidad de escribir consultas SQL manuales.

## ¿Qué es Hibernate?

Hibernate es un framework de mapeo objeto-relacional (ORM) que simplifica el acceso a bases de datos relacionales. Proporciona una capa de abstracción sobre JDBC, permitiendo a los desarrolladores trabajar con objetos en lugar de escribir consultas SQL manuales.

### Características principales

- **Mapeo objeto-relacional:** Convierte automáticamente objetos Java en registros de la base de datos.

- **Gestión de transacciones:** Facilita la gestión de transacciones atómicas.

- **Consultas avanzadas:** Soporta consultas JPQL (Java Persistence Query Language) y HQL (Hibernate Query Language).

- **Portabilidad:** Funciona con múltiples bases de datos (MySQL, PostgreSQL, Oracle, etc.).

## Instalación de Hibernate

### Requisitos previos

- **Java Development Kit (JDK):** Hibernate requiere JDK 8 o superior.

- **Base de datos:** Una base de datos relacional (por ejemplo, MySQL, PostgreSQL).

- **Maven o Gradle:** Para gestionar las dependencias del proyecto.

### Agregar dependencias de Hibernate

Si estás utilizando Maven, agrega las siguientes dependencias en tu archivo pom.xml:

```xml
<dependencies>
    <!-- Hibernate Core -->
    <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-core</artifactId>
        <version>5.6.5.Final</version>
    </dependency>

    <!-- Driver de la base de datos (ejemplo para MySQL) -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.27</version>
    </dependency>

    <!-- JPA API (opcional, pero recomendado) -->
    <dependency>
        <groupId>javax.persistence</groupId>
        <artifactId>javax.persistence-api</artifactId>
        <version>2.2</version>
    </dependency>
</dependencies>
```

Si estás utilizando Gradle, agrega las siguientes dependencias en tu archivo build.gradle:

```groovy
dependencies {
    implementation 'org.hibernate:hibernate-core:5.6.5.Final'
    implementation 'mysql:mysql-connector-java:8.0.27'
    implementation 'javax.persistence:javax.persistence-api:2.2'
}
```

## Configuración de Hibernate

### Archivo de configuración (hibernate.cfg.xml)

El archivo `hibernate.cfg.xml` es el archivo principal de configuración de Hibernate. Define la conexión a la base de datos, el dialecto SQL y otras propiedades.

```xml
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
    <session-factory>
        <!-- Configuración de la base de datos -->
        <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/mi_base_de_datos</property>
        <property name="hibernate.connection.username">root</property>
        <property name="hibernate.connection.password">contraseña</property>

        <!-- Configuración de Hibernate -->
        <property name="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</property>
        <property name="hibernate.show_sql">true</property> <!-- Muestra las consultas SQL en la consola -->
        <property name="hibernate.hbm2ddl.auto">update</property> <!-- Actualiza el esquema de la base de datos -->

        <!-- Mapeo de entidades -->
        <mapping class="com.ejemplo.Empleado"/>
    </session-factory>
</hibernate-configuration>
```

### Propiedades comunes de configuración

- **hibernate.connection.driver_class:** Clase del controlador JDBC.

- **hibernate.connection.url:** URL de la base de datos.

- **hibernate.connection.username:** Nombre de usuario de la base de datos.

- **hibernate.connection.password:** Contraseña de la base de datos.

- **hibernate.dialect:** Dialecto SQL de la base de datos (por ejemplo, `MySQL8Dialect` para MySQL).

- **hibernate.show_sql:** Muestra las consultas SQL generadas en la consola.

- **hibernate.hbm2ddl.auto:** Define el comportamiento de actualización del esquema de la base de datos (`create`, `update`, `validate`, `none`).

## Definición de entidades

### Crear una entidad

Una entidad es una clase Java que representa una tabla en la base de datos. Se mapea utilizando anotaciones JPA.

```java
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private double salario;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
```

## Uso Básico de Hibernate

### Inicializar Hibernate

Para utilizar Hibernate, es necesario crear una `SessionFactory`, que es un objeto pesado que se utiliza para crear sesiones.

```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Crear la SessionFactory a partir del archivo de configuración
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml") // Cargar configuración
                .buildSessionFactory();

        // Abrir una sesión
        Session session = sessionFactory.openSession();

        // Aquí se ejecutarían las operaciones con la base de datos

        // Cerrar la sesión
        session.close();
        sessionFactory.close();
    }
}
```

### Operaciones CRUD con Hibernate

Guardar un Objeto (Create)

```java
session.beginTransaction();
Empleado empleado = new Empleado();
empleado.setNombre("Juan Pérez");
empleado.setSalario(3000.00);
session.save(empleado); // Guardar en la base de datos
session.getTransaction().commit();
```

Obtener un Objeto (Read)

```java
Empleado empleado = session.get(Empleado.class, 1); // Buscar por ID
System.out.println("Nombre: " + empleado.getNombre());
```

Actualizar un Objeto (Update)

```java
session.beginTransaction();
Empleado empleado = session.get(Empleado.class, 1);
empleado.setSalario(3500.00);
session.update(empleado); // Actualizar en la base de datos
session.getTransaction().commit();
```

Eliminar un Objeto (Delete)

```java
session.beginTransaction();
Empleado empleado = session.get(Empleado.class, 1);
session.delete(empleado); // Eliminar de la base de datos
session.getTransaction().commit();
```
