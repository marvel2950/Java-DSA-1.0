public class StackClient {
    public static void main(String args[]) throws Exception {
        StackImpl st = new StackImpl();

        System.out.println(st.size());
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);

        System.out.println(st.size());
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());

        System.out.println(st.peek());

        System.out.println(st.pop()); // 9
        System.out.println(st.pop()); // 8
        System.out.println(st.pop()); // 7


    }
}
