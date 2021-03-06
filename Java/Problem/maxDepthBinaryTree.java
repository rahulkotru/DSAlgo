class maxDepthBinaryTree{
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int data;
    }
    class Solution {
        private int answer;
        void maxDepth(TreeNode root,int depth){
            if(root==null){
                return 0;
            }
            if(root.left==null&&root.right==null){
                answer=Math.max(answer,depth);
            }
            maxDepth(root.left,depth+1);
            maxDepth(root.right,depth+1);
        }
    }
    public static void main(String[] args){

    }
}