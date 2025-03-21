<h1 align="center">Anotaciones</h1>

<h2>📑 Contenido</h2>

- [Anotaciones](#anotaciones)
- [¿Qué son las anotaciones?](#qué-son-las-anotaciones)
- [Anotaciones incorporadas](#anotaciones-incorporadas)
- [Creación de anotaciones personalizadas](#creación-de-anotaciones-personalizadas)
  - [Ejemplo de anotación personalizada](#ejemplo-de-anotación-personalizada)
  - [Uso de anotaciones personalizadas](#uso-de-anotaciones-personalizadas)
- [Tipos de retención](#tipos-de-retención)
- [Acceso a anotaciones en tiempo de ejecución](#acceso-a-anotaciones-en-tiempo-de-ejecución)
- [Anotaciones en frameworks populares](#anotaciones-en-frameworks-populares)
  - [Ejemplos en Spring](#ejemplos-en-spring)
  - [Ejemplos en Hibernate](#ejemplos-en-hibernate)
- [Buenas prácticas](#buenas-prácticas)

## Anotaciones

Las anotaciones en Java son una forma de metadatos que proporcionan información sobre el código sin afectar su ejecución directa. Se utilizan para configurar, documentar o modificar el comportamiento de clases, métodos, variables y otros elementos del código

## ¿Qué son las anotaciones?

Las anotaciones son una forma de añadir información adicional al código que puede ser utilizada por el compilador, herramientas de desarrollo o frameworks en tiempo de ejecución. Fueron introducidas en Java 5 y se han convertido en una parte fundamental de muchos frameworks y bibliotecas.

```java
@NombreDeAnotacion
public class MiClase {
    @NombreDeAnotacion
    public void miMetodo() {
        // Código del método
    }
}
```

## Anotaciones incorporadas

Java proporciona varias anotaciones incorporadas, como:

- **@Override:** Indica que un método sobrescribe un método de la superclase.

- **@Deprecated:** Indica que un elemento está obsoleto y no debe ser usado.

- **@SuppressWarnings:** Suprime advertencias del compilador.

## Creación de anotaciones personalizadas

Java permite la creación de anotaciones personalizadas. Para ello, se utiliza la palabra clave `@interface`.

### Ejemplo de anotación personalizada

```java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MiAnotacion {
    String valor() default "valor por defecto";
    int numero() default 0;
}
```

---

### Uso de anotaciones personalizadas

```java
@MiAnotacion(valor = "Ejemplo", numero = 42)
public class MiClase {
    @MiAnotacion
    public void miMetodo() {
        // Código del método
    }
}
```

---

## Tipos de retención

- **RetentionPolicy.SOURCE:** La anotación está disponible solo en el código fuente y es descartada por el compilador.

- **RetentionPolicy.CLASS:** La anotación está disponible en el archivo `.class` pero no en tiempo de ejecución.

- **RetentionPolicy.RUNTIME:** La anotación está disponible en tiempo de ejecución y puede ser accedida mediante reflexión.

```java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MiAnotacion {
    String valor();
}
```

## Acceso a anotaciones en tiempo de ejecución

Las anotaciones con retención `RUNTIME` pueden ser accedidas y procesadas en tiempo de ejecución usando reflexión.

```java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MiAnotacion {
    String valor();
}

public class AccesoAnotacionesExample {
    @MiAnotacion(valor = "Ejemplo")
    public void miMetodo() {
        // Código del método
    }

    public static void main(String[] args) throws Exception {
        Method metodo = AccesoAnotacionesExample.class.getMethod("miMetodo");
        MiAnotacion anotacion = metodo.getAnnotation(MiAnotacion.class);

        if (anotacion != null) {
            System.out.println("Valor de la anotación: " + anotacion.valor());
        }
    }
}
```

## Anotaciones en frameworks populares

Muchos frameworks y bibliotecas utilizan anotaciones para configurar y personalizar el comportamiento del código.

### Ejemplos en Spring

- **@Controller:** Indica que una clase es un controlador en una aplicación web.

- **@RequestMapping:** Mapea una URL a un método en un controlador.

### Ejemplos en Hibernate

- **@Entity:** Indica que una clase es una entidad persistente.

- **@Table:** Especifica la tabla de la base de datos asociada a una entidad.

## Buenas prácticas

- **Usa anotaciones para configurar y documentar:** Las anotaciones son ideales para configurar frameworks y documentar el comportamiento del código.

- **Evita el abuso de anotaciones:** No uses anotaciones para lógica compleja que podría ser mejor manejada en código.

- **Considera la retención adecuada:** Usa RetentionPolicy.RUNTIME solo cuando sea necesario acceder a la anotación en tiempo de ejecución.
