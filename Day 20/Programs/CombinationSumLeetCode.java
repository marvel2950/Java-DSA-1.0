import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int idx = 0;
        comb(candidates, target, list, idx, ans);
        return ans;
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