package basic.part1;

import java.util.Scanner;

public class Ejer_06 {
    public static void main(String[] args) {
        /*
        Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int firstNumber = sc.nextInt();
        System.out.println("Introduce otro numero");
        int secondNumber = sc.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        System.out.println(firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
    }
}
