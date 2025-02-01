public class Maximum69Number {

    public static void main(String[] args) {
        maximum69Number(9669);
    }

    public static int maximum69Number(int num) {
        int max = -1;
        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++) {
            int temp = 0;
            char[] charArray = str.toCharArray();
            if (str.charAt(i) == '6') {
                charArray[i] = '9';
                temp = Integer.parseInt(new String(charArray));
                max = temp > max ? temp : max;
            }

        }

        return max;
    }
}
