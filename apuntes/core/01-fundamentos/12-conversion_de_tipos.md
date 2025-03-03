<h1 align="center">Conversion de tipos(Casting)</h1>

<h2>📑 Contenido</h2>

- [Conversion de tipos](#conversion-de-tipos)
- [Conversión implícita (Widening Casting)](#conversión-implícita-widening-casting)
- [Conversión explícita (Narrowing Casting)](#conversión-explícita-narrowing-casting)
- [Conversión entre tipos de referencia](#conversión-entre-tipos-de-referencia)
- [Conversión entre tipos primitivos y envoltorios (Boxing/Unboxing)](#conversión-entre-tipos-primitivos-y-envoltorios-boxingunboxing)
- [Métodos para conversiones más específicas](#métodos-para-conversiones-más-específicas)

## Conversion de tipos

La conversión de tipos en Java, también conocida como casting, permite convertir datos de un tipo a otro. Esto puede ser útil cuando trabajas con diferentes tipos de datos en una aplicación. Hay dos categorías principales: conversión implícita (automática) y conversión explícita (manual).

## Conversión implícita (Widening Casting)

Java convierte automáticamente un tipo más pequeño a uno más grande (sin pérdida de datos).

Esto ocurre entre tipos compatibles, como:

- `byte` → `short` → `int` → `long` → `float` → `double`

```java
int numero = 10;
double resultado = numero;  // Conversión automática de int a double
System.out.println(resultado);  // Imprime: 10.0
```

## Conversión explícita (Narrowing Casting)

Es necesario forzar la conversión cuando el tipo de destino es más pequeño o incompatible con el tipo original. Podría haber pérdida de precisión o datos.

```java
double numeroDecimal = 9.99;
int numeroEntero = (int) numeroDecimal;  // Conversión explícita de double a int
System.out.println(numeroEntero);  // Imprime: 9 (se truncó la parte decimal)
```

## Conversión entre tipos de referencia

Java permite conversiones entre tipos de objetos relacionados por herencia.

- **Upcasting (de subclase a superclase):** Automático.

- **Downcasting (de superclase a subclase):** Requiere conversión explícita.

```java
class Animal {}
class Perro extends Animal {}

Animal animal = new Perro();  // Upcasting (implícito)
Perro perro = (Perro) animal;  // Downcasting (explícito)
```

## Conversión entre tipos primitivos y envoltorios (Boxing/Unboxing)

- **Boxing:** Convertir un tipo primitivo a su clase envoltorio.

- **Unboxing:** Convertir una clase envoltorio a su tipo primitivo.

```java
int numero = 5;
Integer objetoNumero = numero;  // Boxing (implícito)

Integer otroNumero = 10;
int valorPrimitivo = otroNumero;  // Unboxing (implícito)
```

## Métodos para conversiones más específicas

Clases utilitarias(Wrappers) como `Integer`, `Double`, etc.:

```java
// String a Entero
String numeroComoTexto = "42";
int numero = Integer.parseInt(numeroComoTexto);  // Convierte String a int

int num = 10;
String texto = String.valueOf(num);  // Convierte int a String

// Double a String
double decimal = 5.6;
int entero = (int) decimal;  // Conversión explícita (narrowing casting)

String decimalComoTexto = Double.toString(decimal);  // Convierte a String

```
