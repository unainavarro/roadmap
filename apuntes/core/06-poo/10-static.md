<h1 align="center">Static</h1>

<h2>📑 Contenido</h2>

- [Static](#static)
- [¿Qué es static?](#qué-es-static)
- [Variables estáticas](#variables-estáticas)
  - [Características de las variables estáticas](#características-de-las-variables-estáticas)
- [Métodos estáticos](#métodos-estáticos)
  - [Características de los métodos estáticos](#características-de-los-métodos-estáticos)
- [Bloques estáticos](#bloques-estáticos)
- [Clases estáticas anidadas](#clases-estáticas-anidadas)
- [Ejemplo práctico: gestión de usuarios](#ejemplo-práctico-gestión-de-usuarios)
- [Buenas prácticas](#buenas-prácticas)

## Static

En Java, la palabra clave `static` se utiliza para definir miembros (variables y métodos) que pertenecen a la clase en lugar de a una instancia específica de la clase. Esto significa que los miembros estáticos son compartidos por todas las instancias de la clase y pueden ser accedidos sin necesidad de crear un objeto.

## ¿Qué es static?

La palabra clave `static` se utiliza para definir miembros de clase que son independientes de cualquier instancia de la clase. Estos miembros están asociados con la clase en sí, no con objetos individuales. Los miembros estáticos incluyen:

- **Variables estáticas:** También conocidas como variables de clase.

- **Métodos estáticos:** Métodos que pueden ser llamados sin crear una instancia de la clase.

- **Bloques estáticos:** Bloques de código que se ejecutan cuando la clase se carga en la memoria.

- **Clases estáticas anidadas:** Clases definidas dentro de otra clase que son estáticas.

## Variables estáticas

Una variable estática es una variable que pertenece a la clase, no a una instancia específica. Todas las instancias de la clase comparten la misma variable estática.

### Características de las variables estáticas

- **Compartida:** Todas las instancias de la clase comparten la misma variable estática.

- **Inicialización:** Se inicializa cuando la clase se carga en la memoria.

- **Acceso:** Se puede acceder directamente usando el nombre de la clase.

```java
public class Contador {
    // Variable estática
    public static int contador = 0;

    public Contador() {
        contador++; // Incrementa el contador cada vez que se crea una instancia
    }
}

// Uso:
public class Main {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();

        System.out.println("Número de instancias: " + Contador.contador);// Salida: 2
    }
}
```

## Métodos estáticos

Un método estático es un método que pertenece a la clase, no a una instancia específica. Puede ser llamado sin crear un objeto de la clase.

### Características de los métodos estáticos

- **Acceso directo:** Se puede llamar usando el nombre de la clase.

- **Sin acceso a miembros de instancia:** No pueden acceder directamente a variables o métodos no estáticos.

- **Uso común:** Util para métodos utilitarios o de ayuda.

```java
public class Matemáticas {
    // Método estático
    public static int sumar(int a, int b) {
        return a + b;
    }
}

// Uso:
public class Main {
    public static void main(String[] args) {
        int resultado = Matemáticas.sumar(5, 3);
        System.out.println("Resultado: " + resultado); // Salida: 8
    }
}
```

## Bloques estáticos

Un bloque estático es un bloque de código que se ejecuta cuando la clase se carga en la memoria. Se utiliza para inicializar variables estáticas o realizar tareas de configuración.

```java
public class Configuracion {
    // Variable estática
    public static String nombreAplicacion;

    // Bloque estático
    static {
        nombreAplicacion = "MiAplicación";
        System.out.println("Bloque estático ejecutado.");
    }
}

// Uso:
public class Main {
    public static void main(String[] args) {
        System.out.println("Nombre de la aplicación: " + Configuracion.nombreAplicacion);
    }
}
```

## Clases estáticas anidadas

Una clase estática anidada es una clase definida dentro de otra clase que es estática. A diferencia de las clases internas no estáticas, las clases estáticas anidadas no tienen acceso a los miembros de instancia de la clase externa.

```java
public class Externa {
    // Clase estática anidada
    public static class Anidada {
        public void mostrarMensaje() {
            System.out.println("Mensaje desde la clase anidada estática.");
        }
    }
}

// Uso:
public class Main {
    public static void main(String[] args) {
        Externa.Anidada anidada = new Externa.Anidada();
        anidada.mostrarMensaje();
    }
}
```

## Ejemplo práctico: gestión de usuarios

```java
public class Usuario {
    // Variable estática para contar usuarios
    private static int contadorUsuarios = 0;

    // Variables de instancia
    private String nombre;
    private int id;

    // Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.id = ++contadorUsuarios; // Incrementa el contador y asigna el ID
    }

    // Método estático para obtener el número de usuarios
    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }

    // Método de instancia para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
    }
}

// Uso:
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("Ana");

        usuario1.mostrarDetalles();
        usuario2.mostrarDetalles();

        System.out.println("Total de usuarios: " + Usuario.getContadorUsuarios());
    }
}
```

## Buenas prácticas

**Usa static para miembros compartidos:** Cuando un miembro debe ser compartido por todas las instancias de una clase, decláralo como `static`.

- **Evita el abuso de static:** No uses `static` para todo, ya que puede dificultar las pruebas unitarias y la modularidad del código.

- **Considera la concurrencia:** Las variables estáticas pueden causar problemas en entornos multihilo. Usa sincronización si es necesario.

- **Documenta el uso de static:** Asegúrate de que el propósito de los miembros estáticos esté bien documentado.
