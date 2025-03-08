<h1 align="center">Serialización</h1>

<h2>📑 Contenido</h2>

- [Serialización](#serialización)
- [¿Qué es la serialización?](#qué-es-la-serialización)
- [Interfaz Serializable](#interfaz-serializable)
- [Serialización de objetos](#serialización-de-objetos)
- [Deserialización de objetos](#deserialización-de-objetos)
- [Control de la serialización](#control-de-la-serialización)
- [Interfaz Externalizable](#interfaz-externalizable)
- [Buenas prácticas](#buenas-prácticas)

## Serialización

La serialización es el proceso de convertir un objeto en una secuencia de bytes para que pueda ser almacenado en un archivo, enviado a través de una red o guardado en una base de datos. La deserialización es el proceso inverso, donde una secuencia de bytes se convierte de nuevo en un objeto. Java proporciona un mecanismo integrado para la serialización y deserialización a través de las interfaces `Serializable` y `Externalizable`.

## ¿Qué es la serialización?

La serialización es el proceso de convertir un objeto en una secuencia de bytes. Este proceso es útil para:

- **Almacenamiento persistente:** Guardar el estado de un objeto en un archivo.

- **Comunicación en red:** Enviar objetos a través de una red.

- **Caché en memoria:** Almacenar objetos en memoria para su uso posterior.

## Interfaz Serializable

Para que un objeto sea serializable en Java, su clase debe implementar la interfaz `java.io.Serializable`. Esta interfaz es un marcador (no tiene métodos) que indica que la clase puede ser serializada.

```java
import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }
}
```

## Serialización de objetos

Para serializar un objeto, se utiliza la clase `ObjectOutputStream`. Este proceso convierte el objeto en una secuencia de bytes que puede ser escrita en un archivo o enviada a través de una red.

```java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializacionExample {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);

        try (FileOutputStream fileOut = new FileOutputStream("persona.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(persona);
            System.out.println("Objeto serializado y guardado en persona.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
```

## Deserialización de objetos

Para deserializar un objeto, se utiliza la clase `ObjectInputStream`. Este proceso convierte una secuencia de bytes de nuevo en un objeto.

```java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializacionExample {
    public static void main(String[] args) {
        Persona persona = null;

        try (FileInputStream fileIn = new FileInputStream("persona.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            persona = (Persona) in.readObject();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Clase Persona no encontrada");
            c.printStackTrace();
        }

        System.out.println("Objeto deserializado:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
```

## Control de la serialización

En algunos casos, es necesario controlar el proceso de serialización y deserialización. Esto se puede hacer implementando los métodos `writeObject` y `readObject` en la clase serializable.

```java
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private transient int edad; // No se serializa

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(edad); // Serializar edad manualmente
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        edad = in.readInt(); // Deserializar edad manualmente
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }
}
```

## Interfaz Externalizable

La interfaz Externalizable es una extensión de `Serializable` que permite un control más fino sobre el proceso de serialización y deserialización. Requiere la implementación de los métodos `writeExternal` y `readExternal`.

```java
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Persona implements Externalizable {
    private String nombre;
    private int edad;

    public Persona() {
        // Constructor sin argumentos necesario para Externalizable
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(nombre);
        out.writeInt(edad);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        nombre = (String) in.readObject();
        edad = in.readInt();
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }
}
```

## Buenas prácticas

- **Usa serialVersionUID:** Define un `serialVersionUID` en las clases serializables para evitar problemas de compatibilidad.

- **Evita serializar datos sensibles:** No serialices información sensible como contraseñas.

- **Considera alternativas:** Para objetos complejos o grandes, considera usar formatos como JSON o XML.
