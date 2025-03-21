<h1 align="center">JDBC (Java Database Connectivity)</h1>

<h2>📑 Contenido</h2>

- [JDBC](#jdbc)
- [¿Qué es JDBC?](#qué-es-jdbc)
  - [Componentes principales](#componentes-principales)
- [¿Qué es un controlador JDBC?](#qué-es-un-controlador-jdbc)
  - [Descargar el controlador JDBC](#descargar-el-controlador-jdbc)
    - [MySQL](#mysql)
    - [PostgreSQL](#postgresql)
    - [Oracle](#oracle)
- [Incluir el Controlador JDBC en el Proyecto](#incluir-el-controlador-jdbc-en-el-proyecto)
  - [Opción 1: usar un sistema de construcción (Maven/Gradle)](#opción-1-usar-un-sistema-de-construcción-mavengradle)
  - [Opción 2: agregar manualmente el archivo JAR](#opción-2-agregar-manualmente-el-archivo-jar)

## JDBC

JDBC (Java Database Connectivity) es una API de Java que permite a las aplicaciones interactuar con bases de datos relacionales. Proporciona métodos para conectarse a una base de datos, ejecutar consultas SQL y procesar los resultados. JDBC es una parte esencial del desarrollo de aplicaciones Java que requieren acceso a datos almacenados en sistemas como MySQL, PostgreSQL, Oracle y otros.

## ¿Qué es JDBC?

JDBC es una API estándar de Java que proporciona una interfaz uniforme para acceder a bases de datos relacionales. Permite a los desarrolladores ejecutar sentencias SQL, recuperar resultados y gestionar transacciones desde aplicaciones Java.

### Componentes principales

- **DriverManager:** Gestiona la conexión entre la aplicación Java y la base de datos.

- **Connection:** Representa una conexión activa a la base de datos.

- **Statement:** Permite ejecutar consultas SQL estáticas.

- **PreparedStatement:** Permite ejecutar consultas SQL precompiladas.

- **ResultSet:** Almacena los resultados de una consulta SQL.

## ¿Qué es un controlador JDBC?

Un controlador JDBC es una biblioteca específica para cada base de datos que implementa la interfaz JDBC. Actúa como un puente entre la aplicación Java y la base de datos.

### Descargar el controlador JDBC

El controlador JDBC se puede descargar desde el sitio web del proveedor de la base de datos. A continuación, se muestran ejemplos para algunas bases de datos populares:

#### MySQL

- **Descargar:** [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)

- **Archivo:** mysql-connector-java-X.X.XX.jar

#### PostgreSQL

- **Descargar:** [PostgreSQL JDBC Driver](https://jdbc.postgresql.org/)

- **Archivo:** postgresql-X.X-XXXX.jdbcX.jar

#### Oracle

- **Descargar:** [Oracle JDBC Driver](https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html)

- **Archivo:** ojdbcX.jar

## Incluir el Controlador JDBC en el Proyecto

### Opción 1: usar un sistema de construcción (Maven/Gradle)

Si estás utilizando Maven o Gradle, puedes agregar la dependencia del controlador JDBC en el archivo de configuración.

Maven (pom.xml)

```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.XX</version>
</dependency>
```

Gradle (build.gradle)

```groovy
implementation 'mysql:mysql-connector-java:8.0.XX'
```

### Opción 2: agregar manualmente el archivo JAR

- Descarga el archivo JAR del controlador JDBC.

- Agrega el archivo JAR al classpath de tu proyecto:

  - En un IDE como Eclipse o IntelliJ IDEA, ve a las propiedades del proyecto y agrega el JAR como una biblioteca externa.

  - Si estás compilando desde la línea de comandos, usa la opción -cp para incluir el JAR:

    ```bash
        javac -cp ruta/al/mysql-connector-java-X.X.XX.jar MiClase.java
        java -cp .:ruta/al/mysql-connector-java-X.X.XX.jar MiClase
    ```
