import java.util.Arrays;
import java.util.HashMap;

public class FindMaximumNumberofStringPairs {
    public static void main(String[] args) {
        String[] words = {"ab","ba","cc"};
        System.out.println(maximumNumberOfStringPairs(words));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            char[] wordChar = word.toCharArray();
            Arrays.sort(wordChar);
            String str = new String(wordChar);

            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        for (String val : map.keySet()) {
            if (map.get(val) > 1) count++;
        }
        return count;
    }

}
