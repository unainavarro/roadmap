<h1 align="center">Formatear salida</h1>

<h2>📑 Contenido</h2>

- [Formatear salida](#formatear-salida)
- [Controlando la anchura y alineación](#controlando-la-anchura-y-alineación)
- [String.format()](#stringformat)
- [Formatter](#formatter)

## Formatear salida

En Java, la salida formateada se refiere a la presentación de datos en un formato específico y estructurado utilizando métodos como `System.out.printf()` y `String.format()`. Estos métodos permiten controlar la apariencia de los datos que se imprimen en la consola o se almacenan en cadenas de texto, lo que facilita la visualización y comprensión de la información.

La salida formateada se realiza utilizando especificadores de formato en las cadenas de formato. Estos especificadores indican cómo se deben formatear los diferentes tipos de datos, como cadenas, enteros, números de punto flotante, fechas, etc. Algunos de los especificadores de formato comunes incluyen:

| Especificador | Descripción              | Ejemplo |
| ------------- | ------------------------ | ------- |
| %d            | Entero decimal           | 123     |
| %f            | Número de punto flotante | 123.45  |
| %s            | Cadena de texto          | Hola    |
| %c            | Carácter único           | A       |
| %b            | Booleano                 | true    |

Ejemplo con `pintf()`

```java
int edad = 30;
double altura = 1.75;
String nombre = "Juan";

System.out.printf("Nombre: %s, Edad: %d, Altura: %.2f metros%n", nombre, edad, altura);
```

## Controlando la anchura y alineación

Para definir un ancho fijo:

```java
System.out.printf("|%10s|\n", "Java");

// Salida: |      Java|
```

Para alinear a la izquierda:

```java
System.out.printf("|%-10s|\n", "Java");

// Salida: |Java      |
```

## String.format()

`String.format()` permite almacenar una cadena formateada en lugar de imprimirla directamente.

```java
String mensaje = String.format("Precio: %.2f", 9.99);
System.out.println(mensaje);

// Salida: Precio: 9.99
```

## Formatter

La clase `Formatter` proporciona más control sobre la salida formateada.

```java
import java.util.Formatter;

public class FormatterEjemplo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("%s tiene %d años", "Carlos", 30);
        System.out.println(formatter);
        formatter.close();
    }
}

// Salida: Carlos tiene 30 años
```

El formateo de salida en Java es una herramienta útil para mejorar la presentación de datos. printf() y String.format() son opciones rápidas para la consola, mientras que Formatter ofrece mayor control cuando se requiere formateo avanzado.
