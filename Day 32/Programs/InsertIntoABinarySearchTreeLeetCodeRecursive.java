class Solution {
    public TreeNode insertIntoBST(TreeNode nn, int val) {
        return insert(nn, val);
    }

    private TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            TreeNode node = new TreeNode();
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
}