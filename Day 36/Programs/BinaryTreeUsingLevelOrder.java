import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUsingLevelOrder extends BinaryTree {

    public BinaryTreeUsingLevelOrder() {
        super(true);
        root = createTree();
    }

    public BinaryTreeUsingLevelOrder(int[] arr) {
        super(true);
        root = createTree(arr);
    }

    private Node createTree(int[] arr) {
        int index = 0;
        Queue<Node> q = new LinkedList<>();

        int item = arr[index++];
        Node nn = new Node();
        nn.val = item;
        root = nn;
        q.add(nn);

        while(!q.isEmpty()) {
            Node r = q.poll();

            int c1  = arr[index++];
            int c2 = arr[index++];

            if(c1 != -1) {
                Node node = new Node();
                node.val = c1;
                r.left = node;
                q.add(node);
            }

            if(c2 != -1) {
                Node node = new Node();
                node.val = c2;
                r.right = node;
                q.add(node);
            }
        }
        return root;
    }

    private Node createTree() {
        Queue<Node> q = new LinkedList<>();

        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        root = nn;
        q.add(nn);

        while(!q.isEmpty()) {
            Node r = q.poll();

            int c1  = sc.nextInt();
            int c2 = sc.nextInt();

            if(c1 != -1) {
                Node node = new Node();
                node.val = c1;
                r.left = node;
                q.add(node);
            }

            if(c2 != -1) {
                Node node = new Node();
                node.val = c2;
                r.right = node;
                q.add(node);
            }
        }
        return root;
    }
}
