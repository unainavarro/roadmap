<h1 align='center'>Mutabilidad</h1>

<h2>📑 Contenido</h2>

- [Mutabilidad](#mutabilidad)
- [Mutabilidad en objetos](#mutabilidad-en-objetos)
- [Mutabilidad y referencias](#mutabilidad-y-referencias)
- [Inmutabilidad en objetos (congelación)](#inmutabilidad-en-objetos-congelación)
- [Métodos para controlar la mutabilidad](#métodos-para-controlar-la-mutabilidad)
  - [Object.freeze()](#objectfreeze)
  - [Object.seal()](#objectseal)
  - [Object.preventExtensions()](#objectpreventextensions)
- [Copia de objetos y evitar mutación](#copia-de-objetos-y-evitar-mutación)
  - [Operador de propagación (...)](#operador-de-propagación-)
  - [Object.assign()](#objectassign)
  - [Copia profunda](#copia-profunda)

## Mutabilidad

La mutabilidad en JavaScript se refiere a la capacidad de un valor para ser modificado después de su creación. En el caso de los objetos, son mutables, lo que significa que puedes cambiar sus propiedades o el valor de las mismas después de que el objeto ha sido creado. Esto es un comportamiento importante de los objetos (y arrays) en JavaScript, en contraste con los tipos primitivos, que son inmutables.

## Mutabilidad en objetos

Cuando creas un objeto y lo asignas a una variable, puedes modificar las propiedades de ese objeto directamente.

```js
const persona = { nombre: "Ana", edad: 25 };
persona.edad = 26; // Cambiamos la propiedad 'edad'
console.log(persona.edad); // 26
```

Incluso si el objeto está declarado con `const`, sus propiedades pueden modificarse, porque `const` impide la reasignación del referente (la variable persona no puede apuntar a un nuevo objeto), pero no impide modificar el contenido del objeto.

```js
const coche = { marca: "Toyota" };
coche.marca = "Honda"; // Puedes modificar la propiedad
console.log(coche.marca); // "Honda"
```

Sin embargo, no puedes reasignar la variable si está declarada con const.

```js
const coche = { marca: "Toyota" };
coche = { marca: "Ford" }; // Error: no puedes reasignar 'coche' a un nuevo objeto
```

## Mutabilidad y referencias

Cuando trabajas con objetos en JavaScript, lo que se pasa son referencias, no los valores en sí. Esto significa que si tienes múltiples variables que apuntan al mismo objeto, cambiar una afectará a todas las demás.

```js
const persona1 = { nombre: "Carlos", edad: 30 };
const persona2 = persona1; // persona2 apunta al mismo objeto que persona1

persona2.edad = 35; // Cambia la propiedad 'edad' en el objeto

console.log(persona1.edad); // 35 (ambas variables apuntan al mismo objeto)
```

Aquí, persona1 y persona2 son referencias al mismo objeto en memoria. Por lo tanto, cambiar las propiedades a través de cualquiera de las variables afecta al objeto original

## Inmutabilidad en objetos (congelación)

Aunque los objetos son mutables por defecto, hay formas de hacer que los objetos sean inmutables. Una de ellas es mediante el método Object.freeze(), que congela un objeto impidiendo que se puedan añadir, modificar o eliminar sus propiedades.

## Métodos para controlar la mutabilidad

> [!NOTE]
> Algunos de estos métodos ya se han mencionado

### Object.freeze()

Congela un objeto, impidiendo cualquier cambio en él. No permite añadir, modificar o eliminar propiedades.

```js
const objeto = { a: 1 };
Object.freeze(objeto);
objeto.a = 2; // No tiene efecto
console.log(objeto.a); // 1
```

### Object.seal()

Sella un objeto, lo que significa que no se pueden agregar ni eliminar propiedades, pero las propiedades existentes siguen siendo modificables.

```js
const objeto = { a: 1 };
Object.seal(objeto);
objeto.a = 2; // Se puede modificar la propiedad existente
objeto.b = 3; // No se puede añadir nuevas propiedades
delete objeto.a; // No se puede eliminar propiedades
console.log(objeto.a); // 2
```

### Object.preventExtensions()

Impide que se añadan nuevas propiedades al objeto, pero permite eliminar o modificar las propiedades existentes.

```js
const objeto = { a: 1 };
Object.preventExtensions(objeto);
objeto.a = 2; // Se puede modificar la propiedad existente
objeto.b = 3; // No se puede añadir nuevas propiedades
delete objeto.a; // Se puede eliminar propiedades
console.log(objeto.a); // undefined
```

## Copia de objetos y evitar mutación

Cuando deseas evitar la mutabilidad por referencia (para no afectar al objeto original), puedes realizar una copia del objeto en lugar de compartir la referencia.

### Operador de propagación (...)

Realiza una copia superficial del objeto.

```js
const original = { a: 1, b: 2 };
const copia = { ...original };

copia.a = 3; // No afecta al original
console.log(original.a); // 1 (sin cambios)
```

### Object.assign()

También hace una copia superficial de un objeto.

```js
const original = { a: 1, b: 2 };
const copia = Object.assign({}, original);

copia.a = 3; // No afecta al original
console.log(original.a); // 1
```

### Copia profunda

Si el objeto tiene objetos anidados, una copia superficial solo copia las referencias de esos objetos anidados. Para hacer una copia profunda (copiar todas las propiedades anidadas)
