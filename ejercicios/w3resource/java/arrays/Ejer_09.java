public class Ejer_09 {
    public static void main(String[] args) {
        // Write a Java program to insert an element (specific position) into an array.
        int[] numbers = {1, 2, 3, 4, 5};
        int[] newArray = new int[numbers.length + 1];
        int elementToInsert = 10;
        int position = 2;

        for (int i = 0; i < position; i++) {
            newArray[i] = numbers[i];
        }
        newArray[position] = elementToInsert;

        for (int i = position; i < numbers.length; i++) {
            newArray[i + 1] = numbers[i];
        }

        System.out.print("Array después de inserción: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
