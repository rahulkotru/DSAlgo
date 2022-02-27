class n-arryTreeInorderTraversal{
    class TreeNode{
        int data;
        List<TreeNode> children;
        TreeNode(int val){
            this.data=val;
            this.children=null;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root){
        Stack <TreeNode> stack=new Stack<>();
        List<Integer> output=new ArrayList<>();
        if(root==null){
            return output;
        }
        TreeNode current=root;
        while(current!=null||stack.isEmpty()){
            while(current!=null){
                stack.push(current);
                current=current.left;
            }
            current=stack.pop();
            output.add(current.val);
            current=current.right;
        }
        return output;
    }
    public static void main(String[] args){

    }
}