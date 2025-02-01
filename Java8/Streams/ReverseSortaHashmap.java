package Java8.Streams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseSortaHashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 30);
        map.put("c", 20);
        map.put("d", 40);

        LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedMap);
    }


}
