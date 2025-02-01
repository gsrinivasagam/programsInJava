public class CounttheNumberofConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            boolean flag = true;
            char[] wordChar = word.toCharArray();
            for (int i = 0; i < wordChar.length; i++) {
                if (allowed.indexOf(wordChar[i]) == -1) {
                    flag = false;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}
