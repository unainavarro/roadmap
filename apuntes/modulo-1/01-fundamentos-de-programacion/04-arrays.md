<h1 align="center">Arrays</h1>

<h2>📑 Contenido</h2>

- [Arrays](#arrays)
- [Tipos de arrays](#tipos-de-arrays)
- [Arrays asociativos](#arrays-asociativos)
  - [Características](#características)

## Arrays

Los arrays (o arreglos) son estructuras de datos fundamentales en programación que permiten almacenar múltiples valores del mismo tipo en una sola variable.

- **Estructura Lineal:** Un array es una colección de elementos dispuestos de manera secuencial en memoria. Cada elemento se almacena en una posición específica y se accede a él mediante un índice numérico.
- **Índices:** Los elementos en un array se acceden mediante índices, que generalmente comienzan en 0. Así, el primer elemento está en el índice 0, el segundo en el índice 1, y así sucesivamente.
- **Homogeneidad:** Los arrays suelen contener elementos del mismo tipo de datos, lo que permite operaciones uniformes sobre todos los elementos.
- **Tamaño Fijo:** En muchos lenguajes de programación, el tamaño de un array se define cuando se crea y no puede cambiar. Sin embargo, algunos lenguajes y bibliotecas ofrecen arrays dinámicos que pueden redimensionarse.

## Tipos de arrays

- **Unidimensionales:** Son los arrays más simples y se representan como una lista lineal de elementos.
- **Multidimensionales(Matrices):** Son arrays que contienen otros arrays como elementos, permitiendo representar tablas, matrices y estructuras más complejas.
- **Dinámicos:** Ofrecen estructuras de datos similares a arrays pero con capacidades dinámicas, como listas en Python o ArrayList en Java. Estas estructuras permiten agregar y eliminar elementos fácilmente y redimensionarse automáticamente.

## Arrays asociativos

Los arrays asociativos, también conocidos como **mapas**, **diccionarios** o **tablas hash** en algunos lenguajes de programación, son una estructura de datos que permite almacenar pares de claves y valores. A diferencia de los arrays convencionales, donde los elementos se acceden mediante índices numéricos, en los arrays asociativos se accede a los valores a través de claves únicas, que pueden ser de distintos tipos, como cadenas de texto o números.

### Características

- **Claves y Valores:** Cada elemento en un array asociativo se compone de una clave única y un valor asociado a esa clave.
- **Acceso Rápido:** Los arrays asociativos permiten acceso rápido a los valores mediante sus claves, típicamente en tiempo constante O(1) en promedio, utilizando técnicas de hash.
- **No Ordenados:** En muchos lenguajes, los arrays asociativos no mantienen un orden específico de los elementos. Algunos lenguajes modernos ofrecen variantes ordenadas de arrays asociativos.
- **Flexibilidad en Tipos de Claves:** Las claves pueden ser de cualquier tipo de dato inmutable, como cadenas, números o tuplas inmutables.
