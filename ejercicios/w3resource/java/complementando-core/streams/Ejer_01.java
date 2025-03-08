import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*
Write a Java program to calculate the average of a list of integers using streams.
*/
public class Ejer_01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();

        if (average.isPresent()){
            System.out.println("average.getAsDouble() = " + average.getAsDouble());
        }else{
            System.out.println("Lista vaciá");
        }
    }
}
