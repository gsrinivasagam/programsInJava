import java.util.HashMap;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "islander", s2 = "islander";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {

        int s = 0;
        int e = 0;
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> have = new HashMap<>();
        Boolean flag = false;

        for (int i = 0; i < s1.length(); i++) {
            if (!need.containsKey(s1.charAt(i))) need.put(s1.charAt(i), 1);
            else need.put(s1.charAt(i), need.get(s1.charAt(i)) + 1);
        }

        while (e < s2.length()) {
            if (need.containsKey(s2.charAt(e))) {
                have.put(s2.charAt(e), have.get(s2.charAt(e)) == null ? 1 : have.get(s2.charAt(e)) + 1);
            }

            if (!need.containsKey(s2.charAt(e))) {
                e++;
                s = e;
                have.clear();
                continue;
            }

            if (have.get(s2.charAt(e)) > need.get(s2.charAt(e))) {
                flag = true;
                while (have.get(s2.charAt(e)) > need.get(s2.charAt(e))) {
                    have.put(s2.charAt(s), have.get(s2.charAt(s)) - 1);
                    s++;
                }
            }

            if (need.equals(have)) {
                return true;
            }

            if ((e-s )> s1.length()) {
                s++;
                have.clear();
            }
            e++;
        }

        return false;
    }
}
