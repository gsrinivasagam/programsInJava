import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat", t = "car";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap();
        HashMap<Character, Integer> map2 = new HashMap();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char tc = t.charAt(i);
            if (map1.containsKey(c)) map1.put(c, map1.get(c) + 1);
            else if (!map1.containsKey(c)) map1.put(c, 1);
            if (map2.containsKey(tc)) map2.put(tc, map2.get(tc) + 1);
            else if (!map2.containsKey(tc)) map2.put(tc, 1);
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            int value2 = (map2.containsKey(key)) ? map2.get(key) : 0;

            if (value != value2) return false;
        }

        return true;
    }
}
