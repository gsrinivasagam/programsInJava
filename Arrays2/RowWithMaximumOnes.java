public class RowWithMaximumOnes {

    public static void main(String[] args) {

    }

    public static int[] rowAndMaximumOnes(int[][] mat) {
        int largest = 0;
        int index = 0;
        int rowIndex = 0;
        for (int[] arr : mat) {
            int count = 0;
            for (int n : arr) {
                if (n == 1) count++;
            }

            if (count > largest) {
                largest = count;
                index = rowIndex;
            }
            rowIndex++;
        }

        return new int[]{index, largest};
    }
}


