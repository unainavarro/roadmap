<h1 align="center">Streams</h1>

<h2>📑 Contenido</h2>

- [Streams](#streams)
- [¿Qué es un Stream?](#qué-es-un-stream)
  - [Características principales](#características-principales)
- [Ejemplo básico](#ejemplo-básico)
- [Ventajas](#ventajas)
- [Operaciones intermedias](#operaciones-intermedias)
  - [filter](#filter)
  - [map](#map)
  - [flatMap](#flatmap)
  - [sorted](#sorted)
  - [distinct](#distinct)
  - [peek](#peek)
- [Operaciones terminales](#operaciones-terminales)
  - [forEach](#foreach)
  - [collect](#collect)
  - [reduce](#reduce)
  - [count](#count)
  - [anyMatch, allMatch, noneMatch](#anymatch-allmatch-nonematch)
- [Streams paralelos](#streams-paralelos)
  - [Consideraciones](#consideraciones)
- [Ejemplo: procesar una lista de personas](#ejemplo-procesar-una-lista-de-personas)
- [Buenas prácticas](#buenas-prácticas)

## Streams

La Stream API es una de las características más poderosas introducidas en Java 8. Proporciona una forma funcional y declarativa de manipular colecciones de datos, permitiendo realizar operaciones complejas de manera concisa y eficiente.

## ¿Qué es un Stream?

Un Stream es una secuencia de elementos que soporta operaciones secuenciales y paralelas. A diferencia de las colecciones tradicionales, los streams no almacenan datos; en su lugar, proporcionan una forma de procesar datos de manera funcional.

### Características principales

- **No modifica la fuente de datos:** Las operaciones se realizan sobre una copia de los datos.

- **Lazy evaluation:** Las operaciones intermedias no se ejecutan hasta que se invoca una operación terminal.

- **Operaciones intermedias y terminales:**

  - **Intermedias:** `filter`, `map`, `flatMap`, `distinct`, `sorted`, `peek`, etc.

  - **Terminales:** `forEach`, `collect`, `reduce`, `count`, `anyMatch`, `allMatch`, `noneMatch`, etc.

## Ejemplo básico

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
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

## Ventajas

- **Código más conciso y legible:** Las operaciones se expresan de manera declarativa.

- **Facilita la paralelización:** Los streams paralelos permiten mejorar el rendimiento en operaciones intensivas.

- **Menos errores:** Al evitar la mutación de estado y los efectos secundarios, se reducen los errores comunes.

## Operaciones intermedias

Las operaciones intermedias transforman un stream en otro stream. Algunas de las operaciones intermedias más comunes son:

### filter

Filtra los elementos que cumplen una condición.

```java
List<String> nombresFiltrados = nombres.stream()
                                      .filter(nombre -> nombre.length() > 3)
                                      .collect(Collectors.toList());
```

---

### map

Transforma cada elemento del stream.

```java
List<Integer> longitudes = nombres.stream()
                                 .map(String::length)
                                 .collect(Collectors.toList());
```

---

### flatMap

Transforma cada elemento en un Stream y aplanar los resultados en un único Stream.

```java
Stream<String> flatMapped = stream.flatMap(s -> Arrays.stream(s.split(" ")));
```

---

### sorted

Ordena los elementos del stream.

```java
List<String> nombresOrdenados = nombres.stream()
                                      .sorted()
                                      .collect(Collectors.toList());
```

---

### distinct

Elimina elementos duplicados.

```java
List<String> nombresUnicos = nombres.stream()
                                   .distinct()
                                   .collect(Collectors.toList());
```

---

### peek

Realiza una acción sobre cada elemento sin alterar el Stream.

```java
stream.peek(System.out::println).collect(Collectors.toList());
```

---

## Operaciones terminales

Las operaciones terminales producen un resultado o un efecto secundario. Algunas de las operaciones terminales más comunes son:

### forEach

Realiza una acción para cada elemento del stream.

```java
nombres.stream()
       .forEach(System.out::println);
```

---

### collect

Recolecta los elementos del stream en una colección.

```java
List<String> nombresEnLista = nombres.stream()
                                    .collect(Collectors.toList());
```

---

### reduce

Combina los elementos del stream en un solo valor.

```java
Optional<String> nombresConcatenados = nombres.stream()
                                             .reduce((a, b) -> a + ", " + b);
```

---

### count

Cuenta el número de elementos en el stream.

```java
long cantidad = nombres.stream()
                      .count();
```

---

### anyMatch, allMatch, noneMatch

Verifican si algún elemento, todos los elementos o ningún elemento coinciden con un predicado.

```java
boolean anyMatch = stream.anyMatch(s -> s.startsWith("A"));
```

---

## Streams paralelos

Los streams pueden ejecutarse en paralelo para mejorar el rendimiento en operaciones intensivas.

```java
List<String> nombresFiltrados = nombres.parallelStream()
                                      .filter(nombre -> nombre.length() > 3)
                                      .collect(Collectors.toList());
```

### Consideraciones

- **Uso adecuado:** Los streams paralelos son útiles para grandes volúmenes de datos y operaciones costosas.

- **Sincronización:** Asegúrate de que las operaciones sean thread-safe.

## Ejemplo: procesar una lista de personas

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPersonasExample {
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
            new Persona("Ana", 25),
            new Persona("Juan", 30),
            new Persona("Carlos", 20),
            new Persona("Maria", 35)
        );

        // Filtrar personas mayores de 25 años y obtener sus nombres en mayúsculas
        List<String> nombres = personas.stream()
                                      .filter(p -> p.getEdad() > 25)
                                      .map(Persona::getNombre)
                                      .map(String::toUpperCase)
                                      .collect(Collectors.toList());

        System.out.println(nombres); // Output: [JUAN, MARIA]
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
```

## Buenas prácticas

- **Usa streams para operaciones sobre colecciones:** Aprovecha la Stream API para filtrar, mapear y reducir datos.

- **Evita efectos secundarios:** Las operaciones deben ser funciones puras siempre que sea posible.

- **Combina con lambdas y métodos de referencia:** Usa expresiones lambda y métodos de referencia para simplificar el código.
