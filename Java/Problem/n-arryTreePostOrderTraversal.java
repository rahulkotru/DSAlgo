class n-arryTreePostOrderTraversal{
    class Node{
        int val;
        List<Node> children;
        Node(int data,List<Node> child){
            this.val=data;
            this.children=child;
        }
    }
    public List<Integer> narryTraversal(Node root){
        LinkedList<Node> stack=new LinkedList<>();
        LinkedList<Integer> arr=new LinkedList<>();
        
        if(root==null){
            return arr;
        }
        stack.add(root);
        while(!stack.isEmpty){
            Node node=stack.pollLast();
            arr.addFirst(node.val);
            for(Node child:node.children){
                stack.add(child);
            }
        }
        return arr;
    }
    public static void main(String args[]){

    }
}