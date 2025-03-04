import java.util.Scanner;

public class Ejer_08 {
    public static void main(String[] args) {
        /*
        Write a Java program that requires the user to enter a single character from the alphabet.
        Print Vowel or Consonant, depending on user input.
        If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
        Test Data
        Input an alphabet: p
        Expected Output :
        Input letter is Consonant
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scanner.next();

        // Verificar si la entrada es un único carácter y es una letra
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Input is not a single alphabet character.");
        } else {
            char ch = Character.toLowerCase(input.charAt(0));

            // Verificar si es una vocal o consonante
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Input letter is Vowel.");
            } else {
                System.out.println("Input letter is Consonant.");
            }

        }
    }
}
