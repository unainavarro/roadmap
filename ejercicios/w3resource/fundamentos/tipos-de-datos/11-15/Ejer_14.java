package type;

import java.math.BigInteger;

public class Ejer_14 {
    public static void main(String[] args) {
        /*
        Extract Primitive Value from BigInteger
        Write a Java program to extract the primitive type value from a given BigInteger value.
        A primitive type is predefined by the language and is named by a reserved keyword.
        Primitive values do not share state with other primitive values. The eight primitive data types supported by the Java programming language are byte,
        short, int, long, float, double, Boolean and char.
        BigInteger() translates the sign-magnitude representation of a BigInteger into a BigInteger.
        The sign is represented as an integer signum value: -1 for negative, 0 for zero, or 1 for positive.
        The magnitude is a byte array in big-endian byte-order: the most significant byte is in the zeroth element.
        A zero-length magnitude array is permissible, and will result in a BigInteger value of 0, whether signum is -1, 0 or 1
         */

        BigInteger bigIntegerValue = new BigInteger("1234567890123456789");

        byte byteValue = bigIntegerValue.byteValue();
        short shortValue = bigIntegerValue.shortValue();
        int intValue = bigIntegerValue.intValue();
        long longValue = bigIntegerValue.longValue();
        float floatValue = bigIntegerValue.floatValue();
        double doubleValue = bigIntegerValue.doubleValue();

        System.out.println("BigInteger original: " + bigIntegerValue);
        System.out.println("Valor como byte: " + byteValue);
        System.out.println("Valor como short: " + shortValue);
        System.out.println("Valor como int: " + intValue);
        System.out.println("Valor como long: " + longValue);
        System.out.println("Valor como float: " + floatValue);
        System.out.println("Valor como double: " + doubleValue);
    }
}
