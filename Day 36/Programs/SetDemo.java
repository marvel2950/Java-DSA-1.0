import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String args[]) {
//        Integer i = null;
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(4);
        set1.add(39);
        set1.add(-4);
        set1.add(89);
        set1.add(893);
//        set1.add(null);
//        set1.add(null);
        System.out.println(set1);

        System.out.println(set1.contains(9));
        System.out.println(set1.contains(4));
        System.out.println(set1.remove(4));
        System.out.println(set1.remove(9));
        System.out.println(set1.contains(4));

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(4);
        set2.add(39);
        set2.add(-4);
        set2.add(89);
        set2.add(893);
//        set2.add(null); // Error
        System.out.println(set2);

        System.out.println(set2.contains(9));
        System.out.println(set2.contains(4));
        System.out.println(set2.remove(4));
        System.out.println(set2.remove(9));
        System.out.println(set2.contains(4));

        LinkedHashSet<Integer> set3 = new LinkedHashSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(4);
        set3.add(4);
        set3.add(39);
        set3.add(-4);
        set3.add(89);
        set3.add(893);
        set3.add(null);
        System.out.println(set3);

        System.out.println(set3.contains(9));
        System.out.println(set3.contains(4));
        System.out.println(set3.remove(4));
        System.out.println(set3.remove(9));
        System.out.println(set3.contains(4));

        for(int val : set1) {
            System.out.print(val + " ");
//            set1.add(899);
        }
        System.out.println();

        for(int val : set2) {
            System.out.print(val + " ");
        }
        System.out.println();

        for(Integer val : set3) {
            System.out.print(val + " ");
        }
        System.out.println();

    }
}
