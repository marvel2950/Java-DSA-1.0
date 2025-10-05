public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(primeSieve(n));
    }

    // 1 -> not prime | 0 -> prime
    public static int primeSieve(int n) {
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
