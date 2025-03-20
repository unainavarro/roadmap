<h1 align='center'>Sintaxis</h1>

<h2>📑 Contenido</h2>

- [Sintaxis](#sintaxis)
- [Punto y coma (semicolon)](#punto-y-coma-semicolon)
- [Espacios en blanco](#espacios-en-blanco)
- [¿Qué son las palabras clave?](#qué-son-las-palabras-clave)
- [El Modo estricto: "use strict"](#el-modo-estricto-use-strict)
  - [Modo estricto en todo el script](#modo-estricto-en-todo-el-script)
  - [Modo estricto solo dentro de una función](#modo-estricto-solo-dentro-de-una-función)
  - [Beneficios de "use strict"](#beneficios-de-use-strict)
- [Comentarios](#comentarios)
  - [Comentarios de línea](#comentarios-de-línea)
  - [Comentarios de bloque](#comentarios-de-bloque)

## Sintaxis

JavaScript, como cualquier lenguaje de programación, tiene una serie de reglas y convenciones de sintaxis que determinan cómo deben escribirse sus instrucciones. Estas reglas afectan desde la estructura general del código hasta pequeños detalles como la posición de espacios en blanco o el uso de punto y coma. En este capítulo, repasaremos los aspectos esenciales de la sintaxis en JavaScript, incluyendo el uso de punto y coma, espacios en blanco, el modo estricto (use strict) y cómo escribir comentarios.

## Punto y coma (semicolon)

En JavaScript, el punto y coma (`;`) se utiliza para marcar el final de una sentencia o instrucción. Aunque JavaScript tiene un mecanismo llamado inserción automática de punto y coma (ASI: Automatic Semicolon Insertion), lo que significa que el lenguaje puede añadir puntos y comas donde no se han colocado explícitamente, es una buena práctica utilizarlos para evitar errores inesperados.

```js
return;
{
  nombre: "Juan";
}
```

Este código no devolverá el objeto `{ nombre: "Juan" }` como se esperaría. Debido a la ASI, JavaScript insertará un punto y coma justo después de `return`, haciendo que la función devuelva `undefined`.

Por eso, siempre es recomendable usar punto y coma de forma explícita para evitar confusiones.

## Espacios en blanco

Los espacios en blanco (espacios, tabulaciones y saltos de línea) en JavaScript no afectan la ejecución del programa, pero tienen un papel crucial en la **legibilidad** del código. Usar espacios en blanco correctamente puede hacer que el código sea más fácil de entender para otros desarrolladores (y para ti mismo en el futuro).

## ¿Qué son las palabras clave?

Las palabras clave son términos que JavaScript utiliza para definir la estructura y el comportamiento del código. No se pueden utilizar como nombres para identificadores, como variables o funciones, ya que JavaScript las tiene reservadas para su propio uso. Conocerlas es fundamental, ya que permiten realizar acciones importantes como declarar variables, definir flujos de control y manejar errores.

## El Modo estricto: "use strict"

El modo estricto de JavaScript (`"use strict"`) es una funcionalidad que cambia el comportamiento del lenguaje para ayudarte a evitar errores comunes y malas prácticas. Al activar este modo, el navegador aplica restricciones adicionales al código, como la prohibición de ciertas prácticas poco seguras.

¿Cómo activar `"use strict"`?
Para habilitar el modo estricto, simplemente coloca la cadena `"use strict"`; al comienzo de un archivo o de una función:

### Modo estricto en todo el script

```js
"use strict";

let nombre = "Juan";
```

### Modo estricto solo dentro de una función

```js
function saludar() {
  "use strict";
  let nombre = "Juan";
}
```

### Beneficios de "use strict"

- **Variables no declaradas:** El modo estricto arrojará un error si intentas usar una variable sin declararla previamente.
- **Prohíbe duplicados en parámetros de funciones:** No se permite que dos parámetros de una función tengan el mismo nombre.
- **Prohíbe ciertas palabras clave:** Algunas palabras que están reservadas para futuros estándares no se pueden utilizar como nombres de variables o funciones (por ejemplo, `implements`, `interface`, `package`, `private`, etc.).

## Comentarios

Los comentarios son secciones de texto que los programadores pueden incluir en su código para explicar lo que hace. Los comentarios son ignorados por el motor de JavaScript y no afectan el comportamiento del programa. Existen dos tipos principales de comentarios en JavaScript: de línea y de bloque.

A veces, los comentarios se usan para deshabilitar temporalmente líneas de código mientras se realiza la depuración o pruebas.

### Comentarios de línea

Los comentarios de una sola línea comienzan con // y se extienden hasta el final de la línea.

```js
let nombre = "Juan"; // Esto es un comentario de línea
```

### Comentarios de bloque

Los comentarios de bloque comienzan con `/*` y terminan con `*/`. Pueden abarcar múltiples líneas y son útiles para explicar secciones de código más grandes.

```js
/*
  Esta función toma dos números y devuelve su suma.
  Es útil para operaciones matemáticas básicas.
*/
function sumar(a, b) {
  return a + b;
}
```
