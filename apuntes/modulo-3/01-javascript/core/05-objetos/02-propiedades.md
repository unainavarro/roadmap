<h1 align='center'>Propiedades</h1>

<h2>📑 Contenido</h2>

- [Propiedades de los objetos](#propiedades-de-los-objetos)
  - [Acceso a las propiedades](#acceso-a-las-propiedades)
    - [Notación de punto .](#notación-de-punto-)
    - [Notación de corchetes \[\]](#notación-de-corchetes-)
  - [Asignación y modificación de propiedades](#asignación-y-modificación-de-propiedades)
  - [Eliminar propiedades](#eliminar-propiedades)
- [Propiedades con nombres no válidos](#propiedades-con-nombres-no-válidos)
  - [Nombres válidos (no requieren comillas)](#nombres-válidos-no-requieren-comillas)
  - [Nombres no válidos (requieren comillas)](#nombres-no-válidos-requieren-comillas)
- [Acceso opcional a propiedades ?.](#acceso-opcional-a-propiedades-)
  - [Uso normal de encadenamiento opcional](#uso-normal-de-encadenamiento-opcional)
  - [Sin encadenamiento opcional](#sin-encadenamiento-opcional)

## Propiedades de los objetos

Las propiedades son las características que definen el estado de un objeto. Cada propiedad se asocia con una clave, que es un identificador, y un valor. Los valores de las propiedades pueden ser de cualquier tipo, incluidos otros objetos, funciones o incluso `undefined`.

### Acceso a las propiedades

Puedes acceder a las propiedades de un objeto de dos maneras:

#### Notación de punto .

```js
console.log(persona.nombre); // Imprime "Juan"
console.log(persona.edad); // Imprime 30
```

#### Notación de corchetes []

Es útil cuando la propiedad tiene caracteres especiales o se accede dinámicamente.

```js
console.log(persona["profesion"]); // Imprime "Ingeniero"

let propiedad = "edad";
console.log(persona[propiedad]); // Imprime 30
```

### Asignación y modificación de propiedades

Puedes agregar o modificar propiedades de un objeto utilizando la notación de punto o corchetes.

```js
persona.altura = 1.75; // Añade una nueva propiedad
console.log(persona.altura); // Imprime 1.75

persona.nombre = "Carlos"; // Modifica una propiedad existente
console.log(persona.nombre); // Imprime "Carlos"
```

### Eliminar propiedades

Puedes eliminar una propiedad de un objeto usando la palabra clave delete.

```js
delete persona.profesion;
console.log(persona.profesion); // Imprime undefined
```

## Propiedades con nombres no válidos

En JavaScript, cuando el nombre de una propiedad no es un nombre de enlace válido (también conocido como identificador válido) o un número válido, debes colocar el nombre de la propiedad entre comillas. Un nombre de enlace válido no puede contener espacios ni caracteres especiales, salvo el guion bajo \_ o el símbolo del dólar $. Además, no puede comenzar con un número.

### Nombres válidos (no requieren comillas)

```js
const objeto = {
  nombre: "Ana",
  edad: 25,
  profesion: "Ingeniera",
};
```

### Nombres no válidos (requieren comillas)

Si una propiedad tiene caracteres especiales, espacios, o comienza con un número, el nombre debe ir entre comillas.

```js
const persona = {
  "primer nombre": "Carlos", // Espacio en el nombre
  edad: 30,
  "2do_apellido": "Gómez", // Comienza con un número
  "país-de-origen": "España", // Guion en el nombre
};
```

Al acceder a estas propiedades, necesitas usar la notación de corchetes, ya que la notación de punto no funciona con propiedades con nombres no válidos.

```js
console.log(persona["primer nombre"]); // "Carlos"
console.log(persona["2do_apellido"]); // "Gómez"
```

## Acceso opcional a propiedades ?.

El operador de encadenamiento opcional (`?.`) en JavaScript permite acceder a propiedades de objetos de manera segura, sin lanzar errores si la propiedad o el objeto no existen. Si una propiedad o un objeto en el camino es `null` o `undefined`, el resultado será `undefined` en lugar de un error, evitando así el típico error de "Cannot read property of undefined".

```js
objeto?.propiedad;
objeto?.[propiedad];
```

### Uso normal de encadenamiento opcional

```js
const persona = {
  nombre: "Ana",
  direccion: {
    ciudad: "Madrid",
  },
};

console.log(persona?.direccion?.ciudad); // "Madrid"
console.log(persona?.trabajo?.empresa); // undefined (en lugar de lanzar un error)
```

### Sin encadenamiento opcional

Si no usas ?. y accedes a una propiedad de un objeto que es undefined, obtendrás un error.

```js
console.log(persona.trabajo.empresa); // Error: Cannot read property 'empresa' of undefined
```
