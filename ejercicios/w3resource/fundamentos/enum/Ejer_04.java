package enumeradores;

public class Ejer_04 {
    public static void main(String[] args) {
        /*
        Write a Java program to implement an enum called "Direction" with
        constants representing the cardinal directions (North, South, East, West).
         */
        enum Direction {
            NORTH,
            SOUTH,
            EAST,
            WEST
        }

        System.out.println("First: " + Direction.NORTH);
        System.out.println("Last: " + Direction.WEST);

    }
}
