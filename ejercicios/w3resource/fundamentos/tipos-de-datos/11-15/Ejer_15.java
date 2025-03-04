package type;

public class Ejer_15 {
    public static void main(String[] args) {
        /*
        Next Floating-Point Adjacent to Infinity
        Write a Java program to get the next floating-point adjacent to
        positive and negative infinity from a given floating/double number.
         */
        double number = 1.0;

        // Valor siguiente hacia positivo infinito
        double nextToPositiveInfinity = Math.nextAfter(number, Double.POSITIVE_INFINITY);

        // Valor siguiente hacia negativo infinito
        double nextToNegativeInfinity = Math.nextAfter(number, Double.NEGATIVE_INFINITY);

        System.out.println("Número inicial: " + number);
        System.out.println("Siguiente valor hacia positivo infinito: " + nextToPositiveInfinity);
        System.out.println("Siguiente valor hacia negativo infinito: " + nextToNegativeInfinity);


    }
}
