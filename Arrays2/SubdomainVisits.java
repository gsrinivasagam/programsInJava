import java.util.*;

public class SubdomainVisits {
    public static void main(String[] args) {
        String[] cpdomains = {"9001 discuss.leetcode.com"};
        System.out.println(subdomainVisits(cpdomains));
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList();
        for (String domain : cpdomains) {
            int t = domain.indexOf(' ');
            int n = Integer.valueOf(domain.substring(0, t));
            String s = domain.substring(t + 1);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '.') {
                    String d = s.substring(i + 1);
                    map.put(d, map.getOrDefault(d, 0) + n);
                }
            }
            map.put(s, map.getOrDefault(s, 0) + n);
        }

        for (String s : map.keySet()) {
            res.add(map.get(s) + " " + s);
        }
        return res;
    }
}
