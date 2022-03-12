class sumBST{
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode( int data){
            this.val=data;
        }
    }
    class Solution {
        public int sumIterative(TreeNode root, int L, int R){
            int rangeSum=0;
            Stack<TreeNode> stack= new Stack();
            stack.push(root);
            while(!stack.isEmpty()){
                TreeNode node=stack.pop();
                if(node!=null){
                    
                }
            }
        }   
    }
}