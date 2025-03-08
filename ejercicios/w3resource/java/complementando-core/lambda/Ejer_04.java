import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
*/
public class Ejer_04 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("evenNumbers = " + evenNumbers);

        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("oddNumbers = " + oddNumbers);
    }
}
