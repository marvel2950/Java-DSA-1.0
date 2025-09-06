public class MaximumSumOfKConsecutiveElementsSlidingWindow {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 5, 7, 8, 9, 1 };
        int k = 3;
        System.out.println(maxiumSum(arr, k));
    }

    public static int maxiumSum(int[] arr, int k) {
        int ans = 0;
        int sum = 0;

        // 1st window calculation
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        ans = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i]; // Grow
            sum -= arr[i - k]; // Shrink
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}