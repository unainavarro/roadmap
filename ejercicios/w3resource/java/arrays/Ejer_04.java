public class Ejer_04 {
    public static void main(String[] args) {
        /*
        Write a Java program to calculate the average value of array elements.
         */
        int[] numbers = {6, 7, 9};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        System.out.println("Average: " + (sum / (double) numbers.length));
    }
}
