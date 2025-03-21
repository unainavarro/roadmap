<h1 align="center">Scanner</h1>

<h2>📑 Contenido</h2>

- [Scanner](#scanner)
- [Importar la clase Scanner](#importar-la-clase-scanner)
- [Creación de un objeto Scanner](#creación-de-un-objeto-scanner)
- [Métodos principales de Scanner](#métodos-principales-de-scanner)
- [Ejemplo](#ejemplo)
- [Consideraciones al usar Scanner](#consideraciones-al-usar-scanner)
  - [Problema con nextLine() después de nextInt()](#problema-con-nextline-después-de-nextint)
  - [Cerrar el Scanner](#cerrar-el-scanner)

## Scanner

La clase `Scanner` en Java se utiliza para leer la entrada de usuario desde diversas fuentes, como la consola o archivos. Es parte del paquete `java.util` y permite capturar diferentes tipos de datos, como cadenas, números y booleanos.

Además de la entrada estándar, `Scanner` también puede leer datos de otros tipos de fuentes, como archivos, cadenas de texto y flujos de datos. Esto lo hace muy útil para una amplia gama de aplicaciones de entrada/salida en Java.

## Importar la clase Scanner

Para utilizar `Scanner`, es necesario importarlo desde el paquete `java.util`.

```java
import java.util.Scanner;
```

## Creación de un objeto Scanner

Un objeto `Scanner` se crea pasando `System.in` como argumento para leer desde la entrada estándar (teclado).

```java
Scanner scanner = new Scanner(System.in);
```

## Métodos principales de Scanner

| Método        | Descripción                           |
| ------------- | ------------------------------------- |
| nextLine()    | Lee una línea completa de texto.      |
| next()        | Lee una sola palabra.                 |
| nextInt()     | Lee un número entero.                 |
| nextDouble()  | Lee un número decimal.                |
| nextBoolean() | Lee un valor booleano (true o false). |

## Ejemplo

```java
import java.util.Scanner;

public class ScannerEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("¿Eres estudiante? (true/false): ");
        boolean estudiante = scanner.nextBoolean();

        System.out.println("\nResumen:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estudiante: " + estudiante);

        scanner.close();
    }
}
```

Salida

```
Ingresa tu nombre: Juan Pérez
Ingresa tu edad: 25
¿Eres estudiante? (true/false): true

Resumen:
Nombre: Juan Pérez
Edad: 25
Estudiante: true
```

## Consideraciones al usar Scanner

### Problema con nextLine() después de nextInt()

Al usar `nextInt()`, el salto de línea `(\n)` queda en el buffer. Para evitar problemas, se recomienda llamar a `nextLine()` después.

```java
System.out.print("Ingresa tu edad: ");
int edad = scanner.nextInt();
scanner.nextLine(); // Consumir el salto de línea
```

### Cerrar el Scanner

Siempre se debe cerrar Scanner al finalizar su uso para liberar recursos.

```java
scanner.close();
```
