package Java8.Streams;

import java.util.Arrays;
import java.util.List;

public class SortedNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList( "Bob","Alice", "Charlie");
        names.stream().sorted().forEach(System.out::println);
    }
}
