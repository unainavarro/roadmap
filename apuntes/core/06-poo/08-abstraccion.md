<h1 align="center">Abstracción</h1>

<h2>📑 Contenido</h2>

- [Abstracción](#abstracción)
- [¿Qué es la abstracción?](#qué-es-la-abstracción)
  - [Objetivos de la abstracción](#objetivos-de-la-abstracción)
- [Clases abstractas](#clases-abstractas)
  - [Características de las clases abstractas](#características-de-las-clases-abstractas)
- [Interfaces](#interfaces)
  - [Características de las Interfaces](#características-de-las-interfaces)
- [Diferencias entre clases abstractas e interfaces](#diferencias-entre-clases-abstractas-e-interfaces)
- [Buenas Prácticas con la Abstracción](#buenas-prácticas-con-la-abstracción)
- [Ejemplo práctico: sistema de gestión de vehículos](#ejemplo-práctico-sistema-de-gestión-de-vehículos)

## Abstracción

La abstracción es uno de los pilares fundamentales de la Programación Orientada a Objetos (POO). Se refiere a la capacidad de representar las características esenciales de un objeto, ocultando los detalles innecesarios. En Java, la abstracción se logra mediante clases abstractas e interfaces.

## ¿Qué es la abstracción?

La abstracción es el proceso de identificar y enfocarse en las características esenciales de un objeto, ignorando los detalles irrelevantes o secundarios. En POO, esto permite definir modelos que representan entidades del mundo real de manera simplificada.

### Objetivos de la abstracción

- **Simplificar la complejidad:** Ocultar los detalles de implementación y mostrar solo lo necesario.

- **Facilitar la reutilización:** Crear modelos genéricos que puedan ser extendidos o implementados por otras clases.

- **Mejorar la claridad del código:** Hacer que el código sea más comprensible y fácil de mantener.

## Clases abstractas

Una clase abstracta es una clase que no se puede instanciar directamente, sino que sirve como una plantilla para otras clases. Puede contener métodos abstractos (sin implementación) y métodos concretos (con implementación).

### Características de las clases abstractas

- **No se pueden instanciar:** Solo se pueden heredar.

- **Pueden contener métodos abstractos:** Métodos sin implementación que deben ser implementados por las subclases.

- **Pueden contener métodos concretos:** Métodos con implementación que pueden ser heredados o sobrescritos.

```java
public abstract class Animal {
    // Método abstracto (sin implementación)
    public abstract void hacerSonido();

    // Método concreto (con implementación)
    public void dormir() {
        System.out.println("El animal está durmiendo.");
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

//Uso:

public class Main {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miPerro.hacerSonido(); // Salida: Guau guau
        miPerro.dormir();      // Salida: El animal está durmiendo.

        miGato.hacerSonido();  // Salida: Miau
        miGato.dormir();       // Salida: El animal está durmiendo.
    }
}
```

## Interfaces

Una interfaz es una colección de métodos abstractos y constantes que definen un contrato que las clases deben cumplir. A diferencia de las clases abstractas, una interfaz no puede contener métodos concretos (aunque desde Java 8, se pueden definir métodos predeterminados y estáticos).

### Características de las Interfaces

- **No se pueden instanciar:** Solo se pueden implementar.

- **Todos los métodos son abstractos:** A menos que sean métodos predeterminados o estáticos.

- **Permiten herencia múltiple: **Una clase puede implementar varias interfaces.

```java
public interface Sonido {
    // Método abstracto
    void hacerSonido();

    // Método predeterminado (Java 8+)
    default void dormir() {
        System.out.println("Durmiendo...");
    }
}

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
        miPerro.dormir();      // Salida: Durmiendo...

        miGato.hacerSonido();  // Salida: Miau
        miGato.dormir();       // Salida: Durmiendo...
    }
}
```

## Diferencias entre clases abstractas e interfaces

| **Característica**     | **Clase Abstracta**                | **Interfaz**                                     |
| ---------------------- | ---------------------------------- | ------------------------------------------------ |
| **Instanciación**      | No se puede instanciar             | No se puede instanciar                           |
| **Métodos Abstractos** | Puede tener métodos abstractos     | Todos los métodos son abstractos                 |
| **Métodos Concretos**  | Puede tener métodos concretos      | Solo métodos predeterminados/estáticos (Java 8+) |
| **Herencia Múltiple**  | No admite herencia múltiple        | Admite herencia múltiple                         |
| **Uso Principal**      | Para compartir código entre clases | Para definir contratos                           |

## Buenas Prácticas con la Abstracción

- **Usa clases abstractas para compartir código:** Cuando varias clases comparten comportamiento común, define ese comportamiento en una clase abstracta.

- **Usa interfaces para definir contratos:** Cuando necesites garantizar que ciertos métodos estén implementados, utiliza interfaces.

- **Evita la sobreabstracción:** No crees clases abstractas o interfaces innecesarias; úsalas solo cuando aporten claridad y reutilización.

- **Documenta bien las abstracciones:** Asegúrate de que las clases e interfaces estén bien documentadas para que otros desarrolladores las usen correctamente.

## Ejemplo práctico: sistema de gestión de vehículos

```java
// Clase abstracta
public abstract class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Método abstracto
    public abstract void mover();

    // Método concreto
    public void mostrarMarca() {
        System.out.println("Marca: " + marca);
    }
}

// Subclase
public class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println("El coche está en movimiento.");
    }
}

// Interfaz
public interface Electrico {
    void cargarBateria();
}

// Clase que implementa la interfaz
public class CocheElectrico extends Vehiculo implements Electrico {
    public CocheElectrico(String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println("El coche eléctrico está en movimiento.");
    }

    @Override
    public void cargarBateria() {
        System.out.println("Cargando la batería del coche eléctrico.");
    }
}

// Uso:
public class Main {
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche("Toyota");
        Vehiculo miCocheElectrico = new CocheElectrico("Tesla");

        miCoche.mostrarMarca();
        miCoche.mover();

        miCocheElectrico.mostrarMarca();
        miCocheElectrico.mover();
        ((Electrico) miCocheElectrico).cargarBateria();
    }
}
```
