<h1 align='center'>Los motores de JavaScript</h1>

<h2>📑 Contenido</h2>

- [Los motores de JavaScript](#los-motores-de-javascript)
- [¿Qué es un motor de JavaScript?](#qué-es-un-motor-de-javascript)
- [Principales motores de JavaScript](#principales-motores-de-javascript)
  - [V8](#v8)
  - [SpiderMonkey](#spidermonkey)
  - [Chakra (Clásico y ChakraCore)](#chakra-clásico-y-chakracore)
  - [JavaScriptCore (Nitro)](#javascriptcore-nitro)
- [¿Cómo funciona un motor de JavaScript?](#cómo-funciona-un-motor-de-javascript)
  - [1-Análisis del código fuente (Parsing)](#1-análisis-del-código-fuente-parsing)
  - [2-Interpretación y ejecución](#2-interpretación-y-ejecución)
  - [3-Compilación JIT (Just-In-Time)](#3-compilación-jit-just-in-time)
  - [4- Recolección de basura (Garbage Collection)](#4--recolección-de-basura-garbage-collection)
- [Optimización de los motores de JavaScript](#optimización-de-los-motores-de-javascript)
  - [Compilación JIT (Just-In-Time)](#compilación-jit-just-in-time)
  - [Inline caching](#inline-caching)
  - [Optimización basada en el tipo](#optimización-basada-en-el-tipo)
- [El futuro de los motores de JavaScript](#el-futuro-de-los-motores-de-javascript)

## Los motores de JavaScript

En este capítulo profundizaremos en los motores de JavaScript (JavaScript Engines), los programas que hacen posible la ejecución del código de JavaScript tanto en el navegador como en otros entornos como Node.js. Entender cómo funcionan estos motores es esencial para aprovechar al máximo las características del lenguaje y optimizar el rendimiento de nuestras aplicaciones.

## ¿Qué es un motor de JavaScript?

Un motor de JavaScript es el componente del entorno de ejecución que se encarga de interpretar y ejecutar el código JavaScript. Su función principal es convertir el código fuente de JavaScript, que es legible para los humanos, en un formato que la máquina pueda entender y ejecutar, conocido como código de máquina o código nativo.

Este proceso no siempre ocurre directamente. La mayoría de los motores modernos siguen un proceso que incluye varias fases, como la compilación y la optimización, para mejorar la velocidad y eficiencia de la ejecución.

## Principales motores de JavaScript

A lo largo de los años, diferentes motores de JavaScript han sido desarrollados por empresas tecnológicas, cada uno optimizado para funcionar en su respectivo navegador o entorno. A continuación, exploraremos los más conocidos:

### V8

V8 es uno de los motores más avanzados y populares en la actualidad. Fue diseñado para ser extremadamente rápido y eficiente, aprovechando tecnologías modernas como la compilación JIT (Just-In-Time), que compila partes del código JavaScript a código máquina mientras se ejecuta, acelerando significativamente el rendimiento.

V8 juega un papel crucial tanto en los navegadores basados en Chromium como en entornos de servidor como Node.js. De hecho, la introducción de V8 y su enfoque en la velocidad fue uno de los factores clave en el auge de Node.js, permitiendo que JavaScript fuera usado de manera eficiente en el backend.

**Usado en: Google Chrome, Microsoft Edge (basado en Chromium) y Node.js.**

### SpiderMonkey

SpiderMonkey es el primer motor de JavaScript que se creó, lanzado junto con Netscape Navigator en 1995, y ha sido continuamente desarrollado y mejorado por Mozilla. Hoy en día, es el motor que alimenta Firefox y tiene capacidades similares a V8, como la compilación JIT y técnicas de optimización avanzadas.

Además, SpiderMonkey soporta características experimentales y más nuevas del lenguaje antes que otros motores, dado el enfoque de Mozilla en el desarrollo de estándares web abiertos.

**Usado en: Mozilla Firefox.**

### Chakra (Clásico y ChakraCore)

Chakra fue el motor de JavaScript utilizado en las versiones anteriores de Microsoft Edge antes de que este navegador cambiara su base a Chromium, adoptando V8. ChakraCore, la parte abierta de este motor, sigue siendo utilizado en otros proyectos que requieren de un motor eficiente para ejecutar JavaScript.

**Usado en: Microsoft Edge (versión clásica) y otros proyectos.**

### JavaScriptCore (Nitro)

JavaScriptCore, también conocido como Nitro, es el motor de JavaScript desarrollado por Apple y utilizado en el navegador Safari. Aunque no es tan conocido como V8 o SpiderMonkey, juega un papel importante en los dispositivos iOS y macOS, donde Safari es el navegador por defecto. JavaScriptCore también utiliza técnicas de optimización como la compilación JIT para mejorar la velocidad de ejecución.

**Usado en: Safari.**

## ¿Cómo funciona un motor de JavaScript?

Aunque cada motor tiene su propia implementación específica, en general, todos los motores modernos siguen un proceso similar al ejecutar el código JavaScript. Este proceso consta de varios pasos, cada uno diseñado para mejorar la eficiencia de la ejecución:

### 1-Análisis del código fuente (Parsing)

El primer paso es tomar el código JavaScript que escribes y analizarlo para transformarlo en una estructura más manejable para la máquina. Esto se hace en dos partes:

- **Análisis léxico:** Aquí se separa el código en componentes más pequeños llamados "tokens", que pueden ser palabras clave, operadores, nombres de variables, etc.

- **Análisis sintáctico:** En esta fase, los tokens se organizan en una estructura en forma de árbol, llamada AST (Abstract Syntax Tree) o Árbol de Sintaxis Abstracta, que representa la lógica del código de manera que pueda ser interpretada o compilada.

### 2-Interpretación y ejecución

Tradicionalmente, JavaScript era un lenguaje interpretado, lo que significa que el código se ejecutaba línea por línea sin pasar por un proceso de compilación. Sin embargo, los motores modernos como V8 y SpiderMonkey ahora implementan compilación JIT (Just-In-Time) para mejorar el rendimiento.

**Interpretación básica:** Después del análisis, los motores más simples ejecutarían el código directamente desde el AST. Esto puede ser rápido en términos de tiempo de inicio, pero generalmente es más lento en la ejecución total.

### 3-Compilación JIT (Just-In-Time)

En lugar de interpretar todo el código de manera directa, los motores más avanzados ahora utilizan una técnica conocida como compilación JIT, que se traduce como "compilación en el momento adecuado".

- **Bytecode:** En lugar de compilar directamente a código máquina, el código se convierte primero a un formato intermedio llamado bytecode, que es más eficiente que el AST pero aún no es código de máquina.

- **Compilación a código nativo:** Durante la ejecución, las partes del código que se ejecutan con frecuencia o que son críticas para el rendimiento pueden ser optimizadas y traducidas a código nativo que puede ser ejecutado directamente por el procesador. Esto es lo que hace que la ejecución sea más rápida en comparación con la simple interpretación.

El motor sigue recopilando información sobre el comportamiento del programa mientras se ejecuta. Si identifica partes del código que se pueden optimizar más, las recompila utilizando esas optimizaciones. Si las optimizaciones no funcionan bien (por ejemplo, si se hacen suposiciones incorrectas sobre los tipos de datos), el motor puede deoptimizar y volver a un código menos optimizado.

### 4- Recolección de basura (Garbage Collection)

Otro aspecto clave de los motores de JavaScript es la gestión de memoria. JavaScript maneja automáticamente la asignación y liberación de memoria gracias a un proceso conocido como recolección de basura (garbage collection).

Cuando se crean objetos o variables, estos consumen memoria. Cuando ya no se necesitan, el motor de JavaScript detecta esto y libera la memoria para que pueda ser reutilizada. Los motores modernos emplean algoritmos avanzados para hacer que este proceso sea eficiente y no impacte negativamente en el rendimiento del programa.

## Optimización de los motores de JavaScript

Los motores de JavaScript modernos emplean una serie de técnicas para acelerar la ejecución del código. Algunas de las más importantes incluyen:

### Compilación JIT (Just-In-Time)

Como se explicó antes, esta técnica combina lo mejor de ambos mundos: la rapidez inicial de la interpretación y la velocidad a largo plazo de la compilación. Los motores detectan las partes del código que se ejecutan repetidamente y las compilan a código de máquina para mejorar la velocidad.

### Inline caching

Una técnica que los motores utilizan para acelerar el acceso a las propiedades de los objetos. JavaScript permite cambiar dinámicamente las propiedades de un objeto, lo que puede hacer que el acceso a estas sea más lento. Con Inline Caching, el motor recuerda cómo se accedió previamente a una propiedad para evitar tener que volver a hacer el trabajo cada vez.

### Optimización basada en el tipo

Aunque JavaScript es un lenguaje de tipado dinámico (las variables pueden cambiar de tipo en tiempo de ejecución), los motores intentan inferir los tipos de datos y optimizar en función de eso. Por ejemplo, si una variable parece ser siempre un número entero, el motor optimizará el código como si fuera un número entero, lo que es mucho más rápido.

## El futuro de los motores de JavaScript

El desarrollo de los motores de JavaScript sigue evolucionando. Con el crecimiento de aplicaciones web más complejas y la demanda de rendimiento más alto, los desarrolladores de motores están continuamente mejorando la forma en que los motores manejan el código.

Además, con la llegada de WebAssembly, los motores de JavaScript están evolucionando para ejecutar no solo JavaScript, sino también otros lenguajes compilados (como C, C++ o Rust) de manera eficiente en el navegador, lo que abre nuevas posibilidades para aplicaciones web más rápidas y potentes.

> [!CAUTION]
> En estos momentos para mi es un repaso y estoy familiarizado con los conceptos, pero si estas intentando aprender desde cero con estos apuntes, lo más seguro es que te suene a chino(si sabes chino sustituye chino por un idioma que nos sepas). Cuando llegues al final todo estará más claro y si no en control de flujo revisa los bucles.
