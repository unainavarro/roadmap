import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Write a Java program to remove all duplicate elements from a list using streams.
 */
public class Ejer_04 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        List<String> uniqueStrings = strings.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("uniqueStrings: " + uniqueStrings);
    }
}
