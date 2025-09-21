public class PowerFunction {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        System.out.println(pow(a, b));
        System.out.println(pow1(a, b));
    }

    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return pow(a, b / 2) * pow(a, b / 2);
        } else {
            return 2 * pow(a, b / 2) * pow(a, b / 2);
        }
    }

    public static int pow1(int a, int b) {
        if (b == 0) {
            return 1;
        }
        int half = pow1(a, b / 2);
        if (b % 2 == 0) {
            return half * half;
        } else {
            return 2 * half * half;
        }
    }
}
