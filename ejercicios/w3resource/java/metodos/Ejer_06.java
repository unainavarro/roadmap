public class Ejer_06 {
    public static void main(String[] args) {
        /*
        Write a Java method to compute the sum of digits in an integer.
        Test Data:
        Input an integer: 25
        Expected Output:

        The sum is 7
         */
        int number = 25;
        System.out.println(sumOfDigits(number));
    }

    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
