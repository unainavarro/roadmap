<h1 align='center'>Métodos de búsqueda</h1>

<h2>📑 Contenido</h2>

- [Métodos de búsqueda](#métodos-de-búsqueda)
- [find()](#find)
  - [Uso con objetos](#uso-con-objetos)
- [findIndex()](#findindex)
  - [Uso con objetos](#uso-con-objetos-1)
- [findLast()](#findlast)
- [findLastIndex()](#findlastindex)

## Métodos de búsqueda

JavaScript ofrece métodos potentes para realizar búsquedas dentro de arrays. Estos métodos permiten encontrar un valor específico o el índice de un valor que cumpla con una condición determinada.

## find()

El método `find() `busca y devuelve el primer elemento de un array que cumpla con una condición especificada en una función de prueba. Si no encuentra ningún elemento que cumpla la condición, devuelve undefined.

```js
let numeros = [5, 12, 8, 130, 44];
let encontrado = numeros.find(function (elemento) {
  return elemento > 10;
});
console.log(encontrado); // Devuelve 12
```

En este caso, `find()` devuelve el primer número mayor que 10, que es 12.

### Uso con objetos

También puedes usar `find()` para buscar objetos en un array de objetos. Por ejemplo, si tienes un array de personas y quieres encontrar la primera persona mayor de 18 años:

```js
let personas = [
  { nombre: "Ana", edad: 16 },
  { nombre: "Carlos", edad: 20 },
  { nombre: "Luis", edad: 18 },
];

let mayorDeEdad = personas.find(function (persona) {
  return persona.edad > 18;
});

console.log(mayorDeEdad); // Devuelve { nombre: "Carlos", edad: 20 }
```

## findIndex()

El método `findIndex()` funciona de manera similar a `find()`, pero en lugar de devolver el elemento que cumple la condición, devuelve el índice del primer elemento que la cumpla. Si ningún elemento cumple con la condición, devuelve `-1`.

```js
let numeros = [5, 12, 8, 130, 44];
let indice = numeros.findIndex(function (elemento) {
  return elemento > 10;
});
console.log(indice); // Devuelve 1
```

En este caso, `findIndex()` devuelve 1, que es el índice del número 12, el primer número mayor que 10.

### Uso con objetos

Al igual que con `find()`, puedes usar `findIndex()` para buscar índices en arrays de objetos. Por ejemplo:

```js
let personas = [
  { nombre: "Ana", edad: 16 },
  { nombre: "Carlos", edad: 20 },
  { nombre: "Luis", edad: 18 },
];

let indiceMayorDeEdad = personas.findIndex(function (persona) {
  return persona.edad > 18;
});

console.log(indiceMayorDeEdad); // Devuelve 1
```

## findLast()

El método `findLast()` es similar a `find()`, pero en lugar de buscar desde el inicio del array, busca desde el final hacia el inicio. Devuelve el último elemento que cumpla con la condición especificada.

> [!NOTE]
> Este método es relativamente nuevo y puede no estar disponible en versiones antiguas de navegadores o entornos JavaScript.

```js
let numeros = [5, 12, 8, 130, 44];
let encontradoUltimo = numeros.findLast(function (elemento) {
  return elemento > 10;
});
console.log(encontradoUltimo); // Devuelve 44
```

Aquí, `findLast()` busca desde el final del array y encuentra el último número mayor que 10, que es 44.

## findLastIndex()

El método `findLastIndex()` es la contraparte de `findIndex()`, pero realiza la búsqueda desde el final del array hacia el inicio. Devuelve el índice del último elemento que cumpla con la condición, o -1 si no encuentra ninguno.

```js
let numeros = [5, 12, 8, 130, 44];
let indiceUltimo = numeros.findLastIndex(function (elemento) {
  return elemento > 10;
});
console.log(indiceUltimo); // Devuelve 4
```

En este caso, `findLastIndex()` devuelve 4, que es el índice del último número mayor que 10, es decir, el 44.
