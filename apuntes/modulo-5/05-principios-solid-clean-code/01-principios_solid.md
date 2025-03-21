<h1 align="center">Principios SOLID</h1>

<h2>📑 Contenido</h2>

- [Principios SOLID](#principios-solid)
- [S - Principio de responsabilidad única (Single Responsibility Principle)](#s---principio-de-responsabilidad-única-single-responsibility-principle)
- [O - Principio de abierto/cerrado (Open/Closed Principle)](#o---principio-de-abiertocerrado-openclosed-principle)
- [L - Principio de sustitución de liskov (Liskov Substitution Principle)](#l---principio-de-sustitución-de-liskov-liskov-substitution-principle)
- [I - Principio de segregación de interfaces (Interface Segregation Principle)](#i---principio-de-segregación-de-interfaces-interface-segregation-principle)
- [D - Principio de inversión de dependencias (Dependency Inversion Principle)](#d---principio-de-inversión-de-dependencias-dependency-inversion-principle)

## Principios SOLID

Los principios SOLID son un conjunto de cinco principios de diseño de software que se utilizan para crear sistemas más mantenibles, flexibles y escalables. Fueron introducidos por Robert C. Martin (también conocido como "Uncle Bob") a principios de la década de 2000 y se consideran fundamentales para el diseño de software orientado a objetos

## S - Principio de responsabilidad única (Single Responsibility Principle)

El Principio de Responsabilidad Única (SRP) es uno de los cinco principios SOLID del diseño de software. Fue propuesto por primera vez por Robert C. Martin y establece que una clase debe tener una única razón para cambiar, es decir, una única responsabilidad.

En términos prácticos, esto significa que una clase debe estar diseñada para hacer una sola cosa y hacerla bien. Si una clase tiene múltiples responsabilidades o razones para cambiar, se vuelve más difícil de entender, probar y mantener. Dividir las responsabilidades en clases separadas hace que el código sea más cohesivo y modular, lo que facilita su mantenimiento y extensión.

Algunas señales de advertencia de que una clase puede estar violando el SRP incluyen tener métodos o atributos que no están directamente relacionados con su propósito principal, tener una cantidad excesiva de métodos o tener una funcionalidad que cambia frecuentemente por razones distintas a su propósito original.

Para seguir el SRP, es importante identificar las responsabilidades de una clase y separarlas en clases diferentes cuando sea necesario. Esto promueve un diseño más limpio y flexible, lo que facilita la evolución del software a lo largo del tiempo.

## O - Principio de abierto/cerrado (Open/Closed Principle)

El Principio de Abierto/Cerrado (OCP) es otro de los principios SOLID del diseño de software, propuesto por Bertrand Meyer. Este principio establece que las entidades de software (clases, módulos, funciones, etc.) deben estar abiertas para su extensión pero cerradas para su modificación.

En otras palabras, el código debe estar diseñado de tal manera que pueda ser extendido para agregar nuevas funcionalidades sin necesidad de modificar el código existente. Esto se logra utilizando la herencia, la composición, las interfaces y el polimorfismo para permitir que las nuevas funcionalidades se agreguen sin alterar el comportamiento existente.

El OCP promueve un diseño de software más robusto y resistente a cambios, ya que reduce el riesgo de introducir errores al modificar el código existente. Además, facilita la reutilización del código, ya que las clases y módulos pueden ser extendidos y utilizados en diferentes contextos sin necesidad de cambiar su implementación original.

Para seguir el Principio de Abierto/Cerrado, es importante identificar las áreas del código que son propensas a cambios y diseñarlas de manera que puedan ser extendidas sin modificar el código existente. Esto se logra utilizando técnicas como la encapsulación, la abstracción y el uso de patrones de diseño como el patrón Strategy y el patrón Decorator.

## L - Principio de sustitución de liskov (Liskov Substitution Principle)

El Principio de Sustitución de Liskov (LSP) es uno de los cinco principios SOLID del diseño de software, propuesto por Barbara Liskov. Este principio establece que los objetos de un programa deben poder ser reemplazados por instancias de sus subtipos sin alterar la corrección del programa.

En términos más simples, si S es un subtipo de T, entonces los objetos de tipo T pueden ser reemplazados por objetos de tipo S sin que el comportamiento del programa cambie de manera inesperada. Esto significa que los subtipos deben comportarse de la misma manera que sus tipos base en todas las situaciones y satisfacer las mismas expectativas de comportamiento.

Para cumplir con el Principio de Sustitución de Liskov, los subtipos deben seguir las siguientes reglas:

- La precondición no puede ser más fuerte en el subtipo que en el tipo base.
- La postcondición no puede ser más débil en el subtipo que en el tipo base.
- Las invariantes que se mantienen en el tipo base también deben mantenerse en el subtipo.

El cumplimiento del LSP garantiza que el código sea más robusto y resistente a cambios, ya que los objetos pueden ser reemplazados sin afectar el comportamiento del programa. Además, promueve la cohesión y la flexibilidad del código, ya que permite la introducción de nuevos tipos sin cambiar el código existente.

## I - Principio de segregación de interfaces (Interface Segregation Principle)

El Principio de Segregación de Interfaces (ISP) es uno de los principios SOLID del diseño de software, propuesto por Robert C. Martin. Este principio establece que los clientes no deben ser obligados a depender de interfaces que no utilizan.

En otras palabras, en lugar de tener una única interfaz grande que contenga muchos métodos, es preferible tener múltiples interfaces más pequeñas y específicas que estén diseñadas para ser utilizadas por clientes específicos. Esto promueve una separación más clara de las preocupaciones y evita que los clientes dependan de funcionalidades que no necesitan.

El Principio de Segregación de Interfaces ayuda a evitar la "grasa" de las interfaces, es decir, métodos que no todos los clientes necesitan pero que deben implementar de todos modos. Esto hace que las interfaces sean más cohesivas y los clientes sean menos propensos a implementar métodos vacíos o no utilizados.

Un ejemplo común de aplicación del ISP es en el diseño de clases o componentes que tienen diferentes tipos de clientes. En lugar de tener una interfaz monolítica que satisfaga todas las necesidades de todos los clientes, se pueden definir interfaces más pequeñas y específicas que se adapten a las necesidades de cada cliente.

## D - Principio de inversión de dependencias (Dependency Inversion Principle)

El Principio de Inversión de Dependencias (DIP) es uno de los cinco principios SOLID del diseño de software, propuesto por Robert C. Martin. Este principio establece que los módulos de alto nivel no deben depender de los módulos de bajo nivel, sino de abstracciones. Además, tanto los módulos de alto nivel como los de bajo nivel deben depender de abstracciones.

En términos más simples, el DIP sugiere que las dependencias entre módulos deben ser invertidas, de modo que las clases de alto nivel no dependan directamente de las clases de bajo nivel. En su lugar, ambas deben depender de abstracciones (interfaces o clases abstractas). Esto permite que el código sea más flexible, mantenible y fácilmente adaptable a cambios.

El DIP promueve el desacoplamiento entre los diferentes componentes de un sistema, lo que facilita la reutilización del código y la evolución independiente de cada módulo. Además, al depender de abstracciones en lugar de implementaciones concretas, se facilita la prueba y la substitución de componentes.

Un ejemplo de aplicación del Principio de Inversión de Dependencias es el uso de inyección de dependencias (Dependency Injection) para suministrar las dependencias a una clase desde el exterior, en lugar de que la clase las cree internamente. Esto permite que las dependencias sean intercambiables y se puedan cambiar fácilmente sin modificar el código de la clase.
