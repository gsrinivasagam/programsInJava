public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fib(2));
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] res = new int[n+1];
        res[0] = 0;
        res[1] = 1;

        for (int i = 2; i < n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }

        return res[n];
    }
}
