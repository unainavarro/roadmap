<h1 align='center'>Continue, break y label</h1>

<h2>📑 Contenido</h2>

- [Continue, break y label](#continue-break-y-label)
- [La instrucción continue](#la-instrucción-continue)
- [La instrucción break](#la-instrucción-break)
  - [Return](#return)
- [La instrucción label](#la-instrucción-label)
  - [break y label](#break-y-label)
  - [continue y label](#continue-y-label)

## Continue, break y label

En programación, las estructuras de control del flujo son esenciales para modificar el comportamiento natural de los bucles y condicionales. En JavaScript, existen dos instrucciones clave que permiten alterar el flujo de los bucles: continue y break. Además, JavaScript cuenta con una herramienta menos conocida pero poderosa llamada label, que se puede utilizar en combinación con bucles para mejorar el control en estructuras complejas.

## La instrucción continue

La instrucción `continue` se utiliza dentro de los bucles para saltar la iteración actual y pasar directamente a la siguiente. Esto significa que si el intérprete encuentra una instrucción `continue`, ignora las demás líneas de código en esa iteración específica y regresa al inicio del bucle, evaluando la condición para decidir si continuar con otra iteración.

```js
for (let i = 0; i < 5; i++) {
  if (i === 2) {
    continue; // Salta la iteración cuando i es 2
  }
  console.log(i);
}
```

- En este ejemplo, cuando i es igual a 2, la instrucción `continue` se ejecuta, lo que significa que el bloque console.log(i) se salta para esa iteración.
- El resultado impreso será: 0, 1, 3, 4.

En bucles como `while` y `do...while`, el comportamiento es el mismo: al encontrar un `continue`, se salta el resto del código en la iteración actual.

## La instrucción break

La instrucción `break` se utiliza para terminar un bucle antes de que haya terminado naturalmente. Cuando el intérprete encuentra una instrucción `break`, sale inmediatamente del bucle, ignorando cualquier iteración restante, incluso si la condición del bucle sigue siendo verdadera.

```js
for (let i = 0; i < 5; i++) {
  if (i === 3) {
    break; // Detiene el bucle cuando i es 3
  }
  console.log(i);
}
```

- En este caso, cuando i es igual a 3, la instrucción `break` se ejecuta y el bucle se detiene por completo.
- **El resultado impreso será:** 0, 1, 2.

Este comportamiento también se aplica a los bucles `while` y `do...while`. Cuando `break` se encuentra, el bucle finaliza sin importar si la condición seguiría permitiendo más iteraciones.

### Return

Una pequeña mención a `return`, cuando se usa `return` dentro de un bucle en JavaScript, el bucle se detiene inmediatamente y se sale de la función en la que se encuentra. Es decir, `return` no solo detiene el bucle, sino que también termina la ejecución de la función y devuelve el valor especificado (si lo hay) al llamador de la función. Se profundizara más acerca de `return` en las funciones.

## La instrucción label

Una etiqueta o `label` es un identificador opcional que se puede aplicar a una instrucción, permitiendo referenciar esa parte del código desde otra ubicación. Aunque las etiquetas son poco comunes en el código moderno de JavaScript, pueden ser útiles cuando se combinan con `break` y `continue` para controlar bucles anidados (un bucle dentro de otro bucle).

Normalmente, `break` y `continue` solo afectan al bucle en el que están ubicados, pero con una etiqueta, se pueden aplicar a un bucle externo.

### break y label

```js
outerLoop: for (let i = 0; i < 3; i++) {
  for (let j = 0; j < 3; j++) {
    if (i === 1 && j === 1) {
      break outerLoop; // Sale del bucle externo
    }
    console.log(`i: ${i}, j: ${j}`);
  }
}
```

En este caso, outerLoop es una etiqueta asociada al bucle externo (el de la variable i).
Cuando `i === 1` y `j === 1`, la instrucción `break outerLoop` se ejecuta, lo que rompe el bucle externo, saliendo completamente de ambos bucles.

Si no se hubiera utilizado la etiqueta, el break habría salido solo del bucle interno (el de j), y el bucle externo habría continuado.

### continue y label

```js
outerLoop: for (let i = 0; i < 3; i++) {
  for (let j = 0; j < 3; j++) {
    if (i === 1 && j === 1) {
      continue outerLoop; // Salta a la siguiente iteración del bucle externo
    }
    console.log(`i: ${i}, j: ${j}`);
  }
}
```

En este ejemplo, cuando `i === 1` y `j === 1`, se ejecuta `continue` outerLoop, lo que salta la iteración actual del bucle externo (`i`), ignorando cualquier iteración restante del bucle interno.

En este caso, la combinación de `continue` y `label` hace que el bucle externo salte directamente a la siguiente iteración, omitiendo las iteraciones internas restantes cuando se cumple la condición.

---

> [!NOTE]
> En la mayoría de los casos, es mejor estructurar bien las condiciones de los bucles para evitar depender demasiado de estas instrucciones.
