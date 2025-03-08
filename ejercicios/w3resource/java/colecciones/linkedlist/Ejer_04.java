import java.util.LinkedList;
import java.util.ListIterator;

/*
Write a Java program to iterate a linked list in reverse order.
 */
public class Ejer_04 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Elemento 1");
        list.add("Elemento 2");
        list.add("Elemento 3");
        list.add("Elemento 4");

        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
