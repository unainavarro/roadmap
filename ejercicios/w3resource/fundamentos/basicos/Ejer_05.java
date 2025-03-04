package basic.part1;

import java.util.Scanner;

public class Ejer_05 {
    public static void main(String[] args) {
        /*
        Write a Java program that takes two numbers as input and displays the product of two numbers.
        Test Data:
        Input first number: 25
        Input second number: 5
        Expected Output :
        25 x 5 = 125
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int firstNumber = sc.nextInt();
        System.out.println("Introduce otro numero");
        int secondNumber = sc.nextInt();

        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
    }
}
