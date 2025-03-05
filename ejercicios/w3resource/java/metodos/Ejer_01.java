public class Ejer_01 {
    public static void main(String[] args) {
        /*
        Write a Java method to find the smallest number among three numbers.
        Test Data:
        Input the first number: 25
        Input the Second number: 37
        Input the third number: 29
        Expected Output:
         */
        System.out.println("Smallest: " + smallestNumber(25,37,29));
    }

    public static int smallestNumber(int a, int b, int c){
        return Math.min(a,Math.min(b,c));
    }
}
