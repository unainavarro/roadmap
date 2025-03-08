import java.util.Arrays;
import java.util.List;

/*
Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
 */
public class Ejer_03 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sumEven: " + sumEven);

        int sumOdd = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sumOdd: " + sumOdd);
    }
}
