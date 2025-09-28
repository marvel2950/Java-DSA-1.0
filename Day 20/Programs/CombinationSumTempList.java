import java.util.*;

public class CombinationSumTempList {
    public static void main(String[] args) {
        int[] coin = { 2, 3, 6, 7 };
        int amount = 7;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        comb(coin, amount, list, 0, ans);
        System.out.println(ans);
    }

    public static void comb(int[] coin, int amount, List<Integer> list, int idx,
            List<List<Integer>> ans) {
        if (amount == 0) {
            // System.out.println(ll);
            ans.add(list);
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if (amount >= coin[i]) {
                List<Integer> tempList = new ArrayList<>(list);
                tempList.add(coin[i]);
                comb(coin, amount - coin[i], tempList, i, ans);
            }
        }
    }

}
