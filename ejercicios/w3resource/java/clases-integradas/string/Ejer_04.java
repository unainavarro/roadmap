/*
Write a Java program to count Unicode code points in the specified text range of a string.
 */
public class Ejer_04 {
    public static void main(String[] args) {
        String str = "w3rsource.com";
        System.out.println("Original String: " + str);

        int start = 0;
        int end = 9;

        int count = str.codePointCount(start, end);
        System.out.println("Codepoint count = " + count);
    }
}
