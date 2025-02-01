public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        System.out.println(truncateSentence(s, 4));
    }

    public static String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < k; i++) {
            str1.append(str[i]);
            str1.append(" ");
        }
        return str1.toString().trim();
    }
}
