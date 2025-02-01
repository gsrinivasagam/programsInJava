public class MaximumOddBinaryNumber {
    public static void main(String[] args) {
        String s = "01100011";
        MaximumOddBinaryNumber maximumOddBinaryNumber = new MaximumOddBinaryNumber();
        System.out.println(maximumOddBinaryNumber.maximumOddBinaryNumber(s));
    }

    public String maximumOddBinaryNumber(String s) {
        char[] ch = s.toCharArray();
        int oneCount =0;
        int zeroCount =0;
        for (int i=0;i<s.length();i++){
            if(ch[i] == '0') zeroCount++;
            if(ch[i] == '1') oneCount++;
        }

        StringBuilder str = new StringBuilder();
        while (oneCount>1){
            str.append('1');
            oneCount--;
        }
        for (int i=str.length();i<s.length();i++){

            if(i==s.length()-1) {
                str.append('1');
            }
            else str.append('0');
        }

        return str.toString();
    }
}
