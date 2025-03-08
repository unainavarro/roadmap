<h1 align="center">Lambda </h1>

<h2>📑 Contenido</h2>

- [Lambda](#lambda)
- [¿Qué es una expresión lambda?](#qué-es-una-expresión-lambda)
- [Ventajas de las expresiones lambda](#ventajas-de-las-expresiones-lambda)
- [Referencias a métodos](#referencias-a-métodos)
- [Interfaces funcionales y lambdas](#interfaces-funcionales-y-lambdas)
- [Tipos comunes de interfaces funcionales](#tipos-comunes-de-interfaces-funcionales)
  - [Function\<T, R\>](#functiont-r)
  - [Consumer](#consumer)
  - [Supplier](#supplier)
  - [Predicate](#predicate)
- [Lambdas en la Stream API](#lambdas-en-la-stream-api)
- [Buenas prácticas](#buenas-prácticas)

## Lambda

Las expresiones lambda son una de las características más importantes introducidas en Java 8. Permiten escribir código más conciso y expresivo, especialmente cuando se trabaja con interfaces funcionales y la Stream API

## ¿Qué es una expresión lambda?

Una expresión lambda es una función anónima que puede ser pasada como argumento a un método o asignada a una variable. Proporciona una forma clara y concisa de representar una interfaz funcional (una interfaz con un solo método abstracto)

```java
// sintaxis:
(parámetros) -> expresión

// si el cuerpo tiene múltiples líneas:
(parámetros) -> {
    // Código
    return valor;
}

// ejemplo: Expresión lambda para sumar dos números
(int a, int b) -> a + b
```

## Ventajas de las expresiones lambda

- **Código más conciso y legible:** Las lambdas permiten escribir código más claro y expresivo.

- **Facilita la programación funcional:** Las lambdas son esenciales para trabajar con la Stream API y otras características funcionales.

- **Mejora la productividad:** Reducen la cantidad de código repetitivo y boilerplate.

## Referencias a métodos

Las expresiones lambda pueden reemplazarse por referencias a métodos cuando la expresión lambda simplemente invoca un método existente.

```java
// Expresión lambda que simplemente invoca el método length() de String
(String s) -> s.length();

// Referencia a método que hace lo mismo
String::length;
```

## Interfaces funcionales y lambdas

Las expresiones lambda están diseñadas para trabajar con interfaces funcionales, que son interfaces con un solo método abstracto. Java proporciona varias interfaces funcionales en el paquete `java.util.function`, como `Function`, `Consumer`, `Supplier` y `Predicate`.

```java
@FunctionalInterface
public interface MiInterfazFuncional {
    void ejecutar();
}

// Uso
public class LambdaExample {
    public static void main(String[] args) {
        // Usando una expresión lambda para implementar la interfaz funcional
        MiInterfazFuncional accion = () -> System.out.println("Hola, mundo!");
        accion.ejecutar(); // Output: Hola, mundo!
    }
}
```

## Tipos comunes de interfaces funcionales

Java proporciona varias interfaces funcionales predefinidas en el paquete `java.util.function`. Algunas de las más comunes son:

### Function<T, R>

Acepta un argumento de tipo T y devuelve un resultado de tipo R.

```java
Function<String, Integer> convertirAEntero = s -> Integer.parseInt(s);
System.out.println(convertirAEntero.apply("123")); // Output: 123
```

---

### Consumer<T>

Acepta un argumento de tipo T y no devuelve ningún resultado.

```java
Consumer<String> imprimir = s -> System.out.println(s);
imprimir.accept("Hola, mundo!"); // Output: Hola, mundo!
```

---

### Supplier<T>

No acepta argumentos y devuelve un resultado de tipo T.

```java
Supplier<Double> obtenerNumeroAleatorio = () -> Math.random();
System.out.println(obtenerNumeroAleatorio.get()); // Output: Un número aleatorio
```

---

### Predicate<T>

Acepta un argumento de tipo T y devuelve un valor booleano.

```java
Predicate<String> esVacio = s -> s.isEmpty();
System.out.println(esVacio.test("")); // Output: true
```

---

## Lambdas en la Stream API

Las expresiones lambda son ampliamente utilizadas en la Stream API para realizar operaciones sobre colecciones de manera funcional.

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLambdaExample {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Juan", "Carlos", "Maria");

        // Filtrar nombres que empiezan con "A" y convertirlos a mayúsculas
        List<String> resultado = nombres.stream()
                                       .filter(nombre -> nombre.startsWith("A"))
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());

        System.out.println(resultado); // Output: [ANA]
    }
}
```

## Buenas prácticas

- **Usa lambdas para interfaces funcionales:** Asegúrate de que la interfaz sea funcional (un solo método abstracto).

- **Evita efectos secundarios:** Las lambdas deben ser funciones puras siempre que sea posible.

- **Combina con métodos de referencia:** Usa métodos de referencia para simplificar aún más el código
