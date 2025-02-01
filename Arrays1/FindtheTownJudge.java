public class FindtheTownJudge {
    public static void main(String[] args) {
        int n = 3;
        int trust[][] = {{1, 3}, {2, 3}};
        FindtheTownJudge findtheTownJudge = new FindtheTownJudge();
        System.out.println(findtheTownJudge.findJudge(n, trust));
    }

    public int findJudge(int n, int[][] trust) {
        int[] sol = new int[n + 1];
        for (int[] ns : trust) {
            sol[ns[0]] = sol[ns[0]] - 1;
            sol[ns[1]] = sol[ns[1]] + 1;
        }

        for (int i = 1; i <= n; i++) {
            if (sol[i] == (n - 1)) return i;
        }

        return -1;
    }
}
