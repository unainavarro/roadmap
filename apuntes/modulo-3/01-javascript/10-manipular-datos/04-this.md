<h1 align='center'>This</h1>

<h2>📑 Contenido</h2>

- [El contexto de this](#el-contexto-de-this)
- [¿Qué es this?](#qué-es-this)
- [El contexto de this en diferentes entornos](#el-contexto-de-this-en-diferentes-entornos)
  - [En el ámbito global (modo estricto y no estricto)](#en-el-ámbito-global-modo-estricto-y-no-estricto)
    - [Sin modo estricto](#sin-modo-estricto)
    - [Con modo estricto](#con-modo-estricto)
  - [En funciones](#en-funciones)
    - [Función regular](#función-regular)
    - [Métodos de objetos](#métodos-de-objetos)
  - [En constructores](#en-constructores)
- [Function borrowing (préstamo de funciones)](#function-borrowing-préstamo-de-funciones)

## El contexto de this

Uno de los aspectos más importantes y a veces confusos en JavaScript es el uso del valor de `this`. En este capítulo, exploraremos en detalle cómo funciona `this`, cómo cambia según el contexto de ejecución y cómo podemos manipular su comportamiento utilizando técnicas como `Function Borrowing`.

## ¿Qué es this?

En JavaScript, `this` es una palabra clave que se refiere al contexto de ejecución en el que se está ejecutando una función. El valor de `this` varía dependiendo de cómo y dónde se llame a la función. En general, `this` hace referencia al objeto "dueño" de la función que se está ejecutando en ese momento, pero ese dueño puede cambiar dependiendo de cómo se invoque la función.

```js
const persona = {
  nombre: "Ana",
  saludar: function () {
    console.log("Hola, me llamo " + this.nombre);
  },
};

persona.saludar(); // Imprime "Hola, me llamo Ana"
```

En este ejemplo, `this` dentro del método saludar se refiere al objeto persona. Por tanto, this.nombre se resuelve como "Ana".

## El contexto de this en diferentes entornos

El valor de this depende de cómo se llame a la función y en qué contexto se esté ejecutando.

### En el ámbito global (modo estricto y no estricto)

#### Sin modo estricto

En el ámbito global (fuera de una función o método), `this` hace referencia al objeto global, que es `window` en los navegadores.

```js
console.log(this); // En un navegador, imprime el objeto window
```

#### Con modo estricto

En el modo estricto (`"use strict"`), `this` en el contexto global será `undefined`.

```js
"use strict";
console.log(this); // Imprime undefined
```

### En funciones

#### Función regular

Cuando se llama a una función de forma global (fuera de cualquier objeto), `this` también apunta al objeto global, o a `undefined` en modo estricto.

```js
function mostrarThis() {
  console.log(this);
}

mostrarThis(); // En navegadores: window. En modo estricto: undefined.
```

#### Métodos de objetos

En el caso de un método de objeto (una función dentro de un objeto), `this` se refiere al objeto dueño del método.

```js
const coche = {
  marca: "Toyota",
  mostrarMarca: function () {
    console.log(this.marca);
  },
};

coche.mostrarMarca(); // Imprime "Toyota"
```

### En constructores

Cuando usamos una función constructora o la palabra clave class, this se refiere al nuevo objeto que está siendo creado. Más sobre constructores en la sección de POO.

```js
function Persona(nombre) {
  this.nombre = nombre;
}

const juan = new Persona("Juan");
console.log(juan.nombre); // Imprime "Juan"
```

## Function borrowing (préstamo de funciones)

El function borrowing (préstamo de funciones) es una técnica en la que un objeto utiliza el método de otro objeto. Esto se logra aprovechando el hecho de que el valor de this puede cambiarse dinámicamente.

```js
const perro = {
  nombre: "Firulais",
  ladrar: function () {
    console.log(this.nombre + " está ladrando.");
  },
};

const gato = {
  nombre: "Michi",
};

// Usar el método ladrar del objeto perro en el objeto gato
gato.ladrar = perro.ladrar;
gato.ladrar(); // Imprime "Michi está ladrando."
```

Aquí, gato toma prestado el método ladrar de perro. Aunque el método originalmente pertenece a perro, cuando se llama desde gato, el valor de `this` se refiere a gato, no a perro.
