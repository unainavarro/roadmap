<h1 align="center">Modificadores de acceso</h1>

<h2>📑 Contenido</h2>

- [Modificadores de acceso](#modificadores-de-acceso)
- [¿Qué son los modificadores de acceso?](#qué-son-los-modificadores-de-acceso)
- [Modificadores de acceso en detalle](#modificadores-de-acceso-en-detalle)
  - [public](#public)
  - [private](#private)
  - [protected](#protected)
  - [Sin modificador(default)](#sin-modificadordefault)
- [Modificadores de acceso en clases](#modificadores-de-acceso-en-clases)
- [Buenas prácticas con modificadores de acceso](#buenas-prácticas-con-modificadores-de-acceso)

## Modificadores de acceso

Los modificadores de acceso son palabras clave en Java que **controlan la visibilidad y el alcance de clases, métodos, atributos y constructores**. Estos modificadores son esenciales para **implementar el principio de encapsulamiento** en la Programación Orientada a Objetos (POO), ya que permiten restringir o permitir el acceso a los miembros de una clase desde otras partes del programa.

## ¿Qué son los modificadores de acceso?

Los modificadores de acceso definen dónde y cómo se puede acceder a los miembros de una clase (atributos, métodos, constructores) o a la clase misma. En Java, existen cuatro modificadores de acceso:

- **public:** Acceso desde cualquier parte del programa.

- **private:** Acceso solo dentro de la clase.

- **protected:** Acceso dentro del mismo paquete y desde subclases (incluso en otros paquetes).

- **Sin modificador (default):** Acceso solo dentro del mismo paquete.

## Modificadores de acceso en detalle

### public

El modificador `public` permite que un miembro de una clase sea accesible desde cualquier parte del programa, ya sea dentro o fuera de la clase, del paquete o de las subclases

```java
public class Ejemplo {
    public int atributoPublico = 10;

    public void metodoPublico() {
        System.out.println("Método público");
    }
}

// Uso:
public class Main {
    public static void main(String[] args) {
        Ejemplo obj = new Ejemplo();
        System.out.println(obj.atributoPublico); // Acceso permitido
        obj.metodoPublico(); // Acceso permitido
    }
}
```

### private

El modificador `private` restringe el acceso a los miembros de una clase, de modo que solo se pueden usar dentro de la misma clase. Es ideal para ocultar detalles de implementación.

```java
public class Ejemplo {
    private int atributoPrivado = 20;

    private void metodoPrivado() {
        System.out.println("Método privado");
    }

    public void accederPrivado() {
        System.out.println(atributoPrivado); // Acceso permitido dentro de la clase
        metodoPrivado(); // Acceso permitido dentro de la clase
    }
}

// Uso:
public class Main {
    public static void main(String[] args) {
        Ejemplo obj = new Ejemplo();
        // System.out.println(obj.atributoPrivado); // Error: acceso denegado
        // obj.metodoPrivado(); // Error: acceso denegado
        obj.accederPrivado(); // Acceso indirecto
    }
}
```

### protected

El modificador `protected` permite el acceso a los miembros de una clase dentro del mismo paquete y desde subclases, incluso si están en paquetes diferentes.

```java
package paquete1;

public class Ejemplo {
    protected int atributoProtegido = 30;

    protected void metodoProtegido() {
        System.out.println("Método protegido");
    }
}

// Uso desde una subclase en otro paquete:
package paquete2;

import paquete1.Ejemplo;

public class Subclase extends Ejemplo {
    void accederProtegido() {
        System.out.println(atributoProtegido); // Acceso permitido
        metodoProtegido(); // Acceso permitido
    }
}
```

### Sin modificador(default)

Cuando no se especifica un modificador de acceso, el miembro tiene acceso predeterminado (también conocido como "**package-private**"). Esto significa que solo es accesible dentro del mismo paquete.

```java
package paquete1;

public class Ejemplo {
    int atributoDefault = 40;

    void metodoDefault() {
        System.out.println("Método default");
    }
}

// Uso dentro del mismo paquete:
package paquete1;

public class Main {
    public static void main(String[] args) {
        Ejemplo obj = new Ejemplo();
        System.out.println(obj.atributoDefault); // Acceso permitido
        obj.metodoDefault(); // Acceso permitido
    }
}
```

## Modificadores de acceso en clases

Los modificadores de acceso también se aplican a las clases. Sin embargo, solo se pueden usar `public` o el modificador predeterminado (sin modificador). Puedes usar `private` y `protected` para clases internas (clases anidadas dentro de otra clase).

- **public:** La clase es accesible desde cualquier parte del programa.

- **Sin modificador:** La clase solo es accesible dentro del mismo paquete.

> No se puede declarar una **clase de nivel superior** (una clase que no está anidada dentro de otra clase)

```java
// Esto no es permitido:
private class Ejemplo {
    // Código
}

// Esto es permitido:
class Ejemplo {
    // Código
}

// O también es permitido:
public class Ejemplo {
    // Código
}

// #########
// Ejemplos subclases
public class Contenedora {
    private class ClaseInternaPrivada {
        // Código
    }

    protected class ClaseInternaProtegida {
        // Código
    }
}
```

Para clases de nivel superior solo puedes usar `public` o el acceso por defecto, mientras que para clases internas puedes usar `private`, `protected`, `public` o el acceso por defecto.

## Buenas prácticas con modificadores de acceso

- **Encapsula los atributos:** Usa private para los atributos y proporciona métodos public (getters y setters) para acceder y modificar su valor.

- **Protege la lógica interna:** Usa private para métodos que no deben ser accesibles desde fuera de la clase.

- **Usa protected para herencia:** Cuando quieras que los miembros de una clase sean accesibles solo para subclases, usa protected.

- **Evita el uso excesivo de public:** Limita el uso de public solo a lo que realmente necesita ser accesible desde cualquier parte del programa.
