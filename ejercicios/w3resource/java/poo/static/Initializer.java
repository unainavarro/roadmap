/*
Write a Java program to create a class called "Initializer"
with a static block that initializes a static variable 'initialValue' to 1000.
Print the value of 'initialValue' before and after creating an instance of "Initializer".
 */
public class Initializer {
    private static int initialValue;

    // Bloque estático
    static {
        initialValue = 1000;
        System.out.println("Valor inicial static block: " + initialValue);
    }

    public Initializer() {
        System.out.println("Initializer instance creada.");
    }

    public static void main(String[] args) {
        System.out.println("Antes de inicializar la instancia " + Initializer.initialValue);

        Initializer initializer = new Initializer();
        System.out.println("Después de crear la instancia " + Initializer.initialValue);
    }
}
