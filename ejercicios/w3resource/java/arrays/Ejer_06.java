public class Ejer_06 {
    public static void main(String[] args) {
        // Write a Java program to find the index of an array element.
        int[] numbers = {10, 20, 30, 40, 50};
        int elementToFind = 30;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == elementToFind) {
                System.out.println("El índice es: " + i);
                return;
            }
        }

        System.out.println("El elemento no está en el array");
    }
}
