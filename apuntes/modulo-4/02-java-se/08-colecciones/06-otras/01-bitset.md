<h1 align="center">BitSet </h1>

<h2>📑 Contenido</h2>

- [BitSet](#bitset)
- [¿Qué es BitSet?](#qué-es-bitset)
- [Operaciones comunes con BitSet](#operaciones-comunes-con-bitset)
  - [Establecer y limpiar bits](#establecer-y-limpiar-bits)
  - [Obtener el valor de un bit](#obtener-el-valor-de-un-bit)
  - [Operaciones a nivel de bits](#operaciones-a-nivel-de-bits)
  - [Cardinalidad](#cardinalidad)
  - [Longitud lógica](#longitud-lógica)
  - [Intersección](#intersección)
- [Probando métodos](#probando-métodos)
- [Consideraciones importantes](#consideraciones-importantes)
  - [Tamaño dinámico](#tamaño-dinámico)
  - [Eficiencia en memoria](#eficiencia-en-memoria)
  - [Alternativas](#alternativas)
- [Ejemplo: manejar un conjunto de banderas](#ejemplo-manejar-un-conjunto-de-banderas)
- [Buenas prácticas](#buenas-prácticas)

## BitSet

En el mundo de la programación, a menudo necesitamos manejar conjuntos de bits para realizar operaciones eficientes a nivel de bits. Java proporciona una clase especializada llamada `BitSet` que permite manipular secuencias de bits de manera eficiente.

## ¿Qué es BitSet?

`BitSet` es una clase en el paquete `java.util` que representa un vector de bits que puede crecer dinámicamente. Cada componente del `BitSet` tiene un valor booleano (`true` o `false`), que puede interpretarse como un bit encendido (`1`) o apagado (`0`). `BitSet` es especialmente útil para realizar operaciones a nivel de bits, como AND, OR, XOR, y para manejar grandes conjuntos de banderas o indicadores de manera eficiente.

```java
BitSet bitSet = new BitSet(64); // Crea un BitSet con 64 bits
```

## Operaciones comunes con BitSet

### Establecer y limpiar bits

Puedes establecer (encender) o limpiar (apagar) bits específicos en un `BitSet`:

```java
bitSet.set(3); // Establece el bit en la posición 3 a true (1)
bitSet.clear(3); // Limpia el bit en la posición 3 (lo establece a false o 0)
```

---

### Obtener el valor de un bit

Puedes verificar el valor de un bit específico:

```java
boolean value = bitSet.get(3); // Obtiene el valor del bit en la posición 3
```

---

### Operaciones a nivel de bits

BitSet proporciona métodos para realizar operaciones a nivel de bits entre dos BitSet:

```java
BitSet bitSet1 = new BitSet();
bitSet1.set(1);
bitSet1.set(2);

BitSet bitSet2 = new BitSet();
bitSet2.set(2);
bitSet2.set(3);

bitSet1.and(bitSet2); // AND lógico
bitSet1.or(bitSet2);  // OR lógico
bitSet1.xor(bitSet2); // XOR lógico
bitSet1.andNot(bitSet2); // AND NOT lógico
```

---

### Cardinalidad

Obtiene el número de bits encendidos (`true`) en el `BitSet`.

```java
int cardinality = bitSet.cardinality();
```

---

### Longitud lógica

Obtiene el índice del bit más alto encendido más uno.

```java
int length = bitSet.length();
```

---

### Intersección

Verifica si dos `BitSet` tienen algún bit encendido en común.

```java
boolean intersects = bitSet1.intersects(bitSet2);
```

---

## Probando métodos

```java
import java.util.BitSet;

public class Main {
    public static void main(String[] args) {
        // Crear un BitSet
        BitSet bits = new BitSet(16);

        // Establecer algunos bits
        bits.set(0);
        bits.set(2);
        bits.set(4);
        bits.set(6);
        bits.set(8);

        // Imprimir los bits establecidos
        System.out.println("Bits establecidos: " + bits);

        // Comprobar si un bit está establecido
        boolean bit4 = bits.get(4);
        System.out.println("El bit en la posición 4 está establecido: " + bit4);

        // Borrar un bit
        bits.clear(2);

        // Imprimir el BitSet actualizado
        System.out.println("Bits después de borrar el bit en la posición 2: " + bits);

        // Contar el número de bits establecidos
        int cantidadBitsEstablecidos = bits.cardinality();
        System.out.println("Número de bits establecidos: " + cantidadBitsEstablecidos);
    }
}

```

## Consideraciones importantes

### Tamaño dinámico

`BitSet` puede crecer dinámicamente según sea necesario. Si estableces un bit en una posición alta, el `BitSet` se expandirá automáticamente para acomodar ese bit.

### Eficiencia en memoria

`BitSet` es eficiente en memoria para manejar grandes conjuntos de bits, ya que utiliza un array de `long` internamente para almacenar los bits.

### Alternativas

En algunos casos, podrías considerar usar un array de booleanos o un `EnumSet` si tus necesidades son más específicas. Sin embargo, `BitSet` es ideal para operaciones a nivel de bits y para manejar grandes conjuntos de indicadores.

---

## Ejemplo: manejar un conjunto de banderas

```java
import java.util.BitSet;

public class BitSetExample {
    public static void main(String[] args) {
        // Crear un BitSet para representar banderas
        BitSet flags = new BitSet(8);

        // Establecer algunas banderas
        flags.set(0); // Bandera 1
        flags.set(2); // Bandera 3
        flags.set(4); // Bandera 5

        // Verificar si una bandera está establecida
        System.out.println("Bandera 3 está encendida: " + flags.get(2));

        // Limpiar una bandera
        flags.clear(2);
        System.out.println("Bandera 3 está encendida después de limpiar: " + flags.get(2));

        // Mostrar todas las banderas encendidas
        System.out.println("Banderas encendidas: " + flags);

        // Realizar operaciones a nivel de bits
        BitSet otherFlags = new BitSet(8);
        otherFlags.set(1);
        otherFlags.set(3);

        flags.or(otherFlags); // Combinar banderas
        System.out.println("Banderas después de OR: " + flags);
    }
}
```

## Buenas prácticas

- **Usa BitSet para operaciones a nivel de bits:** Es la herramienta ideal para realizar operaciones como AND, OR, XOR, etc.

- **Considera el tamaño inicial:** Si sabes el tamaño aproximado de tu `BitSet`, especifícalo en el constructor para optimizar el rendimiento.

- **Evita el uso excesivo:** Para conjuntos pequeños o cuando no necesitas operaciones a nivel de bits, un array de booleanos puede ser más simple y eficiente.
