import java.util.ArrayList;

/*
Write a Java program to iterate through all elements in an array list
 */
public class Ejer_02 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
