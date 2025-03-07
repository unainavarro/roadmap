import java.io.File;

/*
Write a Java program to get a list of all file/directory names in the given directory.
 */
public class Ejer_01 {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\user\\Desktop\\pruebas");

        if (directory.exists() && directory.isDirectory()) {
            String[] files = directory.list();

            System.out.println("Files and directories in the specified path:");
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("The specified path is not a valid directory.");
        }
    }
}
