package type;

public class Ejer_07 {
    public static void main(String[] args) {
        /*
        Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds),
        and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
        Test Data
        Input distance in meters: 2500
        Input hour: 5
        Input minutes: 56
        Input seconds: 23
        Expected Output :
        Your speed in meters/second is 0.11691531
        Your speed in km/h is 0.42089513
        Your speed in miles/h is 0.26158804
         */
        int meters = 2500;
        int hours = 5;
        int minutes = 56;
        int seconds = 23;

        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        double metersPerSecond = (double) meters / totalSeconds;
        double kilometersPerHour = (meters / 1000.0) / (totalSeconds / 3600.0);
        double milesPerHour = (meters / 1609.0) / (totalSeconds / 3600.0);

        System.out.println("Your speed in meters/second is " + metersPerSecond);
        System.out.println("Your speed in km/h is " + kilometersPerHour);
        System.out.println("Your speed in miles/h is " + milesPerHour);
    }
}
