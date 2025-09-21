
public class QueenCombinations {

    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int tq = 2; // total queen
        com(board, tq, 0, "", 0);
    }

    public static void com(boolean[] b, int tq, int qpsf, String ans, int idx) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < b.length; i++) {
            if (b[i] == false) {
                b[i] = true; // queen placed
                com(b, tq, qpsf + 1, ans + "b" + i + "q" + qpsf, i + 1);
                b[i] = false; // queen removed -> backtracking
            }
        }
    }
}
