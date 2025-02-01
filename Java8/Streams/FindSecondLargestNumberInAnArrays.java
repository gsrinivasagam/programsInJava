package Java8.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FindSecondLargestNumberInAnArrays {
    public static void main(String[] args) {
        // random numbers
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};

        //distinct needed only for this
//                int[] numbers = {5, 9, 5, 2, 8, 9, 1};

        // print to console
        System.out.println("Numbers in an Arrays : "
                + Arrays.toString(numbers));


        int num = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(num);

    }
}
