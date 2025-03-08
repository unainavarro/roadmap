import java.util.HashSet;

/*
Write a Java program to iterate through all elements in a hash list.
 */
public class Ejer_02 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Element1");
        set.add("Element2");
        set.add("Element3");

        for (String element : set) {
            System.out.println(element);
        }
    }
}
