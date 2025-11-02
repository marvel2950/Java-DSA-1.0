public class Addition {

    public static void main(String... arggs) {
//        System.out.println(arggs.length);
//        System.out.println(add(5, 10));
//        Long l = Long.valueOf(245555);
//        System.out.println(add(5, l));
//        System.out.println(add(5.5f, 9.1f));
        add(1.9f, 2, 1, 2, 5, 8, 9);
    }

    // int... => int[]
    public static void add(float a, int x, int... b) {
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

//    public static long add(int a, int b) {
//        return a + b;
//    }

    public static int add(int a, long b) {
        System.out.println("int long");
        return ((int) b) + a;
    }

    public static float add(float a, float b) {
        return a + b;
    }


}
