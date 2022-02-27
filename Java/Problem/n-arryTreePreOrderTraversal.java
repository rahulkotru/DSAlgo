class n-arryTreePreorderTraversal{
    class Node{
        int val;
        List<Node> children;
        Node(int value, List<Node> child){
            this.val=value;
            this.children=child;
        }

    }
    class Solution {
        public List<Integer> preorder(Node root){
            LinkedList<Node> stack=new LinkedList<>();
            LinkedList<Node> arry=new LinkedList<>();
            if(root=-null){
                return arry;
            }
            stack.add(root);
            while(!stack.isEmpty()){
                Node node=stack.pollLast();
                arry.add(node.val);
                Collections.reverse(node.children);
                for(Node child:node.children){
                    stack.add(child);
                }
            }
            return arry;
        }
    }
}