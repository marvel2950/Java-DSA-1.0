
public class QueenPermutations {

    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int tq = 2; // total queen
        perm(board, tq, 0, "");
    }

    // qpsf -> queen placed so far
    public static void perm(boolean[] board, int tq, int qpsf, String ans) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true; // queen placed
                perm(board, tq, qpsf + 1, ans + " b" + i + " q" + qpsf);
                board[i] = false; // queen removed -> backtracking
                // DRY RUN before doing backtracking
            }
        }
    }
}
