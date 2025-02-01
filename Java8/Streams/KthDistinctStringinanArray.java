package Java8.Streams;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class KthDistinctStringinanArray {
    public static void main(String[] args) {
        String[] arr = {"d", "b", "c", "b", "c", "a"};
        int k = 2;
        System.out.println(kthDistinct(arr, k));
    }

    public static String kthDistinct(String[] arr, int k) {
//        List<String> list = Arrays.stream(arr).distinct().collect(Collectors.toList());
//        if (k <= list.size()) return list.get(k);
//        else return " ";

//        List<String> list= Arrays.stream(arr)
//                .distinct()
//                .skip(k - 1)  // Skip the first k - 1 distinct elements
//                .collect(Collectors.toList());
//        System.out.println("list "+list.toString());
//        return "";

        return Arrays.stream(arr)
                .collect(Collectors.toCollection(LinkedHashSet::new)) // Remove duplicates by converting to LinkedHashSet
                .stream()
                .skip(k - 1)
                .findFirst()
                .orElse(null);
    }
}
