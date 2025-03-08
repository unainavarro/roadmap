import java.util.LinkedList;

/*
Write a Java program to append the specified element to the end of a linked list.
 */
public class Ejer_01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        list.add("Elemento 1");
        list.add("Elemento 2");
        list.add("Elemento 3");

        System.out.println("list = " + list);
    }
}
