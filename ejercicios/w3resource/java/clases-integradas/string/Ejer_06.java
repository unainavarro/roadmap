/*
 Write a Java program to compare two strings lexicographically, ignoring case differences.
 */
public class Ejer_06 {
    public static void main(String[] args) {
        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";

        int result = str1.compareToIgnoreCase(str2);
        if (result == 0) {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\" (ignoring case)");
        } else {
            System.out.println("\"" + str1 + "\" is not equal to \"" + str2 + "\" (ignoring case)");
        }
    }
}
