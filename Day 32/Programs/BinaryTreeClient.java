public class BinaryTreeClient {
    public static void main(String... args) {
        BinaryTree bt = new BinaryTree(); // Tree create
        bt.display();
        bt.levelOrderTraversal();
        bt.preOrder();
        bt.postOrder();
        bt.inOrder();
        System.out.println("Hello Akarsh!");
    }

}
