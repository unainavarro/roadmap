<h1 align="center">Clases y Objetos</h1>

<h2>📑 Contenido</h2>

- [Clases y objetos](#clases-y-objetos)
- [¿Qué es una clase?](#qué-es-una-clase)
  - [Componentes de una clase](#componentes-de-una-clase)
- [¿Qué es un objeto?](#qué-es-un-objeto)
  - [Características de un objeto](#características-de-un-objeto)
- [Relación entre clases y objetos](#relación-entre-clases-y-objetos)
- [Atributos y métodos](#atributos-y-métodos)
  - [Atributos](#atributos)
  - [Métodos](#métodos)
  - [Ejemplo](#ejemplo)
- [Buenas prácticas con clases y objetos](#buenas-prácticas-con-clases-y-objetos)

## Clases y objetos

En Java, la Programación Orientada a Objetos (POO) es un paradigma fundamental que organiza el software en torno a "clases" y "objetos". Las clases son plantillas que definen la estructura y el comportamiento de los objetos, mientras que los objetos son instancias concretas de esas clases.

## ¿Qué es una clase?

Una clase es una plantilla o un plano que define las propiedades (atributos) y comportamientos (métodos) que tendrán los objetos creados a partir de ella. En otras palabras, una clase es un modelo abstracto que describe cómo serán los objetos.

### Componentes de una clase

- **Atributos:** Variables que almacenan el estado del objeto.

- **Métodos:** Funciones que definen el comportamiento del objeto.

- **Constructores:** Métodos especiales para inicializar objetos.

- **Bloques de inicialización:** Bloques de código que se ejecutan al crear un objeto.

- **Clases anidadas:** Clases definidas dentro de otra clase.

```java
public class Coche {
    // Atributos
    String marca;
    String modelo;
    int año;

    // Constructor
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método
    public void arrancar() {
        System.out.println("El coche " + marca + " " + modelo + " está arrancando.");
    }
}
```

## ¿Qué es un objeto?

Un objeto es una instancia concreta de una clase. Mientras que la clase es una definición abstracta, el objeto es una entidad real que ocupa memoria y tiene un estado y comportamiento específicos.

### Características de un objeto

- **Estado:** Representado por los valores de sus atributos.

- **Comportamiento:** Definido por los métodos que puede ejecutar.

- **Identidad:** Cada objeto es único, incluso si tiene el mismo estado que otro.

```java
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 2022);

        // Acceder a los atributos y métodos del objeto
        System.out.println("Marca: " + miCoche.marca);
        System.out.println("Modelo: " + miCoche.modelo);
        miCoche.arrancar();
    }
}
```

## Relación entre clases y objetos

La relación entre una clase y un objeto es similar a la relación entre un plano y una casa. El plano (clase) describe cómo será la casa, pero no es una casa en sí. La casa (objeto) es una construcción real basada en el plano.

- **Clase:** Define la estructura y el comportamiento.

- **Objeto:** Es una instancia concreta de esa estructura y comportamiento.

## Atributos y métodos

### Atributos

Los atributos son variables que almacenan el estado de un objeto. Pueden ser de cualquier tipo de dato (primitivo o referencia).

### Métodos

Los métodos son funciones que definen el comportamiento de un objeto. Pueden realizar operaciones, modificar atributos o devolver valores.

### Ejemplo

```java
public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
    }

    public void prestar() {
        System.out.println("El libro '" + titulo + "' ha sido prestado.");
    }
}

// Uso:
public class Main {
    public static void main(String[] args) {
        // Crear objetos de la clase Libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", 1949);

        // Acceder a los métodos de los objetos
        libro1.mostrarInformacion();
        libro1.prestar();

        libro2.mostrarInformacion();
    }
}
```

## Buenas prácticas con clases y objetos

- **Usa nombres descriptivos:** El nombre de la clase debe reflejar su propósito.

- **Encapsula los atributos:** Usa modificadores de acceso como private y proporciona métodos public (getters y setters) para acceder a ellos.

- **Mantén la cohesión:** Una clase debe tener una única responsabilidad.

- **Evita clases demasiado grandes:** Si una clase tiene demasiados atributos o métodos, considera dividirla en clases más pequeñas.
