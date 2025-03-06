/*
Write a Java program to create a class called "Cat" with instance variables name and age.
Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.
 */
public class Cat {
    public String name;
    public int age;

    public Cat() {
        name = "Unknown";
        age = 0;
    }

    //Uso:
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name + " " + cat.age);
    }
}
