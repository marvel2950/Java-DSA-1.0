import java.util.Stack;

public class StackJava {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.capacity());
        System.out.println(st.size() + "\n");

        // push
        st.push(5);
        st.push(10);
        st.push(5);
        st.push(10);
        st.push(5);
        st.push(10);
        st.push(5);
        st.push(10);
        st.push(5);
        st.push(10);
        System.out.println(st.capacity());
        System.out.println(st.size() + "\n");

        st.push(11);
        System.out.println(st.capacity());
        System.out.println(st.size() + "\n");

        // peek/top
        System.out.println(st.peek());

        System.out.println(st);
        //pop
        st.pop(); // 11
        st.pop(); // 10
        st.pop(); // 5

        System.out.println(st);

        for(int x: st){
            System.out.println(x);
        }
    }
}
