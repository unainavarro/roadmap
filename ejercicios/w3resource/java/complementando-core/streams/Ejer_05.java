import java.util.Arrays;
import java.util.List;

/*
Write a Java program to count the number of strings in a list that start with a specific letter using streams.
 */
public class Ejer_05 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apricot", "orange", "avocado");

        long count = strings.stream()
                .filter(s -> s.startsWith("a"))
                .count();
        System.out.println("Number of strings starting with 'a': " + count);
    }
}
