public class Power {
    public static void main(String[] args) {
        int a = 3;
        int n = 4;
        System.out.println(power(a, n));
    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int m = power(a, n - 1);
        return m * a;
    }
}
