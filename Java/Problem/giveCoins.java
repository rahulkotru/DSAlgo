class giveCoins{
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int data){
            this.val=data;
        }
    }
    class Solution{
        int coins;
        public static int distributeCoins(TreeNode root){
            coins=0;
            giveOut(root);
            return coins;
        }
        public int giveOut(TreeNode node){
            if(node==null) return 0;
            int left=giveOut(node.left);
            int right=giveOut(node.right);
            coins=Math.abs(left)+Math.abs(right);
            return node.val+left+right-1;
        }
    }
}