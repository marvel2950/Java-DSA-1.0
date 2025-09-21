import java.util.*;

class Solution {
    public void subset(String ip, String op, List<String> ans){
        if(ip.length()==0){
            ans.add(op);
            System.out.println(op);
            return;
        }
        char ch = ip.charAt(0);
        if(Character.isAlphabetic(ch)){
            subset(ip.substring(1), op+Character.toUpperCase(ch), ans);
            subset(ip.substring(1), op+Character.toLowerCase(ch), ans);
        }
        else{
            subset(ip.substring(1), op+ch, ans);
        }
    }
    
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        String ip = s;
        String op = "";
        subset(ip, op, ans);
        return ans;
    }
}