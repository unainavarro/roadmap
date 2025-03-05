public class Ejer_02 {
    public static void main(String[] args) {
        /*
        Write a Java method to compute the average of three numbers.
        Test Data:
        Input the first number: 25
        Input the second number: 45
        Input the third number: 65
        Expected Output:
        The average value is 45.0
         */
        System.out.println(average(25, 45, 65));
    }

    public static double average(int a, int b, int c) {
        return (double) ((a + b + c) / 3);
    }
}
