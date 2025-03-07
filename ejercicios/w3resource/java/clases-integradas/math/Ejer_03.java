/*
Write a Java program to test if a double number is an integer.
*/
public class Ejer_03 {
    public static void main(String[] args) {
        double number = 5.0;

        if (number == Math.floor(number)) {
            System.out.println("Entero");
        } else {
            System.out.println("No es entero");
        }
    }
}
