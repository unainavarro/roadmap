import java.util.HashSet;

/*
Write a Java program to test if a hash set is empty or not.
 */
public class Ejer_05 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Element1");
        set.add("Element2");

        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);

        set.clear();
        isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty after clearing? " + isEmpty);
    }
}
