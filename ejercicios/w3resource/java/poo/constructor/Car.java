/*
Write a Java program to create a class called Car with instance variables make, model, and year.
Implement a parameterized constructor that initializes these variables and assigns default values if not provided.
Print the values of the variables.
 */
public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = (make != null && !make.isEmpty() ? make : "Unknown make");
        this.model = (model != null && !model.isEmpty() ? model : "Unknown mode");
        this.year = (year > 0 ? year : 2020);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car("Audi", "A9", 2019);
        System.out.println(car.toString());
    }
}
