<h1 align="center">Tipos de retorno</h1>

<h2>📑 Contenido</h2>

- [Tipos de retorno](#tipos-de-retorno)
  - [Tipo primitivo](#tipo-primitivo)
  - [Tipo de objeto y referenciados](#tipo-de-objeto-y-referenciados)
  - [Tipo void](#tipo-void)
  - [Tipo array](#tipo-array)
  - [Tipo interface](#tipo-interface)
  - [Tipo colecciones](#tipo-colecciones)

## Tipos de retorno

Los métodos pueden tener diferentes tipos de retorno, lo que determina el tipo de valor que devuelven cuando se ejecutan.

### Tipo primitivo

Un método puede devolver un valor de un tipo primitivo, como `int`, `double`, `boolean`, `char`, etc.

```java
public int sumar(int a, int b) {
    return a + b;
}
```

### Tipo de objeto y referenciados

Un método también puede devolver un objeto de cualquier clase. Esto puede ser un objeto de una clase predefinida en Java, como `String`, o un objeto de una clase definida por el usuario.

```java
public class Persona {
    String nombre;

    public Persona obtenerPersona() {
        Persona p = new Persona();
        p.nombre = "Juan";
        return p;
    }

    public String obtenerSaludo() {
    return "¡Hola, mundo!";
    }
}
```

### Tipo void

Si un método no devuelve ningún valor, su tipo de retorno se especifica como `void`.

```java
public void saludar() {
    System.out.println("¡Hola, mundo!");
}
```

### Tipo array

Un método también puede devolver un `array` de cualquier tipo de datos.

```java
public int[] obtenerArray() {
    int[] array = {1, 2, 3, 4, 5};
    return array;
}
```

### Tipo interface

Un método puede devolver un objeto que implementa una interfaz.

```java
public Comparable getMax(Comparable a, Comparable b) {
    return (a.compareTo(b) > 0) ? a : b;
}
```

### Tipo colecciones

También se pueden devolver estructuras de datos como listas o conjuntos.

```java
import java.util.List;
import java.util.ArrayList;

public class ListaNombres {
    public List<String> obtenerNombres() {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        return nombres;
    }
}
```
