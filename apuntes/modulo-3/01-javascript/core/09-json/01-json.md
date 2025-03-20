<h1 align='center'>JSON</h1>

<h2>📑 Contenido</h2>

- [JSON](#json)
- [Sintaxis básica de JSON](#sintaxis-básica-de-json)
- [Reglas de la sintaxis JSON](#reglas-de-la-sintaxis-json)
- [Ejemplos de tipos de datos JSON](#ejemplos-de-tipos-de-datos-json)
  - [Número](#número)
  - [Cadena](#cadena)
  - [Boolean](#boolean)
  - [Array](#array)
  - [Objeto](#objeto)

## JSON

JSON (JavaScript Object Notation) es un formato ligero y legible para representar datos estructurados. Aunque está inspirado en la sintaxis de objetos de JavaScript, es un formato independiente del lenguaje, lo que lo convierte en un estándar ampliamente utilizado para la intercambio de datos entre sistemas.

JSON es simple y fácil de leer para los humanos, pero lo suficientemente estructurado para ser interpretado y procesado por las máquinas. Debido a su simplicidad y compatibilidad con múltiples lenguajes de programación, JSON se ha convertido en uno de los formatos más comunes para el envío de datos en aplicaciones web, especialmente en el contexto de APIs RESTful.

## Sintaxis básica de JSON

La sintaxis JSON está basada en una estructura de clave-valor, similar a los objetos en JavaScript, pero con restricciones más estrictas. Las claves deben ser cadenas de texto entre comillas dobles (`" "`), y los valores pueden ser de varios tipos de datos básicos.

```json
{
  "nombre": "Juan",
  "edad": 30,
  "esEstudiante": false,
  "cursos": ["Matemáticas", "Física"],
  "direccion": {
    "ciudad": "Madrid",
    "pais": "España"
  }
}
```

## Reglas de la sintaxis JSON

- **Claves y valores:** Las claves deben ser cadenas entre comillas dobles. Los valores pueden ser de tipo:
  - **Números:** Enteros o decimales (`10, 3.14`)
  - **Cadenas:** Siempre entre comillas dobles (`"Texto"`)
  - **Booleanos:** `true` o `false`
  - **Nulos:** `null`
  - **Arrays:** Una lista ordenada de valores `[ ]`
  - **Objetos:** Colecciones de pares clave-valor `{ }`
- **Cadenas:** Las cadenas deben ir siempre entre comillas dobles. No se permite el uso de comillas simples como en JavaScript.
- **Nombres de claves:** Siempre deben ser cadenas entre comillas dobles.
- **No admite comentarios:** A diferencia de JavaScript, JSON no permite comentarios.

## Ejemplos de tipos de datos JSON

### Número

```json
{ "precio": 49.99 }
```

### Cadena

```json
{ "nombre": "Laptop" }
```

### Boolean

```json
{ "disponible": true }
```

### Array

```json
{ "colores": ["rojo", "verde", "azul"] }
```

### Objeto

```json
{
  "producto": {
    "nombre": "Laptop",
    "precio": 799.99
  }
}
```
