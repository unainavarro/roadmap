public class Ejer_10 {
    public static void main(String[] args) {
        /*
        Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
        Expected Output:
        Input a year: 2017
        false
         */
        int year = 2017;
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
