import java.util.LinkedList;
import java.util.ListIterator;

/*
Write a Java program to iterate through all elements in a linked list starting at the specified position.
 */
public class Ejer_03 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.add("Element4");

        ListIterator<String> iterator = list.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
