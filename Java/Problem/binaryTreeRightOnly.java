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
                int size=queue.size();
                for(int i=0;i<size;i++){
                    TreeNode currentNode=queue.poll();
                    if(i==0) res.add(currentNode.val);
                    if(currentNode.right!=null) queue.offer(currentNode.right);
                    if(currentNode.left!=null) queue
                }
            }
        }
    }
}