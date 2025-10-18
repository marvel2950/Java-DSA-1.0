public class QueueClient {
    public static void main(String args[]) {
        QueueImpl q = new QueueImpl();

        System.out.println(q.isEmpty());

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println(q.size());

        System.out.println(q.dequeue()); // 1
//        System.out.println(q.dequeue()); // 1
//        System.out.println(q.dequeue()); // 1
//        System.out.println(q.dequeue()); // 1
//        System.out.println(q.dequeue()); // 1
//        System.out.println(q.dequeue()); // 1

        System.out.println(q.size());
    }
}
