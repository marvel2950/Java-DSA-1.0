public class DyanamicStack extends StackImpl {

    DyanamicStack(){
        System.out.println("DynamicStack Param");
    }
    @Override
    public void push(int ele) throws Exception {
        if (isFull()) {
            int[] newArr = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        super.push(ele);
    }

    public static void main(String args[]) throws Exception {
//        DyanamicStack st = new DyanamicStack();
        StackImpl st = new DyanamicStack();


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
