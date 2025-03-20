<h1 align='center'>Map</h1>

<h2>📑 Contenido</h2>

- [Map](#map)
- [Características de Map](#características-de-map)
- [Creación de un Map](#creación-de-un-map)
- [Métodos y propiedades de Map](#métodos-y-propiedades-de-map)
  - [set(clave, valor)](#setclave-valor)
  - [get(clave)](#getclave)
  - [has(clave)](#hasclave)
  - [delete(clave)](#deleteclave)
  - [clear()](#clear)
  - [size](#size)
- [Iteración en Map](#iteración-en-map)
  - [for...of](#forof)
  - [forEach()](#foreach)

## Map

Un Map es una colección de datos en la que los elementos se almacenan en pares clave-valor. A diferencia de los objetos regulares, donde las claves deben ser cadenas o símbolos, en un Map, las claves pueden ser de cualquier tipo: números, objetos, funciones, etc.

## Características de Map

- Las claves pueden ser cualquier tipo de dato, incluidos objetos y funciones.
- Los elementos en un Map se ordenan en función del orden de inserción. Esto significa que cuando iteras sobre un Map, los elementos aparecen en el mismo orden en el que fueron insertados.
- Los Maps son más adecuados que los objetos cuando necesitas asociar claves que no son cadenas o cuando el tamaño y la ordenación son importantes.

## Creación de un Map

Para crear un Map, se utiliza el constructor `Map()`

```js
let miMapa = new Map();
```

También puedes inicializar un Map con un array de pares clave-valor:

```js
let miMapa = new Map([
  ["nombre", "Juan"],
  ["edad", 25],
  [true, "verdadero"],
]);
```

## Métodos y propiedades de Map

### set(clave, valor)

Añade o actualiza un par clave-valor en el Map.

```js
miMapa.set("color", "azul");
```

### get(clave)

Devuelve el valor asociado a la clave especificada.

```js
console.log(miMapa.get("nombre")); // 'Juan'
```

### has(clave)

Verifica si una clave está presente en el Map.

```js
console.log(miMapa.has("edad")); // true
```

### delete(clave)

Elimina el par clave-valor asociado con la clave dada.

```js
miMapa.delete("edad");
```

### clear()

Elimina todos los elementos del Map.

```js
miMapa.clear();
```

### size

Devuelve el número de elementos en el Map.

```js
console.log(miMapa.size); // 0
```

## Iteración en Map

Un Map puede ser recorrido utilizando varios métodos, tales como `forEach()` o `for...of`.

### for...of

```js
let mapa = new Map([
  ["nombre", "Ana"],
  ["edad", 28],
]);

for (let [clave, valor] of mapa) {
  console.log(clave, valor);
}
// nombre Ana
// edad 28
```

### forEach()

```js
mapa.forEach((valor, clave) => {
  console.log(clave, valor);
});
```
