public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(121));
    }

    public static int countDigits(int num) {
        int temp = num;
        int sum = 0;
        while(temp != 0){
            int n = temp%10;
            if(num %n == 0) sum++;
            temp  = temp/10;
        }

        return sum;
    }
}
