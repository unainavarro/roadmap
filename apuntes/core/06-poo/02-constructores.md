<h1 align="center">Constructores</h1>

<h2>📑 Contenido</h2>

- [¿Qué es un constructor?](#qué-es-un-constructor)
  - [Características de un constructor](#características-de-un-constructor)
- [Tipos de constructores](#tipos-de-constructores)
  - [Constructor predeterminado](#constructor-predeterminado)
  - [Constructor sin parámetros](#constructor-sin-parámetros)
  - [Constructor con parámetros](#constructor-con-parámetros)
- [Uso de constructores](#uso-de-constructores)
  - [Creación de objetos con constructores](#creación-de-objetos-con-constructores)
  - [Sobrecarga de constructores](#sobrecarga-de-constructores)
- [Palabra clave this](#palabra-clave-this)
- [Llamadas entre constructores](#llamadas-entre-constructores)
- [Constructores en herencia](#constructores-en-herencia)
- [Ejemplo práctico: sistema de gestión de empleados](#ejemplo-práctico-sistema-de-gestión-de-empleados)
- [Buenas prácticas con constructores](#buenas-prácticas-con-constructores)

## ¿Qué es un constructor?

Un constructor es un bloque de código que se ejecuta cuando se crea una instancia de una clase (es decir, cuando se crea un objeto). Su principal propósito es inicializar los atributos del objeto y prepararlo para su uso.

### Características de un constructor

- Tiene el mismo nombre que la clase.

- No tiene tipo de retorno (ni siquiera void).

- Puede aceptar parámetros para inicializar los atributos del objeto.

- Si no se define un constructor, Java proporciona uno por defecto (constructor predeterminado).

## Tipos de constructores

En Java, existen tres tipos principales de constructores:

### Constructor predeterminado

Si no defines ningún constructor en una clase, Java proporciona automáticamente un constructor predeterminado. Este constructor no tiene parámetros y no realiza ninguna inicialización específica.

```java
public class Coche {
    String marca;
    int año;

    // Constructor predeterminado (proporcionado por Java)
    public Coche() {
        // No hace nada
    }
}
```

### Constructor sin parámetros

Puedes definir un constructor sin parámetros manualmente para realizar inicializaciones específicas.

```java
public class Coche {
    String marca;
    int año;

    // Constructor sin parámetros
    public Coche() {
        marca = "Desconocida";
        año = 2020;
    }
}
```

En el ejemplo, no es necesario usar `this` en el constructor porque los nombres de los parámetros no están en conflicto con los nombres de los atributos de la clase. Cuando el nombre del parámetro es diferente al nombre del atributo de la clase, la palabra clave `this` no es necesaria para distinguirlos.

### Constructor con parámetros

Un constructor con parámetros permite inicializar los atributos de un objeto con valores específicos al momento de su creación.

```java
public class Coche {
    String marca;
    int año;

    // Constructor con parámetros
    public Coche(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }
}
```

En este caso, `this` se utiliza para referirse a los atributos de la clase y diferenciarlos de los parámetros del constructor.

> Evitar usar ñ, acentos o caracteres especiales. Prefiero escribir las variables,métodos... en ingles pero veo mejor los ejemplos en castellano.

## Uso de constructores

### Creación de objetos con constructores

Para crear un objeto utilizando un constructor, se usa la palabra clave `new` seguida del nombre de la clase y los argumentos necesarios.

```java
public class Main {
    public static void main(String[] args) {
        // Usando el constructor con parámetros
        Coche coche1 = new Coche("Toyota", 2022);

        // Usando el constructor sin parámetros
        Coche coche2 = new Coche();
    }
}
```

A la creación del objeto se le llama instanciar. En el ejemplo se esta instanciando un objeto de la clase `Coche`.

Instanciar un objeto es una parte fundamental de la programación orientada a objetos, ya que te permite crear múltiples objetos basados en la misma clase, cada uno con sus propios valores y comportamientos únicos.

### Sobrecarga de constructores

Java permite definir múltiples constructores en una clase, siempre y cuando tengan diferentes listas de parámetros. Esto se conoce como sobrecarga de constructores.

```java
public class Coche {
    String marca;
    int año;

    // Constructor sin parámetros
    public Coche() {
        marca = "Desconocida";
        año = 2020;
    }

    // Constructor con parámetros
    public Coche(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

    // Constructor con un solo parámetro
    public Coche(String marca) {
        this.marca = marca;
        this.año = 2023; // Año por defecto
    }
}
```

## Palabra clave this

La palabra clave `this` se utiliza dentro de un constructor para referirse al objeto actual. Es especialmente útil cuando los parámetros del constructor tienen el mismo nombre que los atributos de la clase.

```java
public class Coche {
    String marca;
    int año;

    public Coche(String marca, int año) {
        this.marca = marca; // "this.marca" se refiere al atributo de la clase
        this.año = año;     // "this.año" se refiere al atributo de la clase
    }
}
```

## Llamadas entre constructores

Un constructor puede llamar a otro constructor de la misma clase utilizando la palabra clave `this`. Esto se conoce como **llamada explícita a constructores**.

```java
public class Coche {
    String marca;
    int año;

    // Constructor sin parámetros
    public Coche() {
        this("Desconocida", 2020); // Llama al constructor con parámetros
    }

    // Constructor con parámetros
    public Coche(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }
}
```

## Constructores en herencia

Cuando una clase hereda de otra, el constructor de la clase base (superclase) se llama automáticamente antes que el constructor de la clase derivada (subclase). Esto se hace utilizando la palabra clave `super`.

```java
// Clase Vehículo
public class Vehiculo {
    String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }
}

// Clase Coche que hereda de vehículo
public class Coche extends Vehiculo {
    String marca;

    public Coche(String tipo, String marca) {
        super(tipo); // Llama al constructor de la superclase
        this.marca = marca;
    }
}
```

## Ejemplo práctico: sistema de gestión de empleados

```java
public class Empleado {
    private String nombre;
    private int id;
    private double salario;

    // Constructor sin parámetros
    public Empleado() {
        this.nombre = "Sin nombre";
        this.id = 0;
        this.salario = 0.0;
    }

    // Constructor con parámetros
    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    // Método para mostrar detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario: " + salario);
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear un empleado usando el constructor con parámetros
        Empleado empleado1 = new Empleado("Juan Pérez", 101, 3000.0);
        empleado1.mostrarDetalles();

        // Crear un empleado usando el constructor sin parámetros
        Empleado empleado2 = new Empleado();
        empleado2.mostrarDetalles();
    }
}
```

## Buenas prácticas con constructores

- Usa constructores para inicializar todos los atributos importantes de un objeto.

- Evita lógica compleja en los constructores, ya que su principal propósito es la inicialización.

- Utiliza la sobrecarga de constructores para proporcionar flexibilidad al crear objetos.

- Asegúrate de llamar al constructor de la superclase cuando trabajes con herencia.
