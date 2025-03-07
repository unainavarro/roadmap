<h1 align="center">File</h1>

<h2>📑 Contenido</h2>

- [File](#file)
- [La clase file](#la-clase-file)
- [Creación de un objeto file](#creación-de-un-objeto-file)
- [Métodos comunes de la clase file](#métodos-comunes-de-la-clase-file)
  - [exists()](#exists)
  - [createNewFile()](#createnewfile)
  - [delete()](#delete)
  - [isDirectory() y isFile()](#isdirectory-y-isfile)
  - [list()](#list)
- [Lectura y escritura de archivos](#lectura-y-escritura-de-archivos)
  - [Lectura de archivos con BufferedReader](#lectura-de-archivos-con-bufferedreader)
  - [Escritura de archivos con BufferedWriter](#escritura-de-archivos-con-bufferedwriter)
- [Manejo de archivos con FileHandler](#manejo-de-archivos-con-filehandler)
  - [Configuración de FileHandler](#configuración-de-filehandler)
  - [Características de FileHandler](#características-de-filehandler)
- [Buenas prácticas con archivos](#buenas-prácticas-con-archivos)
- [Ejemplo práctico: copia de archivos](#ejemplo-práctico-copia-de-archivos)

## File

El manejo de archivos es una parte esencial de muchos programas, ya que permite leer y escribir datos en archivos, así como manipular directorios y sus contenidos. En Java, la clase `File` y las clases relacionadas con `FileHandler` proporcionan las herramientas necesarias para realizar estas operaciones.

## La clase file

La clase `File` en Java representa una ruta de archivo o directorio en el sistema de archivos. Proporciona métodos para crear, eliminar, renombrar y obtener información sobre archivos y directorios.

## Creación de un objeto file

Puedes crear un objeto `File` especificando la ruta del archivo o directorio.

```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File archivo = new File("archivo.txt");
        File directorio = new File("directorio");

        System.out.println("Ruta del archivo: " + archivo.getAbsolutePath());
        System.out.println("Ruta del directorio: " + directorio.getAbsolutePath());
    }
}
```

## Métodos comunes de la clase file

### exists()

Verifica si el archivo o directorio existe.

```java
if (archivo.exists()) {
    System.out.println("El archivo existe.");
} else {
    System.out.println("El archivo no existe.");
}
```

### createNewFile()

Crea un nuevo archivo si no existe.

```java
try {
    if (archivo.createNewFile()) {
        System.out.println("Archivo creado: " + archivo.getName());
    } else {
        System.out.println("El archivo ya existe.");
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

### delete()

Elimina el archivo o directorio.

```java
if (archivo.delete()) {
    System.out.println("Archivo eliminado: " + archivo.getName());
} else {
    System.out.println("No se pudo eliminar el archivo.");
}
```

### isDirectory() y isFile()

Verifican si el objeto `File` representa un directorio o un archivo.

```java
if (archivo.isFile()) {
    System.out.println("Es un archivo.");
} else if (directorio.isDirectory()) {
    System.out.println("Es un directorio.");
}
```

### list()

Devuelve un arreglo de nombres de archivos y directorios contenidos en un directorio.

```java
String[] contenido = directorio.list();
if (contenido != null) {
    for (String elemento : contenido) {
        System.out.println(elemento);
    }
}
```

## Lectura y escritura de archivos

Para leer y escribir archivos, Java proporciona varias clases en el paquete `java.io`, como `FileReader`, `FileWriter`, `BufferedReader`, y `BufferedWriter`.

### Lectura de archivos con BufferedReader

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Escritura de archivos con BufferedWriter

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt"))) {
            bw.write("Hola, Mundo!");
            bw.newLine();
            bw.write("Este es un archivo de ejemplo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Manejo de archivos con FileHandler

`FileHandler` es una clase en el paquete `java.util.logging` que se utiliza para manejar la salida de logs a archivos. Es especialmente útil para aplicaciones que necesitan registrar eventos en archivos de texto.

### Configuración de FileHandler

```java
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        try {
            FileHandler fh = new FileHandler("log.txt");
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);

            logger.log(Level.INFO, "Este es un mensaje de log.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Características de FileHandler

- **Rotación de archivos:** Puede configurarse para crear nuevos archivos de log cuando el archivo actual alcanza un tamaño máximo.

- **Formato personalizado:** Puedes usar `SimpleFormatter` o `XMLFormatter` para definir el formato de los logs.

- **Niveles de log:** Permite registrar mensajes con diferentes niveles de severidad (INFO, WARNING, SEVERE, etc.).

## Buenas prácticas con archivos

**Cierra los recursos:** Usa bloques `try-with-resources` para asegurarte de que los recursos (como `BufferedReader` y `BufferedWriter`) se cierren correctamente.

**Maneja excepciones:** Siempre maneja las excepciones de E/S para evitar que el programa falle inesperadamente.

**Usa rutas relativas con cuidado:** Prefiere rutas absolutas o rutas relativas bien definidas para evitar problemas de portabilidad.

**Considera el rendimiento:** Para operaciones de lectura/escritura intensivas, considera usar `BufferedReader` y `BufferedWriter` para mejorar el rendimiento.

## Ejemplo práctico: copia de archivos

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiaArchivos {
    public static void main(String[] args) {
        File archivoOrigen = new File("archivoOrigen.txt");
        File archivoDestino = new File("archivoDestino.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(archivoOrigen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            System.out.println("Archivo copiado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
