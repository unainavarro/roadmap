import java.util.LinkedList;

/*
Write a Java program to iterate through all elements in a linked list.
 */
public class Ejer_02 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Elemento 1");
        list.add("Elemento 2");
        list.add("Elemento 3");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
