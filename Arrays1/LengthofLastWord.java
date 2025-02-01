public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        System.out.println(s.substring(s.lastIndexOf(" ")+1).length());
        return words[words.length-1].length();
    }
}
