public class CalculateMoneyInLeetcodeBank {
    public static void main(String[] args) {
        int n=20;
        System.out.println(totalMoney(n));
    }

    public static int totalMoney(int n) {
            int sum=0;
            if(n<=7){
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
            } else {
                sum +=28;
                for(int i=8;i<=n;i++){
                    int week_count = i / 7;
                    sum += (i%7==0 ? 7 : i%7) +week_count;
                }
            }
        return sum;
    }
}
