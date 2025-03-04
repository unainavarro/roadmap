package type;

import java.util.Scanner;

public class Ejer_09 {
    public static void main(String[] args) {
        /*
        Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average,
        the distance (the difference between the integers), the maximum (the largest of the two integers),
        and the minimum (the smallest of the two integers).
        Test Data
        Input 1st integer: 25
        Input 2nd integer: 5
        Expected Output :
        Sum of two integers: 30
        Difference of two integers: 20
        Product of two integers: 125
        Average of two integers: 15.00
        Distance of two integers: 20
        Max integer: 25
        Min integer: 5
         */
        int firstNumber = 25;
        int secondNumber = 5;

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double average = (firstNumber + secondNumber) / 2.0;
        int distance = Math.abs(firstNumber - secondNumber);
        int max = Math.max(firstNumber, secondNumber);
        int min = Math.min(firstNumber, secondNumber);


        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + difference);
        System.out.println("Product of two integers: " + product);
        System.out.printf("Average of two integers: %.2f%n", average);
        System.out.println("Distance of two integers: " + distance);
        System.out.println("Max integer: " + max);
        System.out.println("Min integer: " + min);
    }
}
