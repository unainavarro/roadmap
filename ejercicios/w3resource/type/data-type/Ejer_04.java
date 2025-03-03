package type;

public class Ejer_04 {
    public static void main(String[] args) {
        /*
        Write a Java program to convert minutes into years and days.
        Test Data
        Input the number of minutes: 3456789
        Expected Output :
        3456789 minutes is approximately 6 years and 210 days
        No voy ha utilizar más  scanner🥱.
         */
        int minutes = 3456789;
        int minutesInDay = 1440;
        int minutesInYear = 525600;

        int years = minutes / minutesInYear;
        int remainingMinutes = minutes % minutesInYear;
        int days = remainingMinutes / minutesInDay;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}
