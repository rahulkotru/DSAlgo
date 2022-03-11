class bottomLeftTree{
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int data){
            this.val=data;
        }
    }
    class Solution{
        public int findBottomLeft(TreeNode root){
            Queue<TreeNode> queue=new LinkedList();
            queue.offer(root);
            while(!queue.isEmpty()){
                root=queue.poll();
                if(root.right!=null){
                    queue.offer(root.right);
                }
            }
        }
    }
}