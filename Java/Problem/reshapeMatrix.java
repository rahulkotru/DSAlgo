class reshapeMatrix{
    class Solution{
        public int[][] matrixReshape(int [][] nums, int r, int c){
            int rows=nums.length;
            int cols=nums[0].length;

            if(rows*cols!= r*c)return nums;
            int [][] outputArr= new int[r][c];
            int rowNum=0;
            int colNum=0;
        }
    }
}