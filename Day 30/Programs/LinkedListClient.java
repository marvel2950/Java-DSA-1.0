public class LinkedListClient {
    public static void main(String... args){
        LinkedListImpl ll = new LinkedListImpl();
        System.out.println(ll.getSize());
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addFirst(5);
//        System.out.println(ll.getSize());
        ll.display();

        ll.addLast(1);
        ll.addLast(0);
//        System.out.println(ll.getSize());
        ll.display();

        System.out.println(ll.removeFirst());
        ll.display();

        System.out.println(ll.getNode(3).val);

        System.out.println(ll.removeLast());
        ll.display();



    }

}
