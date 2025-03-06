/*
Write a Java program to create a class called Classroom with instance variables className and students (an array of strings).
Implement a parameterized constructor that initializes these variables. Print the values of the variables.
*/
public class Classroom {
    private String className;
    private String[] students;

    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students != null ? students : new String[0];
    }

    public void printDetails() {
        System.out.println("Class Name: " + className);
        System.out.print("Students: ");
        for (String student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] students = {"Juan", "Ana", "Maria"};

        Classroom classroom = new Classroom("Programación POO", students);

        classroom.printDetails();
    }
}
