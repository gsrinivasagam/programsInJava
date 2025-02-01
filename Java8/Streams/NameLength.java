package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> list = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println(list);
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int sum = numbers.stream().reduce(0,(a,b) -> a*b);
//        System.out.println(sum);
//
//        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
//        System.out.println(numbers2.stream().distinct().collect(Collectors.toList()));
//
//        System.out.println(numbers2.stream().peek(System.out::println).map(n->n*n).peek(System.out::println).collect(Collectors.toList()));
//
//        List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie", "Baby" ,"Alex", "Anna");
//
//        Map<Character, List<String>> groupedNames = names2.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
//
//        System.out.println(groupedNames);


        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> opt = numbers5.stream().filter(x->x%2==0).findFirst();
        System.out.println(opt.orElse(0));

        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> list2 = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(list2);

        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers4.stream().mapToInt(Integer::intValue).sum());

        Stream<Integer> numbers = Stream.of(5, 2, 4, 1, 3);
        Stream<Integer> sortedNumbers = numbers.sorted();
        List<Integer> list1 = sortedNumbers.collect(Collectors.toList());
        System.out.println(list1);


        List<String> words = Arrays.asList("Hello", "World", "Java", "Streams");
        System.out.println(words.stream().collect(Collectors.joining(", ")));
    }
}
