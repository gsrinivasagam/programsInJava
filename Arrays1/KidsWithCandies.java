import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.regex.Matcher;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }

        List<Boolean> sol = new ArrayList();
        for (int i = 0; i < candies.length; i++) {
            sol.add((candies[i] + extraCandies) >= max);
        }

        return sol;
    }
}


