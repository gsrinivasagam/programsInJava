import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindMaximumNumberofStringPairs2 {
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(words));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        Set<String> set = new HashSet();
        for (String word : words) {
            char[] wordChar = word.toCharArray();
            Arrays.sort(wordChar);
            String str = new String(wordChar);
            if (set.contains(str)) {
                count++;
            } else {
                set.add(str);
            }
        }
        return count;
    }

}
