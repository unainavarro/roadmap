package enumeradores;

public class Ejer_02 {
    public static void main(String[] args) {
        /*
        Write a Java program to create an enum called "Weekend" with constants representing the days of the weekend.
         */
        enum Weekend {
            SATURDAY,
            SUNDAY
        }

        Weekend day1 = Weekend.SATURDAY;
        Weekend day2 = Weekend.SUNDAY;

        System.out.println("day1 = " + day1);
        System.out.println("day2 = " + day2);
    }
}
