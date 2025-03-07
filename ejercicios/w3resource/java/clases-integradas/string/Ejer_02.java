/*
Write a Java program to get the character (Unicode code point) at the given index within the string.
 */
public class Ejer_02 {
    public static void main(String[] args) {
        String str = "w3resource.com";
        System.out.println("Original String: " + str);

        int index1 = 1;
        int index2 = 13;

        System.out.println("Character (Unicode point) at index " + index1 + " = " + str.codePointAt(index1));
        System.out.println("Character (Unicode point) at index " + index2 + " = " + str.codePointAt(index2));
    }
}
