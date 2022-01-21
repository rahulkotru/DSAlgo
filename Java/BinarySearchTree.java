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
    public  TreeNode insert(TreeNode root, int val){
        if(root == null){
            root=new TreeNode(val);
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
        System.out.println("InOrder Traversal");
        inOrder(root);
    }
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+"-->");
        inOrder(root.right);
    }
    public TreeNode search(int key){
        return search(root,key);
    }
    public TreeNode search(TreeNode root,int key){
        if(root==null||root.data==key){
            return root;
        }
        if(key<root.data){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }
    public boolean isValid(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.data<=min||root.data>=max){
            return false;
        }
        boolean left=isValid(root.left,min,root.data);
        if(left){
            boolean right=isValid(root.right,root.data, max);
            return right;
        }
        return false;
    }
    public static void main(String[] args) {
        BinarySearchTree bts=new BinarySearchTree();
        bts.insert(5);
        bts.insert(3);
        bts.insert(7);
        bts.insert(1);
        bts.insert(4);
        bts.insert(9);

        bts.inOrder();

    }
}