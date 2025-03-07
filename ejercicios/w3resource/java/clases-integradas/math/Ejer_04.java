/*
Write a Java program to round a float number to specified decimals.
*/
public class Ejer_04 {
    public static void main(String[] args) {
        float number = 5.6789f;
        int decimals = 2;

        float rounded = (float) (Math.round(number * Math.pow(10, decimals)) / Math.pow(10, decimals));
        System.out.println("Número redondeado: " + rounded);
    }
}
