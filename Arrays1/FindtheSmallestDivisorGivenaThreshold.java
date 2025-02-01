public class FindtheSmallestDivisorGivenaThreshold {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9};int threshold = 6;
        System.out.println(smallestDivisor(nums,threshold));
    }

    public static int smallestDivisor(int[] A, int threshold) {
        int left = 1, right = (int)1e6;
        while (left < right) {
            int m = (left + right) / 2, sum = 0;
            for (int i : A)
                sum += (i + m - 1) / m;
            if (sum > threshold)
                left = m + 1;
            else
                right = m;
        }
        return left;
    }
}
