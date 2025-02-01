public class UniquePaths {
    public static void main(String[] args) {
        int m = 3, n = 7;
        System.out.println(uniquePaths(m,n));
    }

    public static int uniquePaths(int m, int n) {
        int[][] res = new int[m][n];
        for(int i=1;i<n;i++) {
            res[0][i] = 1;
        }
        for (int j = 1; j < m; j++) {

            res[j][0] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                res[i][j] = res[i-1][j]+res[i][j-1];
            }
        }
        return res[m-1][n-1];
    }
}
