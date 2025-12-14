import java.util.Arrays;

public class Fibonacci {
    private static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    private static int fibMem(int n, int[] dp) {
        if(dp[n] != -1) {
            return dp[n];
        }
        if (n == 1) {
            dp[n] = 0;
            return 0;
        } else if (n == 2) {
            dp[n] = 1;
            return 1;
        }
        dp[n] = fibMem(n - 1, dp) + fibMem(n - 2, dp);
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 20;
        System.out.println(fib(n));

        int[] dp = new int[n+1];
//        for(int i=0; i<n+1; i++) {
//            dp[i] = -1;
//        }
        Arrays.fill(dp, -1);
        System.out.println(Arrays.toString(dp));

        System.out.println(fibMem(n, dp));

    }

}
