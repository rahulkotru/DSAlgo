class binaryTreePruning{
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int data){
            this.val=data;
        }
    }
    class Solution{
        public TreeNode prune(TreeNode root){
            if(root==null) return null;
            containsOne(root);
            return root;
        }
        public boolean containsOne(TreeNode node){
            if(node==null)return false;
            boolean left_contains=containsOne(node.left);
            boolean right_contains=containsOne(node.right);
        }

    }
}