<h1 align="center">Tipos Avanzados</h1>

<h2>📑 Contenido</h2>

- [Mapped types (tipos mapeados)](#mapped-types-tipos-mapeados)
- [Conditional types (tipos condicionales)](#conditional-types-tipos-condicionales)
- [Literal types (tipos literales)](#literal-types-tipos-literales)
- [Template literal types (tipos de literales de plantillas)](#template-literal-types-tipos-de-literales-de-plantillas)
- [Recursive types (tipos recursivos)](#recursive-types-tipos-recursivos)

## Mapped types (tipos mapeados)

Los tipos mapeados son una característica de TypeScript que permite transformar cada propiedad de un tipo existente en un nuevo tipo, aplicando una operación a cada una de ellas.

```ts
type Mayusculas<T> = {
  [K in keyof T]: T[K] extends string ? Uppercase<T[K]> : T[K];
};

type PersonaMayusculas = Mayusculas<Persona>;
```

## Conditional types (tipos condicionales)

Los tipos condicionales permiten definir tipos que dependen de condiciones basadas en otros tipos.

```ts
type EsString<T> = T extends string ? true : false;

type Resultado = EsString<string>; // true
```

## Literal types (tipos literales)

Los tipos literales permiten definir tipos que representan un conjunto específico de valores literales.

```ts
type Color = "rojo" | "verde" | "azul";

let color: Color = "verde";
```

## Template literal types (tipos de literales de plantillas)

Los tipos de literales de plantillas son una extensión de los tipos literales que permiten crear tipos basados en plantillas de cadenas.

```ts
type Saludo<T extends string> = `Hola, ${T}`;

type SaludoJuan = Saludo<"Juan">; // "Hola, Juan"
```

## Recursive types (tipos recursivos)

Los tipos recursivos permiten definir tipos que se refieren a sí mismos, lo que es útil para modelar estructuras de datos recursivas.

```ts
type Saludo<T extends string> = `Hola, ${T}`;

type SaludoJuan = Saludo<"Juan">; // "Hola, Juan"
```
