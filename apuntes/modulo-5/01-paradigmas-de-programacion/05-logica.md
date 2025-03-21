<h1 align="center">Programación lógica</h1>

<h2>📑 Contenido</h2>

- [Programación lógica](#programación-lógica)
- [Características principales](#características-principales)
- [Componentes](#componentes)
- [Ventajas](#ventajas)
- [Consideraciones](#consideraciones)

## Programación lógica

La programación lógica es un paradigma de programación basado en la lógica formal, en particular la lógica de predicados de primer orden. En este paradigma, los programas se representan como un conjunto de sentencias lógicas, y la ejecución del programa consiste en la inferencia de conclusiones a partir de estas sentencias.

## Características principales

- **Declarativo:** Describe **qué** es el problema y no **cómo** resolverlo. Se enfocan en las relaciones y reglas lógicas más que en procedimientos específicos.

- **Inferencia Automática:** Utiliza un motor de inferencia para derivar nuevas verdades a partir de las reglas y hechos dados.

- **Lógica de Predicados:** Basa su funcionamiento en la lógica de predicados, con uso de predicados, términos, y variables.

- **No Procedural:** Los programas no especifican el orden de ejecución, sino que definen relaciones lógicas y condiciones.

## Componentes

1. **Hechos:**

   - Afirmaciones básicas sobre el mundo que se consideran verdaderas.
   - Ejemplo: `hermano(juan, pedro).`

2. **Reglas:**

   - Definen relaciones lógicas entre hechos y otros predicados.
   - Ejemplo: `es_tio(X, Y) :- hermano(X, padre(Y)).`

3. **Consultas:**
   - Preguntas que se hacen al sistema para derivar información a partir de los hechos y reglas.
   - Ejemplo: `?- es_tio(juan, Maria).`

## Ventajas

- **Simplicidad y Claridad:** Facilita la representación de problemas complejos en términos lógicos y reglas claras.

- **Facilidad para Representar Conocimiento:** Adecuada para aplicaciones que requieren manipulación y razonamiento sobre hechos y reglas, como sistemas expertos e inteligencia artificial.

- **Inferencia Automática:** El motor de inferencia puede encontrar soluciones automáticamente a partir de las reglas y hechos definidos, reduciendo la necesidad de escribir procedimientos explícitos.

## Consideraciones

- **Rendimiento:** La inferencia lógica puede ser computacionalmente intensiva, especialmente en problemas grandes o complejos.

- **Curva de Aprendizaje:** El enfoque declarativo y el uso de lógica formal pueden ser difíciles de aprender y aplicar para programadores acostumbrados a paradigmas imperativos o orientados a objetos.

- **Limitaciones Prácticas:** Aunque potente en teoría, puede ser difícil de aplicar en algunos tipos de problemas prácticos donde los procedimientos específicos y el control del flujo son esenciales.
