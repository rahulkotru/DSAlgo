class islandGraph{
    class Solution{


        public static int countIslands(char [][] island){
            int count=0;
            for(int i=0;i<island.length;i++){
                for(int j=0;j<island[i].length;j++){
                    if(island[i][j]=='1'){
                        callBFS(island,i,j);
                    }
                }
            }
        }
        return count;
    }
    void callBFS(char [][] island,int i, int j){
        if(i<0|| i>island.length||j<0||j>=island.length||grid[i][j]=='0')
        return;

        island[i][j]='0';
        callBFS(island,i+1,j);
        callBFS(island,i-1,j);
        callBFS(island,i,j+1);
        callBFS(island,i,j-1);
    }    
}