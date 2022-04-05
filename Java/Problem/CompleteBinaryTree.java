public class CompleteBinaryTree{
    public class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        TreeNode(int data){
            this.data=data;
        }
    }
    public boolean isComplete(TreeNode root){
        boolean end=false;
        Queue<TreeNode> Tree = new LinkedList<>();
        Tree.offer(root);

        while(!Tree.isEmpty()){
            TreeNode current= Tree.poll();
            if(current==null){
                end=true;
            }
            else{
                if(end){
                    return false;
                }
                Tree.offer(current.left);
                Tree.offer(current.right);
            }
        }
    }
    public static void main (String args[]){

    }
}