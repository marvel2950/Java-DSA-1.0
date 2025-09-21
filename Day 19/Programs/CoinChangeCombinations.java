
public class CoinChangeCombinations {

    public static void main(String[] args) {
        int[] coin = { 1, 2, 4 };
        int amount = 6;
        comb(coin, amount, "", 0);
    }

    public static void comb(int[] coin, int amount, String ans, int idx) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if (amount >= coin[i]) {
                comb(coin, amount - coin[i], ans + coin[i], i);
            }
        }
    }
}