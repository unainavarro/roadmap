<h1 align='center'>Binding explícito (Call, Apply y Bind)</h1>

<h2>📑 Contenido</h2>

- [Binding explícito (Call, Apply y Bind)](#binding-explícito-call-apply-y-bind)
- [El método call()](#el-método-call)
- [El Método apply()](#el-método-apply)
- [El Método bind()](#el-método-bind)
- [Diferencias entre call(), apply() y bind()](#diferencias-entre-call-apply-y-bind)

## Binding explícito (Call, Apply y Bind)

A veces, necesitamos controlar explícitamente el valor de this en una función. JavaScript nos proporciona tres métodos clave para hacer esto: `call(), apply() y bind()`. Estos métodos permiten asignar manualmente un valor específico a this al llamar a una función.

## El método call()

El método `call()` permite llamar a una función y asignarle un valor específico a `this`. Los argumentos adicionales se pasan de manera individual.

```js
function saludar(saludo) {
  console.log(saludo + ", me llamo " + this.nombre);
}

const persona = {
  nombre: "Laura",
};

saludar.call(persona, "Hola"); // Imprime "Hola, me llamo Laura"
```

En este ejemplo, `call()` cambia explícitamente el valor de `this` dentro de la función saludar, estableciéndolo como el objeto persona.

## El Método apply()

El método `apply()` es similar a `call()`, pero la diferencia clave es que `apply()` toma los argumentos como un array o un objeto similar a un array.

```js
function saludar(saludo, despedida) {
  console.log(saludo + ", me llamo " + this.nombre + ". " + despedida);
}

const persona = {
  nombre: "Laura",
};

saludar.apply(persona, ["Hola", "Adiós"]); // Imprime "Hola, me llamo Laura. Adiós"
```

En este ejemplo, `apply()` nos permite pasar los argumentos como un array, en lugar de pasarlos de manera individual.

## El Método bind()

El método `bind()` es similar a `call()` y `apply()`, pero con una diferencia importante: en lugar de ejecutar la función inmediatamente, `bind()` devuelve una nueva función con el valor de `this` permanentemente vinculado al objeto especificado. Esto permite "preparar" una función con un `this` específico y usarla más adelante.

```js
const persona = {
  nombre: "Pedro",
};

function presentarse() {
  console.log("Hola, me llamo " + this.nombre);
}

const presentacionPedro = presentarse.bind(persona);
presentacionPedro(); // Imprime "Hola, me llamo Pedro"
```

Aquí, `bind()` crea una nueva función presentacionPedro, donde `this` está permanentemente vinculado al objeto persona.

## Diferencias entre call(), apply() y bind()

- **call():** Llama a la función inmediatamente y permite pasar los argumentos de forma individual.
- **apply():** Llama a la función inmediatamente, pero los argumentos se pasan como un array.
- **bind():** No llama a la función inmediatamente. En su lugar, devuelve una nueva función con this vinculado permanentemente al valor especificado.
