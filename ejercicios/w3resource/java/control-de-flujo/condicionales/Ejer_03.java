import java.util.Scanner;

public class Ejer_03 {
    public static void main(String[] args) {
        /*
        Write a Java program that takes three numbers from the user and prints the greatest number.
        Test Data
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
        Expected Output :
        The greatest: 87
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = sc.nextInt();

        int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }if (num3 > greatest) {
            greatest = num3;
        }

        System.out.println("El más alto " + greatest);

        System.out.println("----Sin if----");
        System.out.println(Math.max(num1, Math.max(num2, num3)));
        sc.close();
    }
}
