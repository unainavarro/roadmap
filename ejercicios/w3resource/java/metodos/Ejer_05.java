public class Ejer_05 {
    public static void main(String[] args) {
        /*
        Write a Java method to count all the words in a string.
        Test Data:
        Input the string: The quick brown fox jumps over the lazy dog.
        Expected Output:
        Number of words in the string: 9
         */
        String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Number of words in the string: " + countWords(str));

    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
