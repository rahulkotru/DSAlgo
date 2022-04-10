class flattenBinaryTreeToLinkedList{
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode (int val){
            this.data=val;
        }
    }
    class Solution{
        public void flatten(TreeNode root){
            if(root==null) return
            Stack<TreeNode> stack=new Stack();
            stack.push(root);
            while(!stack.isEmpty){
                TreeNode current=stack.pop();
                if(current.right!=null){
                    stack.push(current.right);
                }
                if(current.left!=null){
                    stack.push(current.left);
                }
            }
        }
    }
}