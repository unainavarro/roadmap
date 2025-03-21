<h1 align="center">Record</h1>

<h2>📑 Contenido</h2>

- [Record](#record)
- [¿Qué es un Record?](#qué-es-un-record)
  - [Declaración de un Record](#declaración-de-un-record)
- [Personalización de Records](#personalización-de-records)
  - [Constructor personalizado](#constructor-personalizado)
  - [Métodos adicionales](#métodos-adicionales)
  - [Métodos estáticos](#métodos-estáticos)
- [Comparación con clases tradicionales](#comparación-con-clases-tradicionales)
- [Limitaciones de los Records](#limitaciones-de-los-records)
- [Casos de uso comunes](#casos-de-uso-comunes)
- [Ejemplo completo](#ejemplo-completo)

## Record

En el mundo de la programación, es común encontrarse con clases que tienen como único propósito almacenar datos. Estas clases, a menudo llamadas clases de datos o DTOs (Data Transfer Objects), suelen requerir una gran cantidad de código repetitivo: constructores, métodos `getters`, `equals`, `hashCode` y `toString`. Para simplificar este patrón, Java introdujo los Records.

Los Records son una forma compacta de definir clases inmutables que contienen solo datos. Automáticamente, generan métodos como equals, hashCode, toString y los métodos de acceso (getters), lo que reduce significativamente la cantidad de código repetitivo que necesitas escribir.

## ¿Qué es un Record?

Un Record es un tipo de clase en Java que se declara con la palabra clave `record`. Su principal característica es que es inmutable, es decir, una vez creado, no se pueden modificar sus campos. Está diseñado para ser una representación simple y eficiente de datos.

### Declaración de un Record

La sintaxis para declarar un Record es la siguiente:

```java
public record NombreRecord<TipoParametro>(TipoCampo1 campo1, TipoCampo2 campo2, ...) {
    // Cuerpo opcional del Record
}
```

Por ejemplo, si queremos representar un punto en un plano 2D, podemos definir un Record de la siguiente manera:

```java
public record Punto(int x, int y) {}
```

Con esta simple declaración, Java genera automáticamente:

- Un constructor que recibe `x` e `y`.

- Métodos `x()` e `y()` para acceder a los valores.

- Métodos `equals`, `hashCode` y `toString`.

```java
public record Punto(int x, int y) {}

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(3, 4);
        Punto p2 = new Punto(3, 4);

        System.out.println(p1.x()); // 3
        System.out.println(p1.y()); // 4

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1); // Punto[x=3, y=4]
    }
}
```

## Personalización de Records

Aunque los Records generan automáticamente muchos métodos, es posible personalizarlos según tus necesidades.

### Constructor personalizado

Puedes definir un constructor personalizado para validar o transformar los datos:

```java
public record Punto(int x, int y) {
    public Punto {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Las coordenadas no pueden ser negativas");
        }
    }
}
```

### Métodos adicionales

Puedes agregar métodos adicionales a un Record:

```java
public record Punto(int x, int y) {
    public double distanciaAlOrigen() {
        return Math.sqrt(x * x + y * y);
    }
}
```

### Métodos estáticos

También puedes incluir métodos estáticos:

```java
public record Punto(int x, int y) {
    public static Punto crearPuntoEnOrigen() {
        return new Punto(0, 0);
    }
}
```

## Comparación con clases tradicionales

| Característica    | Record                     | Clase Tradicional                                   |
| ----------------- | -------------------------- | --------------------------------------------------- |
| Inmutabilidad     | Campos finales por defecto | Campos mutables (a menos que se definan como final) |
| Código repetitivo | Automáticamente generado   | Debe escribirse manualmente                         |
| Uso principal     | Almacenar datos            | Lógica compleja y datos                             |
| Herencia          | No admite herencia         | Admite herencia                                     |

## Limitaciones de los Records

No pueden extender otras clases: Los Records no pueden heredar de otras clases, ya que ya extienden implícitamente `java.lang.Record`.

- **Campos finales:** No puedes agregar campos de instancia adicionales fuera de la declaración del Record.

- **No son adecuados para lógica compleja:** Los Records están diseñados para ser simples contenedores de datos. Si necesitas lógica compleja, una clase tradicional es más apropiada.

## Casos de uso comunes

- **DTOs:** Representar datos transferidos entre capas de una aplicación.

- **Llaves en mapas:** Debido a su correcta implementación de `equals` y `hashCode`, los Records son ideales para usarse como llaves en un `Map`.

- **Valores inmutables:** Representar valores que no cambian, como coordenadas, fechas, o configuraciones.

## Ejemplo completo

```java
public record Persona(String nombre, int edad, String ciudad) {
    public Persona {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public static Persona crearPersonaDesconocida() {
        return new Persona("Desconocido", 0, "Desconocida");
    }
}

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 25, "Madrid");
        Persona p2 = Persona.crearPersonaDesconocida();

        System.out.println(p1.nombre()); // Juan
        System.out.println(p1.esMayorDeEdad()); // true
        System.out.println(p2); // Persona[nombre=Desconocido, edad=0, ciudad=Desconocida]
    }
}
```
