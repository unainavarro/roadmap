<h1 align='center'>Seguridad al trabajar con JSON</h1>

<h2>📑 Contenido</h2>

- [Seguridad al trabajar con JSON](#seguridad-al-trabajar-con-json)
- [Validar tipos de datos esperados](#validar-tipos-de-datos-esperados)
- [Validar valores esperados](#validar-valores-esperados)
- [Manejo de errores](#manejo-de-errores)

## Seguridad al trabajar con JSON

Cuando se trabaja con datos JSON, especialmente cuando se reciben desde fuentes externas, es importante ser cuidadoso. Aunque JSON es generalmente seguro, aún pueden existir vulnerabilidades, como inyecciones de código malicioso si no se valida adecuadamente la entrada.

Por ejemplo, nunca debes confiar ciegamente en el contenido JSON recibido desde una fuente externa. Siempre es importante validar los datos antes de procesarlos para evitar posibles ataques de inyección o mal uso de los datos.

Validar datos JSON recibidos de fuentes externas es crucial para garantizar la seguridad y consistencia de la información que procesamos. Al recibir datos JSON desde un cliente, una API o cualquier otra fuente externa, debemos asegurarnos de que los datos sean correctos y seguros antes de usarlos. Esto previene problemas como errores en el sistema, vulnerabilidades de seguridad como inyecciones de código, o incluso ataques más graves.

## Validar tipos de datos esperados

Es importante verificar que las claves y valores recibidos sean del tipo correcto. Por ejemplo, si esperamos un número, debemos asegurarnos de que el valor recibido sea efectivamente un número.

```js
const datos = JSON.parse(jsonRecibido);

if (typeof datos.nombre !== "string") {
  throw new Error("El nombre debe ser una cadena de texto.");
}

if (typeof datos.edad !== "number") {
  throw new Error("La edad debe ser un número.");
}

if (!Array.isArray(datos.cursos)) {
  throw new Error("Los cursos deben ser un array.");
}
```

En este ejemplo, comprobamos que las propiedades nombre, edad y cursos sean del tipo esperado. Si no lo son, lanzamos un error.

## Validar valores esperados

A veces, no basta con validar el tipo de dato. También es importante verificar que los valores caigan dentro de un rango o conjunto aceptable.

```js
if (datos.edad < 0 || datos.edad > 120) {
  throw new Error("La edad debe estar entre 0 y 120 años.");
}

const estadosValidos = ["activo", "inactivo", "pendiente"];
if (!estadosValidos.includes(datos.estado)) {
  throw new Error("El estado no es válido.");
}
```

Aquí estamos validando que edad esté dentro de un rango razonable y que estado sea uno de los valores permitidos.

## Manejo de errores

Cuando se encuentran errores en los datos, es importante proporcionar retroalimentación adecuada al usuario o al sistema, pero sin revelar detalles sensibles sobre la validación que podrían ser utilizados por un atacante.

```js
try {
  const datos = JSON.parse(jsonRecibido);

  // Validación de datos aquí...
} catch (error) {
  console.error("Error al procesar los datos:", error);
  // Mensaje genérico para el usuario
  throw new Error("Los datos proporcionados no son válidos.");
}
```
