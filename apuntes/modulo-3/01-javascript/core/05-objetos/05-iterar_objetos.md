<h1 align='center'>Maneras de iterar objetos</h1>

<h2>📑 Contenido</h2>

- [Maneras de iterar objetos](#maneras-de-iterar-objetos)
- [Iteración con el bucle for...in](#iteración-con-el-bucle-forin)
- [Método Object.keys()](#método-objectkeys)
- [Método Object.values()](#método-objectvalues)
- [Método Object.entries()](#método-objectentries)
- [Bucle for...of con Object.entries()](#bucle-forof-con-objectentries)
- [Iteración con Reflect.ownKeys()](#iteración-con-reflectownkeys)

## Maneras de iterar objetos

Cuando trabajas con objetos en JavaScript, es común que necesites recorrer o iterar sobre sus propiedades. A diferencia de los arrays, los objetos no tienen un índice numérico, pero puedes iterar a través de sus claves (también llamadas propiedades) o valores utilizando diversas técnicas.

## Iteración con el bucle for...in

El bucle `for...in` es una de las formas más tradicionales de iterar sobre las propiedades de un objeto. Recorre todas las propiedades enumerables de un objeto, incluidas las heredadas.

- Itera también sobre las propiedades heredadas a menos que se use un control adicional con `hasOwnProperty`.
- No garantiza el orden de las propiedades (aunque generalmente siguen el orden de inserción en la mayoría de los navegadores modernos).

> El método `hasOwnProperty()` en JavaScript se utiliza para verificar si un objeto tiene una propiedad específica como una propiedad propia (es decir, que no se hereda del prototipo del objeto).

```js
let persona = {
  nombre: "Ana",
  edad: 30,
  profesion: "Ingeniera",
};

for (let clave in persona) {
  console.log(clave + ": " + persona[clave]);
}
```

## Método Object.keys()

El `método Object.keys()` devuelve un array con todas las propiedades enumerables propias del objeto (es decir, no incluye las heredadas). Luego, puedes utilizar cualquier bucle para recorrer las claves de este array.

- No itera sobre las propiedades heredadas.
- Permite usar cualquier método de `array`, como `forEach`, `map`, etc.

```js
let coche = {
  marca: "Toyota",
  modelo: "Corolla",
  año: 2020,
};

Object.keys(coche).forEach(function (clave) {
  console.log(clave + ": " + coche[clave]);
});
```

## Método Object.values()

`Object.values() `devuelve un array con los valores de todas las propiedades enumerables propias del objeto. Esta técnica es útil cuando solo necesitas acceder a los valores sin preocuparte por las claves.

- Ideal cuando solo te interesan los valores del objeto.
- Como con `Object.keys()`, puedes usar cualquier método de array.

```js
let persona = {
  nombre: "Carlos",
  edad: 25,
  profesion: "Diseñador",
};

Object.values(persona).forEach(function (valor) {
  console.log(valor);
});
```

## Método Object.entries()

`Object.entries()` devuelve un array de arrays donde cada sub-array contiene dos elementos: la clave y el valor de cada propiedad del objeto. Esto permite iterar sobre las propiedades y los valores simultáneamente.

- Muy útil cuando necesitas tanto las claves como los valores en cada iteración.
- Es compatible con los métodos de `array`, como `forEach` y `map`.

```js
let libro = {
  titulo: "Cien años de soledad",
  autor: "Gabriel García Márquez",
  año: 1967,
};

Object.entries(libro).forEach(function ([clave, valor]) {
  console.log(clave + ": " + valor);
});
```

## Bucle for...of con Object.entries()

Aunque el bucle for...of no puede utilizarse directamente en objetos, se puede combinar con `Object.entries()` para recorrer cada par clave-valor de un objeto.

```js
let ciudad = {
  nombre: "Barcelona",
  pais: "España",
  poblacion: 1.6,
};

for (let [clave, valor] of Object.entries(ciudad)) {
  console.log(clave + ": " + valor);
}
```

## Iteración con Reflect.ownKeys()

`Reflect.ownKeys()` es una función más avanzada que devuelve todas las claves de un objeto, incluidas las propiedades no enumerables y las propiedades simbólicas.

```js
let simbolo = Symbol("claveSimbolo");
let objeto = {
  clave1: "valor1",
  [simbolo]: "valorSimbolo",
};

Reflect.ownKeys(objeto).forEach(function (clave) {
  console.log(clave + ": " + objeto[clave]);
});
```
