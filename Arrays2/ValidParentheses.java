import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(' || a == '[' || a == '{') stack.push(a);
            if(stack.empty()) return false;
            if (a == ')' && stack.pop() != '(') return false;
            if (a == ']' && stack.pop() != '[') return false;
            if (a == '}' && stack.pop() != '{') return false;
        }
        return stack.empty();
    }
}
