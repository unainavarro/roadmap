<h1 align="center">Programación Funcional</h1>

<h2>📑 Contenido</h2>

- [Programación funcional](#programación-funcional)
- [Conceptos básicos](#conceptos-básicos)
  - [¿Qué es la programación funcional?](#qué-es-la-programación-funcional)
  - [Diferencias con la programación imperativa](#diferencias-con-la-programación-imperativa)
- [Ventajas de la programación funcional en Java](#ventajas-de-la-programación-funcional-en-java)
- [Interfaces funcionales](#interfaces-funcionales)
- [Métodos de referencia](#métodos-de-referencia)
  - [Tipos de métodos de referencia](#tipos-de-métodos-de-referencia)
    - [Referencia a un método estático](#referencia-a-un-método-estático)
    - [Referencia a un método de instancia](#referencia-a-un-método-de-instancia)
    - [Referencia a un constructor](#referencia-a-un-constructor)
  - [Ejemplo](#ejemplo)
- [Buenas prácticas](#buenas-prácticas)

## Programación funcional

La programación funcional es un paradigma de programación que trata la computación como la evaluación de funciones matemáticas y evita el uso de estados mutables y datos mutables. En Java, la programación funcional se ha vuelto más prominente a partir de la versión 8, con la introducción de características como **expresiones lambda, métodos de referencia, interfaces funcionales y Stream API**.

## Conceptos básicos

### ¿Qué es la programación funcional?

La programación funcional se basa en los siguientes principios:

- **Funciones como ciudadanos de primera clase:** Las funciones pueden ser pasadas como argumentos, devueltas como resultados y asignadas a variables.

- **Inmutabilidad:** Los datos no se modifican después de su creación. En lugar de cambiar un valor existente, se crean nuevos valores.

- **Evitar efectos secundarios:** Las funciones no deben modificar el estado fuera de su ámbito (por ejemplo, no modificar variables globales).

- **Uso de expresiones en lugar de declaraciones:** Se enfoca en "qué" hacer en lugar de "cómo" hacerlo.

### Diferencias con la programación imperativa

- **Programación imperativa:** Se centra en cómo realizar tareas paso a paso, utilizando bucles, condicionales y mutación de estado.

- **Programación funcional:** Se centra en qué se debe hacer, utilizando funciones puras y evitando la mutación de estado.

## Ventajas de la programación funcional en Java

- **Código más conciso y legible:** Las expresiones lambda y los streams permiten escribir código más claro y expresivo.

- **Facilita la paralelización:** Las operaciones funcionales son más fáciles de paralelizar (por ejemplo, usando `parallelStream`).

- **Menos errores:** Al evitar la mutación de estado y los efectos secundarios, se reducen los errores comunes.

## Interfaces funcionales

Una interfaz funcional es una interfaz que tiene exactamente un método abstracto. Java proporciona varias interfaces funcionales en el paquete `java.util.function`, como `Function`, `Consumer`, `Supplier` y `Predicate`.

```java
@FunctionalInterface
public interface MiInterfazFuncional {
    void ejecutar();
}

// Uso:
public class InterfazFuncionalExample {
    public static void main(String[] args) {
        // Usando una expresión lambda para implementar la interfaz funcional
        MiInterfazFuncional accion = () -> System.out.println("Hola, mundo!");
        accion.ejecutar(); // Output: Hola, mundo!
    }
}
```

## Métodos de referencia

Los métodos de referencia permiten reutilizar métodos existentes como expresiones lambda. Son una forma más concisa de escribir lambdas cuando ya existe un método que realiza la operación deseada.

### Tipos de métodos de referencia

#### Referencia a un método estático

```java
Clase::metodoEstatico
```

#### Referencia a un método de instancia

```java
instancia::metodo
```

#### Referencia a un constructor

```java
Clase::new
```

### Ejemplo

```java
import java.util.List;
import java.util.Arrays;

public class MetodoReferenciaExample {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Juan", "Carlos");

        // Usando referencia a método para imprimir cada elemento
        nombres.forEach(System.out::println);
    }
}
```

## Buenas prácticas

- **Usa streams para operaciones sobre colecciones:** Aprovecha la Stream API para filtrar, mapear y reducir datos.

- **Evita efectos secundarios en lambdas:** Las funciones puras son más fáciles de probar y mantener.

- **Combina programación funcional e imperativa cuando sea necesario:** No todo debe ser funcional; usa el enfoque más adecuado para cada problema.
