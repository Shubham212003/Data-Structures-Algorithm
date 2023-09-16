public class BuyAndSellStocks {
    public static int buyAndSellStocks(int Priecs[]) {
        int buyPrices = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for (int i = 0; i < Priecs.length; i++) {
            if (buyPrices < Priecs[i]) {// Profit
                int Profit = Priecs[i] - buyPrices;// today's Profit
                MaxProfit = Math.max(MaxProfit, Profit);

            } else {
                buyPrices = Priecs[i];
            }
        }
        return MaxProfit;

    }

    public static void main(String[] args) {
        int Priecs[] = { 7, 1, 5, 5, 6, 4 }; // -1 = 5
        System.out.println(buyAndSellStocks(Priecs));
    }
}
