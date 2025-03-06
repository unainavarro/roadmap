<h1 align="center">Paquetes</h1>

<h2>📑 Contenido</h2>

- [Paquetes](#paquetes)
- [¿Qué es un paquete?](#qué-es-un-paquete)
- [Creación de paquetes](#creación-de-paquetes)
- [Importación de paquetes](#importación-de-paquetes)
- [Paquetes estándar](#paquetes-estándar)
- [Subpaquetes](#subpaquetes)
- [Buenas prácticas](#buenas-prácticas)

## Paquetes

En Java, los paquetes son una forma de organizar y estructurar el código en módulos lógicos. Los paquetes ayudan a evitar conflictos de nombres, facilitan la reutilización del código y mejoran la mantenibilidad de los proyectos.

## ¿Qué es un paquete?

Un paquete es un contenedor que agrupa clases, interfaces y subpaquetes relacionados. Los paquetes proporcionan un mecanismo para:

- **Organizar el código:** Agrupar clases relacionadas en un mismo espacio de nombres.

- **Evitar conflictos de nombres:** Dos clases pueden tener el mismo nombre si están en paquetes diferentes.

- **Controlar el acceso:** Los modificadores de acceso (`public`, `protected`, `private`) funcionan en conjunto con los paquetes para controlar la visibilidad de las clases y sus miembros.

## Creación de paquetes

Para crear un paquete en Java, se utiliza la palabra clave `package` al inicio del archivo de la clase. El nombre del paquete debe coincidir con la estructura de directorios donde se encuentra el archivo.

```java
package nombreDelPaquete;
```

Ejemplo:

Supongamos que tienes una clase `Coche` que deseas colocar en un paquete llamado `vehiculos`. La estructura de directorios y el código serían los siguientes:

```
src/
└── vehiculos/
    └── Coche.java
```

```java
package vehiculos;

public class Coche {
    private String marca;
    private String modelo;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
```

## Importación de paquetes

Para usar una clase de otro paquete, debes importarla utilizando la palabra clave `import`. Esto permite acceder a la clase sin necesidad de escribir el nombre completo del paquete cada vez.

Si deseas usar la clase Coche del paquete vehiculos en otra clase, debes importarla:

```java
import vehiculos.Coche;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla");
        miCoche.mostrarDetalles();
    }
}
```

Puedes importar todas las clases de un paquete usando \*:

```java
import vehiculos.*;
```

## Paquetes estándar

Java incluye una serie de paquetes estándar que proporcionan funcionalidades comunes. Algunos de los más utilizados son:

- **java.lang:** Contiene clases fundamentales como `String`, `System`, y `Object`. Este paquete se importa automáticamente.

- **java.util:** Proporciona utilidades como colecciones (`ArrayList`, `HashMap`), fechas y más.

- **java.io:** Ofrece clases para manejar entrada y salida de datos.

- **java.net:** Contiene clases para trabajar con redes.

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        System.out.println(lista);
    }
}
```

## Subpaquetes

Los paquetes pueden contener otros paquetes, conocidos como subpaquetes. Esto permite una organización jerárquica del código.

Ejemplo:

Supongamos que tienes un paquete `vehiculos` y dentro de él un subpaquete `electricos`:

Estructura de Directorios:

```
src/
└── vehiculos/
    ├── Coche.java
    └── electricos/
        └── CocheElectrico.java
```

```java
package vehiculos.electricos;

public class CocheElectrico {
    private int capacidadBateria;

    public CocheElectrico(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public void cargar() {
        System.out.println("Cargando la batería de " + capacidadBateria + " kWh.");
    }
}

// Uso:

import vehiculos.electricos.CocheElectrico;

public class Main {
    public static void main(String[] args) {
        CocheElectrico miCocheElectrico = new CocheElectrico(75);
        miCocheElectrico.cargar();
    }
}
```

## Buenas prácticas

- **Usa nombres descriptivos:** Los nombres de los paquetes deben reflejar su propósito y ser fáciles de entender.

- **Sigue las convenciones de nomenclatura:** Usa nombres en minúsculas y evita caracteres especiales.

- **Organiza el código por funcionalidad:** Agrupa clases relacionadas en el mismo paquete.

- **Evita paquetes demasiado grandes:** Si un paquete tiene muchas clases, considera dividirlo en subpaquetes.
