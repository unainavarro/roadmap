<h1 align="center">Biblioteca principal</h1>

<h2>📑 Contenido</h2>

- [Biblioteca principal](#biblioteca-principal)
- [Bibliotecas principales de Java](#bibliotecas-principales-de-java)
  - [java.lang](#javalang)
  - [java.util](#javautil)
  - [java.io y java.nio](#javaio-y-javanio)
  - [java.net](#javanet)
  - [java.sql](#javasql)
  - [java.time](#javatime)
  - [javax](#javax)
- [Características clave de las clases integradas](#características-clave-de-las-clases-integradas)

## Biblioteca principal

Java ofrece una amplia biblioteca estándar que proporciona una colección de clases y métodos listos para su uso. Estas bibliotecas permiten manejar estructuras de datos, realizar operaciones de entrada y salida, manipular fechas, ejecutar tareas concurrentes, entre muchas otras funcionalidades. En este capítulo exploraremos algunas de las bibliotecas más utilizadas y las clases integradas en Java.

Estas bibliotecas forman parte del Java Development Kit (JDK) y ofrecen una amplia gama de funcionalidades listas para usar.

> Conocer las bibliotecas principales de Java es crucial porque son la base del desarrollo en este lenguaje. Entender cómo funcionan estas bibliotecas te ayuda a comprender mejor el lenguaje, ya que están profundamente integradas en su diseño y estructura.

## Bibliotecas principales de Java

### java.lang

Importada automáticamente, incluye clases fundamentales como:

- **Object:** Clase base de todas las demás clases en Java.

- **String:** Manejo de cadenas de texto.

- **Math:** Métodos matemáticos como `sin`, `cos`, `sqrt`, etc.

- **System:** Métodos relacionados con la entrada/salida del sistema.

- **Thread:** Soporte para programación multihilo.

### java.util

Ofrece herramientas para estructuras de datos y utilidades como:

- **Colecciones** (`ArrayList`, `HashMap`, `HashSet`, etc.).

- **Clases de fechas** (`Date`, `Calendar`).

- Clases relacionadas con utilidades como `Random`.

### java.io y java.nio

Manejo de entrada y salida de datos.

- **java.io:** Archivos, flujos de entrada/salida (`File`, `InputStream`, `OutputStream`).

- **java.nio:** Entrada/salida no bloqueante para rendimiento avanzado.

### java.net

Funcionalidades para redes.

- Clases como `URL`, `HttpURLConnection` para comunicación HTTP o conexiones de red.

### java.sql

- Acceso y manejo de bases de datos relacionales mediante JDBC (`DriverManager`, `Connection`, `Statement`).

### java.time

Introducida en Java 8 para manejar fechas y tiempos de forma moderna y más robusta.

- Clases como `LocalDate`, `LocalTime`, `LocalDateTime`.

### javax

Incluye extensiones relacionadas con Java estándar:

- **javax.swing:** Desarrollo de interfaces gráficas (ventanas, botones, etc.).

- **javax.xml:** Procesamiento de XML.

## Características clave de las clases integradas

- **Reutilización:** Estas clases eliminan la necesidad de reinventar la rueda, ya que puedes reutilizar funcionalidades existentes.

- **Portabilidad**: Las clases están diseñadas para funcionar en cualquier plataforma compatible con Java.

- **Extensibilidad:** Puedes heredar y extender muchas de estas clases para adaptarlas a tus necesidades.
