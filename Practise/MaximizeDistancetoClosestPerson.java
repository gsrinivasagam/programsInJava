package Practise;

public class MaximizeDistancetoClosestPerson {
    public static void main(String[] args) {
        int[] seats = {0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1};
        System.out.println(maxDistToClosest(seats));
    }

    public static int maxDistToClosest(int[] seats) {
        int maxDis = 0, left = -1;
        int len = seats.length;

        for (int i = 0; i < len; i++) {
            if (seats[i] == 0) continue;

            if (left == -1) {
                maxDis = Math.max(maxDis, i);
            } else {
                maxDis = Math.max(maxDis, (i - left) / 2);
            }
            left = i;
        }

        if (seats[len - 1] == 0) {
            maxDis = Math.max(maxDis, (len - 1) - left);
        }

        return maxDis;
    }
}
