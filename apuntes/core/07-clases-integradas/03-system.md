<h1 align="center">Clase System</h1>

<h2>📑 Contenido</h2>

- [System](#system)
- [¿Qué es la clase system?](#qué-es-la-clase-system)
  - [Características de la Clase System](#características-de-la-clase-system)
- [Métodos Comunes](#métodos-comunes)
  - [Entrada y salida estándar](#entrada-y-salida-estándar)
    - [System.out](#systemout)
    - [System.in](#systemin)
    - [System.err](#systemerr)
  - [Propiedades del Sistema](#propiedades-del-sistema)
    - [System.getProperty(String key)](#systemgetpropertystring-key)
    - [System.setProperty(String key, String value)](#systemsetpropertystring-key-string-value)
  - [Finalización del programa](#finalización-del-programa)
    - [System.exit(int status)](#systemexitint-status)
  - [Tiempo y memoria](#tiempo-y-memoria)
    - [System.currentTimeMillis()](#systemcurrenttimemillis)
    - [System.nanoTime()](#systemnanotime)
    - [System.gc()](#systemgc)
- [Buenas Prácticas con la Clase System](#buenas-prácticas-con-la-clase-system)
- [Ejemplo práctico: medición del tiempo de ejecución](#ejemplo-práctico-medición-del-tiempo-de-ejecución)

## System

La clase `System` en Java es una clase utilitaria que proporciona acceso a recursos y funcionalidades del sistema, como la entrada y salida estándar, la gestión de propiedades del sistema y la finalización del programa.

## ¿Qué es la clase system?

La clase `System` es parte del paquete `java.lang`, por lo que no es necesario importarla manualmente. Contiene métodos estáticos que permiten interactuar con el sistema operativo y el entorno de ejecución de Java.

### Características de la Clase System

- **Métodos estáticos:** Todos los métodos de `System` son estáticos, lo que significa que se pueden llamar directamente usando el nombre de la clase.

- **Recursos del sistema:** Proporciona acceso a la entrada y salida estándar, propiedades del sistema y más.

- **Finalización del programa:** Permite finalizar la ejecución del programa y gestionar la limpieza de recursos.

## Métodos Comunes

A continuación, se presentan algunos de los métodos más utilizados de la clase `System`.

### Entrada y salida estándar

#### System.out

Es una instancia de `PrintStream` que representa la salida estándar (normalmente la consola).

```java
System.out.println("Hola, Mundo!");
```

#### System.in

Es una instancia de `InputStream` que representa la entrada estándar (normalmente el teclado).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + "!");
    }
}
```

#### System.err

Es una instancia de PrintStream que representa la salida de error estándar (normalmente la consola).

```java
System.err.println("¡Esto es un mensaje de error!");
```

---

### Propiedades del Sistema

#### System.getProperty(String key)

Devuelve el valor de una propiedad del sistema especificada por la clave.

```java
String versionJava = System.getProperty("java.version");
String directorioActual = System.getProperty("user.dir");
System.out.println("Versión de Java: " + versionJava);
System.out.println("Directorio actual: " + directorioActual);
```

#### System.setProperty(String key, String value)

Establece el valor de una propiedad del sistema

```java
System.setProperty("mi.propiedad", "valor");
System.out.println("Mi propiedad: " + System.getProperty("mi.propiedad"));
```

---

### Finalización del programa

#### System.exit(int status)

Finaliza la ejecución del programa con un código de estado. Un código `0` indica una finalización exitosa, mientras que cualquier otro valor indica un error

```java
System.out.println("Finalizando el programa...");
System.exit(0);
```

---

### Tiempo y memoria

#### System.currentTimeMillis()

Devuelve el tiempo actual en milisegundos desde el 1 de enero de 1970 (epoch).

```java
long tiempoActual = System.currentTimeMillis();
System.out.println("Tiempo actual en milisegundos: " + tiempoActual);
```

#### System.nanoTime()

Devuelve el tiempo actual en nanosegundos. Es útil para medir intervalos de tiempo con alta precisión.

```java
long inicio = System.nanoTime();
// Código a medir
long fin = System.nanoTime();
long duracion = fin - inicio;
System.out.println("Duración en nanosegundos: " + duracion);
```

#### System.gc()

Sugiere al recolector de basura (garbage collector) que realice una recolección de objetos no utilizados.

```java
System.gc();
System.out.println("Recolección de basura sugerida.");
```

## Buenas Prácticas con la Clase System

- **Usa System.out para depuración:** Es útil para imprimir mensajes de depuración, pero evita su uso excesivo en producción.

- **Maneja adecuadamente System.exit:** Úsalo solo cuando sea necesario finalizar el programa de manera controlada.

- **Optimiza el uso de propiedades del sistema:** Accede a las propiedades del sistema solo cuando sea necesario para evitar sobrecargar el programa.

- **Considera la precisión de nanoTime:** Para medir intervalos de tiempo cortos, `nanoTime` es más preciso que `currentTimeMillis`.

## Ejemplo práctico: medición del tiempo de ejecución

```java
public class MedicionTiempo {
    public static void main(String[] args) {
        long inicio = System.nanoTime();

        // Código a medir
        for (int i = 0; i < 1000000; i++) {
            Math.sqrt(i);
        }

        long fin = System.nanoTime();
        long duracion = fin - inicio;
        System.out.println("Duración en nanosegundos: " + duracion);
    }
}
```
