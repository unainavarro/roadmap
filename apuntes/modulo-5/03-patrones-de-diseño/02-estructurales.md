<h1 align="center">Patrones estructurales</h1>

<h2>📑 Contenido</h2>

- [Patrones estructurales](#patrones-estructurales)
- [Adapter (Adaptador)](#adapter-adaptador)
- [Bridge (Puente)](#bridge-puente)
- [Composite (Composite)](#composite-composite)
- [Decorator (Decorador)](#decorator-decorador)
- [Facade (Fachada)](#facade-fachada)
- [Flyweight (Peso Ligero)](#flyweight-peso-ligero)
- [Proxy (Proxy)](#proxy-proxy)

## Patrones estructurales

Los patrones estructurales en programación son un conjunto de patrones de diseño que se centran en cómo se componen las clases y los objetos para formar estructuras más grandes. Estos patrones ayudan a definir cómo las clases y los objetos interactúan entre sí para formar sistemas más complejos.

## Adapter (Adaptador)

El patrón Adapter, o Adaptador, es un patrón de diseño estructural que permite que las interfaces de una clase sean utilizadas como si fueran interfaces de otra clase. En otras palabras, el adaptador permite que objetos con interfaces incompatibles trabajen juntos.

Este patrón se utiliza cuando tienes una clase existente con una interfaz que no coincide con la que necesitas. En lugar de modificar la clase existente, se crea un adaptador que actúa como un intermediario entre el cliente y la clase existente, traduciendo las solicitudes del cliente a un formato que la clase existente pueda entender.

Hay dos tipos principales de adaptadores:

- **Adaptador de objeto (Object Adapter):** Utiliza la composición para adaptar una interfaz a otra. Esto implica que el adaptador contiene una instancia de la clase que necesita adaptación.

- **Adaptador de clase (Class Adapter):** Utiliza la herencia para adaptar una interfaz a otra. Esto implica que el adaptador hereda tanto de la clase que necesita adaptación como de la interfaz que necesita ser implementada.

## Bridge (Puente)

El patrón Bridge es un patrón de diseño estructural que separa la abstracción de su implementación, permitiendo que ambas puedan variar independientemente. Es decir, el patrón Bridge desacopla una abstracción de su implementación para que puedan cambiar por separado.

Este patrón se utiliza cuando se tienen múltiples dimensiones de variación en una jerarquía de clases. En lugar de usar una jerarquía de clases con múltiples subclases, el patrón Bridge utiliza una composición de objetos con una relación "tiene un" en lugar de "es un".

En el patrón Bridge, hay dos jerarquías de clases separadas: una para la abstracción y otra para la implementación. La abstracción se refiere a la interfaz que el cliente ve, mientras que la implementación es la interfaz real que realiza el trabajo.

El patrón Bridge permite que la abstracción y la implementación varíen independientemente entre sí, lo que facilita la extensión y el mantenimiento del código. Además, proporciona una estructura más flexible y escalable, ya que las nuevas funcionalidades pueden ser introducidas sin modificar las clases existentes.

## Composite (Composite)

El patrón Composite es un patrón de diseño estructural que permite tratar tanto a objetos individuales como a composiciones de objetos de manera uniforme. Este patrón se basa en una estructura de árbol en la que los nodos hoja y los nodos compuestos (contenedores) tienen una interfaz común.

En esencia, el patrón Composite permite a los clientes tratar a los objetos compuestos (que contienen otros objetos) y a los objetos individuales de manera uniforme, lo que facilita la manipulación de estructuras complejas como si fueran objetos simples.

El patrón Composite se compone de tres elementos principales:

- **Componente (Component):** Define la interfaz común para todos los objetos en la estructura de árbol, tanto para los nodos hoja como para los nodos compuestos.

- **Nodo Hoja (Leaf):** Representa los nodos finales de la estructura de árbol que no tienen hijos. Los nodos hoja implementan la interfaz del Componente.

- **Nodo Compuesto (Composite):** Representa los nodos intermedios de la estructura de árbol que pueden contener nodos hoja y/o nodos compuestos. Los nodos compuestos implementan la interfaz del Componente y pueden contener una lista de hijos que son Componentes.

El patrón Composite permite construir estructuras de árbol complejas de manera recursiva, lo que facilita la representación y manipulación de relaciones de tipo todo-parte.

## Decorator (Decorador)

El patrón Decorator es un patrón de diseño estructural que permite agregar funcionalidad adicional a un objeto dinámicamente. Este patrón se basa en la composición en lugar de la herencia, lo que significa que agrega nuevas funcionalidades al envolver un objeto original en otro objeto llamado "decorador".

El Decorator se utiliza cuando se necesita extender o modificar el comportamiento de un objeto sin alterar su estructura básica. Es útil cuando se tienen muchas combinaciones posibles de funcionalidades y no quieres tener una clase para cada combinación, o cuando la herencia es poco práctica o inadecuada para el problema.

El patrón Decorator consta de los siguientes componentes:

- **Componente (Component):** Define la interfaz común para los objetos que pueden ser decorados.

- **Componente Concreto (Concrete Component):** Es la implementación básica del Componente.

- **Decorador (Decorator):** Es una clase abstracta que implementa la interfaz del Componente y tiene una referencia a un objeto del tipo Componente. Esta clase también puede tener una referencia a otro Decorador.

- **Decorador Concreto (Concrete Decorator):** Es una extensión del Decorador abstracto que agrega funcionalidad adicional al Componente.

## Facade (Fachada)

El patrón Facade es un patrón de diseño estructural que proporciona una interfaz unificada simplificada para un conjunto de interfaces en un subsistema más grande. Este patrón oculta la complejidad del sistema y proporciona una interfaz fácil de usar para el cliente.

El propósito principal del patrón Facade es proporcionar una interfaz única y simplificada que oculte la complejidad de un sistema más grande. Esto ayuda a reducir la dependencia y el acoplamiento entre el cliente y las clases del subsistema, ya que el cliente no necesita conocer los detalles internos del subsistema.

El patrón Facade consta de los siguientes componentes:

Facade (Fachada): Es una clase que proporciona una interfaz unificada y simplificada para un conjunto de interfaces más complejas en un subsistema. La fachada oculta los detalles de implementación del subsistema y proporciona métodos más simples y directos para el cliente.

Subsistema (Subsystem): Es un conjunto de clases que implementan la funcionalidad real del sistema. Estas clases son utilizadas por la fachada para realizar operaciones más complejas.

El patrón Facade se utiliza cuando se desea proporcionar una interfaz simple y unificada para un sistema complejo, y cuando se desea ocultar la complejidad del sistema del cliente. También se puede utilizar para promover la reutilización y la modularidad del código al encapsular la funcionalidad compleja en una fachada.

## Flyweight (Peso Ligero)

El patrón Flyweight es un patrón de diseño estructural que se utiliza para minimizar el uso de memoria o el costo de almacenamiento compartiendo lo máximo posible con objetos similares. Este patrón se basa en la idea de reutilizar objetos existentes en lugar de crear nuevos objetos cuando sea posible.

El patrón Flyweight se utiliza cuando una aplicación necesita manejar un gran número de objetos similares que comparten parte de su estado. En lugar de almacenar todo el estado en cada objeto individual, el patrón Flyweight separa el estado compartido y el estado intrínseco, y almacena el estado compartido externamente. De esta manera, múltiples objetos pueden compartir el mismo estado compartido, lo que reduce significativamente la cantidad de memoria utilizada.

El patrón Flyweight consta de los siguientes componentes:

- **Flyweight (Peso Ligero):** Es una interfaz o clase abstracta que define la interfaz para los objetos que tienen estado intrínseco y extrínseco. Esta interfaz proporciona métodos para establecer y obtener el estado intrínseco y para realizar operaciones basadas en el estado extrínseco.

- **ConcreteFlyweight (Peso Ligero Concreto):** Es una implementación concreta del Flyweight que almacena el estado intrínseco compartido entre múltiples objetos. Esta clase también puede contener parte del estado extrínseco, pero el estado intrínseco es compartido.

- **Factory (Fábrica):** Es una clase que gestiona la creación y el almacenamiento de objetos Flyweight. La fábrica garantiza que se reutilicen los objetos Flyweight existentes y que se creen nuevos objetos Flyweight según sea necesario.

El patrón Flyweight se utiliza comúnmente en situaciones donde una aplicación necesita manejar un gran número de objetos similares que comparten parte de su estado, como en editores de texto, sistemas de gráficos y sistemas de juegos.

## Proxy (Proxy)

El patrón Proxy es un patrón de diseño estructural que proporciona un substituto o representante de otro objeto para controlar el acceso a ese objeto. En resumen, el Proxy actúa como una interfaz a otro objeto, permitiendo controlar cómo se accede a ese objeto y agregar funcionalidad adicional si es necesario.

El patrón Proxy se utiliza cuando se necesita un nivel de indirección entre el cliente y un objeto para controlar el acceso a dicho objeto. Esto puede ser útil en diversas situaciones, como:

- **Lazy Initialization:** Si la creación de un objeto es costosa, se puede utilizar un proxy para retrasar su creación hasta que sea realmente necesario.

- **Control de Acceso:** Si se desea restringir el acceso a un objeto, se puede utilizar un proxy para verificar los permisos antes de permitir el acceso.

- **Cache:** Se puede utilizar un proxy para almacenar en caché los resultados de operaciones costosas y devolver los resultados almacenados en lugar de volver a calcularlos cada vez.

El patrón Proxy consta de los siguientes componentes:

- **Sujeto (Subject):** Define la interfaz común para el Sujeto real y el Proxy, de manera que el Proxy pueda ser utilizado en lugar del Sujeto real.

- **Sujeto Real (Real Subject):** Es la clase que implementa la interfaz definida por el Sujeto. Representa el objeto real al que se accede a través del Proxy.

- **Proxy: **Es una clase que actúa como un intermediario entre el cliente y el Sujeto real. El Proxy implementa la misma interfaz que el Sujeto real y controla el acceso a éste, agregando funcionalidad adicional si es necesario.
