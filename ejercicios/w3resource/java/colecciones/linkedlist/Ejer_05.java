import java.util.LinkedList;

/*
Write a Java program to insert the specified element at the specified position in the linked list.
 */
public class Ejer_05 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");

        list.add(1, "Elemento insertado");
        System.out.println("list = " + list);
    }
}
