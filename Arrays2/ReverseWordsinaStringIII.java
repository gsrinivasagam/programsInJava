public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        String  s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] str =  s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            StringBuilder sbTemp = new StringBuilder();
            sbTemp.append((str[i])).reverse();
            sb.append(sbTemp+" ");
        }

        return sb.toString().trim();
    }
}
