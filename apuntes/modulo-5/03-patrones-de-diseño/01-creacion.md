<h1 align="center">Patrones creacionales</h1>

<h2>📑 Contenido</h2>

- [Patrones creacionales](#patrones-creacionales)
- [Singleton (Único)](#singleton-único)
- [Factory method (Método de Fábrica)](#factory-method-método-de-fábrica)
- [Abstract factory (Fábrica Abstracta)](#abstract-factory-fábrica-abstracta)
- [Builder (Constructor)](#builder-constructor)
- [Prototype (Prototipo)](#prototype-prototipo)

## Patrones creacionales

Los patrones creacionales en programación son un conjunto de patrones de diseño que se centran en cómo se crean los objetos en una aplicación. Estos patrones proporcionan varias técnicas para crear objetos de manera flexible y eficiente, permitiendo la reutilización del código y la facilitación del mantenimiento.

## Singleton (Único)

El patrón Singleton es uno de los patrones de diseño creacionales más simples pero poderosos. Se utiliza cuando se necesita garantizar que una clase tenga exactamente una instancia y proporcionar un punto de acceso global a esta instancia.

La implementación típica del patrón Singleton incluye un método estático que devuelve la misma instancia de la clase cada vez que se invoca.

Este código garantiza que solo pueda existir una instancia de la clase Singleton, y que se puede acceder a ella desde cualquier parte del código utilizando Singleton.getInstance(). Si aún no se ha creado una instancia, se crea la primera vez que se llama a getInstance(), y las llamadas posteriores devolverán la misma instancia.

Es importante tener en cuenta que esta implementación no es segura en un entorno multi-hilo, ya que si dos hilos intentan crear una instancia al mismo tiempo, podrían terminar con dos instancias diferentes

> [!NOTE]
>
> Para hacer que el Singleton sea seguro para subprocesos, es posible utilizar sincronización o usar la inicialización estática de Java.

## Factory method (Método de Fábrica)

El patrón Factory Method es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, pero permite a las subclases alterar el tipo de objetos que se crean. En esencia, delega la responsabilidad de la creación de objetos a las subclases.

## Abstract factory (Fábrica Abstracta)

El patrón Abstract Factory es otro patrón de diseño creacional que proporciona una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas. Esencialmente, el patrón Abstract Factory proporciona una interfaz para crear una serie de objetos, pero permite que las clases concretas de esos objetos sean determinadas por las subclases.

## Builder (Constructor)

El patrón Builder es un patrón de diseño creacional que se utiliza para construir objetos complejos paso a paso. Este patrón permite crear diferentes representaciones de un objeto utilizando el mismo proceso de construcción.

El Builder se compone de los siguientes elementos:

- **Builder (Constructor):** Define una interfaz para la creación de partes de un objeto complejo.
- **ConcreteBuilder (Constructor Concreto):** Implementa la interfaz del Builder y proporciona la implementación para construir y ensamblar las partes del objeto.
- **Director:** Es responsable de construir el objeto utilizando el Builder. No conoce los detalles de la construcción, solo invoca los métodos del Builder para construir el objeto.
- **Producto:** Es el objeto complejo que se va a construir.

## Prototype (Prototipo)

El patrón Prototype es un patrón de diseño creacional que se utiliza cuando la creación de un objeto es costosa en términos de rendimiento o recursos, y se desea evitar recrearlo mediante la clonación de un objeto existente. En lugar de crear un objeto desde cero, el patrón Prototype permite crear nuevas instancias mediante la copia de un objeto prototipo.

En esencia, el patrón Prototype se basa en tener un objeto prototipo que sirve como plantilla para la creación de nuevos objetos. Cuando se necesita crear un objeto nuevo, en lugar de instanciar uno desde cero, se clona el prototipo y se ajustan los valores según sea necesario.

Por ejemplo, supongamos que tienes un objeto complejo que requiere una inicialización costosa o datos de configuración específicos. En lugar de inicializar este objeto cada vez que se necesita, puedes crear una instancia inicial y luego clonarla para obtener nuevas instancias con las mismas características.

El patrón Prototype puede ser útil cuando:

- La creación de un objeto es costosa en términos de recursos.
- Se necesitan varias copias de un objeto con pequeñas variaciones.
- El código necesita evitar la dependencia de clases concretas.

Al utilizar el patrón Prototype, es importante que las clases de los objetos que se van a clonar implementen una interfaz común o proporcionen un método para clonarse a sí mismos. Esto garantiza que el proceso de clonación sea consistente y que los objetos clonados se comporten correctamente.
