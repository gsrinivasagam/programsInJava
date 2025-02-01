import java.util.Arrays;
import java.util.List;

public class IsAcronym {
    public static void main(String[] args) {

        List words = Arrays.asList("alice", "bob", "charlie");
        String s = "abc";
        System.out.println(isAcronym(words, s));
    }

    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder sol = new StringBuilder();
        for (String word : words) {
            sol.append(word.toCharArray()[0]);
        }
        System.out.println(sol);
        return sol.toString().equals(s);
    }


}
