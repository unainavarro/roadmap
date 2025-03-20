<h1 align='center'>Condicionales</h1>

<h2>📑 Contenido</h2>

- [Condicionales](#condicionales)
- [La estructura if](#la-estructura-if)
- [La estructura if-else](#la-estructura-if-else)
- [La estructura if-else if-else](#la-estructura-if-else-if-else)
- [Condiciones anidadas](#condiciones-anidadas)
- [El operador ternario](#el-operador-ternario)
- [El uso de switch](#el-uso-de-switch)
- [Buenas prácticas](#buenas-prácticas)

## Condicionales

Las condicionales son una de las herramientas más fundamentales en cualquier lenguaje de programación. Permiten que un programa tome decisiones basadas en el valor de una expresión o una condición. Al usar condicionales, el flujo de ejecución del programa puede desviarse o cambiar de acuerdo a las circunstancias, en lugar de seguir siempre un camino predefinido.

Las condicionales hacen posible que un programa sea dinámico, es decir, que reaccione a diferentes datos de entrada o situaciones. Dependiendo de si una condición es verdadera o falsa, el programa ejecutará diferentes bloques de código.

## La estructura if

La instrucción `if` es la estructura condicional más simple y común en JavaScript. Evalúa una condición, y si dicha condición es verdadera (`true`), ejecuta un bloque de código. Si la condición es falsa (`false`), el bloque de código se omite.

```js
let edad = 20;

if (edad >= 18) {
  console.log("Eres mayor de edad.");
}
```

En este ejemplo, si la variable edad es mayor o igual a 18, se imprimirá el mensaje "Eres mayor de edad". Si no, el programa simplemente continuará sin ejecutar el bloque de código.

## La estructura if-else

La estructura `if-else` permite ejecutar un bloque de código cuando la condición es verdadera, y otro bloque cuando es falsa.

```js
let hora = 10;

if (hora < 12) {
  console.log("Buenos días.");
} else {
  console.log("Buenas tardes.");
}
```

En este caso, si la hora es menor a 12, se mostrará "Buenos días"; de lo contrario, se mostrará "Buenas tardes".

## La estructura if-else if-else

A veces necesitamos evaluar varias condiciones diferentes en lugar de solo dos posibles resultados. Para esto, usamos `else if`, que permite agregar más de una condición en una estructura condicional.

```js
let temperatura = 30;

if (temperatura > 30) {
  console.log("Hace calor.");
} else if (temperatura >= 20) {
  console.log("El clima es templado.");
} else {
  console.log("Hace frío.");
}
```

En este ejemplo, si la temperatura es mayor a 30, se imprime "Hace calor"; si está entre 20 y 30 inclusive, se imprime "El clima es templado"; si es menor a 20, se imprime "Hace frío".

## Condiciones anidadas

Una condición anidada es cuando hay una instrucción `if` dentro de otra. Esto permite evaluar varias condiciones en cascada, pero hay que ser cuidadoso, ya que puede hacer que el código sea más difícil de leer si se usa en exceso.

```js
let edad = 25;
let tieneLicencia = true;

if (edad >= 18) {
  if (tieneLicencia) {
    console.log("Puedes conducir.");
  } else {
    console.log("Necesitas una licencia para conducir.");
  }
} else {
  console.log("Eres menor de edad, no puedes conducir.");
}
```

En este caso, primero se verifica si la persona es mayor de edad y, dentro de esa condición, si tiene licencia o no.

## El operador ternario

El operador ternario (visto en operadores) es una forma abreviada de escribir una estructura `if-else`. Es útil para condiciones simples, donde el código es corto y directo.

```js
let esAdulto = edad >= 18 ? "Mayor de edad" : "Menor de edad";
console.log(esAdulto);
```

Aquí, si edad es mayor o igual a 18, se asigna el valor "Mayor de edad" a la variable esAdulto; de lo contrario, se asigna "Menor de edad".

## El uso de switch

El `switch` es una estructura alternativa para manejar múltiples condiciones basadas en el valor de una variable. Es especialmente útil cuando se desea comparar el valor de una variable con muchos valores posibles.

```js
let dia = "Lunes";

switch (dia) {
  case "Lunes":
    console.log("Inicio de la semana.");
    break;
  case "Miércoles":
    console.log("Mitad de semana.");
    break;
  case "Viernes":
    console.log("Fin de semana.");
    break;
  default:
    console.log("Día no reconocido.");
}
```

En este ejemplo, el switch evalúa el valor de la variable dia. Dependiendo del valor, ejecuta un bloque de código diferente. Si no coincide con ninguno de los casos, se ejecuta el bloque default.

> [!IMPORTANT]
>
> Es importante tener en cuenta que en JavaScript, el switch compara valores utilizando el operador de igualdad estricta (`===`), lo que significa que también se compara el tipo de dato.

## Buenas prácticas

- **Legibilidad:** Siempre prioriza la claridad en tu código. Evita condiciones anidadas innecesarias y usa operadores lógicos sabiamente para simplificar el código.
- **Operador ternario:** Úsalo solo cuando la expresión sea corta y fácil de entender. Si las condiciones son más complejas, es preferible usar `if-else` por razones de legibilidad.
- **switch vs. if-else:** Usa `switch` cuando trabajes con múltiples valores para una misma variable. Para comparaciones más flexibles o complejas, `if-else` es más adecuado.
- **Condiciones múltiples:** Cuando necesites combinar varias condiciones, usa `&&` (AND lógico) o `||` (OR lógico) para escribir condicionales más eficientes y limpias.
