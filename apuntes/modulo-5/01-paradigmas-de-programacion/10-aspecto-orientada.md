<h1 align="center">Programación aspecto-orientada (AOP)</h1>

<h2>📑 Contenido</h2>

- [Programación aspecto-orientada (AOP)](#programación-aspecto-orientada-aop)
- [Características](#características)
- [Ventajas](#ventajas)
- [Consideraciones](#consideraciones)
- [Ejemplos de Uso](#ejemplos-de-uso)

## Programación aspecto-orientada (AOP)

La programación aspecto-orientada (AOP, por sus siglas en inglés) es un paradigma de programación que permite la separación de preocupaciones transversales del código principal de la aplicación. Las preocupaciones transversales son funcionalidades que afectan a múltiples módulos de una aplicación, como la gestión de logs, la seguridad y la transaccionalidad.

## Características

- **Separación de Preocupaciones:** Permite separar las preocupaciones transversales del código de negocio principal, mejorando la modularidad y la mantenibilidad.

- **Aspects (Aspectos):** Unidades modulares que encapsulan las preocupaciones transversales. Un aspecto puede contener uno o varios puntos de interés (join points) y código adicional (advice) que se ejecuta en esos puntos.

- **Join Points (Puntos de Interés):** Puntos específicos en la ejecución del programa donde un aspecto puede intervenir, como llamadas a métodos o accesos a campos.

- **Advice (Consejos):** Código que se ejecuta en los join points. Puede ser de varios tipos, como before, after, y around, dependiendo de cuándo se ejecuta en relación con el join point.

- **Pointcuts:** Expresiones que definen un conjunto de join points donde un aspecto se aplica.

## Ventajas

- **Modularidad Mejorada:** Al separar las preocupaciones transversales, el código de negocio se mantiene limpio y enfocado en su propósito principal.

- **Reusabilidad:** Los aspectos pueden ser reutilizados en diferentes partes de la aplicación o en diferentes proyectos.

- **Mantenibilidad:** Facilita la actualización y el mantenimiento de funcionalidades transversales sin modificar el código de negocio principal.

- **Reducción de Código Duplicado:** Centraliza la lógica transversal, evitando la duplicación de código en múltiples módulos.

## Consideraciones

- **Curva de Aprendizaje:** Puede ser difícil de entender y aplicar correctamente, especialmente para desarrolladores nuevos en AOP.

- **Complejidad:** La introducción de aspectos puede añadir complejidad al sistema, dificultando la comprensión y depuración del flujo del programa.

- **Impacto en el Rendimiento:** La inserción de aspectos en puntos de interés puede tener un impacto en el rendimiento si no se maneja adecuadamente.

## Ejemplos de Uso

- **Gestión de Logs:** Registrar automáticamente las entradas y salidas de métodos clave en toda la aplicación sin añadir código de logging en cada método.

- **Seguridad:** Aplicar controles de seguridad y validaciones de permisos en diferentes partes de la aplicación.

- **Transacciones:** Gestionar transacciones de base de datos, asegurando que los métodos se ejecuten dentro de un contexto transaccional.

- **Manejo de Errores:** Capturar y gestionar excepciones de manera uniforme en toda la aplicación.
