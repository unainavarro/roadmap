public class Ejer_03 {
    public static void main(String[] args) {
        /*
        Write a Java program to print the following grid.
        Expected Output :
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
         */
        int rows = 10;
        int columns = 10;
        char[][] grid = new char[rows][columns];

        // Rellenar el array con el carácter '-'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = '-';
            }
        }

        // Imprimir el contenido del array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println(); // Pasar a la siguiente línea después de cada fila
        }
    }
}
