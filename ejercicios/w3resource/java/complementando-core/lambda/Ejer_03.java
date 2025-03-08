import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
*/
public class Ejer_03 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello","word","Java");

        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("upperCaseStrings = " + upperCaseStrings);

        List<String> lowerCaseStrings = strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("lowerCaseStrings = " + lowerCaseStrings);
    }
}
