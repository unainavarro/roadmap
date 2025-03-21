<h1 align="center">Pipes</h1>

<h2>📑 Contenido</h2>

- [Pipes](#pipes)
- [¿Qué son las Pipes?](#qué-son-las-pipes)
  - [Características principales](#características-principales)
- [Ventajas de las tuberías](#ventajas-de-las-tuberías)
- [Construcción de tuberías](#construcción-de-tuberías)
  - [Tuberías complejas](#tuberías-complejas)
- [Buenas prácticas](#buenas-prácticas)

## Pipes

En el contexto de la programación funcional y la Stream API de Java, el concepto de pipes (tuberías) se refiere a la composición de operaciones en una secuencia, donde la salida de una operación se convierte en la entrada de la siguiente. Este enfoque permite construir flujos de procesamiento de datos de manera modular y declarativa.

## ¿Qué son las Pipes?

Las pipes son una forma de encadenar operaciones en una secuencia, donde cada operación toma la salida de la anterior como entrada. En Java, este concepto se implementa principalmente a través de la Stream API, donde las operaciones intermedias (como `filter`, `map`, `sorted`, etc.) se pueden encadenar para formar una tubería de procesamiento.

### Características principales

- **Composición de operaciones:** Las operaciones se encadenan en una secuencia.

- **Flujo de datos:** Los datos fluyen a través de las operaciones en una sola dirección.

- **Lazy evaluation:** Las operaciones no se ejecutan hasta que se invoca una operación terminal.

## Ventajas de las tuberías

- **Modularidad:** Cada operación es independiente y puede ser reutilizada.

- **Legibilidad:** El código es más claro y expresivo.

- **Eficiencia:** Las operaciones se ejecutan de manera lazy, optimizando el rendimiento.

## Construcción de tuberías

La construcción de tuberías implica encadenar operaciones intermedias y finalizar con una operación terminal.

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PipeConstructionExample {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Juan", "Carlos", "Maria");

        // Crear una tubería de operaciones
        List<String> resultado = nombres.stream()
                                       .filter(nombre -> nombre.length() > 3)
                                       .map(String::toUpperCase)
                                       .sorted()
                                       .collect(Collectors.toList());

        System.out.println(resultado); // Output: [CARLOS, MARIA]
    }
}
```

### Tuberías complejas

Las tuberías pueden ser tan complejas como sea necesario, combinando múltiples operaciones intermedias.

```java
List<String> resultadoComplejo = nombres.stream()
                                        .filter(nombre -> nombre.length() > 3)
                                        .map(String::toUpperCase)
                                        .sorted()
                                        .distinct()
                                        .collect(Collectors.toList());
```

## Buenas prácticas

- **Encadenar operaciones de manera lógica:** Asegúrate de que cada operación tenga un propósito claro en la tubería.

- **Evitar efectos secundarios:** Las operaciones deben ser funciones puras siempre que sea posible.

- **Usar métodos de referencia:** Simplifica el código utilizando métodos de referencia cuando sea apropiado.
