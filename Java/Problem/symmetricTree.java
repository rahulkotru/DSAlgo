class SymmetricTree{
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
        }
    }
    class Solution{
        public boolean isSymmetric(TreeNode root){
            return isMirror(root,root);
        }
        public boolean isMirror(TreeNode r1,TreeNode r2){
            if(r1==null && r2==null){
                return true;
            }
            if(r1==null||r2==null){
                return false;
            }
            return(t1.val==t2.val)&& isMirror(r1.left,r2.right)&&(r1.right,r2.left)
        }

    }
}