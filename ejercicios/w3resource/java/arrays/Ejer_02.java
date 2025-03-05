public class Ejer_02 {
    public static void main(String[] args) {
        /*
        Write a Java program to sum values of an array.
         */
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Total: " + sum);
    }
}
