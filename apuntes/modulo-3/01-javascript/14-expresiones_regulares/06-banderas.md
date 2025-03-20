<h1 align='center'>Banderas</h1>

<h2>📑 Contenido</h2>

- [Banderas](#banderas)
- [¿Qué son las banderas en RegExp?](#qué-son-las-banderas-en-regexp)
- [Bandera g: búsqueda global](#bandera-g-búsqueda-global)
- [Bandera i: insensible a mayúsculas/minúsculas](#bandera-i-insensible-a-mayúsculasminúsculas)
- [Bandera m: búsqueda multilínea](#bandera-m-búsqueda-multilínea)
- [Bandera s: punto coincide con nueva línea](#bandera-s-punto-coincide-con-nueva-línea)
- [Bandera u: habilitar soporte de unicode](#bandera-u-habilitar-soporte-de-unicode)
- [Bandera y: búsqueda pegajosa (Sticky)](#bandera-y-búsqueda-pegajosa-sticky)
- [Combinación de banderas](#combinación-de-banderas)

## Banderas

En JavaScript, las expresiones regulares (RegExp) no solo se componen de patrones, sino también de banderas (flags), que modifican el comportamiento de las búsquedas. Estas banderas permiten, por ejemplo, realizar búsquedas que no distingan entre mayúsculas y minúsculas, búsquedas globales en una cadena o búsquedas que afecten múltiples líneas. Entender las banderas disponibles y cómo usarlas es crucial para sacar el máximo provecho de las expresiones regulares.

## ¿Qué son las banderas en RegExp?

Las banderas son modificadores opcionales que puedes añadir al final de una expresión regular para cambiar la forma en que se ejecuta la búsqueda. En JavaScript, las banderas se especifican después de la barra inclinada de cierre en una expresión regular literal, o como el segundo argumento cuando se usa el constructor `RegExp()`.

Sintaxis:

- Expresión literal con bandera: `/patrón/flag`
- Expresión con el constructor `RegExp: new RegExp(patrón, flag)`

## Bandera g: búsqueda global

La bandera `g` significa búsqueda global. Al usar esta bandera, la expresión regular busca todas las coincidencias en lugar de detenerse en la primera. Sin esta bandera, una vez que se encuentra la primera coincidencia, la búsqueda se detiene.

```js
let regex = /perro/g;
let texto = "El perro corre más rápido que otro perro";
console.log(texto.match(regex)); // ["perro", "perro"]
```

Sin la bandera `g`, solo encontraría la primera aparición de "perro". Con la bandera `g`, encuentra todas las apariciones de "perro" en la cadena.

## Bandera i: insensible a mayúsculas/minúsculas

La bandera `i` hace que la expresión regular sea insensible a mayúsculas y minúsculas (case-insensitive). Esto significa que no distinguirá entre letras mayúsculas y minúsculas al buscar coincidencias.

```js
let regex = /perro/i;
console.log("Perro".match(regex)); // ["Perro"]
console.log("PERRO".match(regex)); // ["PERRO"]
```

Con la bandera `i`, la búsqueda de "perro" también coincide con "Perro" o "PERRO", lo que hace que la coincidencia sea más flexible en cuanto a la capitalización de las letras.

## Bandera m: búsqueda multilínea

La bandera `m` significa búsqueda en múltiples líneas (multiline). Esta bandera cambia el comportamiento de los límites de línea en las expresiones regulares, permitiendo que los caracteres `^` (inicio de línea) y `$` (final de línea) coincidan con el inicio o el final de cada línea de un texto, en lugar de coincidir solo con el inicio o final de la cadena completa.

```js
let regex = /^perro/gm;
let texto = `perro en la primera línea
gato en la segunda línea
perro en la tercera línea`;
console.log(texto.match(regex)); // ["perro", "perro"]
```

Con la bandera `m`, el patrón `^perro` encuentra "perro" tanto al comienzo de la cadena como al inicio de cada nueva línea.

## Bandera s: punto coincide con nueva línea

La bandera `s` convierte el punto (`.`) en un carácter que también coincide con nuevas líneas. Por defecto, el carácter `.` no coincide con saltos de línea, pero con la bandera `s`, el punto puede coincidir con cualquier carácter, incluidas las nuevas líneas (`\n`).

```js
let regex = /a.b/s;
let texto = "a\nb";
console.log(regex.test(texto)); // true
```

Sin la bandera `s`, el patrón `a.b` no coincidiría porque el carácter `.` no coincide con el salto de línea (`\n`). Con la bandera `s`, el salto de línea se incluye en la coincidencia.

## Bandera u: habilitar soporte de unicode

La bandera `u` habilita el soporte completo para Unicode en expresiones regulares. Esto es especialmente útil cuando se trabaja con caracteres especiales, como emoji o caracteres fuera del conjunto básico ASCII.

```js
let regex = /\u{1F600}/u; // Carácter Unicode para 😀 (cara sonriente)
console.log(regex.test("😀")); // true
```

La bandera `u` permite que las expresiones regulares manejen correctamente secuencias de caracteres Unicode, lo que de otra forma podría causar problemas al buscar o manipular estos caracteres.

## Bandera y: búsqueda pegajosa (Sticky)

La bandera `y` indica que la búsqueda debe ser pegajosa (sticky). Esto significa que la búsqueda solo encontrará una coincidencia si comienza exactamente desde la posición actual en la cadena (donde se encuentra el índice de la búsqueda). No intentará buscar coincidencias más adelante si no encuentra una inmediatamente.

```js
let regex = /perro/y;
let texto = "perro perro";
console.log(regex.exec(texto)); // ["perro"]
console.log(regex.exec(texto)); // null (porque la segunda coincidencia no está inmediatamente después de la primera)
```

Con la bandera `y`, la búsqueda es estrictamente pegajosa, lo que significa que si no encuentra una coincidencia justo donde está el índice actual, no continuará buscando más adelante en la cadena.

## Combinación de banderas

Puedes combinar varias banderas para crear búsquedas aún más potentes y flexibles. Por ejemplo, si deseas realizar una búsqueda global que sea insensible a mayúsculas y minúsculas, puedes usar ambas banderas `g` e `i` juntas.

```js
let regex = /perro/gi;
let texto = "Perro corre más rápido que otro perro";
console.log(texto.match(regex)); // ["Perro", "perro"]
```

Aquí, la expresión `/perro/gi` busca todas las coincidencias de "perro" (bandera `g`) y es insensible a la capitalización de las letras (bandera `i`).
