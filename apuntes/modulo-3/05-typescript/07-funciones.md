<h1 align="center">Funciones</h1>

<h2>📑 Contenido</h2>

- [Funciones](#funciones)
- [Funciones declarativas](#funciones-declarativas)
- [Funciones de expresión](#funciones-de-expresión)
- [Funciones con tipos](#funciones-con-tipos)
- [Funciones flecha](#funciones-flecha)
- [Function type](#function-type)
- [Function overloading](#function-overloading)

## Funciones

Las funciones son bloques de código que realizan una tarea específica cuando son llamadas o invocadas. En TypeScript, al igual que en otros lenguajes de programación, las funciones pueden aceptar datos de entrada (llamados argumentos o parámetros), realizar operaciones en esos datos y devolver un resultado (llamado valor de retorno).

Las funciones pueden ser utilizadas para encapsular lógica, promover la reutilización del código, dividir tareas complejas en partes más pequeñas y facilitar el mantenimiento del código.

En TypeScript, las funciones pueden ser declarativas, expresiones, funciones flecha, y pueden tener tipos definidos explícitamente. También pueden ser utilizadas como valores y pasarlas como argumentos a otras funciones (funciones de orden superior).

## Funciones declarativas

Son las funciones definidas mediante la palabra clave function seguida por un nombre y un bloque de código.

```ts
function suma(a: number, b: number): number {
  return a + b;
}

console.log(suma(2, 3)); // Salida: 5
```

## Funciones de expresión

Son funciones que se asignan a una variable o una propiedad de un objeto.

```ts
const resta = function (a: number, b: number): number {
  return a - b;
};

console.log(resta(5, 3)); // Salida: 2
```

## Funciones con tipos

En TypeScript, podemos especificar los tipos de los parámetros y el tipo de retorno de una función.

```ts
function multiplicacion(a: number, b: number): number {
  return a * b;
}

console.log(multiplicacion(2, 4)); // Salida: 8
```

## Funciones flecha

Son una forma más concisa de escribir funciones, utilizando la sintaxis () => {}.

```ts
const division = (a: number, b: number): number => a / b;

console.log(division(10, 2)); // Salida: 5
```

## Function type

En TypeScript, podemos definir tipos de funciones para especificar la firma de una función.

```ts
type Operacion = (a: number, b: number) => number;

const suma: Operacion = (a, b) => a + b;

console.log(suma(3, 7)); // Salida: 10
```

## Function overloading

Permite definir múltiples firmas de una función y TypeScript elegirá automáticamente la implementación correcta en función de los tipos de los argumentos.

```ts
function duplicar(x: number): number;
function duplicar(x: string): string;
function duplicar(x: any): any {
  return x + x;
}

console.log(duplicar(5)); // Salida: 10
console.log(duplicar("Hola")); // Salida: "HolaHola"
```
