<h1 align="center">Patrones de comportamiento</h1>

<h2>📑 Contenido</h2>

- [Patrones de comportamiento](#patrones-de-comportamiento)
- [Observer](#observer)
- [Strategy](#strategy)
- [Command](#command)
- [State](#state)
- [Iterator](#iterator)
- [Mediator](#mediator)
- [Memento](#memento)
- [Template method](#template-method)
- [Visitor](#visitor)
- [Chain of responsibility](#chain-of-responsibility)
- [Interpreter](#interpreter)

## Patrones de comportamiento

Los patrones de diseño de comportamiento son aquellos que se centran en la interacción entre objetos, cómo se comunican y cómo se distribuyen las responsabilidades entre ellos. Estos patrones se utilizan para mejorar la comunicación y la coordinación entre los objetos en un sistema de software.

## Observer

El patrón Observer, también conocido como el patrón de diseño de Publicador-Suscriptor, es un patrón de diseño de comportamiento que define una relación de uno a muchos entre objetos, de modo que cuando un objeto cambia de estado, todos sus dependientes son notificados y actualizados automáticamente.

Este patrón se utiliza cuando se desea mantener una relación de dependencia entre un objeto (llamado el sujeto o el observable) y uno o más objetos dependientes (llamados observadores) de manera que cuando el sujeto cambie su estado, todos los observadores sean notificados y actualizados.

El patrón Observer consta de los siguientes componentes:

- **Sujeto (Subject):** Es el objeto que es observado. Mantiene una lista de observadores y notifica a los observadores cuando cambia de estado.

- **Observador (Observer):** Define una interfaz de actualización para los objetos que deben ser notificados de los cambios en el sujeto.

- **Observador Concreto (Concrete Observer):** Implementa la interfaz de Observador y registra interés en el sujeto. Recibe notificaciones y actualiza su estado en función de los cambios en el sujeto.

El patrón Observer se utiliza en situaciones donde hay una relación de uno a muchos entre objetos y donde los cambios en un objeto requieren cambios en otros objetos relacionados. Por ejemplo, en interfaces de usuario donde la actualización de un componente debe reflejarse en otros componentes.

## Strategy

El patrón Strategy se utiliza para definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables. Esto permite que el algoritmo varíe independientemente de los clientes que lo utilizan.

En esencia, el patrón Strategy permite definir una serie de algoritmos, encapsular cada uno de ellos en objetos independientes y permitir que estos objetos sean intercambiados entre sí según sea necesario.

Por ejemplo, supongamos que estás desarrollando un sistema de procesamiento de pagos y necesitas implementar diferentes estrategias de cálculo de impuestos para distintos tipos de productos. En lugar de tener un único método de cálculo de impuestos con múltiples condiciones, puedes implementar cada estrategia de cálculo de impuestos como un objeto independiente y permitir que el cliente seleccione la estrategia deseada en tiempo de ejecución.

Este enfoque tiene varios beneficios, como la capacidad de agregar nuevas estrategias fácilmente sin modificar el código existente, la posibilidad de reutilizar estrategias en diferentes contextos y una mayor claridad y mantenibilidad del código.

## Command

El patrón Command es un patrón de diseño de comportamiento que encapsula una solicitud como un objeto, permitiendo parametrizar clientes con operaciones, encolar solicitudes o registrar solicitudes para su posterior ejecución.

Este patrón se basa en la idea de que una solicitud es encapsulada como un objeto, lo que permite que los clientes parametricen objetos con diferentes solicitudes, las encolen, las registren para su posterior ejecución o incluso las deshagan. Esto proporciona una mayor flexibilidad en la manipulación de solicitudes y permite la implementación de sistemas como registros de transacciones o sistemas de comandos y macros.

## State

El patrón State es un patrón de diseño de comportamiento que permite que un objeto cambie su comportamiento cuando su estado interno cambia. Este patrón se basa en la idea de que un objeto puede tener diferentes estados internos y que su comportamiento puede variar dependiendo de su estado actual.

En lugar de tener múltiples condicionales que cambian el comportamiento de un objeto según su estado, el patrón State encapsula cada estado en un objeto separado y permite que el objeto cambie su estado interno de forma dinámica, delegando el comportamiento correspondiente al objeto de estado actual.

El patrón State consta de los siguientes componentes:

- **Contexto (Context):** Es el objeto que tiene un estado interno y cuyo comportamiento puede cambiar según su estado actual. Mantiene una referencia a un objeto de estado concreto y delega el comportamiento correspondiente a ese objeto de estado.

- **Estado (State):** Es una interfaz o una clase abstracta que define una interfaz común para todos los objetos de estado concretos. Define métodos que representan el comportamiento del contexto en un estado particular.

- **Estado Concreto (Concrete State):** Son las implementaciones concretas de la interfaz de Estado. Cada estado concreto proporciona una implementación específica del comportamiento del contexto en un estado particular.

El patrón State se utiliza cuando un objeto necesita cambiar su comportamiento según su estado interno, y cuando el comportamiento del objeto puede ser representado como una serie de estados discretos. Este patrón promueve el encapsulamiento del comportamiento en objetos de estado separados, lo que facilita la adición de nuevos estados y evita la proliferación de condicionales en el código.

## Iterator

El patrón Iterator es un patrón de diseño de comportamiento que se utiliza para proporcionar un medio de acceder secuencialmente a los elementos de una colección sin exponer su representación subyacente.

Este patrón se basa en la idea de tener un objeto iterador que se encarga de recorrer la colección y proporcionar acceso a sus elementos, independientemente de cómo esté estructurada la colección. El cliente utiliza el iterador para recorrer los elementos de la colección sin necesidad de conocer los detalles de implementación de la colección.

El patrón Iterator consta de los siguientes componentes:

- **Iterador (Iterator):** Define una interfaz para acceder y recorrer los elementos de una colección. Esta interfaz proporciona métodos como siguiente(), haySiguiente(), etc.

- **Iterador Concreto (Concrete Iterator):** Implementa la interfaz de Iterador y proporciona una implementación específica para recorrer una colección particular.

- **Agregado (Aggregate):** Define una interfaz para crear un objeto iterador.

- **Agregado Concreto (Concrete Aggregate):** Implementa la interfaz de Agregado y proporciona una implementación específica para crear un objeto iterador para su colección.

El patrón Iterator se utiliza cuando se necesita recorrer los elementos de una colección sin exponer su estructura interna. Esto promueve la encapsulación al permitir que la colección mantenga su estructura interna privada y solo exponga un iterador para recorrer los elementos de la colección.

## Mediator

El patrón Mediator es un patrón de diseño de comportamiento que define un objeto mediador que encapsula cómo un conjunto de objetos interactúan entre sí. Promueve un acoplamiento débil entre los objetos al evitar que se refieran entre sí explícitamente, y en su lugar, interactúan a través del objeto mediador.

En el patrón Mediator, los objetos se comunican entre sí a través del mediador en lugar de comunicarse directamente. Esto permite desacoplar los objetos entre sí, lo que hace que el sistema sea más fácil de mantener y extender. El mediador promueve la modularidad y la reutilización del código al centralizar la lógica de interacción en un solo lugar.

El patrón Mediator consta de los siguientes componentes:

- **Mediador (Mediator):** Define una interfaz para comunicarse con los objetos colegas.

- **Colega (Colleague):** Representa un objeto que interactúa con otros objetos colegas a través del mediador. Los colegas no se comunican directamente entre sí, sino que lo hacen a través del mediador.

- **Colega Concreto (Concrete Colleague):** Implementa la interfaz de Colega y define su comportamiento específico. Interactúa con otros colegas a través del mediador.

El patrón Mediator se utiliza cuando un conjunto de objetos necesita interactuar entre sí de una manera estructurada, pero se desea evitar el acoplamiento excesivo entre ellos. Por ejemplo, puede ser útil en sistemas de GUI (Interfaz Gráfica de Usuario), sistemas de mensajería o sistemas de control de tráfico.

## Memento

El patrón Memento es un patrón de diseño de comportamiento que se utiliza para capturar y restaurar el estado interno de un objeto sin violar el principio de encapsulamiento.

El objetivo principal del patrón Memento es permitir que un objeto vuelva a un estado anterior sin exponer la estructura interna del objeto. Esto se logra encapsulando el estado interno del objeto en un objeto memento separado, que puede ser almacenado, recuperado y utilizado para restaurar el estado del objeto en un momento posterior.

El patrón Memento consta de los siguientes componentes:

- **Originador (Originator):** Es el objeto cuyo estado se desea capturar en un memento. El originador crea mementos para almacenar su estado interno y puede utilizar un memento para restaurar su estado a un estado anterior.

- **Memento:** Es un objeto que almacena el estado interno de un originador en un momento dado. El memento proporciona métodos para obtener y establecer el estado almacenado, pero no permite acceder directamente a su estado interno.

- **Cuidador (Caretaker):** Es responsable de almacenar y gestionar los mementos creados por el originador. El cuidador no modifica ni accede al estado almacenado en los mementos, sino que simplemente los almacena y los devuelve al originador cuando es necesario restaurar un estado anterior.

El patrón Memento se utiliza cuando se necesita implementar una funcionalidad de "deshacer" o "revertir" en un objeto, o cuando se desea guardar y restaurar el estado de un objeto en un momento dado. Por ejemplo, se puede utilizar en editores de texto para implementar la funcionalidad de "deshacer" y "rehacer", o en aplicaciones de dibujo para guardar y restaurar el estado de un lienzo en diferentes momentos.

Al utilizar el patrón Memento, se mejora la modularidad y la encapsulación del código al separar la lógica de almacenamiento y restauración del estado interno en objetos memento independientes.

## Template method

El patrón Template Method es un patrón de diseño de comportamiento que define el esqueleto de un algoritmo en una operación, pero permite que las subclases redefinan ciertos pasos de ese algoritmo sin cambiar su estructura general.

En otras palabras, el patrón Template Method define una serie de pasos comunes en un algoritmo dentro de un método de plantilla, pero permite que las subclases proporcionen implementaciones específicas para algunos pasos del algoritmo. Esto promueve la reutilización del código al permitir que varias subclases compartan el mismo esqueleto de algoritmo pero proporcionen implementaciones específicas para ciertos pasos según sea necesario.

El patrón Template Method consta de los siguientes componentes:

- **Método Plantilla (Template Method):** Es un método en una clase base que define el esqueleto de un algoritmo. Este método puede incluir pasos comunes en el algoritmo y llamar a métodos abstractos que deben ser implementados por las subclases.

- **Método Concreto (Concrete Method):** Son implementaciones concretas de los métodos abstractos definidos en la clase base. Estos métodos proporcionan implementaciones específicas para ciertos pasos del algoritmo.

- **Método Abstracto (Abstract Method):** Son métodos declarados en la clase base pero no implementados. Estos métodos deben ser implementados por las subclases para proporcionar implementaciones específicas para ciertos pasos del algoritmo.

El patrón Template Method se utiliza cuando se desea definir el esqueleto de un algoritmo en una clase base pero permitir que las subclases proporcionen implementaciones específicas para ciertos pasos del algoritmo. Esto promueve la reutilización del código al evitar la duplicación de código común en varias subclases.

Un ejemplo común de uso del patrón Template Method es en el patrón de diseño de Factory Method, donde el método plantilla en la clase base define el esqueleto para la creación de objetos, mientras que las subclases proporcionan implementaciones específicas para la creación de objetos concretos.

## Visitor

El patrón Visitor es un patrón de diseño de comportamiento que se utiliza para agregar nuevos comportamientos a una estructura de objetos sin modificarla. El patrón Visitor se utiliza cuando se desea agregar nuevas operaciones a una jerarquía de clases y evitar la modificación de las clases existentes.

El patrón Visitor se basa en la idea de tener una interfaz Visitor que define métodos de visita para cada tipo de elemento en la estructura de objetos. Cada clase en la estructura de objetos implementa un método accept() que acepta un objeto Visitor como argumento. Cuando se llama a este método accept(), se llama al método correspondiente del Visitor para ese tipo de elemento.

El patrón Visitor consta de los siguientes componentes:

- **Visitor:** Define una interfaz que declara un método de visita para cada tipo de elemento en la estructura de objetos. Esta interfaz proporciona un método de visita para cada tipo de elemento en la estructura de objetos.

- **Elemento (Element):** Define una interfaz que declara el método accept() que acepta un objeto Visitor como argumento.

- **Elemento Concreto (Concrete Element):** Implementa la interfaz de Element y proporciona una implementación del método accept(). Este método llama al método de visita correspondiente del Visitor para este tipo de elemento.

- **Visitante Concreto (Concrete Visitor): **Implementa la interfaz de Visitor y proporciona una implementación para cada método de visita definido en la interfaz Visitor.

El patrón Visitor se utiliza en situaciones donde se necesita agregar nuevas operaciones a una jerarquía de clases sin modificar las clases existentes. Por ejemplo, puede ser útil en aplicaciones de análisis sintáctico, compiladores o editores de texto.

## Chain of responsibility

El patrón Chain of Responsibility es un patrón de diseño de comportamiento que se utiliza para pasar una solicitud a través de una cadena de manejadores. Cada manejador en la cadena decide si procesa la solicitud o la pasa al siguiente en la cadena.

En el patrón Chain of Responsibility, cada manejador en la cadena tiene un enlace a otro manejador en la cadena. Cuando se recibe una solicitud, el primer manejador en la cadena la examina y decide si puede manejarla. Si puede manejar la solicitud, la procesa; de lo contrario, la pasa al siguiente manejador en la cadena. Este proceso continúa hasta que la solicitud es manejada o hasta que se alcanza el final de la cadena.

El patrón Chain of Responsibility consta de los siguientes componentes:

- **Manejador (Handler):** Define una interfaz para manejar solicitudes. Puede proporcionar un enlace a otro manejador en la cadena y define un método para manejar solicitudes.

- **Manejador Concreto (Concrete Handler):** Implementa la interfaz de Manejador y proporciona una implementación específica para manejar ciertos tipos de solicitudes. También puede pasar la solicitud al siguiente manejador en la cadena si no puede manejarla.

El patrón Chain of Responsibility se utiliza cuando se desea desacoplar el remitente de una solicitud de sus receptores y cuando se desea permitir que varios objetos tengan la oportunidad de manejar una solicitud. Este patrón promueve la flexibilidad y la extensibilidad al permitir que se agreguen y se retiren manejadores de la cadena fácilmente.

Un ejemplo común de uso del patrón Chain of Responsibility es en sistemas de manejo de eventos, donde varios objetos pueden tener la oportunidad de manejar un evento antes de que se tome una acción predeterminada.

## Interpreter

El patrón Interpreter es un patrón de diseño de comportamiento que se utiliza para interpretar o evaluar expresiones escritas en un lenguaje específico. Este patrón define una gramática para el lenguaje y proporciona una forma de evaluar las expresiones en esa gramática.

En el patrón Interpreter, cada regla de la gramática se representa como una clase y las expresiones se representan como árboles de expresión compuestos por instancias de estas clases. Se proporciona un intérprete que recorre el árbol de expresión y evalúa cada nodo de acuerdo con la gramática del lenguaje.

El patrón Interpreter consta de los siguientes componentes:

- **Expresión (Expression):** Define una interfaz para interpretar expresiones. Puede contener métodos para interpretar expresiones y para construir árboles de expresión.

- **Expresión Terminal (Terminal Expression):** Implementa la interfaz de Expresión para expresiones terminales en la gramática. Representa los elementos básicos o primitivos en una expresión.

- **Expresión No Terminal (Non-terminal Expression):** Implementa la interfaz de Expresión para expresiones no terminales en la gramática. Representa combinaciones de elementos básicos en una expresión.

- **Contexto (Context):** Contiene información global que es compartida por las diferentes expresiones durante la interpretación.

El patrón Interpreter se utiliza cuando se desea interpretar expresiones escritas en un lenguaje específico y cuando se desea representar la gramática del lenguaje de una manera flexible y extensible. Este patrón promueve la reutilización del código al permitir la composición de expresiones complejas a partir de expresiones más simples.

Un ejemplo común de uso del patrón Interpreter es en el análisis sintáctico de lenguajes de programación, donde las expresiones escritas en el lenguaje son interpretadas y evaluadas para producir un resultado.
