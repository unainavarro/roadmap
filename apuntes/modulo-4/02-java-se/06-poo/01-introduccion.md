<h1 align="center">Programación orientada a objetos (POO)</h1>

<h2>📑 Contenido</h2>

- [Programación orientada a objetos](#programación-orientada-a-objetos)
- [Conceptos básicos de la POO](#conceptos-básicos-de-la-poo)
  - [¿Qué es un objeto?](#qué-es-un-objeto)
  - [¿Qué es una clase?](#qué-es-una-clase)
- [Pilares de la POO](#pilares-de-la-poo)
  - [Abstracción](#abstracción)
  - [Encapsulamiento](#encapsulamiento)
  - [Herencia](#herencia)
  - [Polimorfismo](#polimorfismo)
- [Relaciones entre clases](#relaciones-entre-clases)
  - [Asociación](#asociación)
  - [Agregación](#agregación)
  - [Composición](#composición)
- [Ejemplo práctico: sistema de gestión de biblioteca](#ejemplo-práctico-sistema-de-gestión-de-biblioteca)
- [Buenas prácticas](#buenas-prácticas)

## Programación orientada a objetos

La Programación Orientada a Objetos (POO) es un paradigma de programación que organiza el software en torno a "objetos", los cuales representan entidades del mundo real. Java es un lenguaje que se basa en este paradigma, lo que lo convierte en una herramienta poderosa para desarrollar aplicaciones modulares, reutilizables y fáciles de mantener.

## Conceptos básicos de la POO

### ¿Qué es un objeto?

Un objeto es una instancia de una clase. Representa una entidad con un estado (atributos) y un comportamiento (métodos). Por ejemplo, en un sistema de gestión de bibliotecas, un objeto podría ser un "Libro" con atributos como **titulo**, **autor** y **añoPublicacion**, y métodos como **prestar()** o **devolver()**.

### ¿Qué es una clase?

Una clase es una plantilla o un plano para crear objetos. Define los atributos y métodos que tendrán los objetos de ese tipo. En Java, una clase se define usando la palabra clave `class`.

```java
public class Libro {
    // Atributos
    String titulo;
    String autor;
    int añoPublicacion;

    // Métodos
    void prestar() {
        System.out.println("El libro '" + titulo + "' ha sido prestado.");
    }

    void devolver() {
        System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    }
}
```

## Pilares de la POO

La POO se basa en cuatro pilares fundamentales: **Abstracción**, **Encapsulamiento**, **Herencia** y **Polimorfismo**.

### Abstracción

La abstracción consiste en simplificar la complejidad del mundo real modelando solo los aspectos relevantes de una entidad. En Java, esto se logra mediante clases y métodos que ocultan los detalles innecesarios.

```java
public abstract class Vehiculo {
    abstract void mover();
}
```

### Encapsulamiento

El encapsulamiento es el mecanismo que protege los datos de un objeto, permitiendo el acceso a ellos solo a través de métodos definidos (getters y setters). Esto garantiza la integridad de los datos.

```java
public class CuentaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }
}
```

### Herencia

La herencia permite crear nuevas clases a partir de clases existentes, reutilizando atributos y métodos. En Java, se usa la palabra clave extends.

```java
public class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

public class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau guau");
    }
}
```

### Polimorfismo

El polimorfismo permite que un objeto se comporte de múltiples formas. En Java, esto se logra mediante la sobrescritura de métodos y la sobrecarga.

```java
//Sobrescritura(mirar ejemplo herencia)
public class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Miau");
    }
}

//Sobrecarga
public class Calculadora {
    int sumar(int a, int b) {
        return a + b;
    }

    double sumar(double a, double b) {
        return a + b;
    }
}
```

## Relaciones entre clases

En la POO, las clases pueden relacionarse de diferentes maneras:

### Asociación

Es una relación donde un objeto usa otro objeto. Por ejemplo, un **Estudiante** usa un **Libro**.

### Agregación

Es una relación "tiene-un" donde un objeto contiene otros objetos, pero estos pueden existir de manera independiente. Por ejemplo, una **Universidad** tiene **Estudiantes**.

### Composición

Es una relación más fuerte que la agregación, donde el objeto contenedor es responsable del ciclo de vida del objeto contenido. Por ejemplo, un **Automóvil** tiene un **Motor**.

## Ejemplo práctico: sistema de gestión de biblioteca

A continuación, presentamos un ejemplo práctico que integra los conceptos de POO en un sistema de gestión de bibliotecas.

```java
public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void prestar() {
        System.out.println("Libro prestado: " + titulo);
    }
}

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }
}
```

## Buenas prácticas

- Usa nombres descriptivos para clases, métodos y atributos.

- Mantén el encapsulamiento para proteger los datos.

- Evita la herencia múltiple, ya que Java no la soporta directamente.

- Aplica el principio de responsabilidad única: cada clase debe tener una única responsabilidad.
