import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0 ; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else {
                digits[i] = 0;
            }
        }

        int[] digit = new int[digits.length+1];
        digit[0] = 1;
        return digit;
    }
}