<h1 align="center">Programación funcional</h1>

<h2>📑 Contenido</h2>

- [Programación funcional](#programación-funcional)
- [Características](#características)
- [Componentes](#componentes)
- [Ventajas de la programación funcional](#ventajas-de-la-programación-funcional)
- [Consideraciones](#consideraciones)

## Programación funcional

La programación funcional es un paradigma de programación que trata el cálculo como la evaluación de funciones matemáticas y evita el cambio de estado y los datos mutables. Este enfoque se centra en funciones puras y la aplicación de funciones a datos para producir resultados.

## Características

- **Funciones Puras:** Las funciones siempre producen el mismo resultado para los mismos argumentos y no tienen efectos secundarios (no modifican variables externas ni tienen interacciones con el mundo exterior como I/O).

- **Inmutabilidad:** Los datos no cambian una vez creados. En lugar de modificar datos existentes, se crean nuevas versiones con los cambios deseados.

- **Expresiones en lugar de Instrucciones:** Se utilizan expresiones que producen valores en lugar de instrucciones que cambian el estado del programa.

- **Primera Clase y Ciudadanos de Alto Orden:**

- Las funciones son ciudadanos de primera clase, lo que significa que pueden ser pasadas como argumentos a otras funciones, devueltas como resultados y asignadas a variables.
- Las funciones de orden superior son aquellas que toman otras funciones como argumentos o devuelven funciones como resultados.

- **Composición de Funciones:** Las funciones se combinan para formar nuevas funciones. La composición es una técnica fundamental en programación funcional.

## Componentes

- **Funciones:** Bloques de código que toman entradas, realizan cálculos y producen salidas sin efectos secundarios.

- **Funciones de Orden Superior:** Funciones que toman otras funciones como parámetros o devuelven funciones.

- **Recursión:** Uso de funciones que se llaman a sí mismas para realizar iteraciones, en lugar de bucles imperativos.

- **Expresiones Lambda:** Funciones anónimas que se definen en el lugar donde se necesitan, sin necesidad de nombrarlas.

- **Clausuras:** Funciones que capturan y recuerdan el entorno en el que fueron creadas.

## Ventajas de la programación funcional

- **Modularidad y Reutilización:** Las funciones puras son más fáciles de razonar, probar, reutilizar y mantener.

- **Paralelismo y Concurrencia:** La inmutabilidad y la ausencia de efectos secundarios facilitan la ejecución paralela y concurrente del código.

- **Legibilidad y Mantenimiento:** El código funcional tiende a ser más declarativo y expresivo, lo que mejora la legibilidad y facilita el mantenimiento.

- **Reducción de Errores:** La inmutabilidad y la pureza de las funciones reducen la probabilidad de errores relacionados con el estado y los efectos secundarios.

## Consideraciones

- **Curva de Aprendizaje:** Puede ser difícil de aprender para aquellos acostumbrados a la programación imperativa.

- **Rendimiento:** La creación de nuevas estructuras de datos en lugar de modificar las existentes puede ser menos eficiente en términos de uso de memoria y tiempo de ejecución.

- **Compatibilidad:** Integrar programación funcional en sistemas existentes basados en paradigmas imperativos puede ser complicado.
