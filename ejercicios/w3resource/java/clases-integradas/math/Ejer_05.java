import java.util.HashSet;

/*
Write a Java program to count the absolute distinct value in an array.
*/
public class Ejer_05 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -2, 3, 1};

        HashSet<Integer> absValues = new HashSet<>();
        for (int num : arr) {
            absValues.add(Math.abs(num));
        }

        System.out.println("Número de valores absolutos distintos: " + absValues.size());
    }
}
