<h1 align="center">Funciones puras</h1>

<h2>📑 Contenido</h2>

- [Funciones puras](#funciones-puras)
- [¿Qué es una función pura?](#qué-es-una-función-pura)
  - [Dada la misma entrada, siempre devuelve la misma salida.](#dada-la-misma-entrada-siempre-devuelve-la-misma-salida)
  - [No tiene efectos secundarios.](#no-tiene-efectos-secundarios)
- [Características](#características)
  - [Predictibilidad](#predictibilidad)
  - [Reutilización](#reutilización)
  - [Facilidad de prueba](#facilidad-de-prueba)
  - [Inmutabilidad](#inmutabilidad)
- [Ejemplos](#ejemplos)
  - [Ejemplo 1: función pura básica](#ejemplo-1-función-pura-básica)
  - [Ejemplo 2: función impura](#ejemplo-2-función-impura)
  - [Ejemplo 3: función pura con objetos](#ejemplo-3-función-pura-con-objetos)

## Funciones puras

En el mundo de la programación funcional, las funciones puras son uno de los conceptos más importantes y fundamentales. Estas funciones no solo hacen que el código sea más predecible y fácil de probar, sino que también promueven la inmutabilidad y la ausencia de efectos secundarios, lo que resulta en un código más limpio y mantenible.

## ¿Qué es una función pura?

Una función pura es una función que cumple con dos condiciones principales:

### Dada la misma entrada, siempre devuelve la misma salida.

Esto significa que, independientemente de cuándo o dónde se llame la función, si los argumentos de entrada son los mismos, el resultado será siempre el mismo.

### No tiene efectos secundarios.

Una función pura no modifica ningún estado fuera de su ámbito, ni altera variables globales, ni realiza operaciones como llamadas a APIs, manipulación del DOM o escritura en bases de datos.

## Características

### Predictibilidad

Al no depender de estados externos ni producir efectos secundarios, las funciones puras son altamente predecibles. Esto facilita la depuración y el razonamiento sobre el código.

### Reutilización

Dado que no dependen de contextos externos, las funciones puras pueden ser reutilizadas en diferentes partes de la aplicación sin preocuparse por efectos colaterales.

### Facilidad de prueba

Las funciones puras son ideales para pruebas unitarias, ya que no requieren configuración previa ni limpieza posterior. Simplemente se prueba la entrada y la salida.

### Inmutabilidad

Las funciones puras no modifican sus argumentos de entrada ni ningún estado externo. En su lugar, devuelven un nuevo valor basado en los argumentos proporcionados.

## Ejemplos

### Ejemplo 1: función pura básica

```javascript
// Función pura: suma dos números
function sumar(a, b) {
  return a + b;
}

console.log(sumar(2, 3)); // Siempre devuelve 5
```

En este ejemplo, la función sumar siempre devuelve el mismo resultado para los mismos valores de a y b, y no tiene efectos secundarios.

---

### Ejemplo 2: función impura

```javascript
let contador = 0;

// Función impura: modifica un estado externo
function incrementarContador() {
  contador++;
  return contador;
}

console.log(incrementarContador()); // Depende del estado externo 'contador'
```

Esta función es impura porque modifica una variable externa (contador), lo que introduce un efecto secundario.

---

### Ejemplo 3: función pura con objetos

```javascript
// Función pura: agrega una propiedad a un objeto sin modificarlo
function agregarPropiedad(objeto, clave, valor) {
  return { ...objeto, [clave]: valor };
}

const persona = { nombre: "Juan" };
const personaActualizada = agregarPropiedad(persona, "edad", 30);

console.log(persona); // { nombre: "Juan" }
console.log(personaActualizada); // { nombre: "Juan", edad: 30 }
```

Aquí, la función agregarPropiedad no modifica el objeto original, sino que devuelve un nuevo objeto con la propiedad agregada.

---
