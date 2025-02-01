import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MDCXCV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int sum = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            int first = map.get(s.charAt(i));
            int second = map.get(s.charAt(i + 1));

            if (first - second >= 0) {
                sum += first;
                if (i + 1 == s.length() - 1) {
                    sum += second;
                }
            } else {
                sum += second - first;
                i++;
                if (i + 1 == s.length() - 1) {
                    sum += map.get(s.charAt(i + 1));
                }
            }
        }
        return sum;
    }
}
