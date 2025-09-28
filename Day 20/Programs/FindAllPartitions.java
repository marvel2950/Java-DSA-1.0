public class FindAllPartitions {
    public static void main(String[] args) {
        String ip = "nitin";
        String op = "";
        partition(ip, op);
    }

    public static void partition(String ip, String op) {
        if (ip.length() == 0) {
            System.out.println(op);
            return;
        }
        for (int cut = 1; cut <= ip.length(); cut++) {
            String prefix = ip.substring(0, cut);
            String rest = ip.substring(cut);
            partition(rest, op + prefix + "|");
        }
    }
}
