
public class DicePathCombinations {

    public static void main(String[] args) {
        int n = 4;
        printPath(n, 0, "");
    }

    public static void printPath(int n, int curr, String ans) {
        if (curr == n) {
            System.out.println(ans);
            return;
        }
        if (curr > n) {
            return;
        }
        // for (int dice = 1; dice <= 3; dice++) {
        // printPath(n, curr + dice, ans + dice);
        // }
        printPath(n, curr + 1, ans + 1);
        printPath(n, curr + 2, ans + 2);
        printPath(n, curr + 3, ans + 3);
    }
}
