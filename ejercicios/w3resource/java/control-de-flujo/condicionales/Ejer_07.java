import java.time.YearMonth;

public class Ejer_07 {
    public static void main(String[] args) {
        /*
        Write a Java program to find the number of days in a month.
        Test Data
        Input a month number: 2
        Input a year: 2016
        Expected Output :
        February 2016 has 29 days
         */
        int month = 2;
        int year = 2016;

        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();

        String monthName = yearMonth.getMonth().name().substring(0, 1) +
                yearMonth.getMonth().name().substring(1).toLowerCase();

        System.out.println(monthName + " " + year + " has " + daysInMonth + " days.");
    }
}
