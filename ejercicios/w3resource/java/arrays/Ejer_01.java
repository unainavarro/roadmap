import java.util.Arrays;

public class Ejer_01 {
    public static void main(String[] args) {
        /*
        Write a Java program to sort a numeric array and a string array.
         */
        int[] numbers = {100, 2, 33, 404, 5};
        String[] str = {"Tomates", "Lechuga", "Cebolla", "Bonito"};

        System.out.println("Numbers");
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\nStrings");
        Arrays.sort(str);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
