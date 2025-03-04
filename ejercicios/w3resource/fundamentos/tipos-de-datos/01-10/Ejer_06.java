package type;

public class Ejer_06 {
    public static void main(String[] args) {
        /*
        Write a Java program to compute the body mass index (BMI).
        Test Data
        Input weight in pounds: 452
        Input height in inches: 72
        Expected Output:
        Body Mass Index is 61.30159143458721
         */
        // Conversion factors
        final double POUNDS_TO_KILOGRAMS = 0.45359237; // 1 pound = 0.45359237 kg
        final double INCHES_TO_METERS = 0.0254;       // 1 inch = 0.0254 meters

        double weight = 452;
        double height = 72;

        double weightInKg = weight * POUNDS_TO_KILOGRAMS;
        double heightInMeters = height * INCHES_TO_METERS;

        System.out.println("Body Mass Index is " + (weightInKg / (heightInMeters * heightInMeters)));
    }
}
