<h1 align="center">HashMap </h1>

<h2>📑 Contenido</h2>

- [HashMap](#hashmap)
- [¿Qué es HashMap?](#qué-es-hashmap)
  - [Características de HashMap](#características-de-hashmap)
- [Probando métodos](#probando-métodos)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplo práctico: contador de palabras](#ejemplo-práctico-contador-de-palabras)

## HashMap

La clase `HashMap` en Java es una de las implementaciones más utilizadas de la interfaz `Map`. Almacena pares clave-valor en una tabla hash, lo que proporciona un acceso rápido a los valores mediante las claves.

## ¿Qué es HashMap?

`HashMap` es una clase en el paquete `java.util` que implementa la interfaz `Map`. Utiliza una tabla hash para almacenar pares clave-valor, lo que permite un acceso rápido a los valores mediante las claves. Sin embargo, no garantiza un orden específico de los pares clave-valor.

### Características de HashMap

**Claves únicas:** No permite claves duplicadas.

**Acceso rápido:** Proporciona un acceso rápido a los valores mediante las claves.

**Sin orden garantizado:** Los pares clave-valor no están ordenados.

**Permite un valor null y una clave null:** Puede contener un solo valor `null` y una sola clave `null`.

## Probando métodos

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
   public static void main(String[] args) {
       // Crear un HashMap de Strings (clave) a Integers (valor)
       Map<String, Integer> mapa = new HashMap<>();

       // Agregar elementos al mapa
       mapa.put("Juan", 25);
       mapa.put("María", 30);
       mapa.put("Pedro", 28);

       // Acceder a un valor por su clave
       int edadDeMaria = mapa.get("María");
       System.out.println("La edad de María es: " + edadDeMaria);

       // Verificar si una clave está presente
       boolean contienePedro = mapa.containsKey("Pedro");
       System.out.println("¿El mapa contiene a Pedro? " + contienePedro);

       // Eliminar un elemento del mapa
       mapa.remove("Juan");

       // Imprimir todos los pares clave-valor del mapa
       System.out.println("Elementos del mapa:");
       for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
           System.out.println(entry.getKey() + ": " + entry.getValue());
       }

       // Obtener el tamaño del mapa
       int tamaño = mapa.size();
       System.out.println("Tamaño del mapa: " + tamaño);

       // Verificar si el mapa está vacío
       boolean vacio = mapa.isEmpty();
       System.out.println("¿El mapa está vacío? " + vacio);
   }
}
```

## Buenas prácticas

- **Usa genéricos:** Especifica el tipo de claves y valores que almacenará el `HashMap` para evitar errores en tiempo de compilación.

- **Considera el rendimiento:** `HashMap` es ideal para operaciones de acceso rápido, pero no garantiza un orden específico.

- **Evita claves duplicadas:** Aprovecha la característica de unicidad de las claves para evitar duplicados.

- **Maneja adecuadamente los valores null:** `HashMap` permite un solo valor `null` y una sola clave `null`, pero asegúrate de que esto sea consistente con el diseño de tu aplicación.

## Ejemplo práctico: contador de palabras

```java
import java.util.HashMap;
import java.util.Map;

public class ContadorPalabras {
    public static void main(String[] args) {
        String texto = "Hola mundo Hola Java mundo Java";
        String[] palabras = texto.split(" ");

        Map<String, Integer> contador = new HashMap<>();

        for (String palabra : palabras) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }

        System.out.println("Frecuencia de palabras: " + contador);
    }
}
```
