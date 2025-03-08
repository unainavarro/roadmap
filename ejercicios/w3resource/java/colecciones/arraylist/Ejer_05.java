import java.util.ArrayList;

/*
Write a Java program to update an array element by the given element.
 */
public class Ejer_05 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        colors.set(1, "Purple");

        System.out.println("Updated Colors: " + colors);
    }
}
