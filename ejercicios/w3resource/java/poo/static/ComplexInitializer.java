/*
Write a Java program to create a class called "ComplexInitializer"
with a static block that initializes multiple static variables (x, y, z) using complex logic.
Print the values of these variables in the main method.
 */
public class ComplexInitializer {
    private static int x;
    private static int y;
    private static int z;

    static {
        x = 10;
        y = 20;
        z = x + y;
        System.out.println("Valores del bloque static x = " + x + ", y = " + y + ", z = " + z);
    }

    public static void main(String[] args) {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }
}
