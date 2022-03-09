class largestTreeVal{
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode (int data){
            this.val=data;
        }
    } 
    class Solution {
        
        public List<Integer> maxLevel(TreeNode root){
            List<Integer> largestVal=new ArrayList();
            helper(root, largestVal,0);
            return largestVal;
        }  
        public void helper(TreeNode root, List<Integer> largestVal,int level){
            if(root==null) return;
            if(level==largestVal.size()){
                largestVal.add(root.val);
            }
            else{
                largestVal.set(level, Math.max)
            }
        }
    
    }
}