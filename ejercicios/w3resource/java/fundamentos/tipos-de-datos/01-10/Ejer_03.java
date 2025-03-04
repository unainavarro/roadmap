package type;

import java.util.Scanner;

public class Ejer_03 {
    public static void main(String[] args) {
        /*
        Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
        Test Data
        Input an integer between 0 and 1000: 565
        Expected Output :
        The sum of all digits in 565 is 16
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 1000) {
            System.out.println("Invalid input! Please enter a number between 0 and 1000.");
        } else {
            int sum = 0;

            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }


            System.out.println("The sum of all digits is: " + sum);
        }
    }
}
