import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
*/
public class Ejer_05 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry", "date");

        // Sort strings in alphabetical order
        List<String> sortedStrings = strings.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted strings: " + sortedStrings);
    }
}
