class search2DMatrix{
    class Solution {
        public boolean searchMatrix(int [][] matrix, int target){
            if(matrix.length==0){
                return false;
            }
            int rows=matrix.length;
            int cols=matrix[0].length;
            int left=0;
            int right=rows*cols-1;

            while(left<=right){
                int midpoint=left-(right-left)/2;
            }
        }
    }
    public static void main(String args[]){

    }
}