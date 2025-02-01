import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack();
        Stack strStack = new Stack();
        char ch[] = s.toCharArray();
        boolean flag = false;
        StringBuilder str = new StringBuilder();
        StringBuilder sol = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            if(Character.isDigit(ch[i])) numStack.push(ch[i]-'0');
            if (ch[i]=='[') flag = true;
            if (ch[i]==']') flag = false;
                if((ch[i]==']' || Character.isDigit(ch[i])) && str.length() != 0){
                    strStack.push(str);
                    str = new StringBuilder("");
                }
                if (flag && (ch[i]!=']') && (ch[i]!='[') && !Character.isDigit(ch[i])){
                    str.append(ch[i]);
                }

        }

        while (!numStack.isEmpty()){
            String strng = strStack.pop().toString();
            int len = numStack.pop();
            for (int i = 0; i < len; i++) {
                    sol.insert(0,strng);
            }
        }

        return sol.toString();
    }
}
