class reshapeMatrix{
    class Solution{
        public int[][] matrixReshape(int [][] nums, int r, int c){
            int rows=nums.length;
            int cols=nums[0].length;

            if(rows*cols!= r*c)return nums;
            int [][] outputArr= new int[r][c];
            int rowNum=0;
            int colNum=0;

            for(int i=0; i<rows;i++){
                for (int j=0;j<cols;j++){
                    outputArr[rowNum][colNum]=nums[i][j];
                    colNum++;
                    if(colNum==c){
                        colNum=0;
                        rowNum++;
                    }
                }
            }
            return outputArr;
        }
    }
}