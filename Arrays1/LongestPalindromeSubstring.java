public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    private static int lo,maxLen;
    public static String longestPalindrome(String s) {
        if(s.length()<2)
            return s;

        for (int i = 0; i < s.length(); i++) {
            extendPalindrome(s,i,i);
            extendPalindrome(s,i,i+1);
        }

        return s.substring(lo,lo+maxLen);
    }

    private static void extendPalindrome(String s, int j, int k) {

        while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }

        if(maxLen<k-j-1){
            lo = j+1;
            maxLen = k-j-1;
        }
    }
}
