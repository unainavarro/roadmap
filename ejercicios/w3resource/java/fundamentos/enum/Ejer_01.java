package enumeradores;

public class Ejer_01 {
    public enum DaysOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        /*
        Write a Java program to create an enum called "DaysOfWeek" representing the days of the week.
        */
        DaysOfWeek today = DaysOfWeek.MONDAY;
        System.out.println(today);
    }
}
