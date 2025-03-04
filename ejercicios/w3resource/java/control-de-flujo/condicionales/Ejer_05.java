import java.util.Scanner;

public class Ejer_05 {
    public static void main(String[] args) {
        /*
        Write a Java program that takes a number from the user and generates an integer between 1 and 7.
        It displays the weekday name.
        Test Data
        Input number: 3
        Expected Output :
        Wednesday
         */
        int number = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un numero entre el 1-7");
            number = sc.nextInt();
        } while (number < 1 || number > 7);

        String day = switch (number) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día no valido";
        };

        System.out.println(day);
    }
}
