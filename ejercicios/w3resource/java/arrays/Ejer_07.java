public class Ejer_07 {
    public static void main(String[] args) {
        // Write a Java program to remove a specific element from an array.
        // Array original
        int[] numbers = {10, 20, 30, 40, 50};
        int elementToRemove = 30;

        // Contar el tamaño del nuevo array (excluyendo el elemento a eliminar)
        int count = 0;
        for (int number : numbers) {
            if (number != elementToRemove) {
                count++;
            }
        }

        // Crear un nuevo array con el tamaño ajustado
        int[] numbersNew = new int[count];
        int index = 0;

        // Copiar elementos al nuevo array, excluyendo el elemento a eliminar
        for (int number : numbers) {
            if (number != elementToRemove) {
                numbersNew[index++] = number;
            }
        }

        // Mostrar el nuevo array
        System.out.print("Nuevo array: ");
        for (int number : numbersNew) {
            System.out.print(number + " ");
        }
    }

    /*
    Forma de w3resources
        // The main method where the program execution starts.
    public static void main(String[] args) {
        // Declare and initialize an integer array 'my_array'.
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        // Print the original array using Arrays.toString() method.
        System.out.println("Original Array : " + Arrays.toString(my_array));

        // Define the index of the element to be removed (second element, index 1, value 14).
        int removeIndex = 1;

        // Loop to remove the element at the specified index.
        for (int i = removeIndex; i < my_array.length - 1; i++) {
            my_array[i] = my_array[i + 1];
        }

        // Print the modified array after removing the second element.
        System.out.println("After removing the second element: " + Arrays.toString(my_array));
    }
     */
}

