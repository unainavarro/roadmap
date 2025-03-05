public class Ejer_08 {
    public static void main(String[] args) {
        // Write a Java program to copy an array by iterating the array.
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.print("Copia: ");
        for (int element : copy) {
            System.out.print(element + " ");
        }
    }
}
