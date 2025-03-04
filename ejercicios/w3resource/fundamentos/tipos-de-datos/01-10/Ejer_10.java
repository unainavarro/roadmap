package type;

public class Ejer_10 {
    public static void main(String[] args) {
        /*
        Write a Java program to break an integer into a sequence of digits.
        Test Data
        Input six non-negative digits: 123456
        Expected Output :
        1 2 3 4 5 6
         */
        int number = 123456;

        String numberString = Integer.toString(number);
        
        for (int i = 0; i < numberString.length(); i++) {
            System.out.print(numberString.charAt(i) + " ");
        }
    }
}
