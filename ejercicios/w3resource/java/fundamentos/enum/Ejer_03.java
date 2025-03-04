package enumeradores;

public class Ejer_03 {
    public static void main(String[] args) {
        /*
        Write a Java program to implement an enum called "Shape" with constants representing different geometric shapes.
         */
        enum Shape {
            SQUARE,
            CIRCLE,
            RECTANGLE,
            TRIANGLE,
            HEXAGON
        }

        Shape shape1 = Shape.CIRCLE;
        Shape shape2 = Shape.SQUARE;

        System.out.println("First shape: " + shape1);
        System.out.println("Second shape: " + shape2);
    }
}
