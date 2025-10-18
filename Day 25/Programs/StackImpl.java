public class StackImpl {
    private int[] arr;
    private int top = -1;
    private static int maxSize = 5;

    public StackImpl() {
        this(maxSize);
    }

    public StackImpl(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isFull() {
        return size() == arr.length;
    }

    public void push(int ele) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is already full!");
        }
        top++;
        arr[top] = ele;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is already empty!");
        }
        return arr[top];
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is already empty!");
        }
        int ele = arr[top];
        top--;
        return ele;
    }
}



