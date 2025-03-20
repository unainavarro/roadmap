<h1 align='center'>Objetos</h1>

<h2>📑 Contenido</h2>

- [Objetos](#objetos)
- [¿Qué es un objeto?](#qué-es-un-objeto)
- [Creación de objetos](#creación-de-objetos)
  - [Literal de objeto](#literal-de-objeto)
  - [Objeto object](#objeto-object)
  - [Constructor de función](#constructor-de-función)

## Objetos

Los objetos en JavaScript son una de las estructuras de datos más importantes y flexibles. Son utilizados para representar entidades del mundo real o abstraer funcionalidades del código. Los objetos están formados por propiedades y métodos que permiten almacenar información y realizar acciones.

## ¿Qué es un objeto?

Un objeto en JavaScript es una colección de pares clave-valor. Cada clave (también llamada propiedad) está asociada a un valor que puede ser cualquier tipo de dato: un número, una cadena de texto, una función, otro objeto, etc.

```js
let persona = {
  nombre: "Juan",
  edad: 30,
  profesion: "Ingeniero",
};
```

En este ejemplo, el objeto persona tiene tres propiedades: `nombre`, `edad` y `profesion`. Los valores de estas propiedades son `"Juan"`, `30` y `"Ingeniero"`, respectivamente.

## Creación de objetos

Existen varias formas de crear objetos en JavaScript. Vamos a explorar algunas de las más comunes.

### Literal de objeto

Es la forma más simple de crear un objeto. Se utiliza la notación de llaves {} para definir un conjunto de propiedades y valores.

```js
let perro = {
  nombre: "Rex",
  raza: "Labrador",
  ladrar: function () {
    console.log("Guau guau");
  },
};
```

### Objeto object

Puedes crear un objeto utilizando el constructor Object().

```js
let gato = new Object();
gato.nombre = "Miau";
gato.ronronear = function () {
  console.log("Prrr");
};

gato.ronronear(); // Imprime "Prrr"
```

### Constructor de función

Es una técnica avanzada para crear múltiples objetos similares. Un constructor de función actúa como una plantilla para crear objetos con las mismas propiedades y métodos.

```js
function Persona(nombre, edad) {
  this.nombre = nombre;
  this.edad = edad;
  this.saludar = function () {
    console.log("Hola, soy " + this.nombre);
  };
}

let persona1 = new Persona("Carlos", 28);
let persona2 = new Persona("María", 22);

persona1.saludar(); // Imprime "Hola, soy Carlos"
persona2.saludar(); // Imprime "Hola, soy María"
```
