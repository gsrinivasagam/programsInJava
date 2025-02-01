import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision3 {
    public static void main(String[] args) {
        int[] asteroids = {10, 5, -3, 12, -15, 20, -8, -9};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            if (i > 0) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(i)) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() < 0 || stack.isEmpty()) {
                    stack.push(i);
                } else if (stack.peek() == Math.abs(i)) stack.pop();
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
