package basic.part1;

import java.util.Scanner;

public class Ejer_10 {
    public static void main(String[] args) {
        /*
        Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n1 = sc.nextInt();
        System.out.println("Introduce otro numero");
        int n2 = sc.nextInt();
        System.out.println("Introduce el último numero");
        int n3 = sc.nextInt();

        System.out.println("Average = " + ((double) (n1 + n2 + n3) / 3));
    }
}
