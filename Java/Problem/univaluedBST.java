class univaluedBST{
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
        }
    }
    class Solution {
        public boolean isUnivalTree(TreeNode root){
            boolean leftUnival=root.left==null||root.left.val==root.val&&isUnivalTree(root.left);
            boolean rightUnival=root.right==null||root.right.val==root.val&&isUnivalTree(root.right);
            return leftUnival&&rightUnival;
        }
    }
    public static void main(String[] args){
        
    }

}