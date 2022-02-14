public class UndirectedGraph{
    private int V;
    private int E;
    private int [][] adjMatrix;
    public UndirectedGraph(int nodes){
        this.V=0;
        this.E=0;
        this.adjMatrix=new int[nodes][nodes];
    }
    public void addEdge(int u,int v){
        this.adjMatrix[u][v]=1;
        this.adjMatrix[v][u]=1;
    }
    public static void main(String[] args){
        UndirectedGraph graph=new UndirectedGraph(4);
        graph.addEdge(0,1);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        graph.addEdge(1,2);
    }

}