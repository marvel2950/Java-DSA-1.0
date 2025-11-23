import java.util.Arrays;
import java.util.Comparator;

public class CarsClient {
    public static void main(String args[]) {
        Cars[] arr = new Cars[5];
        arr[0] = new Cars(6789, 80, "Green");
        arr[1] = new Cars(6789, 200, "Blue");
        arr[2] = new Cars(10000, 1000, "Green");
        arr[3] = new Cars(999, 70, "Orange");
        arr[4] = new Cars(10, 1, "Red");

        display(arr);

//        Arrays.sort(arr, new Comparator<Cars>() {
//            @Override
//            public int compare(Cars o1, Cars o2) {
//                return o1.price - o2.price;
//            }
//        });

//        Arrays.sort(arr, new Comparator<Cars>() {
//            @Override
//            public int compare(Cars o1, Cars o2) {
//                return o2.price - o1.price;
//            }
//        });

        display(arr);

//        Arrays.sort(arr, new Comparator<Cars>() {
//            @Override
//            public int compare(Cars o1, Cars o2) {
//                return o2.speed - o1.speed;
//            }
//        });
        display(arr);

        bubbleSort(arr);
        display(arr);

    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int turn = 1; turn < arr.length; turn++) {
            for (int i = 0; i <arr.length-turn ; i++) {
                if(arr[i].compareTo(arr[i+1]) > 0) {
                    T temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }


    public static void display(Cars[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

}
