import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }


    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> everyRow = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            everyRow.add(0, 1);
            for (int j = 1; j < everyRow.size() - 1; j++) {
                everyRow.set(j, everyRow.get(j) + everyRow.get(j + 1));
            }
            list.add(new ArrayList<>(everyRow));
        }

        return list;
    }
}
