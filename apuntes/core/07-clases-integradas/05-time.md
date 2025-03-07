<h1 align="center">Time</h1>

<h2>📑 Contenido</h2>

- [Time](#time)
- [¿Qué es la API java.time?](#qué-es-la-api-javatime)
  - [Principales características](#principales-características)
- [Clases principales de java.time](#clases-principales-de-javatime)
  - [LocalDate](#localdate)
  - [LocalTime](#localtime)
  - [LocalDateTime](#localdatetime)
  - [ZonedDateTime](#zoneddatetime)
  - [Duration y period](#duration-y-period)
  - [Instant](#instant)
- [Operaciones comunes con java.time](#operaciones-comunes-con-javatime)
  - [Añadir o restar tiempo](#añadir-o-restar-tiempo)
  - [Comparación de fechas](#comparación-de-fechas)
  - [Formateo y parseo](#formateo-y-parseo)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplo práctico: calculadora de edad](#ejemplo-práctico-calculadora-de-edad)

## Time

La API `java.time`, introducida en Java 8, revolucionó el manejo de fechas y horas en Java. Esta API es más clara, segura y fácil de usar que las clases antiguas (`Date`, `Calendar`, etc.).

## ¿Qué es la API java.time?

La API `java.time` es un conjunto de clases en el paquete `java.time` que proporciona un modelo inmutable y seguro para manejar fechas, horas, duraciones, periodos y zonas horarias. Está diseñada para ser más intuitiva y menos propensa a errores que las clases antiguas.

### Principales características

- **Inmutabilidad:** Todas las clases en `java.time` son inmutables, lo que las hace seguras para usar en entornos concurrentes.

- **Claridad:** Los métodos y clases tienen nombres descriptivos y comportamientos predecibles.

- **Extensibilidad:** La API es fácil de extender y personalizar.

- **Soporte para zonas horarias:** Proporciona un manejo robusto de zonas horarias y horarios de verano.

## Clases principales de java.time

A continuación, se presentan las clases más importantes de la API `java.time`.

### LocalDate

Representa una fecha sin hora ni zona horaria (año, mes, día).

```java
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);

        LocalDate fechaEspecifica = LocalDate.of(2021, 1, 1);
        System.out.println("Fecha específica: " + fechaEspecifica);
    }
}
```

### LocalTime

Representa una hora sin fecha ni zona horaria (hora, minuto, segundo, nanosegundo).

```java
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);

        LocalTime horaEspecifica = LocalTime.of(14, 30);
        System.out.println("Hora específica: " + horaEspecifica);
    }
}
```

### LocalDateTime

Combina `LocalDate` y `LocalTime` para representar una fecha y hora sin zona horaria.

```java
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println("Fecha y hora actuales: " + fechaHoraActual);

        LocalDateTime fechaHoraEspecifica = LocalDateTime.of(2021, 1, 1, 14, 30);
        System.out.println("Fecha y hora específicas: " + fechaHoraEspecifica);
    }
}
```

### ZonedDateTime

Representa una fecha y hora con una zona horaria.

```java
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime fechaHoraZonaActual = ZonedDateTime.now();
        System.out.println("Fecha y hora con zona actual: " + fechaHoraZonaActual);

        ZonedDateTime fechaHoraZonaEspecifica = ZonedDateTime.of(2021, 1, 1, 14, 30, 0, 0, ZoneId.of("Europe/Madrid"));
        System.out.println("Fecha y hora con zona específica: " + fechaHoraZonaEspecifica);
    }
}
```

### Duration y period

- **Duration:** Representa una duración en segundos y nanosegundos.

- **Period:** Representa un período en años, meses y días.

```java
import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Duración entre dos horas
        LocalTime inicio = LocalTime.of(14, 0);
        LocalTime fin = LocalTime.of(16, 30);
        Duration duracion = Duration.between(inicio, fin);
        System.out.println("Duración: " + duracion.toHours() + " horas");

        // Período entre dos fechas
        LocalDate fechaInicio = LocalDate.of(2021, 1, 1);
        LocalDate fechaFin = LocalDate.of(2021, 12, 31);
        Period periodo = Period.between(fechaInicio, fechaFin);
        System.out.println("Período: " + periodo.getMonths() + " meses y " + periodo.getDays() + " días");
    }
}
```

### Instant

Representa un instante en el tiempo (timestamp) con una precisión de nanosegundos desde el epoch (1 de enero de 1970).

```java
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Instant instanteActual = Instant.now();
        System.out.println("Instante actual: " + instanteActual);

        Instant instanteEspecifico = Instant.ofEpochSecond(1609459200); // 1 de enero de 2021
        System.out.println("Instante específico: " + instanteEspecifico);
    }
}
```

## Operaciones comunes con java.time

### Añadir o restar tiempo

Puedes añadir o restar días, meses, años, horas, etc., utilizando métodos como `plusDays()`, `minusMonths()`, etc.

```java
LocalDate fecha = LocalDate.of(2021, 1, 1);
LocalDate fechaModificada = fecha.plusDays(10).minusMonths(1);
System.out.println("Fecha modificada: " + fechaModificada);
```

### Comparación de fechas

Puedes comparar fechas usando métodos como `isBefore()`, `isAfter()` y `isEqual()`.

```java
LocalDate fecha1 = LocalDate.of(2021, 1, 1);
LocalDate fecha2 = LocalDate.of(2021, 12, 31);

System.out.println("Fecha1 antes que Fecha2: " + fecha1.isBefore(fecha2)); // true
System.out.println("Fecha1 después que Fecha2: " + fecha1.isAfter(fecha2)); // false
System.out.println("Fecha1 igual que Fecha2: " + fecha1.isEqual(fecha2)); // false
```

### Formateo y parseo

Puedes formatear y parsear fechas usando la clase `DateTimeFormatter`.

```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2021, 1, 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fecha.format(formatter);
        System.out.println("Fecha formateada: " + fechaFormateada);

        LocalDate fechaParseada = LocalDate.parse("01/01/2021", formatter);
        System.out.println("Fecha parseada: " + fechaParseada);
    }
}
```

## Buenas prácticas

- **Usa java.time para nuevos desarrollos:** Es más segura, clara y eficiente que las clases antiguas.

- **Aprovecha la inmutabilidad:** Las clases son inmutables, lo que las hace seguras en entornos concurrentes.

- **Utiliza DateTimeFormatter para formatear y parsear:** Proporciona un control preciso sobre el formato de fechas y horas.

- **Considera las zonas horarias:** Usa `ZonedDateTime` cuando sea necesario manejar zonas horarias.

## Ejemplo práctico: calculadora de edad

```java
import java.time.LocalDate;
import java.time.Period;

public class CalculadoraEdad {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1);
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, fechaActual);
        System.out.println("Edad: " + periodo.getYears() + " años");
    }
}
```
