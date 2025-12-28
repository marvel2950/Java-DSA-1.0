public class Knapsack01 {
    static int knapsackRecursive(int[] wt, int[] val, int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }

        if (wt[n - 1] <= w) { // yes & no
            return Math.max(
                    val[n - 1] + knapsackRecursive(wt, val, w - wt[n - 1], n - 1),
                    knapsackRecursive(wt, val, w, n - 1)
            );
        } else { //no
            return knapsackRecursive(wt, val, w, n - 1);
        }
    }

    static int knapsackMemorization(int[] wt, int[] val, int w, int n, int[][] dp) {
        if (dp[n][w] != -1) {
            return dp[n][w];
        }
        if (n == 0 || w == 0) {
            dp[n][w] = 0;
            return dp[n][w];
        }

        if (wt[n - 1] <= w) { // yes & no
            dp[n][w] = Math.max(
                    val[n - 1] + knapsackMemorization(wt, val, w - wt[n - 1], n - 1, dp),
                    knapsackMemorization(wt, val, w, n - 1, dp)
            );
        } else { //no
            dp[n][w] = knapsackMemorization(wt, val, w, n - 1, dp);
        }
        return dp[n][w];
    }

    public static void main(String args[]) {
//        int[] wt = {1, 3, 4, 5};
//        int[] val = {1, 4, 5, 7};
//        int w = 7;
        int[] wt = {5, 5, 5, 7, 8, 9};
        int[] val = {12, 13, 15, 2, 3, 9};
        int w = 22;

        int n = wt.length;
        System.out.println(knapsackRecursive(wt, val, w, n));

        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsackMemorization(wt, val, w, n, dp));

    }
}
