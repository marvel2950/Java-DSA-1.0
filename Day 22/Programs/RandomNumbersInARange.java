import java.util.*;

public class RandomNumbersInARange {
    public static void main(String[] args) {

        int lo = 10;
        int hi = 100;
        Random rn = new Random();

        System.out.println("y | x");
        System.out.println("------");

        for (int i = 0; i < 10; i++) {

            // 91 --> 0 to 90 (will provide)
            int y = rn.nextInt(hi - lo + 1);
            System.out.print(y + "|");

            // 0+10 to 90+10 (will provide)
            int x = rn.nextInt(hi - lo + 1) + lo;
            System.out.print(x + " ");

            System.out.println();
        }

    }
}
