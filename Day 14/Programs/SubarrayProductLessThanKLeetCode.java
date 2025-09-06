class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1)
            return 0;

        int ans = 0;
        int end = 0, start = 0, prod = 1;
        while (end < nums.length) {
            // Grow
            prod = prod * nums[end];

            // Shrink
            while (prod >= k && start <= end) {
                prod /= nums[start];
                start++;
            }

            // calculate ans
            ans += (end - start + 1);

            end++;
        }
        return ans;
    }
}