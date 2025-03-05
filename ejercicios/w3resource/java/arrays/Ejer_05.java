public class Ejer_05 {
    public static void main(String[] args) {
        // Write a Java program to test if an array contains a specific value.
        int[] numbers = {33, 54, 78, 90, 22, 10, 41};
        int special = 9;

        System.out.println(contains(numbers, special));
    }

    public static boolean contains(int[] numbers, int special) {
        for (int n : numbers) {
            if (special == n) {
                return true;
            }
        }
        return false;
    }
}
