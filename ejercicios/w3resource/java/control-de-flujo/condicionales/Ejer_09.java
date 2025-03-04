import java.util.Scanner;

public class Ejer_09 {
    public static void main(String[] args) {
        /*
        Write a Java program that takes a year from the user and prints whether it is a leap year or not.
        Test Data
        Input the year: 2016
        Expected Output :
        2016 is a leap year
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = scanner.nextInt();

        boolean isLeapYear;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
