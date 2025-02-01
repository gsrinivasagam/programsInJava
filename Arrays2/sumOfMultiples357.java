public class sumOfMultiples357 {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(sumOfMultiples(n));
    }

    public static int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                sum += i;
        }
        return sum;
    }
}
