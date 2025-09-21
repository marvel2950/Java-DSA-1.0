public class LexicographicalCounting {
    public static void main(String[] args) {
        int n = 1000;
        lexicographicalCounting(0, n);
    }

    public static void lexicographicalCounting(int curr, int n) {
        if (curr > n) {
            return;
        }
        System.out.println(curr);
        int i = 0;
        if (curr == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            lexicographicalCounting(curr * 10 + i, n);
        }
    }
}
