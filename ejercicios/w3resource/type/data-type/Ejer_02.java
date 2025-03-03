package type;

import java.util.Scanner;

public class Ejer_02 {
    public static void main(String[] args) {
        /*
        Write a Java program that reads a number in inches and converts it to meters.
        Note: One inch is 0.0254 meter.
        Test Data
        Input a value for inch: 1000
        Expected Output:
        1000.0 inch is 25.4 meters
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int number = sc.nextInt();

        System.out.println((double) number * 0.0254);
    }
}
