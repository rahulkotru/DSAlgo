class invertBinaryTree{
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val=x;
        }
    }
    class Solution{
        public TreeNode invertTree(TreeNode root){
            if(root==null){
                return root;
            }
            TreeNode left=invertTree(root.left);
            TreeNode right=invertTree(root.right);
            root.right=left;
            root.left=right;
            return root;

        }
    }
    public static void main(String[] args){
        
    }
}