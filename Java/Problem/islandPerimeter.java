class islandPerimeter{
    class Solution{
        public int islandPerim(int [][] grid){
            if(grid.length==0||grid.[0].length==0){
                return 0;
            }
            int result=0;
            for(int i=0; i<grid.length;i++){
                for(int j=0;j<grid.length;j++){
                    result+=4;

                }
                if(i>0&& grid[i-1][j]==1){
                    result-=2;
                }
                if(j>0&& grid[i][j]-1==1){
                    result-=2;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){

    }
}