<h1 align='center'>Módulo CommonJS</h1>

<h2>📑 Contenido</h2>

- [Módulo CommonJS](#módulo-commonjs)
- [¿Qué es CommonJS?](#qué-es-commonjs)
  - [CommonJS introduce dos conceptos fundamentales](#commonjs-introduce-dos-conceptos-fundamentales)
  - [Características principales de CommonJS](#características-principales-de-commonjs)
- [Sintaxis de CommonJS](#sintaxis-de-commonjs)
- [Importando un módulo con require](#importando-un-módulo-con-require)
- [module.exports vs. exports](#moduleexports-vs-exports)
- [Ciclo de Vida de los Módulos en CommonJS](#ciclo-de-vida-de-los-módulos-en-commonjs)
- [CommonJS vs Módulos ES](#commonjs-vs-módulos-es)

## Módulo CommonJS

Antes de que JavaScript incluyera el soporte nativo para módulos con la llegada de ES6 (ECMAScript 6), había varias soluciones creadas por la comunidad para manejar módulos y organizar el código. Una de las soluciones más populares fue CommonJS, un sistema de módulos que fue utilizado en gran medida en el entorno Node.js y sigue siendo ampliamente utilizado en aplicaciones del lado del servidor.

CommonJS define un formato de módulos que permite importar y exportar código entre archivos de una manera fácil y estructurada, ofreciendo una forma estándar para escribir código modular en JavaScript.

## ¿Qué es CommonJS?

CommonJS es una especificación que fue creada para establecer un estándar de módulos para JavaScript en entornos fuera del navegador, especialmente en entornos de servidor como Node.js. El principal objetivo de CommonJS era permitir a los desarrolladores dividir sus aplicaciones en módulos reutilizables, encapsulados y fácilmente mantenibles.

### CommonJS introduce dos conceptos fundamentales

- **require:** Una función utilizada para importar módulos en un archivo.
- **module.exports:** Un objeto utilizado para exportar código desde un archivo y hacerlo disponible para otros módulos.

### Características principales de CommonJS

- **Síncrono:** La carga de módulos en CommonJS es síncrona, lo que significa que los módulos se cargan y se evalúan en el orden en que se encuentran en el código.
- **Modularidad en el servidor:** CommonJS fue diseñado originalmente para entornos fuera del navegador, por lo que su enfoque de cargar archivos de manera síncrona es ideal para servidores donde el acceso al sistema de archivos es inmediato.
- **Compatibilidad con Node.js:** Node.js adoptó CommonJS como su sistema de módulos por defecto, lo que hizo que CommonJS se convirtiera en el estándar de facto para el desarrollo de JavaScript del lado del servidor.

## Sintaxis de CommonJS

Exportando un módulo con `module.exports`
En CommonJS, para exportar código desde un archivo y hacerlo disponible para otros módulos, se utiliza el objeto `module.exports`. Este objeto contiene todo lo que el módulo necesita exponer.

```js
// archivo: mathModule.js

function sumar(a, b) {
  return a + b;
}

function restar(a, b) {
  return a - b;
}

// Exportando las funciones con CommonJS
module.exports = {
  sumar,
  restar,
};
```

En este ejemplo, estamos exportando dos funciones (sumar y restar) utilizando `module.exports`. Ahora, otros archivos pueden importar estas funciones desde mathModule.js.

## Importando un módulo con require

Para importar un módulo en CommonJS, se utiliza la función `require()`. Esta función toma como argumento la ruta del archivo del módulo que queremos importar y devuelve el objeto que se exportó desde ese módulo.

```js
// archivo: main.js

// Importando el módulo mathModule.js
const math = require("./mathModule.js");

console.log(math.sumar(5, 3)); // 8
console.log(math.restar(9, 4)); // 5
```

Aquí estamos utilizando `require()` para cargar el módulo mathModule.js y accediendo a las funciones sumar y restar a través del objeto math.

## module.exports vs. exports

En CommonJS, puedes utilizar tanto `module.exports` como `exports` para exportar partes de un módulo. Sin embargo, hay una diferencia importante entre ambos.

- **module.exports:** Es el objeto que será devuelto cuando se importe el módulo con `require()`. Puedes asignar cualquier cosa a `module.exports`: un objeto, una función, una clase, etc.

- **exports:** Es simplemente una referencia a `module.exports`. Al principio de un archivo de módulo, `exports` apunta a `module.exports`. Puedes agregar propiedades a exports, pero si reasignas `exports` directamente, no afectará el valor de `module.exports`.

Ejemplo de `module.exports`:

```js
// archivo: saludo.js

module.exports = function (nombre) {
  return `Hola, ${nombre}`;
};
```

Este módulo exporta directamente una función anónima, lo que significa que cuando lo importemos, obtendremos la función.

Ejemplo de `exports`:

```js
// archivo: operacionesAvanzadas.js

exports.potencia = function (base, exponente) {
  return Math.pow(base, exponente);
};

exports.raizCuadrada = function (numero) {
  return Math.sqrt(numero);
};
```

Aquí, estamos añadiendo funciones a `exports`, lo cual funciona porque `exports` sigue apuntando a module.`exports`.

> [!IMPORTANT]
> Si reasignas exports a un valor, romperás la referencia a module.exports:
>
> ```js
> // NO FUNCIONARÁ COMO SE ESPERA
> exports = function () {
>   console.log("Esto no será exportado correctamente");
> };
> ```
>
> En este caso, no estamos afectando module.exports, lo que significa que cuando el módulo sea importado, la función no estará disponible.

## Ciclo de Vida de los Módulos en CommonJS

Cuando utilizas `require()` para cargar un módulo en CommonJS, ocurre un proceso en varios pasos:

- **Resolución del Módulo:** Node.js primero resuelve la ubicación del módulo. Esto puede implicar buscar en el sistema de archivos o en los módulos instalados en `node_modules`.

- **Cacheo del Módulo:** Una vez que un módulo ha sido cargado, se guarda en caché. Esto significa que si se vuelve a requerir el mismo módulo, no se ejecutará nuevamente, sino que se devolverá el módulo desde la caché. Esto es eficiente en términos de rendimiento.

- **Ejecución del Módulo:** Después de resolver el módulo, Node.js lo ejecuta. El código del módulo se ejecuta solo una vez cuando es cargado por primera vez.

- **Devolución de module.exports:** Después de que el código del módulo se ejecuta, Node.js devuelve el objeto `module.exports` a quien haya llamado `require()`.

```js
// archivo: contador.js
let contador = 0;

module.exports = {
  incrementar: () => contador++,
  valor: () => contador,
};
```

```js
// archivo: main.js
const contador1 = require("./contador");
const contador2 = require("./contador");

contador1.incrementar();
console.log(contador1.valor()); // 1
console.log(contador2.valor()); // 1, porque ambos comparten el mismo módulo en caché
```

En este ejemplo, aunque contador1 y contador2 son llamados desde `require()`, ambos están accediendo al mismo módulo cacheado, por lo que comparten el mismo valor de contador.

## CommonJS vs Módulos ES

Si bien los Módulos ES (introducidos en ES6) y CommonJS tienen propósitos similares, hay algunas diferencias clave entre ambos:

| Característica          | CommonJS                           | Módulos ES                                                        |
| ----------------------- | ---------------------------------- | ----------------------------------------------------------------- |
| Carga de módulos        | Síncrona                           | Asíncrona                                                         |
| Sintaxis de importación | `require()`                        | `import`                                                          |
| Sintaxis de exportación | `module.exports`                   | `export` / `export default`                                       |
| Uso principal           | Node.js                            | Navegadores (y Node.js con soporte moderno)                       |
| Optimización            | Menos optimizado para tree-shaking | Optimizado para tree-shaking (eliminación de código no utilizado) |
