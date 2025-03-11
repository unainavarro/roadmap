<h1 align="center">Principios Básicos</h1>

<h2>📑 Contenido</h2>

- [Principios básicos](#principios-básicos)
- [Principios básicos del ORM](#principios-básicos-del-orm)
  - [Mapeo Objeto-Relacional](#mapeo-objeto-relacional)
  - [Anotaciones y configuración](#anotaciones-y-configuración)
- [Operaciones CRUD](#operaciones-crud)
- [Gestión de Transacciones](#gestión-de-transacciones)

## Principios básicos

El ORM (Object-Relational Mapping) es una técnica que permite mapear objetos de un lenguaje de programación (como Java) a tablas de una base de datos relacional. Este enfoque simplifica el acceso a la base de datos al eliminar la necesidad de escribir consultas SQL manuales y gestionar la conversión entre objetos y registros de la base de datos

## Principios básicos del ORM

### Mapeo Objeto-Relacional

El núcleo del ORM es el mapeo entre objetos y tablas. Cada clase en la aplicación representa una tabla en la base de datos, y cada instancia de la clase representa una fila en esa tabla.

Ejemplo:

- **Clase Java:** Empleado

- **Tabla en la base de datos:** empleados

- **Atributos de la clase:** id, nombre, salario

- **Columnas de la tabla:** id, nombre, salario

### Anotaciones y configuración

En frameworks ORM como Hibernate o JPA, el mapeo se define mediante anotaciones en las clases Java o mediante archivos de configuración XML.

```java
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private double salario;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
```

## Operaciones CRUD

El ORM facilita las operaciones básicas de **Crear**, **Leer**, **Actualizar** y **Eliminar** (CRUD) mediante métodos simples.

```java
// Crear (Create):
Empleado empleado = new Empleado();
empleado.setNombre("Juan Pérez");
empleado.setSalario(3000.00);
em.persist(empleado); // Guardar en la base de datos

// Leer (Read):
Empleado empleado = em.find(Empleado.class, 1); // Buscar por ID

// Actualizar (Update):
Empleado empleado = em.find(Empleado.class, 1);
empleado.setSalario(3500.00);

// Eliminar (Delete):
Empleado empleado = em.find(Empleado.class, 1);
em.remove(empleado); // Eliminar de la base de datos
```

## Gestión de Transacciones

El ORM gestiona las transacciones de manera automática o manual, asegurando que las operaciones se completen de manera atómica.

```java
em.getTransaction().begin(); // Iniciar transacción
em.persist(empleado);        // Operación de persistencia
em.getTransaction().commit(); // Confirmar transacción
```
