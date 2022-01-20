public class BinarySearchTree{
    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data=data;
            }
    }
    public void insert(int val){
        root=insert(root, val);
    }
    public static TreeNode insert(TreeNode root, int val){
        if(root == null){
            return root;
        }
        if(val<root.data){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+"");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        BinarySearchTree bts=new BinarySearchTree();
        bts.insert(5);
        bts.insert(3);
        bts.insert(7);
        bts.insert(1);

        bts.inOrder();
    }
}