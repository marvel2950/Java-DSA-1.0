class Solution {
    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }

        int[] prime = new int[n];
        prime[0] = prime[1] = 1; // 0 & 1 is not a prime number

        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i] == 0) {
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = 1;
                }
            }
        }

        int c = 0;
        for (int i = 2; i < prime.length; i++) {
            if (prime[i] == 0) {
                c++;
            }
        }
        return c;
    }

}