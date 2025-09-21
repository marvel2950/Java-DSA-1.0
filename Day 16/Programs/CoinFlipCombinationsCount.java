public class CoinFlipCombinationsCount {
    public static void main(String[] args) {
        int n = 4;
        String op = "";
        System.out.println("\n" + combinations(n, ""));
    }

    public static int combinations(int n, String op) {
        if (n == 0) {
            System.out.println(op);
            return 1;
        }
        int a = combinations(n - 1, op + "H");
        int b = combinations(n - 1, op + "T");
        return a + b;
    }
}
