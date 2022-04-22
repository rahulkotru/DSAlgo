class binaryTreeRightOnly{
    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int data;
        TreeNode(int val){
            this.data = val;
        }
    }

    class Solution {
        public List<Integer> rightSideTraversal(TreeNode root){
            List<Integer> res=new ArrayList<Integer>();
            Queue<TreeNode> queue=new LinkedList();
            if(root==null){
                return res;
            }
            queue.offer(root);
            while(!queue.isEmpty()){
                
            }
        }
    }
}