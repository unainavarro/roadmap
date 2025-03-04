<h1 align="center">Condicionales</h1>

<h2>📑 Contenido</h2>

- [Condicionales](#condicionales)
- [Sentencia if](#sentencia-if)
- [Sentencia if-else](#sentencia-if-else)
- [Sentencia if-else if-else](#sentencia-if-else-if-else)
- [Operador Ternario](#operador-ternario)
- [Sentencia switch](#sentencia-switch)
- [Switch mejorado](#switch-mejorado)

## Condicionales

Las estructuras condicionales en Java permiten la ejecución de diferentes bloques de código según ciertas condiciones. Estas estructuras incluyen `if`, `else if`, `else`, y `switch`.

## Sentencia if

La sentencia `if` evalúa una condición y ejecuta un bloque de código si la condición es verdadera.

Ejemplo

```java
int edad = 18;

if (edad >= 18) {
    System.out.println("Eres mayor de edad.");
}

// Salida: Eres mayor de edad.
```

## Sentencia if-else

Permite ejecutar un bloque de código si la condición es verdadera y otro si es falsa.

Ejemplo

```java
int edad = 16;

if (edad >= 18) {
    System.out.println("Eres mayor de edad.");
} else {
    System.out.println("Eres menor de edad.");
}

// Salida: Eres menor de edad.
```

## Sentencia if-else if-else

Se usa para evaluar múltiples condiciones en secuencia.

Ejemplo

```java
int nota = 85;

if (nota >= 90) {
    System.out.println("Sobresaliente");
} else if (nota >= 80) {
    System.out.println("Notable");
} else if (nota >= 70) {
    System.out.println("Aprobado");
} else {
    System.out.println("Reprobado");
}

// Salida: Notable
```

## Operador Ternario

El operador ternario `? :` permite escribir una condición en una sola línea.

Ejemplo

```java
int edad = 20;

String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

System.out.println(mensaje);

// Salida: Mayor de edad
```

> [!NOTE]
> El operador ternario es útil cuando necesitas asignar un valor a una variable basado en una condición simple y quieres mantener tu código compacto y legible. Sin embargo, debes tener cuidado de no abusar de su uso, ya que en algunos casos puede hacer que el código sea menos legible si se utiliza de forma excesiva.

## Sentencia switch

La sentencia `switch` evalúa una variable y ejecuta el bloque correspondiente al caso que coincida.

Ejemplo

```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Día no válido");
}

// Salida: Miércoles
```

## Switch mejorado

A partir de Java 14, `switch` permite eliminar la necesidad de `break` y permitiendo múltiples valores en un solo caso.

Ejemplo

```java
int dia = 3;

String nombreDia = switch (dia) {
    case 1 -> "Lunes";
    case 2 -> "Martes";
    case 3 -> "Miércoles";
    case 4 -> "Jueves";
    case 5 -> "Viernes";
    case 6, 7 -> "Fin de semana";
    default -> "Día no válido";
};

System.out.println(nombreDia);

// Salida: Miércoles
```

> [!NOTE]
> La estructura de control `switch` es útil cuando tienes una variable que puede tomar varios valores distintos y quieres ejecutar un bloque de código diferente para cada valor posible.
