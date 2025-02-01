import java.util.Arrays;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String s = " a good   example ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] str = s.trim().split(" +");
        for (int i = str.length - 1; i >= 0; i--) {
                res.append(str[i].trim());
                if(i>0)res.append(" ");
        }
        return res.toString();
    }
}
