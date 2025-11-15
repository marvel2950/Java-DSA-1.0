class Solution {
    public TreeNode insertIntoBST(TreeNode nn, int val) {
        TreeNode node = new TreeNode();
        node.val = val;
        if(nn == null) {
            return node;
        }
        TreeNode cur = nn;
        TreeNode parent = null;
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