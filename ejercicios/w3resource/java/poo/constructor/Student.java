/*
Write a Java program to create a class called Student with instance variables studentId, studentName, and grade.
Implement a default constructor and a parameterized constructor that takes all three instance variables.
Use constructor chaining to initialize the variables. Print the values of the variables.
*/
public class Student {
    public int studentId;
    public String studentName;
    public String grade;

    public Student() {
        this(0, "Unknown", "A");
    }

    public Student(int studentId, String studentName, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("id = " + student.studentId);
        System.out.println("name = " + student.studentName);
        System.out.println("grade = " + student.grade);

        Student student2 = new Student(1, "My name", "B");
        System.out.println("id = " + student2.studentId);
        System.out.println("name = " + student2.studentName);
        System.out.println("grade = " + student2.grade);
    }
}
