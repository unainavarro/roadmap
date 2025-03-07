import java.io.File;

/*
Write a Java program to check if a file or directory has read and write permissions.
 */
public class Ejer_04 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Desktop\\pruebas");

        if (file.exists()) {
            System.out.println("Read permission: " + file.canRead());
            System.out.println("Write permission: " + file.canWrite());
        } else {
            System.out.println("The file/directory does not exist.");
        }
    }
}
