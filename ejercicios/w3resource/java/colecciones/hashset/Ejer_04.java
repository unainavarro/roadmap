import java.util.HashSet;

/*
Write a Java program to empty and hash set.
 */
public class Ejer_04 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Element1");
        set.add("Element2");
        set.add("Element3");

        set.clear();

        System.out.println("HashSet after clearing: " + set);
    }
}
