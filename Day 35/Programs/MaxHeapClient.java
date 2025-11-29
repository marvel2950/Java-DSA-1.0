import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapClient {

    public static void main(String args[]) {
        int[] arr = {40, 30, 50, 10, 20, 60, 70, 5, 15, 2};

        MaxHeap maxHeap = new MaxHeap(arr);
        System.out.println(maxHeap.peek());
        System.out.println(maxHeap.getHeap());
        System.out.println(maxHeap.remove());
        System.out.println(maxHeap.getHeap());

        PriorityQueue<Integer> minPQ = new PriorityQueue<>(); // min heap
        for (int item : arr) {
            minPQ.add(item);
        }

        System.out.println(minPQ.peek());
        System.out.println(minPQ.remove());

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        for (int item : arr) {
            maxPQ.add(item);
        }

        System.out.println(maxPQ.peek());
        System.out.println(maxPQ.remove());

    }
}
