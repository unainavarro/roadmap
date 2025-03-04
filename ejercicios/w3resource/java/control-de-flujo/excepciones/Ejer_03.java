import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejer_03 {
    public static void main(String[] args) {
        try {
            readFile("example.txt");  // Cambia "example.txt" al nombre del archivo que deseas leer
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException("The file " + filename + " was not found.");
        }

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}

