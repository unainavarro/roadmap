<h1 align="center">Encapsulación</h1>

<h2>📑 Contenido</h2>

- [Encapsulación](#encapsulación)
- [¿Qué es la encapsulación?](#qué-es-la-encapsulación)
  - [Objetivos de la encapsulación](#objetivos-de-la-encapsulación)
- [¿Cómo se implementa la encapsulación?](#cómo-se-implementa-la-encapsulación)
  - [Pasos para Implementar la encapsulación:](#pasos-para-implementar-la-encapsulación)
- [Beneficios de la encapsulación](#beneficios-de-la-encapsulación)
  - [Control sobre el acceso a los datos](#control-sobre-el-acceso-a-los-datos)
  - [Flexibilidad para cambios internos](#flexibilidad-para-cambios-internos)
  - [Mejora la seguridad](#mejora-la-seguridad)
- [Buenas prácticas con la encapsulación](#buenas-prácticas-con-la-encapsulación)

## Encapsulación

La encapsulación es uno de los pilares fundamentales de la Programación Orientada a Objetos (POO). Se refiere a la práctica de ocultar los detalles internos de una clase y restringir el acceso directo a sus atributos, exponiendo solo lo necesario a través de métodos controlados.

## ¿Qué es la encapsulación?

La encapsulación es un mecanismo que protege los datos de una clase, evitando que sean accedidos o modificados directamente desde fuera de la clase. En su lugar, se proporcionan métodos públicos (getters y setters) para interactuar con los datos de manera controlada.

### Objetivos de la encapsulación

- **Proteger la integridad de los datos:** Evitar que los datos sean modificados de manera incorrecta.

- **Ocultar la complejidad:** Mostrar solo lo necesario y ocultar los detalles de implementación.

- **Facilitar el mantenimiento:** Permite cambiar la implementación interna sin afectar el código que usa la clase.

## ¿Cómo se implementa la encapsulación?

La encapsulación se implementa utilizando modificadores de acceso (`private`, `public`, `protected`) y proporcionando métodos públicos para acceder y modificar los atributos privados.

### Pasos para Implementar la encapsulación:

- Declara los atributos de la clase como `private`.

- Proporciona métodos `public` (getters y setters) para acceder y modificar los atributos.

```java
public class CuentaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getter para el titular
    public String getTitular() {
        return titular;
    }

    // Setter para el titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getter para el saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }
}
```

## Beneficios de la encapsulación

### Control sobre el acceso a los datos

Al usar métodos `public` para acceder a los atributos `private`, puedes validar o restringir cómo se modifican los datos.

```java
public void setSaldo(double saldo) {
    if (saldo >= 0) {
        this.saldo = saldo;
    } else {
        System.out.println("El saldo no puede ser negativo.");
    }
}
```

### Flexibilidad para cambios internos

Puedes cambiar la implementación interna de una clase sin afectar el código que la usa. Por ejemplo, podrías cambiar el tipo de dato de un atributo o añadir validaciones adicionales.

### Mejora la seguridad

Al ocultar los detalles internos, reduces el riesgo de que otros programadores modifiquen los datos de manera incorrecta.

## Buenas prácticas con la encapsulación

- **Declara los atributos como private:** Esto garantiza que solo los métodos de la clase puedan acceder a ellos.

- **Usa getters y setters:** Proporciona métodos públicos para acceder y modificar los atributos de manera controlada.

- **Valida los datos en los setters:** Asegúrate de que los valores asignados a los atributos sean válidos.

- **No expongas más de lo necesario:** Solo haz públicos los métodos que realmente necesitan ser accedidos desde fuera de la clase.
