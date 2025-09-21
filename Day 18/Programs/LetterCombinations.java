import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        String ip = digits;
        String op = "";
        List<String> list = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return list;
        letterCombinationsUtil(ip, op, list);
        return list;
    }

    static String[] keys = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv",
            "wxyz" };

    public static void letterCombinationsUtil(String ip, String op, List<String> list) {
        if (ip.length() == 0) {
            list.add(op);
            return;
        }
        String ch = ip.charAt(0) + "";
        String pressedKey = keys[Integer.valueOf(ch)];
        for (int i = 0; i < pressedKey.length(); i++) {
            letterCombinationsUtil(ip.substring(1), op + pressedKey.charAt(i), list);
        }
    }
}
