public class WaterBottles {
    public static void main(String[] args) {
    int numBottles = 15, numExchange = 4;
        System.out.println(numWaterBottles(numBottles,numExchange));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;

        while (numBottles>=numExchange){
            int t = numBottles/numExchange;
            sum+=t;
            numBottles = t+(numBottles%numExchange);
        }

        return sum;
    }
}
