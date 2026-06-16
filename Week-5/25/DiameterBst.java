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
        class DiameterBst {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] dia=new int[1];
        fun(root,dia);
        return dia[0];
    }
    private int fun (TreeNode root ,int[] dia ){
        if(root==null){
            return 0;
        }
        int lt=fun(root.left,dia);
        int rt=fun(root.right,dia);
        dia[0]=Math.max(dia[0],lt+rt);
        return 1+Math.max(lt,rt);

    }
    public static void main(String[] args) {
        DiameterBst bst=new DiameterBst();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        System.out.println(bst.diameterOfBinaryTree(root));
    }
}