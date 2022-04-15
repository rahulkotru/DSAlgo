class searchBinaryTree{
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    class Solution{
        public TreeNode search(TreeNode root,int val){
            if(root==null|| root.data==val)return root;
            TreeNode current=root;
            if(val<root.val){
                return search(root.left,val);
            }
            else{
                return search(root.right,val);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}