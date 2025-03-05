public class Ejer_03 {
    public static void main(String[] args) {
        /*
        Write a Java method to display the middle character of a string.
        Note:
        a) If the length of the string is odd there will be two middle characters.
        b) If the length of the string is even there will be one middle character.
        Test Data:
        Input a string: 350
        Expected Output:
         */
        String str = "350";

        System.out.println(middleCharacter(str));
    }

    public static String middleCharacter(String str) {
        int length = str.length();
        int middle = length / 2;

        if (str.length() % 2 == 0) {
            return str.substring(middle - 1, middle + 1);
        } else {
            return str.substring(middle, middle + 1);
        }

    }
}
