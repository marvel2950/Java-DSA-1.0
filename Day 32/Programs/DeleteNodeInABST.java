class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
            return null;
        }

        if(root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        else {
            if(root.left == null && root.right == null) {
                return null;
            }
            else if( root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }
            else {
                int max = max(root.left);
                root.val = max;
                root.left = deleteNode(root.left, max);
            }
        }
        return root;
    }

    public int max(TreeNode node) {
        if(node == null) {
            return Integer.MIN_VALUE;
        }
        TreeNode cur = node;
        while(cur.right != null) {
            cur = cur.right;
        }
        return cur.val;
    }
}