public class LongestCommonSubsequence {
    public static void main(String args[]) {
        String x = "acbcf";
        String y = "abcdaf";

        int n = x.length();
        int m = y.length();

        System.out.println(lcsRecursive(x, y, n, m));

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j] = -1;
            }
        }
//        System.out.println(lcsMemorised(x, y, n, m, dp));
        System.out.println(lcsTabulation(x, y, n, m, dp));

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(printLCS(x, y, n, m, dp));
    }

    static String printLCS(String x, String y, int n, int m, int[][] dp) {
        int i = n;
        int j = m;

//        String ans = "";
        StringBuilder ans = new StringBuilder();
        while (i > 0 && j > 0) {
            if (x.charAt(i - 1) == y.charAt(j - 1)) {
                ans.append(x.charAt(i - 1));
//                ans = ans + x.charAt(i - 1);
                i--;
                j--;
            } else {
                if (dp[i - 1][j] > dp[i][j - 1]) { // move to top
                    i--;
                } else { // move left
                    j--;
                }
            }
        }
        return ans.reverse().toString();
    }

    private static int lcsMemorised(String x, String y, int n, int m, int[][] dp) {
        if (n == 0 || m == 0) {
            dp[n][m] = 0;
            return dp[n][m];
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            dp[n][m] = 1 + lcsMemorised(x, y, n - 1, m - 1, dp);
        } else {
            dp[n][m] = Math.max(
                    lcsMemorised(x, y, n - 1, m, dp),
                    lcsMemorised(x, y, n, m - 1, dp)
            );
        }
        return dp[n][m];
    }

    private static int lcsRecursive(String x, String y, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            return 1 + lcsRecursive(x, y, n - 1, m - 1);
        }
        return Math.max(
                lcsRecursive(x, y, n - 1, m),
                lcsRecursive(x, y, n, m - 1)
        );
    }

    private static int lcsTabulation(String x, String y, int n, int m, int[][] dp) {
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(
                            dp[i - 1][j], dp[i][j - 1]
                    );
                }
            }
        }
        return dp[n][m];
    }

}
