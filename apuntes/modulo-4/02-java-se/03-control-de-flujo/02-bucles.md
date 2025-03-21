<h1 align="center">Bucles</h1>

<h2>📑 Contenido</h2>

- [for](#for)
- [for-each](#for-each)
- [while](#while)
- [do while](#do-while)

## for

El bucle `for` se utiliza para iterar sobre una secuencia de elementos, como una matriz o una colección, o simplemente para ejecutar un bloque de código un número específico de veces.

**Sintaxis**

- La **inicialización** se ejecuta una vez antes de que comience el bucle y se utiliza para inicializar la variable de control del bucle.
- La **condición** se evalúa antes de cada iteración del bucle. Si la condición es verdadera, el cuerpo del bucle se ejecuta; de lo contrario, el bucle se detiene.
- La **actualización** se ejecuta después de cada iteración del bucle y se utiliza para actualizar la variable de control del bucle.

```java
for (inicialización; condición; actualización) {
    // Cuerpo del bucle
}
```

**Ejemplo**

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("El valor de i es: " + i);
        }
    }
}
```

> [!NOTE]
>
> El bucle for es una herramienta poderosa para iterar sobre una secuencia de elementos o para ejecutar un bloque de código un número específico de veces. Se utiliza comúnmente en situaciones donde sabes cuántas veces quieres que se ejecute un bloque de código.

## for-each

El bucle `for-each` (también conocido como bucle `enhanced for` o bucle `for-in`) en Java se utiliza para recorrer elementos de una colección o matriz sin necesidad de utilizar un contador explícito ni acceder a los elementos utilizando índices. Proporciona una forma más concisa y legible de iterar sobre elementos en comparación con el bucle for tradicional.

**Sintaxis**

- **tipo** es el tipo de datos de los elementos en la colección.
- **elemento** es la variable que representa cada elemento en la colección.
- **colección** es la colección sobre la que se va a iterar.

```java
for (tipo elemento : colección) {
    // Cuerpo del bucle
}
```

**Ejemplo**

```java
public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
```

> [!NOTE]
>
> El bucle `for-each` es especialmente útil cuando se trabaja con colecciones como matrices, listas o conjuntos, ya que simplifica el proceso de iteración y hace que el código sea más legible al eliminar la necesidad de manejar un contador y acceder a los elementos mediante índices.

## while

El bucle `while` se utiliza para repetir un bloque de código mientras se cumpla una condición booleana.

**Ejemplo**

```java
public class Main {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 5) {
            System.out.println("El contador es: " + contador);
            contador++;
        }

        System.out.println("Fin del bucle while.");
    }
}
```

## do while

El bucle `do-while` es una estructura de control que se utiliza para ejecutar un bloque de código **al menos una vez**, y luego repetirlo mientras una condición específica sea verdadera.

**Ejemplo**

```java
public class Main {
    public static void main(String[] args) {
        int contador = 0;

        do {
            System.out.println("El contador es: " + contador);
            contador++;
        } while (contador < 5);
    }
}
```
