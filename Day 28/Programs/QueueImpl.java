public class QueueImpl {
    protected int[] arr;

    private int front = 0;
    private int rear = 0;

    private int size = 0;

    private static int maxSize = 5;

    public QueueImpl() {
        this(maxSize);
    }

    public QueueImpl(int n) {
        arr = new int[n];
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int ele) {
        arr[rear] = ele;
        rear++;
        size++;
    }

    public int dequeue() {
        int ele = arr[front];
        front++;
        size--;
        return ele;
    }

    public int peek() {
        return arr[front];
    }


}
