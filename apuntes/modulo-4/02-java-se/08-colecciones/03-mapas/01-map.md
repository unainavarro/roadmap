<h1 align="center">Map</h1>

<h2>📑 Contenido</h2>

- [Map](#map)
- [¿Qué es Map?](#qué-es-map)
  - [Características de Map](#características-de-map)
- [Métodos comunes](#métodos-comunes)
  - [Añadir pares clave-valor](#añadir-pares-clave-valor)
    - [put(K key, V value)](#putk-key-v-value)
  - [Obtener valores](#obtener-valores)
    - [get(Object key)](#getobject-key)
  - [Eliminar pares clave-valor](#eliminar-pares-clave-valor)
    - [remove(Object key)](#removeobject-key)
  - [Verificar la existencia](#verificar-la-existencia)
    - [containsKey(Object key)](#containskeyobject-key)
  - [Tamaño del mapa](#tamaño-del-mapa)
    - [size()](#size)
  - [Iterar sobre el mapa](#iterar-sobre-el-mapa)
- [Probando métodos](#probando-métodos)
- [Buenas practicas](#buenas-practicas)
- [Ejemplo práctico: contador de palabras](#ejemplo-práctico-contador-de-palabras)

## Map

La interfaz `Map` en Java es una colección que almacena pares clave-valor, donde cada clave es única y está asociada a un valor. Es parte del marco de colecciones de Java y se utiliza para representar relaciones de mapeo entre claves y valores.

## ¿Qué es Map?

`Map` es una interfaz en el paquete `java.util` que representa una colección de pares clave-valor. Las claves son únicas, lo que significa que no puede haber duplicados, y cada clave está asociada a un valor. Las implementaciones más comunes de `Map` son:

- **HashMap:** Almacena pares clave-valor en una tabla hash, lo que proporciona un acceso rápido pero no garantiza un orden específico.

- **TreeMap:** Almacena pares clave-valor en un árbol rojo-negro, lo que garantiza un orden natural o un orden definido por un comparador.

- **LinkedHashMap:** Almacena pares clave-valor en una tabla hash con una lista enlazada que mantiene el orden de inserción.

### Características de Map

**Claves únicas:** No permite claves duplicadas.

**Acceso rápido:** Proporciona un acceso rápido a los valores mediante las claves.

**Sin orden garantizado:** Dependiendo de la implementación, los pares clave-valor pueden no estar ordenados.

**Operaciones básicas:** `put`, `get`, `remove`, `containsKey`, `size`, etc.

## Métodos comunes

A continuación, se presentan algunos de los métodos más utilizados de la interfaz `Map`.

### Añadir pares clave-valor

#### put(K key, V value)

Añade un par clave-valor al mapa. Si la clave ya existe, sobrescribe el valor.

```java
mapa.put("JavaScript", 4);
System.out.println("Mapa después de añadir: " + mapa);
```

---

### Obtener valores

#### get(Object key)

Devuelve el valor asociado a la clave especificada.

```java
Integer valor = mapa.get("Java");
System.out.println("Valor asociado a 'Java': " + valor);
```

---

### Eliminar pares clave-valor

#### remove(Object key)

Elimina el par clave-valor asociado a la clave especificada.

```java
mapa.remove("C++");
System.out.println("Mapa después de eliminar: " + mapa);
```

---

### Verificar la existencia

#### containsKey(Object key)

Devuelve `true` si el mapa contiene la clave especificada.

```java
boolean contieneJava = mapa.containsKey("Java");
System.out.println("¿Contiene 'Java'? " + contieneJava);
```

---

### Tamaño del mapa

#### size()

Devuelve el número de pares clave-valor en el mapa.

```java
int tamaño = mapa.size();
System.out.println("Tamaño del mapa: " + tamaño);
```

---

### Iterar sobre el mapa

Puedes iterar sobre un `Map` usando un bucle `for-each` con `entrySet()`, `keySet()`, o `values()`.

```java
// entrySet()
for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
    System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
}

// keySet()
for (String clave : mapa.keySet()) {
    System.out.println("Clave: " + clave + ", Valor: " + mapa.get(clave));
}

// values()
for (Integer valor : mapa.values()) {
    System.out.println("Valor: " + valor);
}
```

---

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

## Buenas practicas

- **Elige la implementación adecuada:** Usa `HashMap` para acceso rápido, `TreeMap` para ordenamiento y `LinkedHashMap` para mantener el orden de inserción.

- **Usa genéricos:** Especifica el tipo de claves y valores que almacenará el `Map` para evitar errores en tiempo de compilación.

- **Considera el rendimiento:** `HashMap` es más rápido para operaciones de acceso, mientras que `TreeMap` es más lento pero mantiene el orden.

- **Evita claves duplicadas:** Aprovecha la característica de unicidad de las claves para evitar duplicados.

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
