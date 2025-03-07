import java.io.File;

/*
Write a Java program to check if a file or directory specified by pathname exists or not
 */
public class Ejer_03 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Desktop\\pruebas");

        if (file.exists()) {
            System.out.println("The file/directory exists.");
        } else {
            System.out.println("The file/directory does not exist.");
        }
    }
}
