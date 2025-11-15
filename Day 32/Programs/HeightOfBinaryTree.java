class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);

        int cd = Math.max(
                Math.max(ld, rd),
                height(root.left) + height(root.right)+2
        );
        return cd;

    }

    public int height(TreeNode root) {
        if(root == null) {
            return -1;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
}