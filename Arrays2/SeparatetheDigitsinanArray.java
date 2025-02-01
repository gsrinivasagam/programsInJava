import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparatetheDigitsinanArray {
    public static void main(String[] args) {
        int[] nums = {7, 100, 3, 9};
        System.out.println(Arrays.toString(separateDigits(nums)));
    }

    public static int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList();

        for (int num : nums) {
            if (num / 10 != 0) {
                String strNum = Integer.toString(num);
                for (int i = 0; i < strNum.length(); i++) {
                    list.add(strNum.charAt(i) - '0');
                }
            } else
                list.add(num);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
