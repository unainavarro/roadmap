/*
 Write a Java program to implement a lambda expression to find the sum of two integers.
*/
@FunctionalInterface
interface Sum {
    int add(int a, int b);
}

public class Ejer_01 {

    public static void main(String[] args) {
        Sum sum = (a, b) -> a + b;
        System.out.println("sum = " + sum.add(10, 4));
    }
}
