<h1 align="center">Tipos de datos</h1>

<h2>📑 Contenido</h2>

- [Tipado](#tipado)
  - [Características](#características)
- [Tipos de datos](#tipos-de-datos)
  - [Datos primitivos](#datos-primitivos)
  - [Datos de referencia](#datos-de-referencia)
- [Tipos de datos envoltorio (wrapper classes)](#tipos-de-datos-envoltorio-wrapper-classes)
- [Clase especial Enum](#clase-especial-enum)
  - [Características de enum](#características-de-enum)
  - [Ejemplo avanzado con métodos y atributos](#ejemplo-avanzado-con-métodos-y-atributos)

## Tipado

Java es un lenguaje de programación fuertemente tipado. Esto significa que en Java, todos los tipos de datos de las variables deben ser declarados explícitamente y el compilador verifica los tipos de datos en tiempo de compilación para asegurar que se utilicen de manera coherente y segura a lo largo del programa.

### Características

- **Declaración de tipos:** En Java, debes declarar el tipo de datos de todas las variables antes de usarlas. Por ejemplo, int, double, String, etc.

- **Verificación de tipos en tiempo de compilación:** El compilador de Java verifica los tipos de datos en tiempo de compilación para asegurarse de que no haya asignaciones o operaciones entre tipos incompatibles. Esto ayuda a detectar errores de tipo antes de que se ejecute el programa.

- **Estricta coerción de tipos:** Java no realiza conversiones automáticas entre tipos incompatibles sin una conversión explícita del desarrollador (casting). Por ejemplo, no puedes asignar un valor double a una variable int sin una conversión explícita.

- **Fuerte restricción en las operaciones entre tipos:** En Java, no puedes realizar operaciones entre tipos de datos que no sean compatibles. Por ejemplo, no puedes sumar una cadena (String) y un número (int) sin una conversión explícita.

- **Seguridad de tipos:** La fuerte tipificación en Java ayuda a prevenir errores comunes relacionados con los tipos de datos, como errores de desbordamiento de memoria, errores de truncamiento y errores de acceso a la memoria no válidos.

## Tipos de datos

Los tipos de datos se pueden clasificar en dos categorías principales: tipos de datos primitivos y tipos de datos de referencia (también conocidos como tipos no primitivos o tipos de objetos).

Los tipos de datos primitivos se utilizan para almacenar valores simples, mientras que los tipos de datos de referencia se utilizan para almacenar referencias a objetos en la memoria. Los tipos de datos primitivos se almacenan en la pila de memoria, mientras que los objetos se almacenan en el heap de memoria.

> [!NOTE]
>
> El "heap" es una región de la memoria donde se almacenan los objetos creados durante la ejecución de un programa. Es una estructura de datos dinámica que se utiliza para asignar y desasignar memoria para objetos durante el tiempo de ejecución.

### Datos primitivos

- **No numéricos**

  - **boolean:** Un tipo de datos que puede tener uno de dos valores: true o false.
  - **char:** Un tipo de datos de 16 bits que puede almacenar un único carácter Unicode.

- **Numéricos**

  - Enteros

    - **byte:** Un tipo de datos de 8 bits que puede almacenar valores enteros en el rango de -128 a 127.
    - **short:** Un tipo de datos de 16 bits que puede almacenar valores enteros en el rango de -32,768 a 32,767.
    - **int:** Un tipo de datos de 32 bits que puede almacenar valores enteros en el rango de -2,147,483,648 a 2,147,483,647.
    - **long:** Un tipo de datos de 64 bits que puede almacenar valores enteros en el rango de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.

  - Coma flotante
    - **float:** Un tipo de datos de 32 bits que puede almacenar valores de punto flotante de precisión simple.
    - **double:** Un tipo de datos de 64 bits que puede almacenar valores de punto flotante de doble precisión.

**Ejemplos**

```java
public class EjemploDatosPrimitivos {
    public static void main(String[] args) {
        // Declaración e inicialización de variables de tipos primitivos
        int numeroEntero = 10;
        double numeroDecimal = 3.14;
        char caracter = 'A';
        boolean esVerdadero = true;

        // Imprimir los valores de las variables
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Carácter: " + caracter);
        System.out.println("Booleano: " + esVerdadero);
    }
}
```

```java
public class EjemploDatosPrimitivos {
    public static void main(String[] args) {
        // Declaración e inicialización de variables de tipos primitivos
        int edad = 25;
        double altura = 1.75;
        char inicial = 'J';
        boolean esEstudiante = true;

        // Imprimir los valores de las variables
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("¿Es estudiante?: " + esEstudiante);
    }
}
```

### Datos de referencia

- **String:** Una secuencia inmutable de caracteres Unicode.

- **Arrays:** Colecciones de elementos del mismo tipo.

- **Clases:** personalizadas: Las clases que defines en tu programa, como las que creas para representar objetos específicos en tu aplicación.

- **Interfaces:** Las definiciones de métodos que una clase puede implementar.

- **Colecciones:** Java proporciona clases como `ArrayList` y `HashMap` en el paquete `java.util` para trabajar con conjuntos dinámicos de datos.

> [!NOTE]
>
> Ejemplos más adelante en cada una de su secciones.

## Tipos de datos envoltorio (wrapper classes)

Java proporciona clases envoltorio para los tipos primitivos, lo que permite tratarlos como objetos.

<div align='center'>

| Tipo Primitivo | Clase Envoltorio |
| -------------- | ---------------- |
| int            | Integer          |
| double         | Double           |
| boolean        | Boolean          |
| char           | Character        |

</div>

```java
Integer numero = Integer.valueOf(42);
Double precio = Double.valueOf(19.99);
```

## Clase especial Enum

Un `enum` no se considera un tipo de dato primitivo en Java, como lo son int, boolean o double. Sin embargo, `enum` es una estructura especial en Java que se comporta como una clase con valores constantes predefinidos. En otras palabras, es un tipo de referencia.

Esto significa que, aunque no sea un "tipo de dato" básico, puedes usar un `enum` para definir un grupo cerrado de valores constantes, y esto es extremadamente útil en muchos escenarios de programación

Es útil cuando necesitas agrupar valores constantes que pertenecen a una categoría específica, como días de la semana, colores, estados, etc.

```java
public enum Dia {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO
}

public class TestEnum {
    public static void main(String[] args) {
        Dia dia = Dia.LUNES;
        System.out.println("El día seleccionado es: " + dia);

        // Recorrer valores de un enum
        for (Dia d : Dia.values()) {
            System.out.println(d);
        }
    }
}
```

### Características de enum

- **Valores constantes:** Los valores de un enum son inmutables y predefinidos.

- **Tipos seguros:** Garantizan que solo puedes asignar valores válidos al usar el enum.

- **Implementación de métodos:** Un enum puede tener atributos y métodos como cualquier otra clase.

- **Enumeración implícita:** Los valores son instancias de la clase enum.

### Ejemplo avanzado con métodos y atributos

```java
public enum EstadoPedido {
    NUEVO("Pedido recién creado"),
    PROCESANDO("Pedido en preparación"),
    ENVIADO("Pedido enviado al cliente"),
    COMPLETADO("Pedido entregado");

    private final String descripcion;

    // Constructor
    EstadoPedido(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método para obtener la descripción
    public String getDescripcion() {
        return descripcion;
    }
}

public class TestEstadoPedido {
    public static void main(String[] args) {
        EstadoPedido estado = EstadoPedido.ENVIADO;
        System.out.println("Estado actual: " + estado.getDescripcion());
    }
}
```
