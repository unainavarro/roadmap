<h1 align="center">Métodos</h1>

<h2>📑 Contenido</h2>

- [Métodos](#métodos)
- [Componentes básicos](#componentes-básicos)
  - [Declaración de método](#declaración-de-método)
  - [Cuerpo del método](#cuerpo-del-método)
  - [Tipo de retorno](#tipo-de-retorno)
  - [Parámetros](#parámetros)
  - [Modificadores de acceso](#modificadores-de-acceso)
- [Métodos y Funciones](#métodos-y-funciones)
  - [Métodos en Java](#métodos-en-java)
  - [Funciones en otros lenguajes](#funciones-en-otros-lenguajes)

## Métodos

Los métodos son bloques de código que se definen dentro de una clase y se utilizan para realizar tareas específicas. Los métodos encapsulan la lógica y el comportamiento de un programa, lo que permite dividir el código en partes más pequeñas y manejables, mejorando la legibilidad, la reutilización y el mantenimiento del código.

## Componentes básicos

### Declaración de método

Consiste en especificar el nombre del método, el tipo de valor que devuelve (si es que devuelve algún valor), los parámetros que acepta (si los hay) y los modificadores de acceso.

```java
public int suma(int a, int b) {
    // Cuerpo del método
}
```

### Cuerpo del método

Es el bloque de código que contiene las instrucciones que se ejecutarán cuando se llame al método. Este bloque de código está encerrado entre llaves `{}`.

```java
public void saludar() {
    System.out.println("¡Hola, mundo!");
}
```

### Tipo de retorno

Especifica el tipo de valor que devuelve el método. Puede ser un tipo primitivo (int, double, boolean, etc.), un tipo de objeto (clase), o void si el método no devuelve ningún valor.

```java
// Devuelve un tipo int
public int suma(int a, int b) {
    return a + b;
}
```

### Parámetros

Son variables que se pasan al método cuando se llama, y que el método utiliza para realizar sus operaciones. Los parámetros se especifican entre paréntesis y pueden ser de cualquier tipo de datos.

```java
// Recibe dos parámetros (int a e int e)
public int suma(int a, int b) {
    return a + b;
}
```

### Modificadores de acceso

Especifican la accesibilidad del método desde otras partes del código. Pueden ser `public`, `protected`, `private` o la ausencia de un modificador de acceso (package-private).

```java
// En este caso el modificador es public
public void saludar() {
    System.out.println("¡Hola, mundo!");
}
```

## Métodos y Funciones

En Java, el término comúnmente utilizado es "método", no "función". Sin embargo, en otros lenguajes de programación como Python o JavaScript, se utiliza el término "función" para referirse a bloques de código similares a los métodos en Java.

### Métodos en Java

En Java, un método es un bloque de código que está asociado con un objeto o una clase. Los métodos son miembros de una clase y se utilizan para definir el comportamiento de los objetos creados a partir de esa clase. Los métodos pueden acceder a los datos de la instancia de la clase (campos) utilizando el operador this.

### Funciones en otros lenguajes

En algunos lenguajes de programación, como Python o JavaScript, una función es un bloque de código que puede ser llamado en cualquier parte del programa y que realiza una tarea específica. Las funciones pueden o no estar asociadas con una clase u objeto. En estos lenguajes, las funciones no tienen acceso implícito a datos de objetos como lo hacen los métodos en Java.
