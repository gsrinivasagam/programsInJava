public class wateringPlants {
    public static void main(String[] args) {
        int plants[] = {2, 2, 3, 3}, capacity = 5;
        System.out.println(wateringPlants(plants, capacity));
    }

    public static int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int can = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] <= can) {
                can -= plants[i];
                steps++;
            } else {
                steps += i + (i + 1);
                can = capacity - plants[i];
            }
        }

        return steps;
    }
}
