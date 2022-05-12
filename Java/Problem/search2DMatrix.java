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
                int midpointElement=matrix[midpoint/cols][midpoint%cols];
                if(matrix[midpoint]==target){
                    return true;
                }
                else if(target<matrix[midpoint]){
                    right=midpoint-1;
                }
                else if(target>matrix.length){
                    left=midpoint+1;
                }
            }
        }
    }
    public static void main(String args[]){

    }
}