public class BinarySearchTreeClient {
    public static void main(String... args) {
        BinarySearchTree bst = new BinarySearchTree(); // Tree create
        bst.display();
        bst.levelOrderTraversal();
        bst.preOrder();
        bst.postOrder();
        bst.inOrder();
        System.out.println("Hello Akarsh!");
    }

}
