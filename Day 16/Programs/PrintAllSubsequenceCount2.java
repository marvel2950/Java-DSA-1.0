public class PrintAllSubsequenceCount2 {
    public static void main(String[] args) {
        String ip = "abc";
        String op = "";
        System.out.println("\n" + subsequenceCount(ip, op));
    }

    public static int subsequenceCount(String ip, String op) {
        if (ip.length() == 0) {
            System.out.println(op);
            return 1;
        }
        int a = subsequenceCount(ip.substring(1), op);
        int b = subsequenceCount(ip.substring(1), op + ip.charAt(0));
        return a + b;
    }
}