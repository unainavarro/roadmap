<h1 align="center">Entrada Principal</h1>

<h2>📑 Contenido</h2>

- [Entrada Principal](#entrada-principal)
- [Ejecutar sin este método](#ejecutar-sin-este-método)
- [Publico y Estático](#publico-y-estático)
- [Método main](#método-main)
  - [Sintaxis](#sintaxis)
  - [Variaciones del Método main](#variaciones-del-método-main)
    - [Uso de varargs](#uso-de-varargs)
    - [Arreglo con otro nombre](#arreglo-con-otro-nombre)
- [Argumentos de Línea de Comandos](#argumentos-de-línea-de-comandos)
- [Consideraciones Importantes](#consideraciones-importantes)

## Entrada Principal

El método `public static void main(String[] args)` es el punto de entrada principal para las aplicaciones Java. Cuando se ejecuta un programa Java, la JVM busca este método y lo invoca automáticamente para comenzar la ejecución del programa. Los argumentos pasados al programa desde la línea de comandos se pueden acceder a través del parámetro args.

Breve explicación de cada parte de este método:

1. **public:** Es un modificador de acceso que indica que el método main es accesible desde cualquier parte de la aplicación. Esto significa que puede ser llamado desde otras clases o paquetes.

2. **static:** Es una palabra clave que indica que el método main pertenece a la clase en sí misma, no a instancias individuales de la clase. Esto significa que el método main puede ser invocado sin necesidad de crear un objeto de la clase que lo contiene.

3. **void:** Es el tipo de retorno del método main. Indica que el método no devuelve ningún valor.

4. **main:** Es el nombre del método. Java busca este método específico cuando se ejecuta un programa Java.

5. **String[] args:** Es el parámetro del método main. Representa un array de cadenas de texto (String) que pueden ser pasadas al programa cuando se ejecuta desde la línea de comandos. El nombre args es una convención, pero podría ser cualquier otro nombre válido.

## Ejecutar sin este método

En teoría, puedes compilar un programa Java sin un método main, pero no podrás ejecutarlo como una aplicación independiente. El método main es el punto de entrada principal para la ejecución de una aplicación Java, por lo que si no lo tienes, no habrá un punto de inicio claro para la ejecución del programa.

Sin el método main, aún puedes tener clases y métodos en tu programa, pero necesitarás otro mecanismo para ejecutarlos. Por ejemplo, podrías tener una clase con un método específico para realizar una acción particular, y luego llamar a ese método desde otro programa Java que tenga un método main. De esta manera, el programa que tiene el método main actuaría como un punto de entrada para ejecutar el código en tu programa.

Sin embargo, para fines prácticos y para ejecutar una aplicación Java de manera independiente, es necesario tener un método main. Es la convención estándar y el punto de entrada esperado por la JVM cuando se inicia una aplicación Java. Por lo tanto, aunque técnicamente podrías crear un programa Java sin un método main, no sería utilizable como una aplicación independiente y no podrías ejecutarlo directamente.

## Publico y Estático

De acuerdo con la especificación del lenguaje, el método main debe ser público y estático para que la JVM pueda encontrar y ejecutar el programa.

Razones clave por las que el método main tiene que ser publico:

- **Accesibilidad:** La JVM necesita poder acceder al método main para iniciar la ejecución del programa. Si el método main fuera privado, la JVM no tendría acceso a él y no podría ejecutar el programa.

- **Punto de entrada público:** El método main sirve como el punto de entrada público para la ejecución de la aplicación Java. Debe ser accesible desde fuera de la clase para que la JVM pueda encontrarlo y comenzar la ejecución del programa.

Razones clave por las que el método main tiene que ser estático:

- **Acceso sin instancia:** Cuando se ejecuta un programa Java, la JVM no crea una instancia de la clase principal que contiene el método main. En su lugar, la JVM invoca directamente el método main desde la clase misma. Para permitir que la JVM llame a un método sin necesidad de una instancia de la clase, el método debe ser estático.

- **Punto de entrada estático:** El método main es el punto de entrada principal para la ejecución de una aplicación Java. Debe estar disponible para su invocación sin necesidad de crear objetos de la clase que lo contiene. Al marcar el método main como estático, se garantiza que pueda ser llamado directamente desde la clase, sin necesidad de crear instancias de la misma.

- **Convención y especificación del lenguaje:** La especificación del lenguaje Java establece que el método main debe ser estático. Esto se debe a la forma en que la JVM está diseñada para buscar y ejecutar el método main como punto de entrada de un programa Java.

## Método main

```java
public class MiPrograma {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
    }
}
```

### Sintaxis

- **public:** Hace que el método sea accesible desde cualquier parte del programa.

- **static:** Permite llamar al método sin necesidad de instanciar un objeto.

- **void:** Indica que el método no devuelve ningún valor.

- **main:** Nombre estándar del método de entrada.

- **String[] args:** Permite recibir argumentos desde la línea de comandos.

### Variaciones del Método main

Si bien la forma estándar es public static void main(String[] args), también existen variaciones válidas:

#### Uso de varargs

```java
public static void main(String... args) {
    System.out.println("Ejecutando con varargs");
}
```

#### Arreglo con otro nombre

```java
public static void main(String parametros[]) {
    System.out.println("Ejecutando con otro nombre de parámetro");
}
```

## Argumentos de Línea de Comandos

Los programas en Java pueden recibir información a través de la línea de comandos. Estos datos se almacenan en el arreglo `args`.

```java
public class Argumentos {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Argumento recibido: " + args[0]);
        } else {
            System.out.println("No se proporcionaron argumentos.");
        }
    }
}
```

Desde la terminal:

> Para ejecutar este programa con un argumento: `java Argumentos Hola`
>
> Salida esperada: `Argumento recibido: Hola`

## Consideraciones Importantes

- Solo puede haber un método main válido en la clase principal.

- Si falta la palabra clave static, el programa no podrá ejecutarse correctamente.

- Si el método main tiene un modificador de acceso distinto a public, la JVM no podrá encontrarlo.
