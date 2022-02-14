public class UndirectedGraph{
    int [][] adjMatrix;
    public UndirectedGraph(int nodes){
        this.adjMatrix=new adjMatrix[nodes][nodes];
    }
    public void addEdge(int u,int v){
        this.adjMatrix[u][v]=1;
        this.adjMatrix[v][u]=1;
    }
    public static void main(String[] args){
        UndirectedGraph graph=new UndirectedGraph(4);

    }

}