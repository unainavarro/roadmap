/*
Write a Java program to insert an element into the array list at the first position.
*/

import java.util.ArrayList;

public class Ejer_03 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        colors.add(0, "Pink");

        System.out.println("Colors: " + colors);
    }
}
