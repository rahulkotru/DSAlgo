class pathSum{
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
        }
    }
    class Solution{
        public boolean hasPath(TreeNode root, int target){
            if(root==null){
                return false;
            }
            Stack<TreeNode> node_stack=new Stack();
            Stack<Integer> sum_stack=new Stack();

            node_stack.add(root);
            sum_stack.add(target-root.val);
            while(!node_stack.isEmpty()){
                TreeNode current_node=node_stack.pop();
                int current_sum=sum_stack.pop();

                if(current_node.left==null&&current.node.right==null &&current_sum==0){
                    return true;
                }
                if(current_node.left!=null){
                    node_stack.add(current_node.left);
                    sum_stack.add(current_sum-current_node.left.val);
                }
                if(current_node.right!=null){
                    node_stack.add(current_node.right);
                    sum_stack.add(current_node.right.val);
                }
            }
            return false;
        }
    }
}