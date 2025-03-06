<h1 align="center">Polimorfismo</h1>

<h2>📑 Contenido</h2>

- [Polimorfismo](#polimorfismo)
- [¿Qué es el polimorfismo?](#qué-es-el-polimorfismo)
  - [Tipos de polimorfismo](#tipos-de-polimorfismo)
- [Polimorfismo de sobrescritura(overriding)](#polimorfismo-de-sobrescrituraoverriding)
- [Polimorfismo de sobrecarga(overloading)](#polimorfismo-de-sobrecargaoverloading)
- [Polimorfismo con interfaces](#polimorfismo-con-interfaces)
- [Polimorfismo y enlace dinámico](#polimorfismo-y-enlace-dinámico)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplo práctico: sistema de gestión de formas geométricas](#ejemplo-práctico-sistema-de-gestión-de-formas-geométricas)

## Polimorfismo

El polimorfismo es uno de los pilares fundamentales de la Programación Orientada a Objetos (POO). Se refiere a la capacidad de un objeto de tomar muchas formas, es decir, de comportarse de diferentes maneras según el contexto. En Java, el polimorfismo permite que una misma operación se comporte de manera diferente en función del objeto que la ejecuta.

## ¿Qué es el polimorfismo?

El polimorfismo proviene del griego "poly" (muchos) y "morph" (formas). En POO, se refiere a la capacidad de una clase de presentar la misma interfaz (métodos) pero con implementaciones diferentes.

### Tipos de polimorfismo

- **Polimorfismo de Sobrescritura (Overriding):** Ocurre cuando una subclase proporciona una implementación específica de un método que ya está definido en su superclase.

- **Polimorfismo de Sobrecarga (Overloading):** Ocurre cuando una clase tiene múltiples métodos con el mismo nombre pero diferentes parámetros.

## Polimorfismo de sobrescritura(overriding)

El polimorfismo de sobrescritura permite a una subclase proporcionar una implementación específica de un método que ya está definido en su superclase. Esto se logra utilizando la anotación `@Override`.

```java
public class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}

public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miAnimal.hacerSonido(); // Salida: Sonido genérico
        miPerro.hacerSonido();  // Salida: Guau guau
        miGato.hacerSonido();   // Salida: Miau
    }
}
```

En este ejemplo, el método `hacerSonido()` se comporta de manera diferente dependiendo del objeto que lo invoca.

## Polimorfismo de sobrecarga(overloading)

El polimorfismo de sobrecarga permite que una clase tenga múltiples métodos con el mismo nombre pero diferentes listas de parámetros (diferente número o tipo de parámetros).

```java
public class Calculadora {
    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para sumar tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método para sumar dos números decimales
    public double sumar(double a, double b) {
        return a + b;
    }
}

// Salida
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.sumar(2, 3));           // Salida: 5
        System.out.println(calc.sumar(2, 3, 4));        // Salida: 9
        System.out.println(calc.sumar(2.5, 3.5));       // Salida: 6.0
    }
}
```

## Polimorfismo con interfaces

En Java, el polimorfismo también se puede lograr mediante interfaces. Una interfaz define un contrato que las clases deben cumplir, permitiendo que diferentes clases implementen la misma interfaz de maneras distintas.

```java
// Interfaz
public interface Sonido {
    void hacerSonido();
}

// Clases que implementan la interfaz
public class Perro implements Sonido {
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}

public class Gato implements Sonido {
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Sonido miPerro = new Perro();
        Sonido miGato = new Gato();

        miPerro.hacerSonido(); // Salida: Guau guau
        miGato.hacerSonido();  // Salida: Miau
    }
}
```

## Polimorfismo y enlace dinámico

El polimorfismo en Java se basa en el enlace dinámico (o enlace tardío), que significa que la decisión sobre qué método ejecutar se toma en tiempo de ejecución, no en tiempo de compilación. Esto permite que el programa sea más flexible y extensible.

```java
public class Main {
    public static void main(String[] args) {
        Animal miAnimal;

        miAnimal = new Perro();
        miAnimal.hacerSonido(); // Salida: Guau guau

        miAnimal = new Gato();
        miAnimal.hacerSonido(); // Salida: Miau
    }
}
```

En este ejemplo, el método `hacerSonido()` que se ejecuta depende del tipo real del objeto en tiempo de ejecución.

## Buenas prácticas

- **Usa polimorfismo para mejorar la flexibilidad:** Permite que tu código sea más adaptable a cambios futuros.

- **Aprovecha las interfaces:** Define contratos claros que las clases pueden implementar de maneras diferentes.

- **Evita el uso excesivo de sobrecarga:** Demasiados métodos sobrecargados pueden dificultar la lectura del código.

- **Documenta bien los métodos sobrescritos:** Asegúrate de que las subclases implementen correctamente los métodos de la superclase.

## Ejemplo práctico: sistema de gestión de formas geométricas

```java
// Superclase
public abstract class Forma {
    public abstract double calcularArea();
}

// Subclases
public class Circulo extends Forma {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class Rectangulo extends Forma {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Forma miForma;

        miForma = new Circulo(5.0);
        System.out.println("Área del círculo: " + miForma.calcularArea());

        miForma = new Rectangulo(4.0, 6.0);
        System.out.println("Área del rectángulo: " + miForma.calcularArea());
    }
}
```
