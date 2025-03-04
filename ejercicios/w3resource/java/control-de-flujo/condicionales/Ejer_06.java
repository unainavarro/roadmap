import java.util.Scanner;

public class Ejer_06 {
    public static void main(String[] args) {
        /*
        Write a Java program that reads two floating-point numbers and tests
        whether they are the same up to three decimal places.
        Test Data
        Input floating-point number: 25.586
        Input floating-point another number: 25.589
        Expected Output :
        They are different
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input floating-point another number: ");
        double num2 = scanner.nextDouble();

        num1 = Math.round(num1 * 1000);
        num2 = Math.round(num2 * 1000);

        if (num1 == num2) {
            System.out.println("They are the same up to three decimal places.");
        } else {
            System.out.println("They are different.");
        }


    }
}
