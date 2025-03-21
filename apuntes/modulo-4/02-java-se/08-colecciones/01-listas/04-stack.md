<h1 align="center">Stack</h1>

<h2>📑 Contenido</h2>

- [Stack](#stack)
- [¿Qué es stack?](#qué-es-stack)
  - [Características de stack](#características-de-stack)
- [Creación de un stack](#creación-de-un-stack)
- [Métodos Comunes de stack](#métodos-comunes-de-stack)
  - [Añadir elementos](#añadir-elementos)
    - [push(E item)](#pushe-item)
  - [Eliminar elementos](#eliminar-elementos)
    - [pop()](#pop)
  - [Acceder al elemento superior](#acceder-al-elemento-superior)
    - [peek()](#peek)
  - [Verificar si la pila esta vacía](#verificar-si-la-pila-esta-vacía)
    - [empty()](#empty)
  - [Buscar un elemento](#buscar-un-elemento)
    - [search(Object o)](#searchobject-o)
- [Probando métodos](#probando-métodos)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplo práctico: evaluación de expresiones postfijas](#ejemplo-práctico-evaluación-de-expresiones-postfijas)

## Stack

La clase `Stack` en Java es una implementación de la estructura de datos pila, que sigue el principio LIFO (Last In, First Out), es decir, el último elemento en entrar es el primero en salir. `Stack` es una subclase de `Vector`, por lo que hereda todas sus características, incluyendo la sincronización.

## ¿Qué es stack?

`Stack` es una clase en el paquete `java.util` que representa una pila de objetos. Proporciona operaciones para añadir, eliminar y acceder a elementos en el orden LIFO.

### Características de stack

- **LIFO:** El último elemento añadido es el primero en ser eliminado.

- **Hereda de Vector:** Al ser una subclase de `Vector`, `Stack` es sincronizado y seguro para su uso en entornos multihilo.

- **Operaciones básicas:** `push`, `pop`, `peek`, `empty`, y `search`.

## Creación de un stack

Para crear un `Stack`, debes especificar el tipo de elementos que almacenará. Esto se hace utilizando genéricos (`<T>`).

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Crear un Stack de cadenas
        Stack<String> pila = new Stack<>();

        // Añadir elementos
        pila.push("Java");
        pila.push("Python");
        pila.push("C++");

        // Imprimir la pila
        System.out.println("Pila: " + pila);
    }
}
```

## Métodos Comunes de stack

A continuación, se presentan algunos de los métodos más utilizados de `Stack`.

### Añadir elementos

#### push(E item)

Añade un elemento a la parte superior de la pila.

```java
pila.push("JavaScript");
System.out.println("Pila después de añadir: " + pila);
```

---

### Eliminar elementos

#### pop()

Elimina y devuelve el elemento en la parte superior de la pila.

```java
String elementoEliminado = pila.pop();
System.out.println("Elemento eliminado: " + elementoEliminado);
System.out.println("Pila después de eliminar: " + pila);
```

---

### Acceder al elemento superior

#### peek()

Devuelve el elemento en la parte superior de la pila sin eliminarlo.

```java
String elementoSuperior = pila.peek();
System.out.println("Elemento en la parte superior: " + elementoSuperior);
```

---

### Verificar si la pila esta vacía

#### empty()

Devuelve true si la pila está vacía.

```java
boolean estaVacia = pila.empty();
System.out.println("¿La pila está vacía? " + estaVacia);
```

---

### Buscar un elemento

#### search(Object o)

Devuelve la posición basada en 1 del elemento en la pila. Si el elemento no está en la pila, devuelve `-1`.

```java
int posicion = pila.search("Python");
System.out.println("Posición de 'Python': " + posicion);
```

---

## Probando métodos

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Crear un Stack de enteros
        Stack<Integer> pila = new Stack<>();

        // Agregar elementos a la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);

        // Ver el elemento en la parte superior de la pila
        int elementoSuperior = pila.peek();
        System.out.println("Elemento en la parte superior de la pila: " + elementoSuperior);

        // Eliminar elementos de la pila
        int elementoEliminado = pila.pop();
        System.out.println("Elemento eliminado de la pila: " + elementoEliminado);

        // Verificar si la pila está vacía
        boolean vacia = pila.empty();
        System.out.println("¿La pila está vacía? " + vacia);
    }
}
```

## Buenas prácticas

- **Usa genéricos:** Especifica el tipo de elementos que almacenará el `Stack` para evitar errores en tiempo de compilación.

- **Considera la sincronización:** Si no necesitas sincronización, considera usar `ArrayDeque` para mejorar el rendimiento.

- **Evita el uso excesivo de search:** El método `search` es lineal `(O(n))`, por lo que puede ser ineficiente para pilas grandes.

- **Maneja adecuadamente las excepciones:** Asegúrate de verificar si la pila está vacía antes de llamar a `pop` o `peek`.

## Ejemplo práctico: evaluación de expresiones postfijas

```java
import java.util.Stack;

public class EvaluacionPostfija {
    public static void main(String[] args) {
        String expresion = "3 4 + 5 *";
        System.out.println("Resultado: " + evaluarPostfija(expresion));
    }

    public static int evaluarPostfija(String expresion) {
        Stack<Integer> pila = new Stack<>();
        String[] tokens = expresion.split(" ");

        for (String token : tokens) {
            if (esNumero(token)) {
                pila.push(Integer.parseInt(token));
            } else {
                int operando2 = pila.pop();
                int operando1 = pila.pop();
                int resultado = aplicarOperacion(token, operando1, operando2);
                pila.push(resultado);
            }
        }

        return pila.pop();
    }

    private static boolean esNumero(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static int aplicarOperacion(String operador, int operando1, int operando2) {
        switch (operador) {
            case "+":
                return operando1 + operando2;
            case "-":
                return operando1 - operando2;
            case "*":
                return operando1 * operando2;
            case "/":
                return operando1 / operando2;
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }
}
```
