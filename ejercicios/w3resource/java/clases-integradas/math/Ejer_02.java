/*
Write a Java program to get whole and fractional parts from a double value.
*/
public class Ejer_02 {
    public static void main(String[] args) {
        double number = 7.45;

        int wholePart = (int) number;
        double fractionalPart = number - wholePart;

        System.out.println("Parte entera = " + wholePart);
        System.out.println("Parte fraccionaria = " + fractionalPart);
    }
}
