package type;

public class Ejer_01 {
    public static void main(String[] args) {
        /*
        Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
        Test Data
        Input a degree in Fahrenheit: 212
        Expected Output:
        212.0 degree Fahrenheit is equal to 100.0 in Celsius
         */
        int fahrenheit = 212;
        System.out.println((double) (fahrenheit-32) * 5/9);
    }
}
