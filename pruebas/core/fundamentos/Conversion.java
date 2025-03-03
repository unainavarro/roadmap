package core.fundamentos;

import java.awt.geom.QuadCurve2D;

public class Conversion {

    public static void main(String[] args) {
        //Conversion implícita de int a double
        int entero = 10;
        double decimal = entero;
        System.out.println(decimal);

        //Conversion explicita de double a int
        double d = 10.6;
        System.out.println((int) d);

        /*
        Tienes un número representado como un String, por ejemplo "1234".
        Convierte este número a un tipo primitivo int para realizar una suma con otro número.
        Después, convierte el resultado final de la suma de nuevo a un String.
        */
        String cadena = "1234";
        int numero = 10;
        System.out.println(Integer.parseInt(cadena) + numero);
    }
}
