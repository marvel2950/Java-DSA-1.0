
public class GridPathFinder {

    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        path(0, 0, n - 1, m - 1, "");
    }
    // cr--> current row, cc--> current col, er--> end row, ec--> end col

    public static void path(int cr, int cc, int er, int ec, String ans) {
        if (cr == er && cc == ec) {
            System.out.println(ans + "STOP");
            return;
        }
        if (cr > er || cc > ec) {
            return;
        }
        path(cr, cc + 1, er, ec, ans + "H -> ");
        path(cr + 1, cc, er, ec, ans + "V -> ");
    }

}
