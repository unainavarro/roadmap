<h1 align='center'>Promesas (promises)</h1>

<h2>📑 Contenido</h2>

- [Promesas (promises)](#promesas-promises)
- [¿Qué es una promesa?](#qué-es-una-promesa)
  - [Ejemplo de una promesa en estado pendiente](#ejemplo-de-una-promesa-en-estado-pendiente)
- [Creando una promesa](#creando-una-promesa)
- [Métodos then, catch y finally](#métodos-then-catch-y-finally)
- [Promesas encadenadas](#promesas-encadenadas)
- [Manejo de errores en promesas](#manejo-de-errores-en-promesas)
  - [Propagación de errores en cadenas](#propagación-de-errores-en-cadenas)
- [Promise.all()](#promiseall)
- [Promise.race()](#promiserace)
- [Promise.allSettled()](#promiseallsettled)
- [Promise.any()](#promiseany)

## Promesas (promises)

Las Promesas en JavaScript son una herramienta fundamental para manejar operaciones asíncronas de una manera más eficiente y estructurada que los callbacks tradicionales. Se introdujeron como una solución al problema del callback hell y ofrecen una sintaxis más clara para manejar tareas asíncronas como solicitudes de red, temporizadores o lecturas de archivos.

## ¿Qué es una promesa?

Una Promesa es un objeto que representa el eventual éxito o fracaso de una operación asíncrona. En otras palabras, es un contenedor para un valor que puede estar disponible ahora, en el futuro o nunca. Las promesas tienen tres posibles estados:

- **Pendiente (Pending):** La promesa está en proceso, pero el resultado aún no se ha determinado.
- **Resuelta (Fulfilled):** La promesa ha sido resuelta con éxito y está disponible un valor.
- **Rechazada (Rejected):** Ocurrió un error y la promesa ha sido rechazada.

### Ejemplo de una promesa en estado pendiente

```js
const miPromesa = new Promise((resolve, reject) => {
  // Operación asíncrona que puede tardar un tiempo en completarse.
});
```

En este ejemplo, la promesa está en estado pendiente, esperando a ser resuelta o rechazada.

## Creando una promesa

Para crear una promesa, se utiliza el constructor `Promise`, que toma una función con dos parámetros: resolve (para indicar que la operación fue exitosa) y reject (para indicar que la operación falló).

```js
const promesaDeEjemplo = new Promise((resolve, reject) => {
  const exito = true;

  if (exito) {
    resolve("¡Operación exitosa!"); // La promesa se resuelve.
  } else {
    reject("Ocurrió un error."); // La promesa es rechazada.
  }
});
```

- Si la condición exito es verdadera, la promesa se resuelve con el mensaje "¡Operación exitosa!".
- Si la condición exito es falsa, la promesa es rechazada con el mensaje "Ocurrió un error".

## Métodos then, catch y finally

Las promesas proporcionan tres métodos clave para manejar el resultado de una operación asíncrona:

- **then():** Se ejecuta cuando la promesa se resuelve correctamente.
- **catch():** Se ejecuta si la promesa es rechazada.
- **finally():** Se ejecuta independientemente de si la promesa fue resuelta o rechazada.

```js
promesaDeEjemplo
  .then((resultado) => {
    console.log(resultado); // "¡Operación exitosa!"
  })
  .catch((error) => {
    console.log(error); // "Ocurrió un error."
  })
  .finally(() => {
    console.log("La promesa ha terminado, independientemente del resultado.");
  });
```

- Si la promesa es resuelta, el bloque `then` se ejecutará con el valor pasado a` resolve()`.
- Si la promesa es rechazada, el bloque `catch` capturará el error y lo manejará.
- El bloque `finally` siempre se ejecuta, sea cual sea el resultado.

## Promesas encadenadas

Una de las grandes ventajas de las promesas es la capacidad de encadenar múltiples operaciones asíncronas de manera clara y concisa. Cada llamada a `then()` devuelve una nueva promesa, lo que permite encadenar más operaciones.

```js
const promesaDoble = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve(10);
  }, 1000);
});

promesaDoble
  .then((resultado) => {
    console.log(resultado); // 10
    return resultado * 2;
  })
  .then((nuevoResultado) => {
    console.log(nuevoResultado); // 20
    return nuevoResultado * 2;
  })
  .then((resultadoFinal) => {
    console.log(resultadoFinal); // 40
  });
```

- La primera promesa se resuelve después de 1 segundo con el valor 10.
- El primer `then` toma ese valor, lo multiplica por 2 y lo pasa al siguiente `then`.
- Esto continúa hasta que se obtiene el valor final 40, que se imprime en la consola.

Este encadenamiento facilita el manejo de tareas asíncronas en secuencia.

## Manejo de errores en promesas

Cuando una promesa es rechazada o algo falla en la cadena de promesas, el error puede ser capturado en un bloque `catch()`. Es importante manejar los errores adecuadamente para evitar comportamientos inesperados en el código.

```js
const promesaConError = new Promise((resolve, reject) => {
  const exito = false;

  if (exito) {
    resolve("Todo salió bien");
  } else {
    reject("Error en la operación");
  }
});

promesaConError
  .then((resultado) => {
    console.log(resultado);
  })
  .catch((error) => {
    console.log("Capturado en el catch:", error); // "Capturado en el catch: Error en la operación"
  });
```

Aquí, si ocurre un error (si exito es `false`), el bloque `catch()` lo captura y maneja.

### Propagación de errores en cadenas

Si ocurre un error en cualquier punto de una cadena de promesas, este se propagará hasta el primer bloque `catch` encontrado:

```js
promesaDoble
  .then((resultado) => {
    throw new Error("Algo salió mal");
  })
  .then((nuevoResultado) => {
    console.log(nuevoResultado);
  })
  .catch((error) => {
    console.log("Error propagado:", error.message); // "Error propagado: Algo salió mal"
  });
```

## Promise.all()

`Promise.all()` es un método útil cuando queremos ejecutar múltiples promesas en paralelo y esperar hasta que todas se hayan completado. Si una de las promesas es rechazada, `Promise.all` también será rechazada.

```js
const promesa1 = Promise.resolve(3);
const promesa2 = new Promise((resolve) => setTimeout(resolve, 1000, "foo"));
const promesa3 = Promise.resolve(42);

Promise.all([promesa1, promesa2, promesa3]).then((valores) => {
  console.log(valores); // [3, "foo", 42]
});
```

En este caso, las tres promesas se ejecutan en paralelo, y `Promise.all()` devuelve un array con los resultados cuando todas han terminado.

## Promise.race()

`Promise.race()` devuelve la primera promesa que se resuelve o se rechaza, sin esperar a que las demás terminen. Es útil cuando se quiere obtener el resultado de la operación que se completa primero.

```js
const promesaRapida = new Promise((resolve) =>
  setTimeout(resolve, 100, "Rápido")
);
const promesaLenta = new Promise((resolve) =>
  setTimeout(resolve, 1000, "Lento")
);

Promise.race([promesaRapida, promesaLenta]).then((resultado) => {
  console.log(resultado); // "Rápido"
});
```

En este ejemplo, la promesa rápida se resuelve primero, por lo que `Promise.race()` devuelve "Rápido".

## Promise.allSettled()

Este método espera a que todas las promesas del array proporcionado se hayan completado, sin importar si fueron resueltas o rechazadas. A diferencia de `Promise.all()`, `Promise.allSettled()` nunca se rechaza; devuelve un array con el estado de todas las promesas.

```js
const promesaA = Promise.resolve("Resuelta");
const promesaB = Promise.reject("Rechazada");

Promise.allSettled([promesaA, promesaB]).then((resultados) => {
  console.log(resultados);
  // [{status: "fulfilled", value: "Resuelta"}, {status: "rejected", reason: "Rechazada"}]
});
```

Este método es útil cuando se necesita el estado de todas las promesas, independientemente de si alguna falló.

## Promise.any()

`Promise.any()` devuelve la primera promesa que se resuelve correctamente. Si todas las promesas son rechazadas, entonces devuelve una promesa rechazada con un `AggregateError`.

```js
const promesaRechazada1 = Promise.reject("Error 1");
const promesaRechazada2 = Promise.reject("Error 2");
const promesaResuelta = Promise.resolve("¡Éxito!");

Promise.any([promesaRechazada1, promesaRechazada2, promesaResuelta])
  .then((resultado) => {
    console.log(resultado); // "¡Éxito!"
  })
  .catch((error) => {
    console.log(error); // Si todas las promesas son rechazadas
  });
```

En este caso, `Promise.any()` devuelve el valor de la primera promesa que se resuelve con éxito.
