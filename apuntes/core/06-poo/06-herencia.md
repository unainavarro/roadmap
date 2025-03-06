<h1 align="center">Herencia</h1>

<h2>📑 Contenido</h2>

- [Herencia](#herencia)
- [¿Qué es la herencia?](#qué-es-la-herencia)
  - [Beneficios de la herencia](#beneficios-de-la-herencia)
- [Implementación de la herencia](#implementación-de-la-herencia)
- [Uso de la palabra clave super](#uso-de-la-palabra-clave-super)
- [Sobrescritura de métodos(overriding)](#sobrescritura-de-métodosoverriding)
- [Tipos de herencia](#tipos-de-herencia)
  - [Herencia simple](#herencia-simple)
  - [Herencia multinivel](#herencia-multinivel)
  - [Jerarquía de herencia](#jerarquía-de-herencia)
- [Buenas Prácticas con la Herencia](#buenas-prácticas-con-la-herencia)
- [Ejemplo práctico: sistema de gestión de figuras geométricas](#ejemplo-práctico-sistema-de-gestión-de-figuras-geométricas)

## Herencia

La herencia es uno de los pilares fundamentales de la Programación Orientada a Objetos (POO). Permite crear nuevas clases a partir de clases existentes, reutilizando y extendiendo su funcionalidad.

## ¿Qué es la herencia?

La herencia es un mecanismo que permite a una clase (llamada subclase o clase derivada) heredar atributos y métodos de otra clase (llamada superclase o clase base). Esto facilita la reutilización de código y la creación de jerarquías de clases.

### Beneficios de la herencia

- **Reutilización de código:** Evita la duplicación de código al permitir que las subclases hereden comportamientos y propiedades de la superclase.

- **Extensibilidad:** Permite añadir nuevas funcionalidades a las subclases sin modificar la superclase.

- **Organización del código:** Facilita la creación de jerarquías de clases que reflejan relaciones del mundo real.

## Implementación de la herencia

La herencia se implementa utilizando la palabra clave `extends`. La subclase hereda todos los atributos y métodos no privados de la superclase.

```java
// Superclase
public class Vehiculo {
    // Atributos
    String marca;
    int año;

    // Constructor
    public Vehiculo(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

    // Método
    public void arrancar() {
        System.out.println("El vehículo está arrancando.");
    }
}

// Subclase
public class Coche extends Vehiculo {
    // Atributo adicional
    int numeroPuertas;

    // Constructor
    public Coche(String marca, int año, int numeroPuertas) {
        super(marca, año); // Llama al constructor de la superclase
        this.numeroPuertas = numeroPuertas;
    }

    // Método adicional
    public void abrirPuertas() {
        System.out.println("Abriendo " + numeroPuertas + " puertas.");
    }
}
```

## Uso de la palabra clave super

La palabra clave `super` se utiliza en las subclases para:

- **Llamar al constructor de la superclase:** Esto es necesario para inicializar los atributos heredados.

- **Acceder a métodos o atributos de la superclase:** Útil cuando la subclase sobrescribe un método pero aún necesita usar la implementación de la superclas

```java
public class Coche extends Vehiculo {
    int numeroPuertas;

    public Coche(String marca, int año, int numeroPuertas) {
        super(marca, año); // Llama al constructor de la superclase
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void arrancar() {
        super.arrancar(); // Llama al método de la superclase
        System.out.println("El coche está listo para conducir.");
    }
}
```

## Sobrescritura de métodos(overriding)

La sobrescritura de métodos permite a una subclase proporcionar una implementación específica de un método que ya está definido en la superclase. Para sobrescribir un método, se utiliza la anotación `@Override`.

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
```

## Tipos de herencia

En Java, la herencia puede ser de varios tipos:

### Herencia simple

Java no admite herencia múltiple directa (una clase no puede heredar de varias clases). Sin embargo, una clase puede heredar de una sola clase.

```java
public class A {
    // Código de la clase A
}

public class B extends A {
    // Código de la clase B
}
```

### Herencia multinivel

Una clase puede heredar de otra clase, que a su vez hereda de una tercera clase.

```java
public class A {
    // Código de la clase A
}

public class B extends A {
    // Código de la clase B
}

public class C extends B {
    // Código de la clase C
}
```

### Jerarquía de herencia

Varias clases pueden heredar de una misma superclase.

```java
public class A {
    // Código de la clase A
}

public class B extends A {
    // Código de la clase B
}

public class C extends A {
    // Código de la clase C
}
```

## Buenas Prácticas con la Herencia

- **Usa la herencia para relaciones "es-un":** La herencia debe reflejar una relación de especialización (por ejemplo, un Coche es un Vehiculo).

- **Evita la herencia múltiple:** Java no la soporta directamente, pero puedes usar interfaces para lograr un comportamiento similar.

- **No abuses de la herencia:** A veces, la composición (usar objetos de otras clases como atributos) es una mejor opción.

- **Usa @Override para claridad:** Indica explícitamente que estás sobrescribiendo un método.

## Ejemplo práctico: sistema de gestión de figuras geométricas

```java
// Superclase
public class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public void dibujar() {
        System.out.println("Dibujando una figura de color " + color);
    }
}

// Subclase
public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color); // Llama al constructor de la superclase
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        super.dibujar(); // Llama al método de la superclase
        System.out.println("Dibujando un círculo de radio " + radio);
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
```
