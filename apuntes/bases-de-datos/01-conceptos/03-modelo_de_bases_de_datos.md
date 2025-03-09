<h1 align="center">Modelos de Bases de Datos</h1>

<h2>📑 Contenido</h2>

- [Modelos de bases de datos](#modelos-de-bases-de-datos)
- [Modelo relacional](#modelo-relacional)
  - [Características principales](#características-principales)
  - [Ventajas](#ventajas)
  - [Desventajas](#desventajas)
  - [Ejemplos de sistemas](#ejemplos-de-sistemas)
- [Modelo jerárquico](#modelo-jerárquico)
  - [Características principales](#características-principales-1)
  - [Ventajas](#ventajas-1)
  - [Desventajas](#desventajas-1)
  - [Ejemplos de sistemas](#ejemplos-de-sistemas-1)
- [Modelo de red](#modelo-de-red)
  - [Características principales](#características-principales-2)
  - [Ventajas](#ventajas-2)
  - [Desventajas](#desventajas-2)
  - [Ejemplos de sistemas](#ejemplos-de-sistemas-2)
- [Modelo orientado a objetos](#modelo-orientado-a-objetos)
  - [Características principales](#características-principales-3)
  - [Ventajas](#ventajas-3)
  - [Desventajas](#desventajas-3)
  - [Ejemplos de sistemas](#ejemplos-de-sistemas-3)
- [Modelos NoSQL](#modelos-nosql)
  - [Tipos de modelos NoSQL](#tipos-de-modelos-nosql)
  - [Ventajas](#ventajas-4)
  - [Desventajas](#desventajas-4)
  - [Ejemplos de sistemas](#ejemplos-de-sistemas-4)
- [Comparación](#comparación)

## Modelos de bases de datos

Un modelo de bases de datos es una representación abstracta de cómo se estructuran y relacionan los datos. Proporciona un marco para organizar la información y define las operaciones que se pueden realizar sobre ella. Los modelos de bases de datos son la base sobre la cual se construyen los Sistemas de Gestión de Bases de Datos (SGBD).

En el mundo de las bases de datos, no existe un enfoque único que se adapte a todas las necesidades. Diferentes aplicaciones requieren diferentes formas de organizar y gestionar los datos. Por ello, se han desarrollado varios modelos de bases de datos, cada uno con sus propias características, ventajas y desventajas.

## Modelo relacional

El modelo relacional es el más utilizado en la actualidad. Fue introducido por Edgar F. Codd en 1970 y se basa en la teoría de conjuntos y el álgebra relacional. En este modelo, los datos se organizan en tablas (también llamadas relaciones), compuestas por filas (tuplas) y columnas (atributos).

### Características principales

- **Estructura:** Los datos se organizan en tablas (relaciones), compuestas por filas (tuplas) y columnas (atributos).

- **Claves:** Cada tabla tiene una clave primaria que identifica de manera única cada fila.

- **Relaciones:** Las tablas se relacionan entre sí mediante claves foráneas.

- **Integridad:** Se mantiene la integridad de los datos mediante restricciones como la integridad de entidad y referencial.

### Ventajas

- **Flexibilidad:** Permite consultas complejas y relaciones entre datos.

- **Consistencia:** Asegura la integridad y consistencia de los datos.

- **Estandarización:** El uso de SQL como lenguaje estándar facilita su adopción y uso.

### Desventajas

- **Escalabilidad:** Puede tener dificultades para escalar horizontalmente en aplicaciones con grandes volúmenes de datos.

- **Complejidad:** El diseño de esquemas normalizados puede ser complejo.

### Ejemplos de sistemas

- MySQL

- PostgreSQL

- Oracle

- Microsoft SQL Server

## Modelo jerárquico

El modelo jerárquico organiza los datos en una estructura de árbol, donde cada registro tiene un único padre, excepto el nodo raíz. Este modelo fue popular en las primeras generaciones de bases de datos.

### Características principales

- **Estructura:** Los datos se organizan en una jerarquía de nodos, donde cada nodo tiene un único padre y puede tener varios hijos.

- **Relaciones:** Las relaciones entre nodos son de tipo padre-hijo.

### Ventajas

- **Simplicidad:** Es fácil de entender y implementar para datos con relaciones jerárquicas claras.

- **Eficiencia:** Las consultas que siguen la jerarquía son muy rápidas.

### Desventajas

- **Rigidez:** No es flexible para representar relaciones complejas o muchos-a-muchos.

- **Redundancia:** Puede haber duplicación de datos.

### Ejemplos de sistemas

- IBM Information Management System (IMS)

## Modelo de red

El modelo de red es una extensión del modelo jerárquico que permite relaciones más complejas entre los datos. En este modelo, un registro puede tener múltiples padres, lo que lo hace más flexible.

### Características principales

- **Estructura:** Los datos se organizan en un grafo, donde un nodo puede tener múltiples padres.

- **Relaciones:** Las relaciones son más flexibles que en el modelo jerárquico.

### Ventajas

- **Flexibilidad:** Permite representar relaciones más complejas.

- **Eficiencia:** Las consultas pueden ser más eficientes para ciertos tipos de datos.

### Desventajas

- **Complejidad:** Es más difícil de implementar y gestionar que el modelo relacional.

- **Rigidez:** Aunque más flexible que el modelo jerárquico, sigue siendo menos flexible que el modelo relacional.

### Ejemplos de sistemas

- Integrated Data Store (IDS)

- IDMS (Integrated Database Management System)

## Modelo orientado a objetos

El modelo orientado a objetos almacena datos en forma de objetos, similares a los utilizados en la programación orientada a objetos. Este modelo es ideal para aplicaciones que manejan datos complejos y requieren un alto grado de flexibilidad.

### Características principales

- **Estructura:** Los datos se organizan en objetos, que pueden contener atributos y métodos.

- **Herencia:** Los objetos pueden heredar propiedades y comportamientos de otros objetos.

- **Identidad:** Cada objeto tiene una identidad única.

### Ventajas

- **Integración:** Se integra bien con lenguajes de programación orientados a objetos.

- **Complejidad:** Puede manejar datos complejos y relaciones de manera más natural.

### Desventajas

- **Complejidad:** Puede ser más difícil de implementar y gestionar que el modelo relacional.

- **Adopción:** Menos estandarizado y menos utilizado que el modelo relacional.

### Ejemplos de sistemas

- db4o

- ObjectDB

## Modelos NoSQL

El modelo NoSQL (Not Only SQL) se utiliza para manejar grandes volúmenes de datos no estructurados o semi-estructurados. Es ideal para aplicaciones que requieren escalabilidad y flexibilidad.

### Tipos de modelos NoSQL

- **Documentos:** Almacenan datos en documentos, generalmente en formato JSON o BSON. Ejemplo: MongoDB.

- **Grafos:** Representan datos como nodos y aristas en un grafo. Ejemplo: Neo4j.

- **Clave-Valor:** Almacenan datos como pares clave-valor. Ejemplo: Redis.

- **Columnas:** Almacenan datos en columnas en lugar de filas. Ejemplo: Cassandra.

### Ventajas

- **Escalabilidad:** Diseñados para escalar horizontalmente.

- **Flexibilidad:** Pueden manejar datos no estructurados y semi-estructurados.

- **Rendimiento:** Optimizados para operaciones específicas, como consultas rápidas o escrituras masivas.

### Desventajas

- **Consistencia:** Pueden sacrificar la consistencia inmediata por disponibilidad y tolerancia a particiones (teorema CAP).

- **Complejidad:** Pueden ser más difíciles de gestionar y consultar que las bases de datos relacionales.

### Ejemplos de sistemas

- MongoDB (Documentos)

- Cassandra (Columnas)

- Redis (Clave-Valor)

- Neo4j (Grafos)

## Comparación

| Modelo              | Estructura | Flexibilidad | Escalabilidad | Complejidad |
| ------------------- | ---------- | ------------ | ------------- | ----------- |
| Relacional          | Tablas     | Alta         | Moderada      | Baja        |
| Jerárquico          | Árbol      | Baja         | Baja          | Media       |
| Red                 | Grafo      | Media        | Media         | Alta        |
| Orientado a Objetos | Objetos    | Alta         | Alta          | Alta        |
| NoSQL               | Variada    | Muy alta     | Muy alta      | Media       |
