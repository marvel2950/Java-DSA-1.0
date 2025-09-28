import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        String ip = s;
        List<String> list = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        partition(ip, list, ans);
        return ans;
    }

    public static void partition(String ip, List<String> list, List<List<String>> ans) {
        if (ip.length() == 0) {
            ans.add(list);
            return;
        }
        for (int cut = 1; cut <= ip.length(); cut++) {
            String prefix = ip.substring(0, cut);
            if (isPalindrome(prefix)) {
                List<String> tempList = new ArrayList<>(list);
                tempList.add(prefix);
                String rest = ip.substring(cut);
                partition(rest, tempList, ans);
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}