import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {10,2,-5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            if (i > 0) {
                if (i > 0 && !stack.isEmpty() && stack.peek() > 0) stack.push(i);
                else if (i > 0 && !stack.isEmpty() && stack.peek() < 0 && stack.peek() < Math.abs(i)) {
                    stack.pop();
                    stack.push(i);
                } else stack.push(i);
            } else {
                if (stack.size() > 0 && stack.peek() > 0 && stack.peek() < Math.abs(i)) {
                    stack.pop();
                    stack.push(i);
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(i);
                } else if (stack.peek() > 0 && stack.peek() == Math.abs(i)) {
                    stack.pop();
                }
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
