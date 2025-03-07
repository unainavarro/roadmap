/*
Write a Java program to round up integer division results.
*/
public class Ejer_01 {
    public static void main(String[] args) {
        int numerador = 7;
        int denominador = 3;

        int resultado = (int) Math.ceil((double) numerador / denominador);
        System.out.println("resultado = " + resultado);
    }

}
