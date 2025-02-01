public class Containerwithmostwater {
    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxiArea = 0;

        while (left < right) {

            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = w * h;
            maxiArea = Math.max(maxiArea, area);

            if (height[left] < height[right])
                left++;
            else if (height[left] > height[right])
                right--;
            else {
                left++;
                right--;
            }

        }

        return maxiArea;
    }
}
