public class BinarySearchTree extends BinaryTree {

    public BinarySearchTree(){
        super(true);
        root = createTree();
    }

    private Node createTree() {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }
        return root;
    }

    private Node insert(Node root, int val) {
        if (root == null) {
            Node node = new Node();
            node.val = val;
            return node;
        }

        if (root.val > val) {
            root.left = insert(root.left, val);
        }
        if (root.val < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    private Node insertIter(Node nn, int val) {
        Node node = new Node();
        node.val = val;
        if(nn == null) {
            return node;
        }
        Node cur = nn;
        Node parent = null;
        while(cur != null) {
            parent = cur;
            if(val < cur.val) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        if( val < parent.val) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        return nn;
    }
}
