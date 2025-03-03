<h1 align="center">Introducción</h1>

<h2>📑 Contenido</h2>

- [Historia y Evolución de Java](#historia-y-evolución-de-java)
- [Características Principales de Java](#características-principales-de-java)
  - [Independencia de Plataforma](#independencia-de-plataforma)
  - [Orientación a Objetos](#orientación-a-objetos)
  - [Manejo Automático de Memoria](#manejo-automático-de-memoria)
  - [Seguridad](#seguridad)
  - [Concurrencia y Multihilo](#concurrencia-y-multihilo)
  - [Gran Ecosistema y Comunidad](#gran-ecosistema-y-comunidad)
- [Usos más comunes](#usos-más-comunes)

## Historia y Evolución de Java

Java es un lenguaje de programación de alto nivel, orientado a objetos y multiplataforma, desarrollado por Sun Microsystems en 1995. Fue creado por un equipo liderado por James Gosling con el objetivo de proporcionar un entorno de desarrollo seguro, portátil y eficiente. En 2010, Oracle Corporation adquirió Sun Microsystems y continúa el desarrollo de Java hasta la actualidad.

Desde su creación, Java ha evolucionado a través de diversas versiones, cada una introduciendo mejoras en el rendimiento, la seguridad y las capacidades del lenguaje. Algunas versiones destacadas incluyen:

- **Java SE 5 (2004)**: Introducción de genéricos y mejoras en la concurrencia.

- **Java SE 8 (2014)**: Expresión lambda, Streams API y mejoras en la programación funcional.

- **Java SE 11 (2018)**: Soporte a largo plazo (LTS) con mejoras en seguridad y rendimiento.

- **Java SE 17 (2021)**: Otra versión LTS con características modernas como registros y mejoras en el garbage collector.

## Características Principales de Java

Java es ampliamente utilizado debido a varias características clave:

### Independencia de Plataforma

Java utiliza la Máquina Virtual de Java (JVM) para ejecutar su código, lo que permite que una aplicación escrita en Java se ejecute en cualquier sistema operativo que tenga una JVM instalada. Esto sigue el principio de "Write Once, Run Anywhere" (WORA). La portabilidad de Java lo convierte en una opción ideal para aplicaciones empresariales, móviles y de desarrollo web.

La independencia de la plataforma en Java se debe principalmente a dos factores:

- **Máquina virtual Java (JVM):** Java se compila en un bytecode intermedio en lugar de un código máquina específico para una plataforma en particular. Este bytecode se ejecuta en la JVM, que está disponible para varias plataformas, como Windows, macOS y diferentes distribuciones de Linux. La JVM interpreta o compila el bytecode en código máquina nativo para la plataforma específica en la que se está ejecutando, lo que permite que las aplicaciones Java sean portables.

- **Librerías estándar (APIs):** Java proporciona una amplia gama de librerías estándar (APIs) que ofrecen funcionalidades comunes y abstracciones de bajo nivel que son independientes de la plataforma. Esto significa que las aplicaciones Java pueden hacer uso de estas librerías sin preocuparse por los detalles específicos de la plataforma subyacente.

### Orientación a Objetos

Java es un lenguaje puramente orientado a objetos, lo que significa que todo en Java se basa en objetos y clases. Soporta los principios de la programación orientada a objetos (POO):

- **Encapsulamiento:** Protege los datos mediante modificadores de acceso (privado, público, protegido, por defecto). Esto mejora la modularidad y la seguridad del código.

- **Herencia:** Permite crear nuevas clases a partir de clases existentes, promoviendo la reutilización del código y facilitando la extensibilidad.

- **Polimorfismo:** Habilidad de un objeto para tomar muchas formas, permitiendo que un mismo método se comporte de diferentes maneras dependiendo del objeto que lo invoque.

- **Abstracción:** Permite ocultar los detalles internos de una clase y exponer solo lo necesario para el usuario, mejorando la legibilidad y reduciendo la complejidad del código.

### Manejo Automático de Memoria

Java incorpora un Garbage Collector (Recolector de basura) que gestiona la memoria de forma automática. Esto significa que el programador no necesita liberar la memoria manualmente, como sucede en otros lenguajes como C o C++. El garbage collector identifica y elimina los objetos que ya no están en uso, previniendo fugas de memoria y mejorando la eficiencia del programa.

### Seguridad

Java tiene un fuerte modelo de seguridad que protege las aplicaciones de código malicioso. Algunas de sus características de seguridad incluyen:

- **Sandbox de seguridad:** Java utiliza un modelo de seguridad basado en sandbox que restringe las operaciones que un programa puede realizar. Esto se logra ejecutando el código en un entorno controlado (sandbox) donde se imponen restricciones, como la prohibición de acceder al sistema de archivos local o a recursos del sistema, a menos que se otorguen permisos explícitos.

- **Verificación de bytecode:** Antes de ejecutar un programa Java, la JVM verifica el bytecode para asegurarse de que cumple con ciertas reglas de seguridad. Esto ayuda a prevenir vulnerabilidades como el desbordamiento de búfer y otros errores de programación comunes que pueden ser aprovechados por atacantes.

- **Gestión de permisos y políticas de seguridad:** Java utiliza un sistema de gestión de permisos y políticas de seguridad que permite controlar qué acciones puede realizar un programa Java. Estos permisos se otorgan mediante archivos de políticas de seguridad y pueden ser configurados para aplicaciones individuales o para todo el entorno de ejecución.

- **Clases y métodos seguros:** Java proporciona clases y métodos específicos que están diseñados para operar de manera segura en entornos potencialmente peligrosos. Por ejemplo, las clases de cifrado y las funciones de manejo de archivos proporcionan interfaces seguras para realizar operaciones criptográficas y de E/S de manera segura.

- **Actualizaciones de seguridad:** Oracle, el mantenedor principal de Java, proporciona regularmente actualizaciones de seguridad para abordar vulnerabilidades conocidas en la plataforma Java. Es importante mantener actualizadas las versiones de Java para protegerse contra nuevas amenazas de seguridad.

- **Criptografía:** Java incluye bibliotecas para realizar operaciones criptográficas seguras, como cifrado y firma digital. Estas bibliotecas están diseñadas para cumplir con los estándares de seguridad y son utilizadas por aplicaciones Java para garantizar la confidencialidad e integridad de los datos.

### Concurrencia y Multihilo

Java ofrece una biblioteca robusta para la ejecución concurrente de tareas, permitiendo crear programas eficientes y responsivos mediante hilos (threads). Algunas características clave incluyen:

- **Clase Thread y la interfaz Runnable:** Permiten la creación y gestión de hilos de manera sencilla.

- **Framework java.util.concurrent:** Introduce estructuras avanzadas para la gestión de hilos, evitando problemas como condiciones de carrera y bloqueos.

- **Sincronización:** Permite controlar el acceso a recursos compartidos para evitar inconsistencias en la ejecución concurrente.

### Gran Ecosistema y Comunidad

Java SE (Standard Edition) no solo es la base del lenguaje Java, sino también una puerta de entrada a un vasto ecosistema. Este ecosistema incluye diversas bibliotecas y frameworks que hacen que el desarrollo de aplicaciones sea más eficiente:

- **Spring:** Un framework ampliamente usado para el desarrollo de aplicaciones empresariales y web, conocido por su flexibilidad y potencia.

- **Hibernate:** Una popular biblioteca que facilita la gestión de bases de datos gracias a su enfoque de Mapeo Objeto-Relacional (ORM).

- **Jakarta EE (anteriormente Java EE):** Un conjunto robusto de especificaciones ideales para el desarrollo de aplicaciones empresariales a gran escala.

> Las características principales de Java se van a ir viendo en profundidad en temas aislados más adelante.

## Usos más comunes

- **Desarrollo empresarial:** Muchas aplicaciones empresariales, como sistemas de gestión empresarial o software financiero, se desarrollan en Java debido a su confiabilidad y seguridad.

- **Aplicaciones web:** Gracias a frameworks como Spring y Jakarta EE, Java es ampliamente utilizado para desarrollar aplicaciones robustas y escalables para la web.

- **Aplicaciones móviles:** Es el lenguaje principal para desarrollar aplicaciones Android, lo que lo hace esencial en el mundo móvil.

- **Big Data:** Herramientas como Apache Hadoop y Apache Spark aprovechan Java para el procesamiento y análisis de grandes volúmenes de datos.

- **Aplicaciones de escritorio:** Java es una opción popular para software de escritorio, especialmente en herramientas multiplataforma, gracias a su portabilidad.

- **Juegos:** Aunque no es el uso principal, Java se emplea en ciertos juegos y motores, especialmente en proyectos independientes.

- **Sistemas embebidos:** Es utilizado en dispositivos como sensores o hardware de IoT debido a su eficiencia y flexibilidad.

- **Inteligencia Artificial y aprendizaje automático:** Con bibliotecas como Weka y Deeplearning4j, Java también tiene presencia en proyectos de IA.
