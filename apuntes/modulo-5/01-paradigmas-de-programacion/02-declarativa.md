<h1 align="center">Programación declarativa</h1>

<h2>📑 Contenido</h2>

- [Programación declarativa](#programación-declarativa)
- [Características](#características)
- [Componentes](#componentes)
- [Ventajas](#ventajas)
- [Consideraciones](#consideraciones)

## Programación declarativa

La programación declarativa es un paradigma de programación en el que se enfoca en describir **qué** se quiere lograr en lugar de **cómo** lograrlo. En lugar de especificar una secuencia de pasos para alcanzar un objetivo, se define el resultado deseado, y el motor de ejecución del lenguaje se encarga de determinar cómo obtener ese resultado.

## Características

- **Describir el qué:** El código se centra en el resultado final deseado, no en los pasos específicos para alcanzarlo.

- **Inmutabilidad:** Se prefiere el uso de estructuras de datos inmutables, lo que simplifica el razonamiento sobre el código y reduce errores asociados con cambios de estado.

- **Abstracción:** Alto nivel de abstracción que facilita la comprensión y el mantenimiento del código.

- **Expresiones:** Uso intensivo de expresiones y funciones en lugar de comandos y procedimientos.

## Componentes

- **Funciones Puras:** Funciones que siempre producen el mismo resultado para los mismos argumentos y no tienen efectos secundarios.

- **Expresiones:** Construcciones que son evaluadas para producir un valor, a diferencia de las declaraciones que son ejecutadas para cambiar el estado.

- **Recursión:** Uso de funciones que se llaman a sí mismas en lugar de bucles para iterar.

- **Lenguajes de Consultas:** Lenguajes como SQL que permiten expresar consultas sobre bases de datos de manera declarativa.

## Ventajas

- **Legibilidad y Mantenimiento:** El código es generalmente más fácil de leer y mantener debido a su alto nivel de abstracción y menor enfoque en detalles de implementación.

- **Reducción de Errores:** La inmutabilidad y la falta de efectos secundarios reducen la probabilidad de errores y facilitan la depuración.

- **Paralelismo y Concurrencia:** La naturaleza inmutable y sin estado facilita la ejecución paralela y concurrente de código.

- **Productividad:** Permite a los desarrolladores enfocarse más en la lógica de negocio y menos en los detalles de implementación.

## Consideraciones

- **Curva de Aprendizaje:** Puede ser difícil de aprender y adoptar para programadores acostumbrados a paradigmas imperativos.

- **Rendimiento:** En algunos casos, el rendimiento puede ser inferior debido a la sobrecarga asociada con la evaluación de expresiones y la gestión de estructuras inmutables.

- **Depuración:** Aunque reduce ciertos tipos de errores, la depuración puede ser más difícil debido a la abstracción y la falta de un flujo de control explícito.
