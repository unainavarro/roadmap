/*
Write a Java program to create a class called Shape with a method called getArea().
Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
*/
public class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + rectangle.getArea());

    }
}




