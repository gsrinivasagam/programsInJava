import java.util.Arrays;

public class FinalPricesWithaSpecialDiscountinaShop {
    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        System.out.println(Arrays.toString(finalPrices(prices)));
    }

    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            int discount = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] < prices[i]) {
                    discount = prices[j];
                    break;
                }
            }
            prices[i] = prices[i] - discount;
        }
        return prices;
    }
}
