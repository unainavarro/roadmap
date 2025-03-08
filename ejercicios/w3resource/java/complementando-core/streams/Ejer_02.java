import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Write a Java program to convert a list of strings to uppercase or lowercase using streams.
 */
public class Ejer_02 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Teclado", "Ratón", "Torre", "Monitor");

        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase: " + upperCaseStrings);

        List<String> lowerCaseStrings = strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("Lowercase: " + lowerCaseStrings);
    }
}
