class islandGraph{
    class Solution{


        public static int countIslands(char [][] island){
            for(int i=0;i<island.length;i++){
                for(int j=0;j<island[i].length;j++){
                    if(island[i][j]=='1'){
                        callBFS(island,i,j);
                    }
                }
            }
        }
    }
}