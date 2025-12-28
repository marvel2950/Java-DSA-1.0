package g;

public class CoinChange {
    static int knapsackRecursive(int[] coins, int amount, int n) {
        if(amount == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        if (coins[n - 1] <= amount) { // yes & no
            return knapsackRecursive(coins, amount - coins[n - 1], n)
                    + knapsackRecursive(coins, amount, n - 1);
        } else { //no
            return knapsackRecursive(coins, amount, n - 1);
        }
    }

    static int knapsackMemorization(int[] coins, int amount, int n, int[][] dp) {
        if(dp[n][amount] != -1) {
            return dp[n][amount];
        }
        if(amount == 0) {
            dp[n][amount] = 1;
            return dp[n][amount];
        }
        if (n == 0) {
            dp[n][amount] = 0;
            return dp[n][amount];
        }

        if (coins[n - 1] <= amount) { // yes & no
            dp[n][amount] = knapsackRecursive(coins, amount - coins[n - 1], n)
                    + knapsackRecursive(coins, amount, n - 1);
            return dp[n][amount];
        } else { //no
            dp[n][amount] = knapsackRecursive(coins, amount, n - 1);
            return dp[n][amount];
        }
    }

    public static void main(String args[]) {
        int[] coins = {5, 2, 20, 10};
        int amount = 22;

        int n = coins.length;
        System.out.println(knapsackRecursive(coins, amount, n));

        int[][] dp = new int[n + 1][amount + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < amount + 1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsackMemorization(coins, amount, n, dp));

    }
}
