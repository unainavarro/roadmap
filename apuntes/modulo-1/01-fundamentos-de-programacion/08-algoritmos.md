<h1 align="center">Algoritmos</h1>

<h2>📑 Contenido</h2>

- [Algoritmos](#algoritmos)
- [Complejidad algorítmica](#complejidad-algorítmica)
- [Complejidad temporal vs espacial](#complejidad-temporal-vs-espacial)
  - [Tiempo de ejecución](#tiempo-de-ejecución)
  - [Complejidad espacial](#complejidad-espacial)
- [Tiempos comunes](#tiempos-comunes)
- [Notación asíntota](#notación-asíntota)
  - [Notación O grande (O())](#notación-o-grande-o)
  - [Notación omega (Ω())](#notación-omega-ω)
  - [Notación theta (Θ())](#notación-theta-θ)

## Algoritmos

Los algoritmos son conjuntos de instrucciones precisas y ordenadas que resuelven un problema específico o realizan una tarea determinada. En programación, los algoritmos son la base de todo.

## Complejidad algorítmica

La Complejidad Algortítmica se refiere a los recursos de computación que necesita un algoritmo para resolver un problema. Estos recursos de computación pueden ser el tiempo que se tarda en la ejecución del programa (complejidad temporal), o el espacio utilizado en la memoria durante su ejecución (complejidad espacial). El objetivo es minimizar estos recursos, por lo que un algoritmo que toma menos tiempo y espacio se considera más eficiente. La complejidad generalmente se expresa usando la notación Big O, que describe el límite superior del tiempo o las necesidades del espacio, y explica cómo crecen en relación con el tamaño de la entrada. Es importante analizar y entender la complejidad algorítmica para elegir o diseñar el algoritmo más eficiente para un caso de uso específico

## Complejidad temporal vs espacial

La diferencia entre tiempo y complejidad espacial en algoritmos es fundamental para comprender su eficiencia.

### Tiempo de ejecución

Se refiere al tiempo que tarda un algoritmo en completar su ejecución. Se mide en función del número de operaciones básicas realizadas por el algoritmo en relación con el tamaño de la entrada. Se expresa típicamente en términos de la notación de O grande (O(n)), que indica el peor caso de tiempo de ejecución en función del tamaño de la entrada (n).

### Complejidad espacial

Se refiere a la cantidad de memoria adicional que requiere un algoritmo en relación con el tamaño de la entrada. Al igual que con el tiempo de ejecución, la complejidad espacial se expresa típicamente en términos de la notación de O grande (O(n)), indicando cuánta memoria adicional se necesita en función del tamaño de la entrada.

## Tiempos comunes

- **O(1) - Tiempo constante:** El tiempo de ejecución no depende del tamaño de la entrada. Por ejemplo, acceder a un elemento específico en un array por su índice tiene tiempo constante.

- **O(log n) - Tiempo logarítmico:** El tiempo de ejecución crece de forma logarítmica con respecto al tamaño de la entrada. Por ejemplo, la búsqueda binaria en una lista ordenada tiene tiempo logarítmico.

- **O(n) - Tiempo lineal:** El tiempo de ejecución crece linealmente con respecto al tamaño de la entrada. Por ejemplo, recorrer una lista o un array tiene tiempo lineal.

- **O(n log n) - Tiempo log-lineal:** Algunos algoritmos de ordenación eficientes, como el algoritmo Quicksort o Mergesort, tienen complejidad temporal log-lineal.

- **O(n^2) - Tiempo cuadrático:** El tiempo de ejecución crece cuadráticamente con respecto al tamaño de la entrada. Por ejemplo, un algoritmo de burbuja o un algoritmo de selección tienen tiempo cuadrático.

- **O(2^n) - Tiempo exponencial:** El tiempo de ejecución crece de forma exponencial con respecto al tamaño de la entrada. Algoritmos de fuerza bruta para problemas de optimización suelen tener esta complejidad.

- **O(n!) - Tiempo factorial:** El tiempo de ejecución crece factorialmente con respecto al tamaño de la entrada. Algoritmos de permutación o combinación pueden tener esta complejidad.

## Notación asíntota

La notación asintótica es una forma de describir el comportamiento del tiempo de ejecución o la complejidad espacial de un algoritmo a medida que el tamaño de la entrada tiende hacia infinito. Se utiliza principalmente para analizar el rendimiento relativo de los algoritmos y para determinar cómo crece el tiempo de ejecución o la complejidad espacial a medida que el tamaño del problema aumenta.

**Hay tres tipos principales de notación asintótica:**

### Notación O grande (O())

Se usa para describir el peor caso de tiempo de ejecución o complejidad espacial de un algoritmo. Indica un límite superior en la tasa de crecimiento de la función. Por ejemplo, si un algoritmo tiene una complejidad temporal de O(n^2), significa que el tiempo de ejecución aumenta cuadráticamente con respecto al tamaño de la entrada en el peor caso.

### Notación omega (Ω())

Se usa para describir el mejor caso de tiempo de ejecución o complejidad espacial de un algoritmo. Indica un límite inferior en la tasa de crecimiento de la función. Por ejemplo, si un algoritmo tiene una complejidad temporal de Ω(n), significa que el tiempo de ejecución crece linealmente como mínimo con respecto al tamaño de la entrada en el mejor caso.

### Notación theta (Θ())

Se utiliza cuando el peor y el mejor caso de tiempo de ejecución o complejidad espacial de un algoritmo son iguales. Indica que la función está acotada tanto superior como inferiormente por las funciones representadas. Por ejemplo, si un algoritmo tiene una complejidad temporal de Θ(n), significa que el tiempo de ejecución crece linealmente con respecto al tamaño de la entrada en todos los casos.
