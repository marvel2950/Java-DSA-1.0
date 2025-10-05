class Solution { 
    public int countPrimes(int n) { 
        int count = 0; 
        for (int i = 2; i < n; i++) { 
            if (isPrime(i)) { 
                count++; 
            } 
        } 
        return count; 
    } 
     
    public boolean isPrime(int x) { 
        for (int d = 2; d <= x-1; d++) { 
            if (x % d == 0) { 
                return false; 
            } 
        } 
        return true; 
    } 
} 