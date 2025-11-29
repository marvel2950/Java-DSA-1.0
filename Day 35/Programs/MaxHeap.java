import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

    private List<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public MaxHeap(int[] items) {
        this();
        for (int item : items) {
            this.push(item);
        }
    }

    public void push(int item) {
        heap.add(item);
        floatUp(heap.size() - 1);
    }

    private void floatUp(int i) {
        if (i == 0) {
            return;
        }
        int parent = (i - 1) / 2;
        if (heap.get(i) > heap.get(parent)) {
            swap(i, parent);
            floatUp(parent);
        }
    }

    private void swap(int i, int parent) {
        int temp = heap.get(i);
        heap.set(i, heap.get(parent));
        heap.set(parent, temp);
    }

    protected Integer peek() {
        if (heap.size() == 0) {
            return null;
        }
        return heap.get(0);
    }

    protected List<Integer> getHeap() {
        return heap;
    }

    public Integer remove() {
        if (heap.size() == 0) {
            return null;
        }
        if (heap.size() == 1) {
            return heap.remove(0);
        }

        int max = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        bubbleDown(0);
        return max;
    }

    private void bubbleDown(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int largest = i;

        if(left < heap.size() && heap.get(left) > heap.get(largest)){
            largest = left;
        }

        if(right < heap.size() && heap.get(right) > heap.get(largest)){
            largest = right;
        }

        if(largest != i) {
            swap(i, largest);
            bubbleDown(largest);
        }
    }
}
