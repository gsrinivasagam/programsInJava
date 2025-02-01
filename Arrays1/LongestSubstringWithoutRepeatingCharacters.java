public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int[] cache = new int[128];
        for (int i = 0, j = 0; i < s.length(); i++) {
            j = Math.max(cache[s.charAt(i)], j);
            cache[s.charAt(i)] = i + 1;
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
