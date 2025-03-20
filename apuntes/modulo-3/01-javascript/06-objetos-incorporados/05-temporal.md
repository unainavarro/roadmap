<h1 align="center">Temporal</h1>

<h2>📑 Contenido</h2>

- [Temporal](#temporal)
- [Limitaciones del objeto date](#limitaciones-del-objeto-date)
  - [API confusa](#api-confusa)
  - [Inmutabilidad](#inmutabilidad)
  - [Soporte limitado para zonas horarias](#soporte-limitado-para-zonas-horarias)
  - [Falta de operaciones comunes](#falta-de-operaciones-comunes)
- [Introducción a la API temporal](#introducción-a-la-api-temporal)
  - [Características principales de temporal](#características-principales-de-temporal)
  - [Inmutabilidad](#inmutabilidad-1)
  - [API intuitiva](#api-intuitiva)
  - [Tipos específicos para diferentes casos de uso](#tipos-específicos-para-diferentes-casos-de-uso)
  - [Tipos de objetos en temporal](#tipos-de-objetos-en-temporal)
- [Ejemplos](#ejemplos)
  - [Ejemplo 1: crear una fecha](#ejemplo-1-crear-una-fecha)
  - [Ejemplo 2: sumar días a una fecha](#ejemplo-2-sumar-días-a-una-fecha)
  - [Ejemplo 3: comparar fechas](#ejemplo-3-comparar-fechas)
  - [Ejemplo 4: manejo de zonas horarias](#ejemplo-4-manejo-de-zonas-horarias)
  - [Ejemplo 5: calcular la diferencia entre dos fechas](#ejemplo-5-calcular-la-diferencia-entre-dos-fechas)
- [Beneficios de usar temporal](#beneficios-de-usar-temporal)

## Temporal

El manejo de fechas y horas es una tarea común en el desarrollo de aplicaciones, pero en JavaScript, el objeto `Date` ha sido históricamente una fuente de frustración para los desarrolladores debido a su API confusa y limitada. Para abordar estos problemas, se ha propuesto una nueva API llamada Temporal, que ofrece una forma más moderna, intuitiva y robusta de trabajar con fechas y horas.

## Limitaciones del objeto date

El objeto Date en JavaScript ha sido la forma estándar de manejar fechas y horas desde los inicios del lenguaje. Sin embargo, tiene varias limitaciones:

### API confusa

Métodos como `getMonth()` (que devuelve un índice basado en 0) o `getYear()` (que devuelve el año menos 1900) pueden ser difíciles de entender y propensos a errores.

### Inmutabilidad

Los objetos `Date` son mutables, lo que significa que métodos como `setMonth()` modifican el objeto original en lugar de devolver uno nuevo.

### Soporte limitado para zonas horarias

El manejo de zonas horarias es complicado y requiere el uso de bibliotecas externas como `moment-timezone` o `date-fns-tz`.

### Falta de operaciones comunes

Operaciones como sumar días, comparar fechas o calcular diferencias de tiempo no están integradas de forma nativa y requieren código adicional.

## Introducción a la API temporal

La API `Temporal` es una propuesta que busca resolver estas limitaciones proporcionando una forma más moderna y consistente de trabajar con fechas y horas en JavaScript. Aunque aún no es parte oficial del estándar ECMAScript (a octubre de 2023), está en etapa avanzada de desarrollo y puede ser usada mediante polyfills o en entornos experimentales.

### Características principales de temporal

### Inmutabilidad

Los objetos Temporal son inmutables, lo que significa que cualquier operación devuelve un nuevo objeto en lugar de modificar el original.

### API intuitiva

Proporciona métodos claros y consistentes para realizar operaciones comunes, como sumar días, comparar fechas o manejar zonas horarias.

Soporte avanzado para zonas horarias:
Incluye soporte nativo para zonas horarias y cálculos de tiempo basados en UTC.

### Tipos específicos para diferentes casos de uso

`Temporal` introduce varios tipos, como `Temporal.Date`, `Temporal.Time`, `Temporal.DateTime`, `Temporal.Duration`, y más, para manejar diferentes aspectos de fechas y horas.

### Tipos de objetos en temporal

La API Temporal define varios tipos para manejar diferentes aspectos de fechas y horas:

**Temporal.Date:** <br>
Representa una fecha sin tiempo ni zona horaria.

**Temporal.Time:** <br>
Representa una hora sin fecha ni zona horaria.

**Temporal.DateTime:** <br>
Representa una fecha y hora sin zona horaria.

**Temporal.ZonedDateTime:** <br>
Representa una fecha y hora en una zona horaria específica.

**Temporal.Duration:** <br>
Representa una duración de tiempo, como "2 horas y 30 minutos".

**Temporal.Instant:** <br>
Representa un punto específico en el tiempo, independiente de la zona horaria.

## Ejemplos

### Ejemplo 1: crear una fecha

```javascript
// Crear una fecha con Temporal
const fecha = Temporal.Date.from("2023-10-15");
console.log(fecha.toString()); // "2023-10-15"
```

### Ejemplo 2: sumar días a una fecha

```javascript
// Sumar 5 días a una fecha
const fecha = Temporal.Date.from("2023-10-15");
const nuevaFecha = fecha.add({ days: 5 });
console.log(nuevaFecha.toString()); // "2023-10-20"
```

### Ejemplo 3: comparar fechas

```javascript
// Comparar dos fechas
const fecha1 = Temporal.Date.from("2023-10-15");
const fecha2 = Temporal.Date.from("2023-10-20");

console.log(fecha1.compare(fecha2)); // -1 (fecha1 es anterior a fecha2)
```

### Ejemplo 4: manejo de zonas horarias

```javascript
// Crear una fecha y hora en una zona horaria específica
const zonedDateTime = Temporal.ZonedDateTime.from({
  timeZone: "America/New_York",
  year: 2023,
  month: 10,
  day: 15,
  hour: 14,
  minute: 30,
});

console.log(zonedDateTime.toString());
// "2023-10-15T14:30:00-04:00[America/New_York]"
```

### Ejemplo 5: calcular la diferencia entre dos fechas

```javascript
// Calcular la diferencia entre dos fechas
const fecha1 = Temporal.Date.from("2023-10-15");
const fecha2 = Temporal.Date.from("2023-10-20");
const duracion = fecha2.difference(fecha1, { largestUnit: "days" });

console.log(duracion.toString()); // "P5D" (5 días)
```

## Beneficios de usar temporal

- **Código más claro y mantenible:**
  La API es intuitiva y evita los errores comunes asociados con el objeto `Date`.

- **Inmutabilidad:**
  Al ser inmutable, `Temporal` promueve un enfoque funcional y reduce los efectos secundarios.

- **Soporte nativo para zonas horarias:**
  Simplifica el manejo de zonas horarias sin necesidad de bibliotecas externas.

- **Operaciones comunes integradas:**
  Proporciona métodos para realizar operaciones como sumar días, comparar fechas o calcular duraciones.
