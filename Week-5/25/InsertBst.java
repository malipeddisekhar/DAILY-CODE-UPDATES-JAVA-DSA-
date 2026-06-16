class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class InsertBst {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
        {
            return new TreeNode(val);
        }
        if(val<root.val)
        {
          root.left=insertIntoBST(root.left,val);
        }
        else
        {
            root.right=insertIntoBST(root.right,val);
        }
        return root;
    }
    public static void main(String[] args) {
        InsertBst bst=new InsertBst();
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        bst.insertIntoBST(root,5);
    }
}//Leetcode 701