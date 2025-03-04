<h1 align="center">Imprimir Datos</h1>

<h2>📑 Contenido</h2>

- [Imprimir Datos](#imprimir-datos)
- [System.out](#systemout)
- [System.err](#systemerr)
- [PrintWriter](#printwriter)
- [Logger](#logger)

## Imprimir Datos

Java proporciona diversas formas para imprimir datos en la consola o en archivos, permitiendo la salida de información de manera estructurada y flexible. Las principales opciones para imprimir datos en Java incluyen `System.out`, `PrintWriter` y `Logger`.

## System.out

- **System.out.print():** Este método se utiliza para imprimir datos en la consola sin agregar una nueva línea al final. Puedes utilizarlo para imprimir valores de diferentes tipos, como cadenas, enteros, flotantes, caracteres, booleanos, etc.

- **System.out.println():** Similar a System.out.print(), pero agrega una nueva línea al final después de imprimir los datos. Esto hace que la próxima salida en la consola se imprima en una nueva línea.

- **System.out.printf():** Este método permite imprimir datos en la consola con formato utilizando especificadores de formato. Es útil cuando necesitas controlar el formato de salida, como imprimir números con un cierto número de decimales.

- **System.out.format():** es esencialmente lo mismo que System.out.printf(), pero se proporciona como una alternativa para mayor claridad y consistencia en el código.

**Ejemplos**

```java
System.out.println("Hola, mundo!");
System.out.print("¡Hola, ");
System.out.println("mundo!");

int num = 10;
double pi = 3.14159;
System.out.printf("El valor de num es %d y el valor de pi es %.2f", num, pi);
```

## System.err

La clase System también tiene un campo err que representa la salida estándar de error. Puedes usar System.err.println() para imprimir mensajes de error en la consola de error estándar.

```java
System.err.println("Error: No se pudo abrir el archivo.");
```

## PrintWriter

La clase PrintWriter se utiliza para imprimir datos en archivos u otros tipos de salidas. Puedes crear un objeto PrintWriter para un archivo específico y luego utilizar métodos como print() o println() para escribir datos en el archivo.

**Ejemplo:**

```java
PrintWriter writer = new PrintWriter("archivo.txt");
writer.println("Este es un ejemplo de texto en un archivo.");
writer.close();
```

> Más en la sección de files.

## Logger

Java proporciona la API de registro (java.util.logging) para imprimir mensajes de registro. Puedes crear un objeto Logger y utilizar métodos como info(), warning(), severe(), entre otros, para imprimir mensajes de registro con diferentes niveles de severidad.

```java
Logger logger = Logger.getLogger("MiLogger");
logger.info("Este es un mensaje de registro de información.");
```
