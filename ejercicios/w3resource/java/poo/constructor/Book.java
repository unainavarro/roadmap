/*
Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.
*/
public class Book {
    public String title;
    public String author;
    public double price;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String author, String title, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book = new Book("J.D. Barker", "El cuarto mono");
        Book book2 = new Book("J.D. Barker", "El cuarto mono", 9.95);

        System.out.println(book.author + " " + book.title);
        System.out.println(book2.author + " " + book2.title + " " + book2.price);
    }
}
