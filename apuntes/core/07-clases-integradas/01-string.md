<h1 align="center">Clase String</h1>

<h2>📑 Contenido</h2>

- [String](#string)
- [¿Qué es la clase string?](#qué-es-la-clase-string)
- [Creación de objetos string](#creación-de-objetos-string)
- [Métodos comunes](#métodos-comunes)
  - [length()](#length)
  - [charAt(int index)](#charatint-index)
  - [substring(int beginIndex, int endIndex)](#substringint-beginindex-int-endindex)
  - [equals(Object obj)](#equalsobject-obj)
  - [equalsIgnoreCase(String anotherString)](#equalsignorecasestring-anotherstring)
  - [toUpperCase() y toLowerCase()](#touppercase-y-tolowercase)
  - [trim()](#trim)
  - [replace(char oldChar, char newChar)](#replacechar-oldchar-char-newchar)
  - [split(String regex)](#splitstring-regex)
  - [indexOf(String str) y lastIndexOf(String str)](#indexofstring-str-y-lastindexofstring-str)
- [Concatenación de cadenas](#concatenación-de-cadenas)
- [Inmutables](#inmutables)
- [StringBuffer](#stringbuffer)
- [Buenas prácticas](#buenas-prácticas)

## String

La clase `String` es una de las clases más utilizadas en Java. Representa una secuencia de caracteres y proporciona una amplia variedad de métodos para manipular cadenas de texto.

## ¿Qué es la clase string?

En Java, `String` es una clase que representa una cadena de caracteres. Las cadenas son inmutables, lo que significa que una vez creadas, no pueden modificarse. Cualquier operación que parezca modificar una cadena en realidad crea una nueva cadena.

## Creación de objetos string

Hay dos formas principales de crear un objeto String:

Usando un literal de cadena:

```java
String texto = "Hola, Mundo!";
```

Usando el constructor de la clase String:

```java
String texto = new String("Hola, Mundo!");
```

Aunque ambas formas son válidas, se recomienda usar literales de cadena porque son más eficientes en términos de memoria.

## Métodos comunes

La clase String proporciona una gran cantidad de métodos para manipular cadenas. A continuación, se presentan algunos de los más utilizados.

### length()

Devuelve la longitud de la cadena (número de caracteres).

```java
String texto = "Hola, Mundo!";
int longitud = texto.length();
System.out.println("Longitud: " + longitud); // Salida: 12
```

### charAt(int index)

Devuelve el carácter en la posición especificada.

```java
String texto = "Hola, Mundo!";
char caracter = texto.charAt(1);
System.out.println("Carácter en la posición 1: " + caracter); // Salida: o
```

### substring(int beginIndex, int endIndex)

Devuelve una subcadena desde `beginIndex` hasta `endIndex` - 1.

```java
String texto = "Hola, Mundo!";
String subcadena = texto.substring(0, 4);
System.out.println("Subcadena: " + subcadena); // Salida: Hola
```

### equals(Object obj)

Compara dos cadenas para verificar si son iguales (distingue entre mayúsculas y minúsculas).

```java
String texto1 = "Hola";
String texto2 = "hola";
boolean sonIguales = texto1.equals(texto2);
System.out.println("¿Son iguales? " + sonIguales); // Salida: false
```

### equalsIgnoreCase(String anotherString)

Compara dos cadenas ignorando mayúsculas y minúsculas.

```java
String texto1 = "Hola";
String texto2 = "hola";
boolean sonIguales = texto1.equalsIgnoreCase(texto2);
System.out.println("¿Son iguales? " + sonIguales); // Salida: true
```

### toUpperCase() y toLowerCase()

Convierte la cadena a mayúsculas o minúsculas, respectivamente.

```java
String texto = "Hola, Mundo!";
String mayusculas = texto.toUpperCase();
String minusculas = texto.toLowerCase();
System.out.println("Mayúsculas: " + mayusculas); // Salida: HOLA, MUNDO!
System.out.println("Minúsculas: " + minusculas); // Salida: hola, mundo!
```

### trim()

Elimina los espacios en blanco al principio y al final de la cadena.

```java
String texto = "   Hola, Mundo!   ";
String sinEspacios = texto.trim();
System.out.println("Cadena sin espacios: " + sinEspacios); // Salida: Hola, Mundo!
```

### replace(char oldChar, char newChar)

Reemplaza todas las ocurrencias de un carácter por otro.

```java
String texto = "Hola, Mundo!";
String nuevoTexto = texto.replace('o', 'a');
System.out.println("Texto modificado: " + nuevoTexto); // Salida: Hala, Munda!
```

### split(String regex)

Divide la cadena en un arreglo de subcadenas basado en una expresión regular.

```java
String texto = "Hola,Mundo,Java";
String[] partes = texto.split(",");
for (String parte : partes) {
    System.out.println(parte);
}
// Salida:
// Hola
// Mundo
// Java
```

### indexOf(String str) y lastIndexOf(String str)

Devuelve la posición de la primera o última ocurrencia de una subcadena.

```java
String texto = "Hola, Mundo!";
int primeraPosicion = texto.indexOf("Mundo");
int ultimaPosicion = texto.lastIndexOf("o");
System.out.println("Primera posición de 'Mundo': " + primeraPosicion); // Salida: 6
System.out.println("Última posición de 'o': " + ultimaPosicion); // Salida: 8
```

## Concatenación de cadenas

En Java, puedes concatenar cadenas usando el operador `+` o el método `concat()`.

```java
String texto1 = "Hola";
String texto2 = "Mundo";
String resultado1 = texto1 + ", " + texto2 + "!";
String resultado2 = texto1.concat(", ").concat(texto2).concat("!");

System.out.println(resultado1); // Salida: Hola, Mundo!
System.out.println(resultado2); // Salida: Hola, Mundo!
```

## Inmutables

Los objetos de la clase `String` en Java son inmutables, lo que significa que una vez que se crea un objeto `String`, su contenido no puede ser modificado.

- **No se puede cambiar su contenido:** Una vez que se crea un objeto `String`, no se puede cambiar su valor. Cualquier operación que parezca modificar el contenido de un `String` en realidad crea un nuevo `String` con el contenido modificado.

- **Seguridad:** La inmutabilidad de los `String` proporciona seguridad en el manejo de datos, ya que evita que otros objetos modifiquen su contenido de manera no autorizada.

- **Hace que el código sea más predecible:** Al ser inmutables, los `String` se comportan de manera predecible en el código, lo que facilita la depuración y el mantenimiento.

```java
/*
En este caso, parece que estamos modificando el contenido de str al agregar " Mundo" al final de "Hola". Sin embargo, en realidad se está creando un nuevo String con el contenido "Hola Mundo" y asignándolo a la variable str. El String original "Hola" permanece inmutable.
*/
String str = "Hola";
str += " Mundo";
```

## StringBuffer

Para manejar cadenas de manera mutable, es decir, donde se pueden realizar modificaciones en su contenido, se puede utilizar la clase `StringBuffer`. A diferencia de la clase `String`, los objetos `StringBuffer` son mutables, lo que significa que su contenido puede ser modificado sin necesidad de crear un nuevo objeto en cada operación.

```java
StringBuffer buffer = new StringBuffer("Hola");
buffer.append(" Mundo"); // Agregar " Mundo" al final de la cadena
buffer.insert(5, ","); // Insertar una coma en la posición 5
buffer.replace(5, 6, "!"); // Reemplazar la coma por un signo de exclamación
buffer.deleteCharAt(4); // Eliminar el espacio en la posición 4

System.out.println(buffer); // Imprime "Hola,Mundo!"
```

## Buenas prácticas

- **Usa literales de cadena cuando sea posible:** Son más eficientes en términos de memoria.

- **Evita concatenar cadenas en bucles:** Usa `StringBuilder` o `StringBuffer` para mejorar el rendimiento.

- **Reutiliza métodos de la clase String:** No reinventes la rueda; aprovecha los métodos ya implementados.

- **Considera la inmutabilidad:** Recuerda que las cadenas son inmutables, por lo que cada operación que parezca modificar una cadena crea una nueva.
