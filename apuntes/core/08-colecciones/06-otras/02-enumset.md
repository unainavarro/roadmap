<h1 align="center">EnumSet</h1>

<h2>📑 Contenido</h2>

- [EnumSet](#enumset)
- [¿Qué es EnumSet?](#qué-es-enumset)
  - [Características principales](#características-principales)
- [Métodos comunes](#métodos-comunes)
  - [Conjunto vacío](#conjunto-vacío)
  - [Conjunto con todos los elementos](#conjunto-con-todos-los-elementos)
  - [Conjunto con elementos específicos](#conjunto-con-elementos-específicos)
  - [Conjunto con un rango de elementos](#conjunto-con-un-rango-de-elementos)
- [Operaciones comunes](#operaciones-comunes)
  - [Añadir y eliminar elementos](#añadir-y-eliminar-elementos)
  - [Verificar la presencia de un elemento](#verificar-la-presencia-de-un-elemento)
  - [Iterar sobre los elementos](#iterar-sobre-los-elementos)
  - [Operaciones de conjunto](#operaciones-de-conjunto)
- [Probando métodos](#probando-métodos)
- [Buenas practicas](#buenas-practicas)

## EnumSet

En Java, los tipos enumerados (`enum`) son una forma poderosa de definir un conjunto fijo de constantes. Cuando trabajamos con conjuntos de valores de un `enum`, la clase `EnumSet` proporciona una implementación altamente eficiente y especializada de la interfaz `Set`.

## ¿Qué es EnumSet?

`EnumSet` es una clase en el paquete `java.util` que representa un conjunto de elementos de un tipo enumerado (`enum`). Está diseñada específicamente para trabajar con `enum` y ofrece un rendimiento superior en comparación con otras implementaciones de `Set`, como `HashSet` o `TreeSet`, cuando los elementos son de un tipo `enum`.

### Características principales

- **Eficiencia:** `EnumSet` está implementada internamente como un vector de bits, lo que la hace extremadamente eficiente en términos de memoria y velocidad.

- **Seguridad de tipos:** Al estar especializada para `enum`, `EnumSet` garantiza que solo se puedan añadir elementos del tipo `enum` especificado.

- **No permite elementos nulos:** `EnumSet` no permite la inserción de elementos nulos, lo que ayuda a evitar errores comunes.

## Métodos comunes

### Conjunto vacío

```java
EnumSet<MyEnum> emptySet = EnumSet.noneOf(MyEnum.class);
```

---

### Conjunto con todos los elementos

```java
EnumSet<MyEnum> fullSet = EnumSet.allOf(MyEnum.class);
```

---

### Conjunto con elementos específicos

```java
EnumSet<MyEnum> specificSet = EnumSet.of(MyEnum.VALUE1, MyEnum.VALUE2);
```

---

### Conjunto con un rango de elementos

```java
EnumSet<MyEnum> rangeSet = EnumSet.range(MyEnum.VALUE1, MyEnum.VALUE3);
```

---

## Operaciones comunes

### Añadir y eliminar elementos

```java
enumSet.add(MyEnum.VALUE1);
enumSet.remove(MyEnum.VALUE1);
```

---

### Verificar la presencia de un elemento

```java
boolean contains = enumSet.contains(MyEnum.VALUE1);
```

---

### Iterar sobre los elementos

```java
for (MyEnum value : enumSet) {
    System.out.println(value);
}
```

---

### Operaciones de conjunto

`EnumSet` soporta operaciones de conjunto como unión, intersección y diferencia:

```java
EnumSet<MyEnum> set1 = EnumSet.of(MyEnum.VALUE1, MyEnum.VALUE2);
EnumSet<MyEnum> set2 = EnumSet.of(MyEnum.VALUE2, MyEnum.VALUE3);

set1.addAll(set2); // Unión
set1.retainAll(set2); // Intersección
set1.removeAll(set2); // Diferencia
```

---

## Probando métodos

```java
import java.util.EnumSet;

public class Main {
    // Enumeración de días de la semana
    public enum DiaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    public static void main(String[] args) {
        // Crear un EnumSet con todos los días de la semana
        EnumSet<DiaSemana> diasLaborales = EnumSet.of(DiaSemana.LUNES, DiaSemana.MARTES,
                                                      DiaSemana.MIERCOLES, DiaSemana.JUEVES, DiaSemana.VIERNES);

        // Agregar el sábado y el domingo como días no laborales
        EnumSet<DiaSemana> finDeSemana = EnumSet.of(DiaSemana.SABADO, DiaSemana.DOMINGO);

        // Imprimir los días laborales
        System.out.println("Días laborales: " + diasLaborales);

        // Imprimir si el sábado es un día laboral
        System.out.println("¿El sábado es un día laboral? " + diasLaborales.contains(DiaSemana.SABADO));

        // Agregar el sábado y el domingo como días no laborales
        diasLaborales.addAll(finDeSemana);

        // Imprimir los días laborales actualizados
        System.out.println("Días laborales después de agregar el fin de semana: " + diasLaborales);
    }
}
```

## Buenas practicas

- **Usa EnumSet para conjuntos de enum:** Siempre que trabajes con conjuntos de elementos `enum`, `EnumSet` es la mejor opción debido a su eficiencia y seguridad de tipos.

- **Aprovecha los métodos de creación:** Utiliza los métodos estáticos como `noneOf`, `allOf`, `of`, y `range` para crear `EnumSet` de manera concisa y legible.

- **Evita otras implementaciones de Set:** Para conjuntos de `enum`, evita usar `HashSet` o `TreeSet`, ya que `EnumSet` es más eficiente y segura.
