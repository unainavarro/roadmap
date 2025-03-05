public class Ejer_09 {
    public static void main(String[] args) {
        /*
        Write a Java method to print characters between two characters (i.e. A to P).
        Note: Prints 20 characters per line
        Expected Output:
        ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;
        < = > ? @ A B C D E F G H I J K L M N O
        P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c
        d e f g h i j k l m n o p q r s t u v w
        x y z
         */
        printCharactersBetween('(', 'z', 20);
    }

    public static void printCharactersBetween(char start, char end, int charsPerLine) {
        int count = 0;

        for (char c = start; c <= end; c++) {
            System.out.print(c + " ");
            count++;

            if (count % charsPerLine == 0) {
                System.out.println();
            }
        }

        if (count % charsPerLine != 0) {
            System.out.println();
        }
    }
}
