public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 4, 2 };
        int k = 10;
        System.out.println(Product_Less_Than_K(arr, k));
    }

    public static int Product_Less_Than_K(int[] arr, int k) {
        int ans = 0;
        int end = 0, start = 0, prod = 1;
        while (end < arr.length) {
            // Grow
            prod = prod * arr[end];

            // Shrink
            while (prod >= k) {
                prod /= arr[start];
                start++;
            }

            // calculate ans
            ans += (end - start + 1);

            end++;
        }
        return ans;
    }
}