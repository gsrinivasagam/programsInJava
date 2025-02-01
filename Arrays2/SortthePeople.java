import java.util.*;

public class SortthePeople {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < names.length; i++) {
            treeMap.put(heights[i], names[i]);
        }

        return treeMap.values().toArray(new String[names.length]);
    }
}
