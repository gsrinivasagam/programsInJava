import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappyNumber(n));
    }

    public static boolean isHappyNumber(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            int sum = 0;
            set.add(n);
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }
}
