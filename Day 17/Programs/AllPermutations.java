public class AllPermutations {
    public static void main(String[] args) {
        String ip = "abc";
        String op = "";
        printPerm(ip, op);
    }

    public static void printPerm(String ip, String op) {
        if (ip.length() == 0) {
            System.out.println(op);
            return;
        }
        for (int i = 0; i < ip.length(); i++) {
            char ch = ip.charAt(i);
            String s1 = ip.substring(0, i);
            String s2 = ip.substring(i + 1);
            printPerm(s1 + s2, op + ch);
        }
    }
}
