package type;

public class Ejer_08 {
    public static void main(String[] args) {
        /*
        Write a Java program that reads a number and displays the square, cube, and fourth power.
        Expected Output:
        Square: .2f
        Cube: .2f
        Fourth power: 50625.00
         */
        double number = 15;

        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);


        System.out.printf("Square: %.2f%n", square);
        System.out.printf("Cube: %.2f%n", cube);
        System.out.printf("Fourth power: %.2f%n", fourthPower);
    }
}
