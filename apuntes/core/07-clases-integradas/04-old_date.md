<h1 align="center">Old Date</h1>

<h2>📑 Contenido</h2>

- [Old date](#old-date)
- [La clase date](#la-clase-date)
- [Métodos comunes](#métodos-comunes)
- [La clase calendar](#la-clase-calendar)
  - [Creación de un Objeto Calendar](#creación-de-un-objeto-calendar)
  - [Métodos Comunes de Calendar](#métodos-comunes-de-calendar)
- [La clase GregorianCalendar](#la-clase-gregoriancalendar)
  - [Creación de un Objeto GregorianCalendar](#creación-de-un-objeto-gregoriancalendar)
  - [Métodos Comunes](#métodos-comunes-1)
  - [Ejemplo práctico: calculadora de edad](#ejemplo-práctico-calculadora-de-edad)
- [Limitaciones de las Clases Antiguas](#limitaciones-de-las-clases-antiguas)

## Old date

Antes de la introducción de la API `java.time` en Java 8, el manejo de fechas y horas en Java se realizaba principalmente mediante las clases `Date`, `Calendar` y `GregorianCalendar`. Aunque estas clases siguen siendo compatibles, se consideran obsoletas en favor de la nueva API. Sin embargo, es importante entender su funcionamiento, especialmente si trabajas con código legacy.

## La clase date

La clase `Date` es una de las clases más antiguas en Java para manejar fechas y horas. Representa un punto específico en el tiempo, con una precisión de milisegundos.

Creación de un Objeto Date
Puedes crear un objeto `Date` que represente la fecha y hora actuales o una fecha específica.

```java
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Fecha y hora actuales
        Date fechaActual = new Date();
        System.out.println("Fecha y hora actuales: " + fechaActual);

        // Fecha específica (en milisegundos desde el epoch)
        long milisegundos = 1609459200000L; // 1 de enero de 2021
        Date fechaEspecifica = new Date(milisegundos);
        System.out.println("Fecha específica: " + fechaEspecifica);
    }
}
```

## Métodos comunes

- **getTime():** Devuelve el número de milisegundos desde el epoch (1 de enero de 1970).

- **setTime(long time):** Establece la fecha y hora usando milisegundos desde el epoch.

- **before(Date when) y after(Date when):** Comparan dos fechas.

```java
Date fecha1 = new Date();
Date fecha2 = new Date(fecha1.getTime() + 1000); // 1 segundo después

System.out.println("Fecha1 antes que Fecha2: " + fecha1.before(fecha2)); // true
System.out.println("Fecha1 después que Fecha2: " + fecha1.after(fecha2)); // false
```

## La clase calendar

La clase `Calendar` es una clase abstracta que proporciona métodos para convertir entre un instante en el tiempo y un conjunto de campos de calendario (como año, mes, día, hora, etc.). La clase más comúnmente utilizada que extiende `Calendar` es `GregorianCalendar`.

### Creación de un Objeto Calendar

Puedes obtener una instancia de Calendar usando el método `getInstance()`.

```java
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        System.out.println("Fecha y hora actuales: " + calendario.getTime());
    }
}
```

### Métodos Comunes de Calendar

- **get(int field):** Obtiene el valor de un campo específico (como `Calendar`.`YEAR`, `Calendar`.`MONTH`, etc.).

- **set(int field, int value):** Establece el valor de un campo específico.

- **add(int field, int amount):** Añade o resta una cantidad a un campo específico.

- **getTime():** Devuelve un objeto `Date` que representa la fecha y hora actuales del calendario.

```java
Calendar calendario = Calendar.getInstance();

// Obtener valores específicos
int año = calendario.get(Calendar.YEAR);
int mes = calendario.get(Calendar.MONTH); // Enero es 0
int dia = calendario.get(Calendar.DAY_OF_MONTH);
System.out.println("Fecha actual: " + dia + "/" + (mes + 1) + "/" + año);

// Modificar la fecha
calendario.add(Calendar.DAY_OF_MONTH, 5); // Añadir 5 días
System.out.println("Fecha modificada: " + calendario.getTime());
```

## La clase GregorianCalendar

`GregorianCalendar` es una implementación concreta de Calendar que representa el calendario gregoriano, que es el calendario utilizado en la mayoría de los países.

### Creación de un Objeto GregorianCalendar

Puedes crear un objeto `GregorianCalendar` para una fecha específica o usar la fecha y hora actuales.

```java
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        // Fecha y hora actuales
        GregorianCalendar calendario = new GregorianCalendar();
        System.out.println("Fecha y hora actuales: " + calendario.getTime());

        // Fecha específica (año, mes, día)
        GregorianCalendar fechaEspecifica = new GregorianCalendar(2021, Calendar.JANUARY, 1);
        System.out.println("Fecha específica: " + fechaEspecifica.getTime());
    }
}
```

### Métodos Comunes

- **isLeapYear(int year):** Verifica si un año es bisiesto.

- **setGregorianChange(Date date):** Establece la fecha de cambio al calendario gregoriano.

```java
GregorianCalendar calendario = new GregorianCalendar();
System.out.println("¿2020 es bisiesto? " + calendario.isLeapYear(2020)); // true
```

### Ejemplo práctico: calculadora de edad

```java
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculadoraEdad {
    public static void main(String[] args) {
        // Fecha de nacimiento (1 de enero de 1990)
        Calendar fechaNacimiento = new GregorianCalendar(1990, Calendar.JANUARY, 1);

        // Fecha actual
        Calendar fechaActual = Calendar.getInstance();

        // Calcular la edad
        int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);

        // Ajustar si aún no ha pasado el cumpleaños este año
        if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }

        System.out.println("Edad: " + edad);
    }
}
```

## Limitaciones de las Clases Antiguas

Aunque las clases `Date`, `Calendar` y `GregorianCalendar` son útiles, tienen varias limitaciones:

- **Inmutabilidad:** Date es mutable, lo que puede causar problemas en entornos concurrentes.

- **Diseño confuso:** Algunos métodos y comportamientos no son intuitivos (por ejemplo, `Calendar.MONTH` comienza en 0).

- **Falta de claridad:** No hay soporte directo para conceptos como duraciones, periodos o zonas horarias.

Por estas razones, se recomienda utilizar la API `java.time` introducida en Java 8 para nuevos desarrollos.
