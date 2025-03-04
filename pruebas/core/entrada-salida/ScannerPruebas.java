package core.io;

import java.util.Scanner;

public class ScannerPruebas {
    public static void main(String[] args) {
        /*
        Crea un programa que:
        Solicite al usuario su nombre, edad, y ciudad de residencia utilizando los métodos nextLine() y nextInt().
        Imprima esta información en formato: "Hola, soy [nombre], tengo [edad] años y vivo en [ciudad]."
        Recuerda manejar el problema del salto de línea después de usar nextInt()
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce tu ciudad");
        String ciudad = sc.nextLine();

        System.out.printf("Hola, soy %s, tengo %d años y vivo en %s", nombre, edad, ciudad);

        sc.close();
    }
}
