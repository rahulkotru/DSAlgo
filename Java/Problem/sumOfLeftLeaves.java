class sumOfLeftLeaves{
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int data;
        TreeNode(int val){
            this.data = val;
        }

    }
    class Solution{
        public static int sumOfLeft(TreeNode root){
            if(root== null) return 0;
        }
        int sumOfLeftLeave=0;
        if(root.left.left==null&&root.left.right==null){
            sumOfLeftLeave+=root.left.val;
        }
        else{
            sumOfLeftLeave+=sumOfLeft(root.left);
        }
        if(root.right!=null){
            if(root.right.left!=null|| root.right.right!=null){
                
            }
        }
    }
}