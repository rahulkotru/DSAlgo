import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

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
    public void iterativeInOrder(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode temp=root;
        System.out.println("");
        while(!stack.isEmpty()|| temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            else{
                temp=stack.pop();
                System.out.print(temp.data+"-->");
                temp=temp.right;
            }
        }
    }
    public void iterativePostOrder(TreeNode root){
        TreeNode current=root;
        Stack<TreeNode> stack=new Stack<>();
        while(current!=null||!stack.isEmpty()){
            if(current!=null){
                stack.push(current);
                current=current.left;
            }
            else{
                TreeNode temp=stack.peek().right;
                if(temp==null){
                    temp=stack.pop();
                    System.out.println(temp.data+" ");
                    while(!stack.isEmpty()&&temp==stack.peek().right){
                        temp=stack.pop();
                        System.out.println(temp.data+"");
                    }
                }
                else{
                current=temp;
                }
            }

        }
    }

    public void recursivePostOrder(TreeNode root){
        if(root==null){
            return;
        }
        recursivePostOrder(root.left);
        recursivePostOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp= queue.poll();
            System.out.println(temp.data+"-> ");
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
        
    }
    public static void main(String[] args) {
        BinaryTree tr=new BinaryTree();
        tr.createTree();
        tr.recursivePreOrder(tr.root);
        tr.iterativePreOrder(tr.root);
        tr.recursiveInOrder(tr.root);
        tr.iterativeInOrder(tr.root);
        tr.recursivePostOrder(tr.root);
        tr.iterativePostOrder(tr.root);
        levelOrder(tr.root);
    }
}