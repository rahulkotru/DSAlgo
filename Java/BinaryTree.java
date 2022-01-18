import java.util.Stack;
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
    public void recursivePreOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data+"-->");
        recursivePreOrder(root.left);
        recursivePreOrder(root.right);
    }
    public void iterativePreOrder(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            System.out.print(temp.data+"--> ");
            if(temp.right !=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
    }
    public void recursiveInOrder(TreeNode root){
        if(root==null){
            return;
        }
        recursiveInOrder(root.left);
        System.out.print(root.data+"--> ");
        recursiveInOrder(root.right);
    }
    public static void main(String[] args) {
        BinaryTree tr=new BinaryTree();
        tr.createTree();
        tr.recursivePreOrder(tr.root);
        tr.iterativePreOrder(tr.root);
        tr.recursiveInOrder(tr.root);
    }
}