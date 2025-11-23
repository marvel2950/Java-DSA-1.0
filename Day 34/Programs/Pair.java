public class Pair<Q, W> {
    Q x;
    W y;

    Pair() {

    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Pair(Q x, W y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String args[]) {
        Pair<Integer, Float> p1 = new Pair<>();
        Pair<Character, String> p2 = new Pair<>('a', "akarsh");

        System.out.println(p2);
    }

}
