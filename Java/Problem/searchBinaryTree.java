class searchBinaryTree{
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
        }
    }
    class Solution{
        public TreeNode search(TreeNode root,int val){
            if(root==null|| root.data==val)return root;
        }
    }
}