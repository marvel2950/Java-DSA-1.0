import java.util.*;

public class CombinationSumBacktracking {
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
            // System.out.println(list);
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if (amount >= coin[i]) {
                list.add(coin[i]);
                comb(coin, amount - coin[i], list, i, ans);
                list.remove(list.size() - 1);
            }
        }
    }

}
