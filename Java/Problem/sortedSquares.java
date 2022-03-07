class sortedSquares{
    class Solution {
        public int [] sortedInSquares(int [] A){
            int N=A.length;
            int positive_pointer=0;
            while(positive_pointer<N&&A[positive_pointer]<0){
                positive_pointer+=1;
            }
            int negative_pointer=positive_pointer-1;
        }
    }
}