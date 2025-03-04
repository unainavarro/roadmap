public class Ejer_02 {
    /*
    Write a Java program to create a method that takes an integer as a parameter and throws
    an exception if the number is odd.
     */
    public static void main(String[] args) {
        int n = 20;
        tryNumber(n);

        n = 7;
        tryNumber(n);
    }

    public static void tryNumber(int n) {
        try {
            checkEvenNumber(n);
            System.out.println(n + " is even.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkEvenNumber(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " is odd.");
        }
    }
}
