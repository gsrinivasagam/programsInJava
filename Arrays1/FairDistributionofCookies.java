public class FairDistributionofCookies {

    public static void main(String[] args) {
        int[] cookies = {8,15,10,20,8};
        int k = 2;
        FairDistributionofCookies fairDistributionofCookies=new FairDistributionofCookies();
        System.out.println(fairDistributionofCookies.distributeCookies(cookies,k));
    }

    int res = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        dfs(cookies, 0, k, new int[k]);
        return res;
    }

    void dfs(int[] cookies, int cur, int k, int[] children) {
        if (cur == cookies.length) {
            int max = 0;
            for (int c : children) max = Math.max(max, c);
            res = Math.min(res, max);
            return;
        }
        for (int i = 0; i < k; i++) {
            children[i] += cookies[cur];
            dfs(cookies, cur + 1, k, children);
            children[i] -= cookies[cur];
        }
    }
}
