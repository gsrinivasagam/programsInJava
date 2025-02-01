import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerinanArray {
    public static void main(String[] args) {
        int arr[] = {2, 2, 3, 4};
        System.out.println(findLucky(arr));
    }

    public static int findLucky(int[] arr) {
        int max = -1;
        Map<Integer, Integer> map = new HashMap();
        for (int num : arr) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.putIfAbsent(num, 1);
        }

        for (int num : map.keySet()) {
            int n = (num == map.get(num)) ? num : -1;
            if (n > max) max = n;
        }

        return max;
    }

}
