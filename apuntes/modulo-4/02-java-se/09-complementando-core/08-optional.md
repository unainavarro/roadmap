<h1 align="center">Optional</h1>

<h2>📑 Contenido</h2>

- [Optional](#optional)
- [¿Qué es Optional?](#qué-es-optional)
- [Métodos principales](#métodos-principales)
  - [Verificación de la presencia de un valor](#verificación-de-la-presencia-de-un-valor)
    - [isPresent()](#ispresent)
    - [isEmpty()](#isempty)
  - [Obtención del valor](#obtención-del-valor)
    - [get()](#get)
    - [orElse(T other)](#orelset-other)
    - [orElseGet(Supplier\<? extends T\> other)](#orelsegetsupplier-extends-t-other)
    - [orElseThrow(Supplier\<? extends X\> exceptionSupplier)](#orelsethrowsupplier-extends-x-exceptionsupplier)
  - [Transformación y filtrado](#transformación-y-filtrado)
    - [map(Function\<? super T, ? extends U\> mapper)](#mapfunction-super-t--extends-u-mapper)
    - [flatMap(Function\<? super T, Optional`<U>`\> mapper)](#flatmapfunction-super-t-optionalu-mapper)
    - [filter(Predicate\<? super T\> predicate)](#filterpredicate-super-t-predicate)
- [Probando métodos](#probando-métodos)
- [Buenas prácticas](#buenas-prácticas)

## Optional

La clase `Optional` fue introducida en Java 8 como una forma de manejar valores que pueden ser `null` de una manera más segura y expresiva. `Optional` es un contenedor que puede o no contener un valor no nulo. Su uso ayuda a evitar los molestos `NullPointerException` y hace que el código sea más legible y mantenible.

## ¿Qué es Optional?

`Optional` es una clase contenedora que puede contener un valor no nulo o no contener nada (es decir, estar vacío). Proporciona métodos para manejar la presencia o ausencia de un valor de manera explícita, lo que ayuda a evitar el uso de `null` y reduce el riesgo de `NullPointerException`.

```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Crear un Optional con un valor no nulo
        Optional<String> optionalConValor = Optional.of("Hola");

        // Crear un Optional vacío
        Optional<String> optionalVacio = Optional.empty();

        // Crear un Optional que puede ser nulo
        String posibleNull = null;
        Optional<String> optionalPosibleNull = Optional.ofNullable(posibleNull);
    }
}
```

## Métodos principales

`Optional` proporciona varios métodos para manejar la presencia o ausencia de un valor.

### Verificación de la presencia de un valor

#### isPresent()

Devuelve `true` si el `Optional` contiene un valor, de lo contrario `false`.

```java
Optional<String> optional = Optional.of("Hola");
if (optional.isPresent()) {
    System.out.println("Valor presente: " + optional.get());
}
```

#### isEmpty()

Devuelve `true` si el `Optional` está vacío, de lo contrario `false` (introducido en Java 11).

```java
Optional<String> optional = Optional.empty();
if (optional.isEmpty()) {
    System.out.println("Optional vacío");
}
```

---

### Obtención del valor

#### get()

Devuelve el valor si está presente, de lo contrario lanza una excepción `NoSuchElementException`.

```java
Optional<String> optional = Optional.of("Hola");
String valor = optional.get(); // "Hola"
```

#### orElse(T other)

Devuelve el valor si está presente, de lo contrario devuelve el valor por defecto proporcionado.

```java
Optional<String> optional = Optional.empty();
String valor = optional.orElse("Valor por defecto"); // "Valor por defecto"
```

#### orElseGet(Supplier<? extends T> other)

Devuelve el valor si está presente, de lo contrario invoca el `Supplier` proporcionado y devuelve su resultado.

```java
Optional<String> optional = Optional.empty();
String valor = optional.orElseGet(() -> "Valor por defecto"); // "Valor por defecto"
```

#### orElseThrow(Supplier<? extends X> exceptionSupplier)

Devuelve el valor si está presente, de lo contrario lanza una excepción proporcionada por el `Supplier`.

```java
Optional<String> optional = Optional.empty();
String valor = optional.orElseThrow(() -> new RuntimeException("Valor no presente"));
```

---

### Transformación y filtrado

#### map(Function<? super T, ? extends U> mapper)

Aplica una función al valor si está presente y devuelve un `Optional` con el resultado.

```java
Optional<String> optional = Optional.of("Hola");
Optional<Integer> longitud = optional.map(String::length); // Optional[4]
```

#### flatMap(Function<? super T, Optional`<U>`> mapper)

Similar a map, pero la función debe devolver un `Optional`.

```java
Optional<String> optional = Optional.of("Hola");
Optional<Integer> longitud = optional.flatMap(s -> Optional.of(s.length())); // Optional[4]
```

#### filter(Predicate<? super T> predicate)

Devuelve un `Optional` con el valor si está presente y cumple con el predicado, de lo contrario devuelve un `Optional` vacío.

```java
Optional<String> optional = Optional.of("Hola");
Optional<String> filtrado = optional.filter(s -> s.length() > 5); // Optional.empty
```

---

## Probando métodos

`Optional` es útil para devolver valores opcionales en métodos, lo que hace explícito que el valor puede estar ausente.

```java
import java.util.Optional;

public class OptionalMethodExample {
    public static Optional<String> encontrarNombrePorId(int id) {
        if (id == 1) {
            return Optional.of("Juan");
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        Optional<String> nombre = encontrarNombrePorId(1);
        nombre.ifPresent(System.out::println); // Juan

        nombre = encontrarNombrePorId(2);
        nombre.ifPresentOrElse(
            System.out::println,
            () -> System.out.println("Nombre no encontrado")
        ); // Nombre no encontrado
    }
}
```

## Buenas prácticas

- **No uses Optional para campos de clase:** `Optional` está diseñado principalmente para devolver valores opcionales en métodos, no para ser usado como campos de clase.

- **Evita el uso excesivo de Optional:** No uses `Optional` para todos los métodos que pueden devolver `null`. Úsalo cuando tenga sentido semántico.

- **No uses Optional.get() sin verificar:** Siempre verifica si el valor está presente antes de llamar a `get()` para evitar `NoSuchElementException`.

- **Prefiere orElse o orElseGet para valores por defecto:** Estos métodos son más seguros que `get()`.
