import java.util.Scanner;

public class Ejer_02 {
    public static void main(String[] args) {
        /*
        Solve Quadratic Equation
        Write a Java program to solve quadratic equations (use if, else if and else).
        Test Data
        Input a: 1
        Input b: 5
        Input c: 1
        Expected Output :
        The roots are -0.20871215252208009 and -4.7912878474779195
         */
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduce a: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce b: ");
        double b = scanner.nextDouble();
        System.out.print("Introduce c: ");
        double c = scanner.nextDouble();

        // Calcular el discriminante
        double discriminant = b * b - 4 * a * c;

        // Resolver según el discriminante
        if (discriminant > 0) {
            // Dos raíces reales
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Las raíces son " + root1 + " y " + root2);
        } else if (discriminant == 0) {
            // Una raíz real
            double root = -b / (2 * a);
            System.out.println("La ecuación tiene una raíz: " + root);
        } else {
            // Sin raíces reales
            System.out.println("La ecuación no tiene raíces reales.");
        }
    }
}
