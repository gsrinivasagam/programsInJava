package Java8.Streams;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,5,6);

        int sum = list.stream().reduce(0,(a,b) -> a+b);
        System.out.println(sum);
    }
}
