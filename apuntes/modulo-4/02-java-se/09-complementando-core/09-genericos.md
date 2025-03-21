<h1 align="center">Genéricos</h1>

<h2>📑 Contenido</h2>

- [Genéricos](#genéricos)
- [¿Qué son los genéricos?](#qué-son-los-genéricos)
- [Beneficios de los genéricos](#beneficios-de-los-genéricos)
- [Parámetros de tipo](#parámetros-de-tipo)
- [Métodos genéricos](#métodos-genéricos)
- [Genéricos y herencia](#genéricos-y-herencia)
  - [Subtipos y supertipos](#subtipos-y-supertipos)
- [Limitaciones de los genéricos](#limitaciones-de-los-genéricos)
- [Buenas prácticas](#buenas-prácticas)

## Genéricos

Los genéricos (generics) en Java son una característica poderosa que permite a los desarrolladores escribir código más seguro y reutilizable. Introducidos en Java 5, los genéricos permiten definir clases, interfaces y métodos que operan sobre tipos parametrizados. Esto significa que puedes escribir una clase o método que funcione con cualquier tipo de dato, proporcionando mayor flexibilidad y seguridad en el tipo de datos.

## ¿Qué son los genéricos?

Los genéricos permiten a los desarrolladores escribir clases, interfaces y métodos que pueden operar sobre cualquier tipo de dato. Esto se logra mediante el uso de parámetros de tipo, que son reemplazados por tipos reales cuando se utiliza la clase o método.

```java
public class Caja<T> {
    private T contenido;

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }

    public static void main(String[] args) {
        Caja<String> cajaDeString = new Caja<>();
        cajaDeString.setContenido("Hola");
        System.out.println(cajaDeString.getContenido()); // Hola

        Caja<Integer> cajaDeEntero = new Caja<>();
        cajaDeEntero.setContenido(42);
        System.out.println(cajaDeEntero.getContenido()); // 42
    }
}
```

## Beneficios de los genéricos

- **Seguridad de tipos:** Los genéricos permiten detectar errores de tipo en tiempo de compilación en lugar de en tiempo de ejecución.

- **Reutilización de código:** Puedes escribir una clase o método genérico que funcione con cualquier tipo de dato.

- **Eliminación de casts:** Los genéricos eliminan la necesidad de hacer conversiones explícitas (casts) de tipos.

## Parámetros de tipo

Los parámetros de tipo son los placeholders que se utilizan en la definición de clases, interfaces y métodos genéricos. Por convención, se utilizan letras mayúsculas como `T`, `U`, `V`, etc., para representar tipos genéricos.

```java
public class Par<T, U> {
    private T primero;
    private U segundo;

    public Par(T primero, U segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public T getPrimero() {
        return primero;
    }

    public U getSegundo() {
        return segundo;
    }

    public static void main(String[] args) {
        Par<String, Integer> par = new Par<>("Edad", 30);
        System.out.println(par.getPrimero() + ": " + par.getSegundo()); // Edad: 30
    }
}
```

## Métodos genéricos

Los métodos genéricos son métodos que tienen sus propios parámetros de tipo. Estos métodos pueden ser estáticos o de instancia.

```java
public class Utilidades {
    public static <T> void imprimirContenido(T contenido) {
        System.out.println(contenido);
    }

    public static void main(String[] args) {
        Utilidades.imprimirContenido("Hola"); // Hola
        Utilidades.imprimirContenido(42); // 42
    }
}
```

## Genéricos y herencia

Los genéricos en Java tienen algunas particularidades cuando se trata de herencia. Es importante entender cómo funcionan las relaciones de tipo en este contexto.

### Subtipos y supertipos

- **List<String> no es un subtipo de List<Object>:** Aunque `String` es un subtipo de `Object`, `List<String>` no es un subtipo de `List<Object>`.

- **Uso de comodines (?):** Los comodines permiten mayor flexibilidad en la definición de tipos.

```java
import java.util.List;

public class ComodinesExample {
    public static void imprimirLista(List<?> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> listaDeStrings = List.of("Hola", "Mundo");
        List<Integer> listaDeEnteros = List.of(1, 2, 3);

        imprimirLista(listaDeStrings); // Hola, Mundo
        imprimirLista(listaDeEnteros); // 1, 2, 3
    }
}
```

## Limitaciones de los genéricos

Aunque los genéricos son poderosos, tienen algunas limitaciones en Java:

- **No se pueden usar tipos primitivos:** Los genéricos solo funcionan con tipos de referencia. Para tipos primitivos, se deben usar sus clases envolventes (por ejemplo, `Integer` en lugar de `int`).

- **No se pueden crear instancias de tipos genéricos:** No es posible crear una instancia de un tipo genérico directamente (por ejemplo, `new T()`).

- **No se pueden usar en excepciones:** No se pueden crear excepciones genéricas.

## Buenas prácticas

- **Usa nombres descriptivos para los parámetros de tipo:** Aunque `T`, `U`, `V` son comunes, usa nombres más descriptivos cuando sea necesario.

- **Evita el uso excesivo de comodines:** Los comodines pueden hacer que el código sea más difícil de entender. Úsalos solo cuando sea necesario.

- **Prefiere métodos genéricos:** Los métodos genéricos son más flexibles y reutilizables que las clases genéricas en muchos casos.
