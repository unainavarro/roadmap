import java.util.HashSet;

/*
Write a Java program to append the specified element to the end of a hash set.
 */
public class Ejer_01 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Elemento 1");
        set.add("Elemento 2");
        set.add("Elemento 3");

        System.out.println("set = " + set);
    }
}
