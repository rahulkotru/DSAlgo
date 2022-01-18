public class BinaryTree{
    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data=data;
        }
    }
    public void createTree(){
        TreeNode first= new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode third= new TreeNode(3);
        TreeNode fourth=new TreeNode(4);
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
    }
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        BinaryTree tr=new BinaryTree();
        tr.createTree();
        tr.preOrder(tr.root);
    }
}