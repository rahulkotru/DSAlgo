class maxWidthBinaryTree{
    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int value;
        TreeNode(int data){
            this.value=data;
        }
    }
    public class Solution {
        int maxWidth;
        HashMap<Integer, Integer> leftmostPosition;
        public int searchWidth(TreeNode root){
            int max=0;
            leftmostPosition=new Hashmap();
            getWidth(root, 0, 0);
            return max;
        }

        public void getWidth(TreeNode root, int depth, int position){
            if(root==null)return 0;
            leftmostPosition.computeIfAbsent(root, x->position);
            max=Math.max(max,position-leftmostPosition.get(depth)-1);
            getWidth(root.left,depth+1,position*2);
            getWidth(root.right,depth+1,position*2+1);
             
        }
        public static void main(String[] args){
            
        }
    }
}