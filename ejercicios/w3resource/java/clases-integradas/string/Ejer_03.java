/*
Write a Java program to get the character (Unicode code point) before the specified index within the string.
 */
public class Ejer_03 {
    public static void main(String[] args) {
        String str = "w3resource.com";
        System.out.println("Original String: " + str);

        int index1 = 1;
        int index2 = 13;

        System.out.println("Character (Unicode point) before index " + index1 + " = " + str.codePointBefore(index1));
        System.out.println("Character (Unicode point) before index " + index2 + " = " + str.codePointBefore(index2));
    }
}
