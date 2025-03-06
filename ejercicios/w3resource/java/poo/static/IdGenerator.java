/*
Write a Java program to create a class called "IDGenerator"
with a static variable 'nextID' and a static method "generateID()"
that returns the next ID and increments 'nextID'.
Demonstrate the usage of generateID in the main method.
 */
public class IdGenerator {
    private static int nextID = 1;

    public static int generateID() {
        return nextID++;
    }

    public static void main(String[] args) {
        System.out.println("Generated ID: " + IdGenerator.generateID());
        System.out.println("Generated ID: " + IdGenerator.generateID());
        System.out.println("Generated ID: " + IdGenerator.generateID());
        System.out.println("Generated ID: " + IdGenerator.generateID());
    }
}
