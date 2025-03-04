package type;

public class Ejer_12 {
    public static void main(String[] args) {
        /*
        Compare Signed and Unsigned Numbers
        Write a Java program to compare two signed and unsigned numbers.
        Creo que hay que comparar un numero positivo con uno negativo.
         */
        int signed = -10;
        int unSigned = 10;
        int compareNumbers = Integer.compare(signed, unSigned);

        if (compareNumbers == -1) {
            System.out.println("El primer numero es menor");
        } else if (compareNumbers == 1) {
            System.out.println("El segundo numero es mayor");
        } else {
            System.out.println("SOn iguales");
        }

        // Otra forma
        switch (compareNumbers) {
            case -1 -> System.out.println("El primer número es menor");
            case 1 -> System.out.println("El segundo número es mayor");
            case 0 -> System.out.println("Son iguales");
        }


    }
}
