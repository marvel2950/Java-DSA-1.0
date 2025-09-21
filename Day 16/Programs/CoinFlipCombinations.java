public class CoinFlipCombinations {
    public static void main(String[] args) {
        int n = 3;
        String op = "";
        combinations(n, "");
    }

    public static void combinations(int n, String op) {
        if (n == 0) {
            System.out.println(op);
            return;
        }
        combinations(n - 1, op + "H");
        combinations(n - 1, op + "T");
    }
}