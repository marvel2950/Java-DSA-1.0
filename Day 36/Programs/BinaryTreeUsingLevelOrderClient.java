public class BinaryTreeUsingLevelOrderClient {
    public static void main(String... args) {
//        BinaryTreeUsingLevelOrder bt = new BinaryTreeUsingLevelOrder(); // Tree create
//        bt.display();
//        bt.levelOrderTraversal();
//        bt.preOrder();
//        bt.postOrder();
//        bt.inOrder();

        int[] arr = {10, 50, 70, 8, -1, -1, 9, -1, -1, 16, -1, -1, -1};
        BinaryTreeUsingLevelOrder bt2 = new BinaryTreeUsingLevelOrder(arr); // Tree create
        bt2.display();
        bt2.levelOrderTraversal();
        bt2.preOrder();
        bt2.postOrder();
        bt2.inOrder();
        System.out.println("Hello Akarsh!");
    }

}
