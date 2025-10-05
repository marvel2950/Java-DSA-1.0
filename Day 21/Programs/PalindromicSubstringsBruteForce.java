class Solution {
    public int countSubstrings(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            String op = "";
            for (int j = i; j < s.length(); j++) {
                op = op + s.charAt(j);
                // System.out.println(op);
                if (isPalindrome(op)) {
                    c = c + 1;
                }
            }
        }
        return c;
    }

    public static boolean isPalindrome(String x) {
        int i = 0;
        int j = x.length() - 1;

        while (i < j) {
            if (x.charAt(i) != x.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}