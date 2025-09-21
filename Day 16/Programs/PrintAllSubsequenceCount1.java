public class PrintAllSubsequenceCount1 {
    public static void main(String[] args) {
        String ip = "abc";
        String op = "";
        subsequenceCount(ip, op);
        System.out.println("\n" + count);
    }

    static int count = 0;

    public static void subsequenceCount(String ip, String op) {
        if (ip.length() == 0) {
            System.out.println(op);
            count++;
            return;
        }
        subsequenceCount(ip.substring(1), op);
        subsequenceCount(ip.substring(1), op + ip.charAt(0));
    }
}