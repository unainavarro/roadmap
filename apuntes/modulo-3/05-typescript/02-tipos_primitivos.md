<h1 align="center">Tipos primitivos</h1>

<h2>📑 Contenido</h2>

- [Tipos primitivos](#tipos-primitivos)
- [Tabla comparativa](#tabla-comparativa)

## Tipos primitivos

Los tipos primitivos son tipos de datos fundamentales que representan valores simples y básicos. Aquí está la descripción de cada uno de los tipos primitivos que mencionaste:

- **Boolean:** Representa un valor lógico que puede ser true o false. Se utiliza para representar condiciones lógicas en el código.

  ```typescript
  let isActive: boolean = true;
  ```

- **Number:** Representa valores numéricos, ya sean enteros o de punto flotante. Se utiliza para representar cantidades, medidas, o cualquier otro valor numérico en el código.

  ```typescript
  let age: number = 25;
  let temperature: number = 36.5;
  ```

- **String:** Representa valores de texto, es decir, cadenas de caracteres. Se utiliza para almacenar y manipular texto en el código.

  ```typescript
  let greeting: string = "Hola, mundo!";
  ```

- **Void:** Representa la ausencia de un tipo. Se utiliza principalmente como tipo de retorno de funciones que no devuelven ningún valor.

  ```typescript
  function logMessage(message: string): void {
    console.log(message);
  }
  ```

- **Undefined:** Representa un valor que no está definido. Generalmente se utiliza cuando una variable ha sido declarada pero no inicializada.

  ```typescript
  let notInitialized: undefined = undefined;
  ```

- **Null:** Representa un valor nulo o la ausencia intencional de un objeto o valor. Se utiliza cuando un objeto o valor no tiene ningún valor asignado.

  ```typescript
  let emptyValue: null = null;
  ```

## Tabla comparativa

| Tipo          | Descripción                                    | Ejemplo                         |
| ------------- | ---------------------------------------------- | ------------------------------- |
| **Boolean**   | Valor lógico `true` o `false`.                 | `let isActive: boolean = true;` |
| **Number**    | Valores numéricos enteros o de punto flotante. | `let age: number = 25;`         |
| **String**    | Texto o cadenas de caracteres.                 | `let name: string = "Alice";`   |
| **Void**      | Ausencia de valor en funciones.                | `function log(): void {}`       |
| **Undefined** | Valor no definido.                             | `let x: undefined = undefined;` |
| **Null**      | Ausencia intencional de valor.                 | `let y: null = null;`           |
