public class MaximumSumOfKConsecutiveElementsBruteForce { 
    public static void main(String[] args) { 
        int[] arr = { 2, 3, 5, 1, 5, 7, 8, 9, 1 }; 
        int k = 3; 
        System.out.println(maximumSumBruteForce(arr, k)); // Output: 24 
    } 
 
    public static int maximumSumBruteForce(int[] arr, int k) { 
        int n = arr.length; 
        int maxSum = Integer.MIN_VALUE; 
 
        // Loop through all possible subarrays of size k 
        for (int i = 0; i <= n - k; i++) { 
            int currentSum = 0; 
 
            // Calculate sum of subarray starting at i 
            for (int j = i; j < i + k; j++) { 
                currentSum += arr[j]; 
            } 
 
            // Update maximum sum 
            maxSum = Math.max(maxSum, currentSum); 
        } 
 
        return maxSum; 
    } 
} 