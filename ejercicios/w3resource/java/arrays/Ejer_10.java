public class Ejer_10 {
    public static void main(String[] args) {
        // Write a Java program to find the maximum and minimum value of an array.
        int[] numbers = {12, 3, 7, 19, 4, 25, 10};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
