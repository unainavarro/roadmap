package basic.part1;

public class Ejer_09 {
    public static void main(String[] args) {
        /*
        Write a Java program to print the area and perimeter of a circle.
        Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586
         */
        final double RADIUS = 7.5;

        System.out.println("Perimeter is = " + (2 * Math.PI * RADIUS));
        System.out.println("Area is = " + (Math.PI * Math.pow(RADIUS,2)));
    }
}
