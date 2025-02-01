import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class KthDistinctStringinanArray {
    public static void main(String[] args) {
        String[] arr = {"d", "b", "c", "b", "c", "a"};
        int k = 2;
        System.out.println(kthDistinct(arr, k));
    }

    public static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        int i = 1;
        for (String s : map.keySet()) {
            if (map.get(s) == 1 && i == k) {
                return s;
            } else if ( (map.get(s) == 1 && i != k)) {
                i++;
            }
        }

        return "";
    }
}
