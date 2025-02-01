package Java8.Streams;

import java.util.List;
import java.util.Arrays;

public class StreamFilterAndCollect {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(x-> x%2==0).forEach(System.out::println);
    }
}
