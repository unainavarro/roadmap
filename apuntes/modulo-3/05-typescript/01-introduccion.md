<h1 align="center">TypeScript</h1>

<h2>📑 Contenido</h2>

- [¿Qué es TypeScript?](#qué-es-typescript)
- [TypeScript vs JavaScript](#typescript-vs-javascript)
- [Instalación y configuración](#instalación-y-configuración)
  - [Instalación de TypeScript](#instalación-de-typescript)
  - [Configuración de TypeScript en un proyecto](#configuración-de-typescript-en-un-proyecto)
- [Opciones del compilador](#opciones-del-compilador)
  - [Personalizar el proceso de compilación.](#personalizar-el-proceso-de-compilación)

## ¿Qué es TypeScript?

TypeScript es un lenguaje de programación desarrollado por Microsoft que amplía la sintaxis de JavaScript al agregarle tipos estáticos. Esto significa que TypeScript permite definir tipos de datos para variables, parámetros de función y valores de retorno de funciones, lo cual ayuda a detectar errores comunes durante la fase de desarrollo, antes de que el código se ejecute. Además de la adición de tipos, TypeScript también proporciona características adicionales como soporte para clases, interfaces, módulos y otras características propias de la programación orientada a objetos y funcional.

Una de las ventajas principales de TypeScript es que compila a JavaScript estándar, lo que significa que cualquier código TypeScript se puede transformar en código JavaScript compatible con cualquier navegador o entorno que admita JavaScript. Esto permite a los desarrolladores escribir código más robusto y mantenible mientras se benefician de todas las características y herramientas del ecosistema JavaScript.

## TypeScript vs JavaScript

- **Tipado estático:** TypeScript es un superconjunto de JavaScript que agrega tipado estático opcional. Esto significa que en TypeScript puedes definir tipos para tus variables, parámetros de función, valores de retorno, etc., lo que puede ayudar a detectar errores de tipo durante la fase de desarrollo. JavaScript, por otro lado, es un lenguaje de tipado dinámico, lo que significa que los tipos de variables se infieren en tiempo de ejecución.

- **Compatibilidad:** Todo el código JavaScript es válido en TypeScript, ya que TypeScript es una extensión de JavaScript. Sin embargo, no todo el código TypeScript es válido en JavaScript, ya que TypeScript agrega características que JavaScript no tiene, como el tipado estático y las interfaces.

- **Herramientas de desarrollo:** TypeScript ofrece un conjunto de herramientas de desarrollo más sólido en comparación con JavaScript puro. Esto incluye un sistema de tipos que proporciona sugerencias y advertencias durante la escritura de código, así como herramientas de refactorización más potentes. Además, TypeScript tiene un sistema de módulos más avanzado que JavaScript, lo que facilita la organización y reutilización del código.

- **Ecosistema y comunidad:** JavaScript tiene una comunidad masiva y un ecosistema muy amplio de bibliotecas y marcos de trabajo. TypeScript se beneficia de este ecosistema, ya que puede usar cualquier biblioteca de JavaScript existente. Sin embargo, TypeScript también tiene su propia comunidad y está respaldado por Microsoft, lo que significa que tiene un buen soporte y está en constante desarrollo y mejora.

## Instalación y configuración

### Instalación de TypeScript

1. **Instalar Node.js y npm:** TypeScript se instala a través de npm, el gestor de paquetes de Node.js. Si no tienes Node.js instalado, puedes descargarlo desde nodejs.org e instalarlo en tu sistema.

2. **Instalar TypeScript globalmente:** Abre una terminal (en Windows, puedes usar el símbolo del sistema o PowerShell) y ejecuta el siguiente comando para instalar TypeScript globalmente:

   ```shell
   npm install -g typescript
   ```

### Configuración de TypeScript en un proyecto

1.  Crear un archivo de configuración: En el directorio raíz de tu proyecto, crea un archivo llamado tsconfig.json.

    Puedes crearlo manualmente o ejecutar el siguiente comando en la terminal:

    ```shell
    # TS de manera global
    tsc --init

    # Otra forma con NodeJs
    npm init

    # Responder que si a todas las preguntas
    npm init -y

    # Instala TypeScript como una dependencia de desarrollo
    npm install typescript --save-dev

    npm install --save-dev typescript

    ```

    Este comando generará un archivo tsconfig.json con una configuración básica.

2.  Configurar opciones según tus necesidades: Abre el archivo tsconfig.json en un editor de texto y ajusta las opciones según las necesidades de tu proyecto.

    Algunas opciones comunes incluyen:

    - **target:** la versión de JavaScript a compilar.

    - **module:** el sistema de módulos a utilizar.

    - **strict:** habilita/deshabilita la comprobación estricta de tipos.

    - **outDir:** el directorio para generar los archivos JavaScript compilados.

    - **rootDir:** el directorio raíz de los archivos TypeScript.

    - **include:** un array de patrones de archivos/directorios para incluir en la compilación.

    - **exclude:** un array de patrones de archivos/directorios para excluir de la compilación.

      ```json
      {
        "compilerOptions": {
        "target": "es5",
        "module": "commonjs",
        "strict": true,
        "outDir": "./dist",
        "rootDir": "./src",
        },
        "exclude": ["node_modules"],
        "include": ["src"]
      ```

3.  Escribir código TypeScript: Ahora puedes comenzar a escribir tu código TypeScript en archivos con extensión .ts

    ```typescript
    // app.ts
    function saludar(nombre: string) {
      return "¡Hola, " + nombre + "!";
    }
    console.log(saludar("Mundo"));
    ```

4.  Compilar TypeScript a JavaScript: Para compilar tus archivos TypeScript a JavaScript, simplemente ejecuta el siguiente comando en la terminal en el directorio de tu proyecto:

    ```shell
    # Todos los archivos
    npx tsc

    # Individual
    npx tsc ./src/index.ts
    ```

    Esto compilará todos los archivos TypeScript en el directorio actual de acuerdo con la configuración en tsconfig.json.

## Opciones del compilador

En TypeScript, "Compiler Options" (Opciones del Compilador) se refiere a las configuraciones que puedes especificar en el archivo tsconfig.json para controlar cómo el compilador de TypeScript (tsc) compila tus archivos TypeScript a JavaScript. Estas opciones permiten personalizar el comportamiento del compilador según las necesidades específicas de tu proyecto.

**Algunas de las opciones comunes de "Compiler Options" incluyen:**

- **target:** Define la versión de JavaScript a la que se compilarán tus archivos TypeScript. Por ejemplo, puedes especificar es5, es6, es2017, etc.

- **module:** Indica el sistema de módulos que se utilizará en la compilación. Las opciones comunes incluyen CommonJS, AMD, UMD, ES6, etc.

- **strict:** Habilita o deshabilita un conjunto de opciones estrictas que ayudan a detectar errores comunes durante la escritura de código TypeScript.

- **outDir:** Especifica el directorio de salida para los archivos JavaScript generados por el compilador.

- **rootDir:** Define el directorio raíz de los archivos TypeScript. Esto se utiliza para estructurar la salida en función de la estructura del proyecto original.

- **include y exclude:** Permiten especificar patrones de archivos o directorios que deben ser incluidos o excluidos del proceso de compilación.

### Personalizar el proceso de compilación.

Estas opciones se pueden pasar al compilador usando el --prefijo

```shell
tsc --target ES5 --module commonjs
```
