class mergeTree{
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val=x;
        }

    }
    public TreeNode mergeTwo(TreeNode t1,TreeNode t2){
        if(t1==null){
            return t2;
        }
        if(t2==null){
            return t1;
        }
        t2.val=+t1.val;
        t2.left=mergeTwo(t1.left,t2.left);
        t2.right=mergeTwo(t1.right,t2.right);
        return t2;
    }
}