public class Ejer_01 {
    public static void main(String[] args) {
        /*
        Write a Java program that throws an exception and catch it using a try-catch block
        */
        try{
            int result = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Programa...");
    }
}
