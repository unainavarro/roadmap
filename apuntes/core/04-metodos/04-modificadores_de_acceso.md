<h1 align="center">Modificadores de acceso</h1>

<h2>📑 Contenido</h2>

- [Modificadores de acceso](#modificadores-de-acceso)
- [A nivel de Métodos](#a-nivel-de-métodos)
  - [public](#public)
  - [protected](#protected)
  - [default(sin modificador)](#defaultsin-modificador)
  - [private](#private)

## Modificadores de acceso

Los modificadores de acceso en Java son palabras clave que se utilizan para controlar el acceso a clases, variables, métodos y constructores dentro de una aplicación Java. Estos modificadores determinan desde qué partes del programa se puede acceder a los miembros de una clase y cómo pueden ser utilizados. En Java, hay cuatro modificadores de acceso principales:

- **public:** Los miembros marcados como `public` son **accesibles desde cualquier parte del código**, ya sea dentro del mismo paquete o desde otro paquete. Esto significa que no hay restricciones de acceso.

- **protected:** Los miembros marcados como `protected` son **accesibles dentro del mismo paquete y también por clases derivadas (subclases) fuera del paquete**. Sin embargo, las clases que no están en el mismo paquete y que no son subclases no pueden acceder a estos miembros.

- **default(sin modificador):** Si no se especifica ningún modificador de acceso (es decir, no se usa `public`, `protected` ni `private`), el miembro se considera tener un modificador de acceso "predeterminado" o "de paquete". Los miembros con este modificador son accesibles **solo dentro del mismo paquete**, pero no desde fuera del paquete, incluso si la clase que intenta acceder está en una subclase.

- **private:** Los miembros marcados como `private` son **accesibles solo dentro de la misma clase**. No pueden ser accedidos desde ninguna otra clase, ni siquiera desde las subclases en el mismo paquete.

## A nivel de Métodos

Los modificadores de acceso en Java también se pueden aplicar a métodos, lo que determina la accesibilidad de los métodos desde otras partes del programa.

### public

Los métodos marcados como `public` son accesibles desde cualquier parte del código, ya sea dentro del mismo paquete o desde otro paquete. Esto significa que no hay restricciones de acceso.

```java
public void metodoPublico() {
    // Cuerpo del método
}
```

### protected

Los métodos marcados como `protected` son accesibles dentro del mismo paquete y también por clases derivadas (subclases) fuera del paquete. Sin embargo, las clases que no están en el mismo paquete y que no son subclases no pueden acceder a estos métodos.

```java
protected void metodoProtegido() {
    // Cuerpo del método
}
```

### default(sin modificador)

Si no se especifica ningún modificador de acceso (es decir, no se usa `public`, `protected` ni `private`), el método se considera tener un modificador de acceso "predeterminado" o "de paquete". Los métodos con este modificador son accesibles solo dentro del mismo paquete, pero no desde fuera del paquete.

```java
void metodoDefault() {
    // Cuerpo del método
}
```

### private

Los métodos marcados como `private` son accesibles solo dentro de la misma clase. No pueden ser accedidos desde ninguna otra clase, ni siquiera desde las subclases en el mismo paquete.

```java
private void metodoPrivado() {
    // Cuerpo del método
}
```

> [!NOTE]
>
> Estos modificadores de acceso se aplican al nivel del método y determinan quién puede invocar el método y desde dónde se puede acceder a él. Es importante usar los modificadores de acceso adecuados para mantener la encapsulación y la seguridad en tu código.
