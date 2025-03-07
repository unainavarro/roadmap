import java.io.File;

/*
Write a Java program to check if the given pathname is a directory or a file.
 */
public class Ejer_05 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Desktop\\pruebas");

        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("The path refers to a directory.");
            } else if (file.isFile()) {
                System.out.println("The path refers to a file.");
            }
        } else {
            System.out.println("The file/directory does not exist.");
        }
    }
}
