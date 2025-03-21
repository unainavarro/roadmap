<h1 align="center">Set</h1>

<h2>📑 Contenido</h2>

- [Set](#set)
  - [Características de set](#características-de-set)
- [Métodos comunes](#métodos-comunes)
  - [Añadir elementos](#añadir-elementos)
    - [add(E e)](#adde-e)
  - [Eliminar elementos](#eliminar-elementos)
    - [remove(Object o)](#removeobject-o)
  - [Verificar la existencia de un elemento](#verificar-la-existencia-de-un-elemento)
    - [contains(Object o)](#containsobject-o)
  - [Tamaño del conjunto](#tamaño-del-conjunto)
    - [size()](#size)
  - [Iterar sobre el conjunto](#iterar-sobre-el-conjunto)
- [Probando métodos](#probando-métodos)
- [Buenas prácticas](#buenas-prácticas)
- [Ejemplo práctico: eliminación de duplicados](#ejemplo-práctico-eliminación-de-duplicados)

## Set

La interfaz `Set` en Java es una colección que no permite elementos duplicados. Es parte del marco de colecciones de Java y se utiliza para representar conjuntos matemáticos.

- **HashSet:** Almacena elementos en una tabla hash, lo que proporciona un acceso rápido pero no garantiza un orden específico.

- **TreeSet:** Almacena elementos en un árbol rojo-negro, lo que garantiza un orden natural o un orden definido por un comparador.

- **LinkedHashSet:** Almacena elementos en una tabla hash con una lista enlazada que mantiene el orden de inserción.

### Características de set

- **Elementos únicos:** No permite duplicados.

- **Sin orden garantizado:** Dependiendo de la implementación, los elementos pueden no estar ordenados.

- **Operaciones básicas:** `add`, `remove`, `contains`, `size`, etc.

## Métodos comunes

A continuación, se presentan algunos de los métodos más utilizados de la interfaz `Set`.

### Añadir elementos

#### add(E e)

Añade un elemento al conjunto si no está presente.

```java
conjunto.add("JavaScript");
System.out.println("Conjunto después de añadir: " + conjunto);
```

---

### Eliminar elementos

#### remove(Object o)

Elimina el elemento especificado del conjunto.

```java
conjunto.remove("C++");
System.out.println("Conjunto después de eliminar: " + conjunto);
```

---

### Verificar la existencia de un elemento

#### contains(Object o)

Devuelve `true` si el conjunto contiene el elemento especificado.

```java
boolean contieneJava = conjunto.contains("Java");
System.out.println("¿Contiene 'Java'? " + contieneJava);
```

---

### Tamaño del conjunto

#### size()

Devuelve el número de elementos en el conjunto.

```java
int tamaño = conjunto.size();
System.out.println("Tamaño del conjunto: " + tamaño);
```

---

### Iterar sobre el conjunto

Puedes iterar sobre un Set usando un bucle `for-each` o un iterador.

```java
// for-each
for (String elemento : conjunto) {
    System.out.println(elemento);
}

// iterador
import java.util.Iterator;

Iterator<String> iterador = conjunto.iterator();
while (iterador.hasNext()) {
    System.out.println(iterador.next());
}
```

---

## Probando métodos

```java

```

## Buenas prácticas

- **Elige la implementación adecuada:** Usa `HashSet` para acceso rápido, `TreeSet` para ordenamiento y `LinkedHashSet` para mantener el orden de inserción.

- **Usa genéricos:** Especifica el tipo de elementos que almacenará el `Set` para evitar errores en tiempo de compilación.

- **Considera el rendimiento:** `HashSet` es más rápido para operaciones de acceso, mientras que `TreeSet` es más lento pero mantiene el orden.

- **Evita duplicados:** Aprovecha la característica de unicidad de `Set` para eliminar duplicados automáticamente.

## Ejemplo práctico: eliminación de duplicados

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EliminarDuplicados {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("Java");
        lista.add("C++");
        lista.add("Python");

        // Convertir la lista a un conjunto para eliminar duplicados
        Set<String> conjunto = new HashSet<>(lista);

        // Convertir el conjunto de nuevo a una lista
        List<String> listaSinDuplicados = new ArrayList<>(conjunto);

        System.out.println("Lista original: " + lista);
        System.out.println("Lista sin duplicados: " + listaSinDuplicados);
    }
}
```
