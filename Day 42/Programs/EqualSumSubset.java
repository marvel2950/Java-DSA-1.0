class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++) {
            sum = sum + nums[i];
        }
        if(sum%2 != 0) { //odd
            return false;
        }
        int wt = sum/2;
        Boolean[][] dp = new Boolean[n+1][wt+1];
        return knapsack(nums, wt, n, dp);
    }

    Boolean knapsack(int[] nums, int wt, int n, Boolean[][] dp) {
        if(dp[n][wt] != null) {
            return dp[n][wt];
        }
        if(wt == 0) {
            dp[n][wt] = true;
            return dp[n][wt];
        }
        if(n == 0) {
            dp[n][wt] = false;
            return dp[n][wt];
        }
        if(nums[n-1] <= wt) { // yes & no
            dp[n][wt] = knapsack(nums, wt - nums[n-1], n-1, dp) || knapsack(nums, wt, n-1, dp);
            return dp[n][wt];
        } else { // no
            dp[n][wt] = knapsack(nums, wt, n-1, dp);
            return dp[n][wt];
        }

    }
}