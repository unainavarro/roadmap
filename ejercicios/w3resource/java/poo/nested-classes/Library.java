/*
Write a Java program to create an outer class called Library with an instance variable libraryName.
Create an inner class Book with a method getLibraryName() that returns the name of the library.
Instantiate the Book class and call the getLibraryName() method.
*/
class Library {
    private String libraryName = "Central Library";

    class Book {
        String getLibraryName() {
            return libraryName;
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Library.Book book = library.new Book();
        System.out.println("Library Name: " + book.getLibraryName());
    }
}



