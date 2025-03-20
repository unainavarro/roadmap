<h1 align='center'>Métodos de combinación</h1>

<h2>📑 Contenido</h2>

- [Métodos de combinación](#métodos-de-combinación)
- [concat()](#concat)
  - [Concatenar dos arrays](#concatenar-dos-arrays)
  - [Concatenar múltiples arrays](#concatenar-múltiples-arrays)
  - [Concatenar valores no array](#concatenar-valores-no-array)
- [flat()](#flat)
  - [Aplanar un array de un nivel de profundidad](#aplanar-un-array-de-un-nivel-de-profundidad)
  - [Aplanar múltiples niveles de profundidad](#aplanar-múltiples-niveles-de-profundidad)
  - [Aplanar un array infinitamente](#aplanar-un-array-infinitamente)
- [flatMap()](#flatmap)
  - [Transformar y aplanar un array](#transformar-y-aplanar-un-array)
  - [Filtrar y aplanar](#filtrar-y-aplanar)

## Métodos de combinación

JavaScript ofrece varios métodos poderosos para combinar, aplanar y transformar arrays. En este capítulo, cubriremos los tres métodos más importantes para combinar arrays y sus variaciones: `concat(), flat() y flatMap()`. Estos métodos permiten manipular arrays de manera eficiente, ya sea fusionando múltiples arrays, aplanando estructuras anidadas o combinando transformaciones con aplanamiento en un solo paso.

## concat()

El método `concat()` se utiliza para fusionar dos o más arrays. No modifica los arrays originales, sino que devuelve un nuevo array con los elementos combinados de los arrays proporcionados.

### Concatenar dos arrays

```js
let array1 = [1, 2, 3];
let array2 = [4, 5, 6];
let resultado = array1.concat(array2);
console.log(resultado); // [1, 2, 3, 4, 5, 6]
```

En este ejemplo, los elementos de `array1` y `array2` se fusionan en un nuevo array, sin modificar los arrays originales.

### Concatenar múltiples arrays

```js
let array1 = [1, 2];
let array2 = [3, 4];
let array3 = [5, 6];
let resultado = array1.concat(array2, array3);
console.log(resultado); // [1, 2, 3, 4, 5, 6]
```

Se pueden concatenar varios arrays a la vez, obteniendo un array resultante con todos los elementos.

### Concatenar valores no array

```js
let array = [1, 2, 3];
let resultado = array.concat(4, 5, [6, 7]);
console.log(resultado); // [1, 2, 3, 4, 5, 6, 7]
```

Se pueden concatenar arrays y valores individuales, siempre y cuando estos valores se pasen como argumentos al método `concat()`.

## flat()

El método `flat()` devuelve un nuevo array con todos los elementos de los sub-arrays concatenados en un solo nivel, lo que se conoce como aplanar un array. Puedes especificar cuántos niveles de profundidad quieres aplanar.

### Aplanar un array de un nivel de profundidad

```js
let array = [1, 2, [3, 4], [5, 6]];
let resultado = array.flat();
console.log(resultado); // [1, 2, 3, 4, 5, 6]
```

El array original tiene sub-arrays de un nivel de profundidad, y `flat()` los aplana a un solo nivel.

### Aplanar múltiples niveles de profundidad

```js
let array = [1, 2, [3, [4, 5], 6], 7];
let resultado = array.flat(2);
console.log(resultado); // [1, 2, 3, 4, 5, 6, 7]
```

En este caso, el método `flat(2)` aplana hasta el segundo nivel de sub-arrays. Si el array tuviera más niveles, podrías especificar un valor más alto para aplanar más profundamente.

### Aplanar un array infinitamente

Si no sabes cuántos niveles de anidación tiene un array, puedes utilizar Infinity como argumento para aplanarlo completamente.

```js
let array = [1, [2, [3, [4, 5]]]];
let resultado = array.flat(Infinity);
console.log(resultado); // [1, 2, 3, 4, 5]
```

El método aplana todos los niveles de sub-arrays hasta que no quede ninguno.

## flatMap()

El método `flatMap()` primero mapea cada elemento utilizando una función de mapeo y luego aplana el resultado en un solo array. Combina los métodos `map() y flat()` en una sola operación, proporcionando una manera más eficiente de transformar y aplanar arrays en una sola pasada.

> [!NOTE]
> Por defecto, flatMap() aplana el array un nivel.

### Transformar y aplanar un array

```js
let array = [1, 2, 3, 4];
let resultado = array.flatMap((x) => [x, x * 2]);
console.log(resultado); // [1, 2, 2, 4, 3, 6, 4, 8]
```

En este ejemplo, la función mapea cada elemento para devolver un array con el valor original y su doble, y luego aplana el resultado en un solo nivel.

### Filtrar y aplanar

También puedes usar `flatMap()` para combinar filtrado y aplanamiento. Por ejemplo, si deseas eliminar elementos vacíos mientras aplanas:

```js
let array = ["hola", "", "mundo"];
let resultado = array.flatMap((x) => (x === "" ? [] : [x]));
console.log(resultado); // ["hola", "mundo"]
```
