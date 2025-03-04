public class Ejer_04 {
    public static void main(String[] args) {
        /*
        Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
        Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,
        or "large" if it exceeds 1,000,000.
        Test Data
        Input a number: 25
        Expected Output :
        Input value: 25
        Positive number
         */
        double numero = 25.0;
        String salida = "Valor de entrada: " + numero + "\n";

        if (numero == 0) {
            salida += "Número cero";
        } else {
            if (numero > 0) {
                salida += "Número positivo";
            } else {
                salida += "Número negativo";
            }

            if (Math.abs(numero) < 1) {
                salida += " (pequeño)";
            } else if (Math.abs(numero) > 1000000) {
                salida += " (grande)";
            }
        }

        System.out.println(salida);
    }
}
