<h1 align="center">Continue, Break y Return</h1>

<h2>📑 Contenido</h2>

- [Continue](#continue)
- [Break](#break)
- [Return](#return)
  - [Sin devolver un valor (void)](#sin-devolver-un-valor-void)
  - [Devolviendo un valor](#devolviendo-un-valor)
  - [Con estructuras de control](#con-estructuras-de-control)
  - [Reglas Importantes sobre return](#reglas-importantes-sobre-return)

## Continue

La palabra clave `continue` se utiliza dentro de un bucle para omitir la ejecución del resto del código dentro del bucle en la iteración actual y pasar a la siguiente iteración. Esto significa que si se encuentra la instrucción `continue`, el programa salta directamente al inicio del bucle y evalúa la siguiente iteración sin ejecutar el código restante dentro del bloque de bucle para la iteración actual.

**Ejemplo**

```java
public class Main {
    public static void main(String[] args) {
        // Imprimir números pares entre 0 y 9
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue; // Salta a la siguiente iteración si i no es par
            }
            System.out.println(i);
        }
    }
}
```

## Break

La palabra clave `break` se utiliza para salir inmediatamente de un bucle (como `for`, `while`, o `do-while`) o de un bloque `switch`. Cuando se encuentra la instrucción `break`, el programa sale del bucle o del bloque `switch` y continúa con la ejecución del código después del bucle o del bloque `switch`.

**Ejemplo**

```java
public class Main {
    public static void main(String[] args) {
        // Encuentra el primer número mayor que 5 en un array
        int[] numeros = {1, 3, 7, 4, 9};

        for (int numero : numeros) {
            if (numero > 5) {
                System.out.println("El primer número mayor que 5 es: " + numero);
                break; // Sale del bucle una vez que se encuentra el primer número mayor que 5
            }
        }
    }
}
```

> [!NOTE]
>
> `Break` también se puede utilizar en un bloque `switch` para salir del bloque `switch` antes de que se complete. La forma de usar `break` en un bloque `switch` es similar a su uso en un bucle.

## Return

En Java, la palabra clave `return` se utiliza para finalizar la ejecución de un método y, opcionalmente, devolver un valor al lugar donde se invocó ese método. Es fundamental para los métodos que necesitan devolver datos o simplemente indicar que se ha completado su ejecución.

> [!NOTE]
> Return !== Break
>
> Return se utiliza para salir de un método, mientras que break se utiliza para salir de bucles o bloques switch. Además, return puede tener una expresión asociada para devolver un valor, mientras que break no devuelve ningún valor.

### Sin devolver un valor (void)

Si un método está declarado como void, el uso de `return` es opcional y generalmente se emplea para finalizar el método antes de su conclusión natural.

```java
public void saludar(String nombre) {
    if (nombre == null) {
        System.out.println("Nombre no proporcionado.");
        return; // Termina el método aquí
    }
    System.out.println("Hola, " + nombre + "!");
}

```

### Devolviendo un valor

Los métodos no void deben usar `return` para devolver un valor que coincida con su tipo de retorno.

```java
public int sumar(int a, int b) {
    return a + b; // Devuelve la suma de a y b
}

```

### Con estructuras de control

El `return` puede estar dentro de estructuras condicionales para devolver valores diferentes dependiendo de las condiciones.

```java
public String evaluarNota(int nota) {
    if (nota >= 90) {
        return "Sobresaliente";
    } else if (nota >= 70) {
        return "Aprobado";
    } else {
        return "Reprobado";
    }
}
```

### Reglas Importantes sobre return

- El tipo de valor devuelto debe coincidir exactamente con el tipo especificado en la declaración del método.

- En métodos void, el uso de `return` no puede ir acompañado de un valor.

- Un método debe asegurarse de que devuelve un valor en todos los caminos posibles, especialmente si no es `void`.
