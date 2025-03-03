<h1 align="center">Constantes</h1>

<h2>📑 Contenido</h2>

- [Constantes](#constantes)
- [Declaración de Constantes](#declaración-de-constantes)
- [Uso de static final](#uso-de-static-final)
- [Beneficios de Usar Constantes](#beneficios-de-usar-constantes)
- [Buenas Prácticas en el Uso de Constantes](#buenas-prácticas-en-el-uso-de-constantes)
- [Ejemplo simple](#ejemplo-simple)
- [Ejemplo más avanzado](#ejemplo-más-avanzado)

## Constantes

Las constantes en Java son valores que no pueden ser modificados una vez asignados. Se definen usando la palabra clave `final` y suelen utilizarse para representar valores fijos como tasas de interés, valores matemáticos o configuraciones del sistema

## Declaración de Constantes

Para definir una constante en Java, se utiliza la palabra clave `final` seguida del tipo de dato y el nombre de la constante en mayúsculas, siguiendo la convención `UPPER_CASE` con palabras separadas por guion bajo.

```java
final double PI = 3.1416;
final int MAX_INTENTOS = 5;
```

## Uso de static final

Cuando una constante pertenece a una clase y no a una instancia específica, se combina con static para definir una constante de clase.

```java
public class Configuracion {
    public static final String SISTEMA_OPERATIVO = "Windows";
    public static final int VERSION = 11;
}
```

Para acceder a estas constantes:

```java
System.out.println(Configuracion.SISTEMA_OPERATIVO);
```

## Beneficios de Usar Constantes

- **Legibilidad:** Facilitan la comprensión del código al usar nombres descriptivos.

- **Mantenimiento:** Si un valor cambia, solo se actualiza en un lugar.

- **Evita errores:** Evita modificaciones accidentales de valores clave.

## Buenas Prácticas en el Uso de Constantes

- Usar nombres en mayúsculas con guion bajo (`TASA_INTERES`, `LIMITE_USUARIOS`).

- Declararlas como static final si pertenecen a una clase en general.

- Evitar valores mágicos dentro del código y reemplazarlos por constantes

## Ejemplo simple

```java
public class EjemploConstantesEnMain {
    public static void main(String[] args) {
        // Declaración de constantes en el método main
        final double PRECIO_PRODUCTO = 50.0;
        final int CANTIDAD_PRODUCTOS = 10;

        // Cálculo del total
        double total = PRECIO_PRODUCTO * CANTIDAD_PRODUCTOS;

        // Mostrar el total
        System.out.println("El total es: " + total);
    }
}
```

## Ejemplo más avanzado

```java
public class EjemploConstantes {
    // Constante global
    public static final double PI = 3.14159;

    // Constantes locales
    public void imprimirMensaje() {
        final String SALUDO = "¡Hola, mundo!";
        System.out.println(SALUDO);
    }

    public static void main(String[] args) {
        // Acceso a la constante global
        System.out.println("Valor de PI: " + EjemploConstantes.PI);

        // Creación de una instancia de la clase
        EjemploConstantes ejemplo = new EjemploConstantes();
        ejemplo.imprimirMensaje();
    }
}
```
