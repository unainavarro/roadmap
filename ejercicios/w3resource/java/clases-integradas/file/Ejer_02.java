import java.io.File;

/*
Write a Java program to get specific files with extensions from a specified folder.
 */
public class Ejer_02 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\user\\Desktop\\pruebas");
        String extension = ".txt"; // Change this to your desired file extension.

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles((dir, name) -> name.endsWith(extension));

            System.out.println("Files with " + extension + " extension:");
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("The specified path is not a valid directory.");
        }
    }
}
