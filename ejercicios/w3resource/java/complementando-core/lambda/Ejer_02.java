import java.util.function.Predicate;

/*
Write a Java program to implement a lambda expression to check if a given string is empty.
*/
public class Ejer_02 {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("Is string empty? " + isEmpty.test(""));
    }
}
