package Java8.Streams;

import java.util.Map;
import java.util.stream.Collectors;

public class Findthefrequencyofeachcharacter {
    public static void main(String[] args) {
        String str = "example string with repeated characters";

        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).
                filter(c -> c != ' ').
                collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(map);
    }
}
