
import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        return parentheses(n, 0, 0, "", new ArrayList<>());
    }

    public static List<String> parentheses(int n, int open, int closed, String ans,
            List<String> ll) {
        if (open == n && closed == n) {
            ll.add(ans);
            return ll;
        }
        if (open > n || closed > open) {
            return ll;
        }
        parentheses(n, open + 1, closed, ans + "(", ll);
        parentheses(n, open, closed + 1, ans + ")", ll);
        return ll;
    }
}
