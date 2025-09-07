class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split(" +");
        String op = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            op = op + arr[i] + " ";
        }
        return op.trim();
    }
}
