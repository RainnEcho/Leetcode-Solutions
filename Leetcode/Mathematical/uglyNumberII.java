class uglyNumberII {
    public int nthUglyNumber(int n) {
        int idxOf2 = 0, idxOf3 = 0, idxOf5 = 0;
        int[] dp = new int[n];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            int res1 = dp[idxOf2] * 2;
            int res2 = dp[idxOf3] * 3;
            int res3 = dp[idxOf5] * 5;
            int res = Math.min(Math.min(res1, res2), res3);
            dp[i] = res;

            if (res == res1) {
                idxOf2 ++;
            }
            if (res == res2) {
                idxOf3 ++;
            }
            if (res == res3) {
                idxOf5 ++;
            }
        }
        return dp[n - 1];
    }
}