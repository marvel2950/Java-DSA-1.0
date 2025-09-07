public class PrintNumbersFrom1ToN {
    public static void main(String[] args) {
        int n = 5;
        printIncreasing(n);
    }

    public static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }
}
