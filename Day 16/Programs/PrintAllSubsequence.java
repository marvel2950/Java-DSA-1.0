public class PrintAllSubsequence {
    public static void main(String[] args) {
        String ip = "abc";
        String op = "";
        subsequence(ip, op);
    }

    public static void subsequence(String ip, String op) {
        if (ip.length() == 0) {
            System.out.println(op);
            return;
        }
        subsequence(ip.substring(1), op);
        subsequence(ip.substring(1), op + ip.charAt(0));
    }
}
