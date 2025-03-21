<h1 align="center">Hilos</h1>

<h2>📑 Contenido</h2>

- [Hilos](#hilos)
- [¿Qué es un hilo?](#qué-es-un-hilo)
  - [Hilos vs. Procesos](#hilos-vs-procesos)
- [Creación de hilos](#creación-de-hilos)
  - [Extendiendo la clase Thread](#extendiendo-la-clase-thread)
  - [Implementando la interfaz Runnable](#implementando-la-interfaz-runnable)
  - [Uso de expresiones lambda](#uso-de-expresiones-lambda)
- [Estados de un hilo](#estados-de-un-hilo)
- [Sincronización de hilos](#sincronización-de-hilos)
  - [Uso de synchronized](#uso-de-synchronized)
  - [Uso de ReentrantLock](#uso-de-reentrantlock)
- [Comunicación entre hilos](#comunicación-entre-hilos)
- [Buenas prácticas](#buenas-prácticas)

## Hilos

Los hilos (threads) son una de las características más importantes de Java para la programación concurrente. Permiten ejecutar múltiples tareas simultáneamente, lo que puede mejorar el rendimiento y la capacidad de respuesta de las aplicaciones.

## ¿Qué es un hilo?

Un hilo es la unidad más pequeña de ejecución dentro de un proceso. Un proceso puede tener múltiples hilos, y todos comparten el mismo espacio de memoria y recursos. Los hilos permiten realizar tareas en paralelo, lo que es especialmente útil en aplicaciones que requieren multitarea, como servidores, interfaces gráficas y procesamiento de datos.

```java
public class HiloBasico {
    public static void main(String[] args) {
        // Crear un hilo
        Thread hilo = new Thread(() -> {
            System.out.println("Hilo en ejecución");
        });

        // Iniciar el hilo
        hilo.start();
    }
}
```

### Hilos vs. Procesos

- **Proceso:** Un programa en ejecución con su propio espacio de memoria.

- **Hilo:** Una unidad de ejecución dentro de un proceso, que comparte memoria y recursos con otros hilos del mismo proceso.

## Creación de hilos

En Java, hay dos formas principales de crear hilos:

### Extendiendo la clase Thread

```java
class MiHilo extends Thread {
    public void run() {
        System.out.println("Hilo en ejecución");
    }
}

public class ExtendThreadExample {
    public static void main(String[] args) {
        MiHilo hilo = new MiHilo();
        hilo.start();
    }
}
```

---

### Implementando la interfaz Runnable

```java
class MiRunnable implements Runnable {
    public void run() {
        System.out.println("Hilo en ejecución");
    }
}

public class ImplementRunnableExample {
    public static void main(String[] args) {
        Thread hilo = new Thread(new MiRunnable());
        hilo.start();
    }
}
```

---

### Uso de expresiones lambda

Desde Java 8, puedes usar expresiones lambda para implementar Runnable de manera más concisa:

```java
public class LambdaThreadExample {
    public static void main(String[] args) {
        Thread hilo = new Thread(() -> {
            System.out.println("Hilo en ejecución");
        });
        hilo.start();
    }
}
```

---

## Estados de un hilo

Un hilo puede estar en uno de los siguientes estados:

- **Nuevo (New):** El hilo ha sido creado pero no iniciado.

- **Ejecutable (Runnable):** El hilo está listo para ejecutarse, pero el planificador no lo ha seleccionado.

- **En ejecución (Running):** El hilo está siendo ejecutado.

- **Bloqueado (Blocked):** El hilo está esperando por un recurso.

- **Esperando (Waiting):** El hilo está esperando indefinidamente por otro hilo.

- **Tiempo de espera (Timed Waiting):** El hilo está esperando por un tiempo específico.

- **Terminado (Terminated):** El hilo ha terminado su ejecución.

## Sincronización de hilos

Cuando múltiples hilos acceden a recursos compartidos, puede ocurrir una condición de carrera. Para evitar esto, Java proporciona mecanismos de sincronización.

### Uso de synchronized

```java
class Contador {
    private int cuenta = 0;

    public synchronized void incrementar() {
        cuenta++;
    }

    public int getCuenta() {
        return cuenta;
    }
}

public class SincronizacionExample {
    public static void main(String[] args) {
        Contador contador = new Contador();

        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contador.incrementar();
            }
        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contador.incrementar();
            }
        });

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cuenta final: " + contador.getCuenta());
    }
}
```

---

### Uso de ReentrantLock

```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Contador {
    private int cuenta = 0;
    private Lock lock = new ReentrantLock();

    public void incrementar() {
        lock.lock();
        try {
            cuenta++;
        } finally {
            lock.unlock();
        }
    }

    public int getCuenta() {
        return cuenta;
    }
}
```

---

## Comunicación entre hilos

Los hilos pueden comunicarse entre sí mediante métodos como `wait()`, `notify()` y `notifyAll()`.

```java
class Buffer {
    private int dato;
    private boolean disponible = false;

    public synchronized void poner(int valor) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dato = valor;
        disponible = true;
        notifyAll();
    }

    public synchronized int tomar() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        disponible = false;
        notifyAll();
        return dato;
    }
}

public class ComunicacionHilosExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread productor = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                buffer.poner(i);
                System.out.println("Productor pone: " + i);
            }
        });

        Thread consumidor = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                int valor = buffer.tomar();
                System.out.println("Consumidor toma: " + valor);
            }
        });

        productor.start();
        consumidor.start();
    }
}
```

## Buenas prácticas

- **Evita el bloqueo de hilos:** Usa mecanismos de sincronización adecuados para evitar deadlocks.

- **Minimiza la contención de hilos:** Reduce la cantidad de tiempo que los hilos pasan en estado bloqueado.

- **Usa ExecutorService para gestionar hilos:** Proporciona un nivel de abstracción más alto para la gestión de hilos.
