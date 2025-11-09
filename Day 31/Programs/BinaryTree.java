import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

    private class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;

    Scanner sc = new Scanner(System.in);

    public BinaryTree() {
        root = createTree();
    }

    private Node createTree() {
        int val = sc.nextInt();
        Node nn = new Node();
        nn.val = val;

        boolean hasLeftChild = sc.nextBoolean();
        if (hasLeftChild) {
            nn.left = createTree();
        }

        boolean hasRightChild = sc.nextBoolean();
        if (hasRightChild) {
            nn.right = createTree();
        }
        return nn;
    }

    public void display() {
        display(root);
    }

    public void display(Node nn) {
        if (nn == null) {
            return;
        }

        String ans = " <-- " + nn.val + " --> ";

        if (nn.left != null) {
            ans = nn.left.val + ans;
        } else {
            ans = "." + ans;
        }

        if (nn.right != null) {
            ans = ans + nn.right.val;
        } else {
            ans = ans + ".";
        }

        System.out.println(ans);
        display(nn.left);
        display(nn.right);
    }

    public void levelOrderTraversal() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node nn = q.poll(); // remove first
            System.out.print(nn.val + " ");

            if (nn.left != null) {
                q.add(nn.left);
            }

            if (nn.right != null) {
                q.add(nn.right);
            }
        }
        System.out.println();
    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    public void preOrder(Node nn) {
        if (nn == null) {
            return;
        }
        System.out.print(nn.val + " ");
        preOrder(nn.left);
        preOrder(nn.right);
    }

    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    public void postOrder(Node nn) {
        if (nn == null) {
            return;
        }
        postOrder(nn.left);
        postOrder(nn.right);
        System.out.print(nn.val + " ");
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    public void inOrder(Node nn) {
        if (nn == null) {
            return;
        }
        inOrder(nn.left);
        System.out.print(nn.val + " ");
        inOrder(nn.right);
    }

}
