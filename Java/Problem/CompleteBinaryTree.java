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

        while(!Tree.isEmpty){
            
        }
    }
    public static void main (String args[]){

    }
}