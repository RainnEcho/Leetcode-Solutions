class stockII {
    public static int maxProfit (int[] prices) {
        int n = prices.length;
        if (n < 2) return 0;
        int profit = 0;
        int[] dif = new int[2];
        boolean isInHand = false, checkpoint = false;
        for (int i = 0; i < n - 1; i++) {
            checkpoint = false;
            if (!isInHand) 
            {
                if (prices[i + 1] > prices[i]) {
                    isInHand = true;
                    dif[0] = prices[i];
                    dif[1] = prices[i + 1];
                }
            }
            else
            {
                if (prices[i] <= prices[i + 1]) {
                    dif[1] = prices[i + 1];
                } else {
                    isInHand = false;
                    checkpoint = true;
                    profit += dif[1] - dif[0];
                    dif[0] = 0;
                    dif[1] = 0;
                }
            }
        }
        if (! checkpoint) profit += dif[1] - dif[0];
        return profit;
    }
}