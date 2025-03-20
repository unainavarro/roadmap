<h1 align='center'>Prototipos y herencia</h1>

<h2>📑 Contenido</h2>

- [Prototipos y herencia](#prototipos-y-herencia)
- [¿Qué es un prototipo?](#qué-es-un-prototipo)
- [Propiedad \_\_proto\_\_ y método Object.getPrototypeOf()](#propiedad-__proto__-y-método-objectgetprototypeof)
- [Herencia prototípica](#herencia-prototípica)
  - [La cadena de prototipos (prototype chain)](#la-cadena-de-prototipos-prototype-chain)

## Prototipos y herencia

En JavaScript, uno de los conceptos clave para entender cómo funciona el lenguaje es el modelo de prototipos y la herencia prototípica. A diferencia de lenguajes orientados a objetos tradicionales, como Java o C#, que utilizan un sistema basado en clases, JavaScript utiliza prototipos para definir las propiedades y métodos que los objetos pueden heredar.

## ¿Qué es un prototipo?

Un prototipo es simplemente un objeto del que otros objetos pueden heredar propiedades y métodos. Cada objeto en JavaScript tiene un prototipo, y este prototipo a su vez puede tener su propio prototipo, formando una cadena conocida como la cadena de prototipos (prototype chain).

Cuando intentas acceder a una propiedad o método en un objeto, JavaScript primero busca en el propio objeto. Si no encuentra la propiedad, sigue buscando en el prototipo del objeto. Este proceso continúa hasta llegar al prototipo base: `Object.prototype`.

```js
let persona = {
  nombre: "Juan",
  saludar: function () {
    console.log("Hola, me llamo " + this.nombre);
  },
};

let empleado = {
  profesion: "Ingeniero",
};

// Establecer el prototipo de empleado como persona
Object.setPrototypeOf(empleado, persona);

console.log(empleado.nombre); // Imprime "Juan" (heredado de persona)
empleado.saludar(); // Imprime "Hola, me llamo Juan"
```

En este ejemplo, el objeto empleado no tiene la propiedad nombre ni el método saludar, pero puede acceder a ellos a través de su prototipo, que es el objeto persona.

## Propiedad \_\_proto\_\_ y método Object.getPrototypeOf()

Cada objeto tiene una propiedad interna llamada `[[Prototype]]`, que señala a su prototipo. Aunque esta propiedad no es accesible directamente, puedes acceder a ella usando la propiedad `\_\_proto\_\_`, o de manera más formal, usando el método `Object.getPrototypeOf()`.

```js
let animal = {
  especie: "perro",
};

let miMascota = Object.create(animal);

console.log(miMascota.__proto__); // Imprime el objeto animal
console.log(Object.getPrototypeOf(miMascota)); // También imprime el objeto animal
```

Ambos enfoques permiten acceder al prototipo del objeto miMascota, que es el objeto animal.

## Herencia prototípica

La herencia prototípica es el mecanismo por el cual un objeto puede heredar propiedades y métodos de otro objeto. A diferencia de la herencia basada en clases, donde las clases son plantillas para crear objetos, en JavaScript la herencia se da directamente entre objetos.

```js
function Persona(nombre, edad) {
  this.nombre = nombre;
  this.edad = edad;
}

Persona.prototype.saludar = function () {
  console.log("Hola, me llamo " + this.nombre);
};

let juan = new Persona("Juan", 30);
juan.saludar(); // Imprime "Hola, me llamo Juan"
```

En este ejemplo:

- Definimos una función constructora Persona.
- Añadimos un método saludar al prototipo de Persona.
- Los objetos creados con el constructor Persona (como juan) pueden acceder al método saludar a través de la herencia prototípica.

### La cadena de prototipos (prototype chain)

Cuando JavaScript no encuentra una propiedad o método en un objeto, sigue buscando en la cadena de prototipos hasta llegar a `Object.prototype`, que es el prototipo de todos los objetos. Si no se encuentra la propiedad en ningún prototipo, se devuelve `undefined`.

```js
console.log(juan.toString()); // Imprime "[object Object]"
```

El método toString no está definido en Persona, pero lo hereda de Object.prototype.

> [!NOTE]
> La herencia basada en clases se ve en la sección de POO.
