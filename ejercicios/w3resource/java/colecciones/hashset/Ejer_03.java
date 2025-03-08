import java.util.HashSet;

/*
Write a Java program to get the number of elements in a hash set.
 */
public class Ejer_03 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Element1");
        set.add("Element2");
        set.add("Element3");

        int size = set.size();
        System.out.println("Number of elements in HashSet: " + size);
    }
}
