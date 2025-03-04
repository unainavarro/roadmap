package type;

public class Ejer_11 {
    public static void main(String[] args) {
        /*
        Check Finite Floating-Point Value
        Write a Java program to test whether a given double/float value is a finite floating-point value or not
         */
        double doubleValue = 123.45;
        float floatValue = 10.0f;
        double infiniteValue = Double.POSITIVE_INFINITY;
        double nanValue = Double.NaN;

        System.out.println("¿El valor " + doubleValue + " es finito? " + Double.isFinite(doubleValue));
        System.out.println("¿El valor " + floatValue + " es finito? " + Float.isFinite(floatValue));
        System.out.println("¿El valor infinito es finito? " + Double.isFinite(infiniteValue));
        System.out.println("¿El valor NaN es finito? " + Double.isFinite(nanValue));
    }
}
