import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(reverseString(s)));
    }

    public static char[] reverseString(char[] s) {
        int n = s.length-1;
        for(int i=0;i<s.length/2;i++){
            char temp = s[n-i];
            s[n-i] = s[i];
            s[i] = temp;
        }
        return s;
    }
}
