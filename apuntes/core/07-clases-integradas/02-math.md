<h1 align="center">Clase Math</h1>

<h2>📑 Contenido</h2>

- [Math](#math)
- [¿Qué es la clase math?](#qué-es-la-clase-math)
  - [Características](#características)
- [Constantes de la clase math](#constantes-de-la-clase-math)
- [Métodos comunes](#métodos-comunes)
  - [Métodos básicos](#métodos-básicos)
    - [abs(double a)](#absdouble-a)
    - [max(double a, double b) y min(double a, double b)](#maxdouble-a-double-b-y-mindouble-a-double-b)
  - [Métodos de redondeo](#métodos-de-redondeo)
    - [round(double a)](#rounddouble-a)
    - [ceil(double a) y floor(double a)](#ceildouble-a-y-floordouble-a)
  - [Métodos exponenciales y logarítmicos](#métodos-exponenciales-y-logarítmicos)
    - [pow(double a, double b)](#powdouble-a-double-b)
    - [sqrt(double a)](#sqrtdouble-a)
    - [log(double a) y log10(double a)](#logdouble-a-y-log10double-a)
  - [Métodos trigonométricos](#métodos-trigonométricos)
    - [sin(double a), cos(double a), tan(double a)](#sindouble-a-cosdouble-a-tandouble-a)
    - [toRadians(double angdeg) y toDegrees(double angrad)](#toradiansdouble-angdeg-y-todegreesdouble-angrad)
  - [Generación de números aleatorios](#generación-de-números-aleatorios)
    - [random()](#random)
- [Buenas prácticas](#buenas-prácticas)

## Math

La clase `Math` en Java es una clase utilitaria que proporciona métodos estáticos para realizar operaciones matemáticas comunes, como cálculos trigonométricos, exponenciales, logarítmicos, redondeo y más.

## ¿Qué es la clase math?

La clase `Math` es parte del paquete `java.lang`, por lo que no es necesario importarla manualmente. Contiene métodos estáticos que permiten realizar operaciones matemáticas sin necesidad de crear una instancia de la clase.

### Características

- **Métodos estáticos:** Todos los métodos de `Math` son estáticos, lo que significa que se pueden llamar directamente usando el nombre de la clase.

- **Constantes útiles:** Proporciona constantes como `Math.PI` y `Math.E`.

- **Operaciones comunes:** Incluye métodos para cálculos trigonométricos, exponenciales, logarítmicos, redondeo, generación de números aleatorios y más.

## Constantes de la clase math

La clase Math define dos constantes útiles:

**Math.PI:** Representa el valor de π (pi), aproximadamente 3.141592653589793.

**Math.E:** Representa la base del logaritmo natural, aproximadamente 2.718281828459045.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Valor de PI: " + Math.PI);
        System.out.println("Valor de E: " + Math.E);
    }
}
```

## Métodos comunes

A continuación, se presentan algunos de los métodos más utilizados de la clase Math.

### Métodos básicos

#### abs(double a)

Devuelve el valor absoluto de un número.

```java
double numero = -10.5;
double absoluto = Math.abs(numero);
System.out.println("Valor absoluto: " + absoluto); // Salida: 10.5
```

---

#### max(double a, double b) y min(double a, double b)

Devuelven el máximo o mínimo entre dos valores.

```java
int a = 10;
int b = 20;
int maximo = Math.max(a, b);
int minimo = Math.min(a, b);
System.out.println("Máximo: " + maximo); // Salida: 20
System.out.println("Mínimo: " + minimo); // Salida: 10
```

---

### Métodos de redondeo

#### round(double a)

Redondea un número al entero más cercano.

```java
double numero = 10.6;
long redondeado = Math.round(numero);
System.out.println("Redondeado: " + redondeado); // Salida: 11
```

---

#### ceil(double a) y floor(double a)

- **ceil:** Redondea hacia arriba al entero más cercano.

- **floor:** Redondea hacia abajo al entero más cercano.

```java
double numero = 10.4;
double techo = Math.ceil(numero);
double piso = Math.floor(numero);
System.out.println("Techo: " + techo); // Salida: 11.0
System.out.println("Piso: " + piso);   // Salida: 10.0
```

---

### Métodos exponenciales y logarítmicos

#### pow(double a, double b)

Devuelve el valor de a elevado a la potencia de b.

```java
double base = 2;
double exponente = 3;
double potencia = Math.pow(base, exponente);
System.out.println("Potencia: " + potencia); // Salida: 8.0
```

---

#### sqrt(double a)

Devuelve la raíz cuadrada de un número.

```java
double numero = 16;
double raiz = Math.sqrt(numero);
System.out.println("Raíz cuadrada: " + raiz); // Salida: 4.0
```

---

#### log(double a) y log10(double a)

- **log:** Devuelve el logaritmo natural (base e).

- **log10:** Devuelve el logaritmo en base 10.

```java
double numero = 100;
double logNatural = Math.log(numero);
double logBase10 = Math.log10(numero);
System.out.println("Logaritmo natural: " + logNatural); // Salida: 4.605170185988092
System.out.println("Logaritmo base 10: " + logBase10);   // Salida: 2.0
```

### Métodos trigonométricos

#### sin(double a), cos(double a), tan(double a)

Devuelven el seno, coseno y tangente de un ángulo en radianes.

```java
double angulo = Math.PI / 2; // 90 grados en radianes
double seno = Math.sin(angulo);
double coseno = Math.cos(angulo);
double tangente = Math.tan(angulo);
System.out.println("Seno: " + seno);       // Salida: 1.0
System.out.println("Coseno: " + coseno);   // Salida: 6.123233995736766E-17 (casi 0)
System.out.println("Tangente: " + tangente); // Salida: 1.633123935319537E16 (infinito)
```

---

#### toRadians(double angdeg) y toDegrees(double angrad)

Convierten ángulos entre grados y radianes.

```java
double grados = 90;
double radianes = Math.toRadians(grados);
double gradosConvertidos = Math.toDegrees(radianes);
System.out.println("Radianes: " + radianes);           // Salida: 1.5707963267948966
System.out.println("Grados convertidos: " + gradosConvertidos); // Salida: 90.0
```

### Generación de números aleatorios

#### random()

Devuelve un número aleatorio entre 0.0 (inclusive) y 1.0 (exclusive).

```java
double aleatorio = Math.random();
System.out.println("Número aleatorio: " + aleatorio); // Salida: Un número entre 0.0 y 1.0
```

Para generar un número aleatorio en un rango específico, puedes usar:

```java
int min = 1;
int max = 100;
int aleatorioEnRango = min + (int) (Math.random() * ((max - min) + 1));
System.out.println("Número aleatorio entre 1 y 100: " + aleatorioEnRango);
```

---

## Buenas prácticas

Usa métodos estáticos directamente: No es necesario crear una instancia de `Math`.

**Considera la precisión:** Al trabajar con números decimales, ten en cuenta la precisión y los errores de redondeo.

**Reutiliza constantes:** Usa `Math.PI` y `Math.E` en lugar de definir tus propias constantes.

**Optimiza cálculos complejos:** Para operaciones repetitivas, considera almacenar resultados intermedios en variables.
