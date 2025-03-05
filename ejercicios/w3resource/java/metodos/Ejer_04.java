public class Ejer_04 {
    public static void main(String[] args) {
        /*
        Write a Java method to count all vowels in a string.
        Test Data:
        Input the string: "w3resource"
        Expected Output:
        Number of  Vowels in the string: 4
         */
        String str = "w3resource";
        System.out.println("Number of  Vowels in the string: " + countVowels(str));
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }
}

