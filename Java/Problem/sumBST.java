class sumBST{
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode( int data){
            this.val=data;
        }
    }
    class Solution {
        public int sumIterative(TreeNode root, int L, int R){
            int rangeSum=0;
            Stack<TreeNode> stack= new Stack();
            stack.push(root);
            while(!stack.isEmpty()){
                TreeNode node=stack.pop();
                if(node!=null){
                    if(node.val>=L && node.val<=R){
                        rangeSum+=node.val;
                    }
                    if(node.val>L){
                        stack.push(node.left);
                    }
                    if(node.val<R){
                        stack.push(node.right);
                    }
                }
            }
            return rangeSum;
        }   
        public int sumRecursive (TreeNode root, int L , int R){
            Stack<TreeNode> stack= new Stack();
            if(root!=null){
                if(root.val>L&& root.val<R){
                    rangeSum+=node.val;
                }
                if(root.val>L){
                    sumRecursive(root.left, L,R);
                }
                if(root.val<R){
                    sumRecursive(root.right,L,R);
                }
            }
            return rangedSum;
        }
        public static void main(String[] args){
            
        }
    }

}