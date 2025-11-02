public class DynamicQueue extends QueueImpl {
    @Override
    public void enqueue(int ele) {
        if (isFull()) {
            int[] newArr = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        super.enqueue(ele);
    }

    public static void main(String args[]) {
        QueueImpl q = new DynamicQueue();

        System.out.println(q.isEmpty());

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println(q.size());

        System.out.println(q.dequeue()); // 1
        System.out.println(q.dequeue()); // 1
        System.out.println(q.dequeue()); // 1
//        System.out.println(q.dequeue()); // 1
//        System.out.println(q.dequeue()); // 1
//        System.out.println(q.dequeue()); // 1

        System.out.println(q.size());
    }
}
