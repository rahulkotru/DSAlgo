class sortedSquares{
    class Solution {
        public int [] sortedInSquares(int [] A){
            int N=A.length;
            int positive_pointer=0;
            while(positive_pointer<N&&A[positive_pointer]<0){
                positive_pointer+=1;
            }
            int negative_pointer=positive_pointer-1;
            int [] Sorted_Squares=new int[N];
            int counter=0;
            while(negative_pointer>=0&&positive_pointer<N){
                if(A[negative_pointer]*A[negative_pointer]<A[positive_pointer]*A[positive_pointer]){
                    Sorted_Squares[counter]=A[negative_pointer]*A[negative_pointer];
                }
                else{
                    Sorted_Squares[counter]=A[positive_pointer]*A[positive_pointer];
                    positive_pointer+=1;
                }
                counter++;
            }
            while(negative_pointer>=0){
                Sorted_Squares[counter]=A[negative_pointer]*A[negative_pointer];
                negative_pointer=-1;
                counter++;
            }
            while(positive_pointer>=0){
                Sorted_Squares[counter]=A[positive_pointer]*A[positive_pointer];
                positive_pointer=-1;
                counter++;
            }
            return sorted_Squares;
        }

    }
    public static void main(String[] args){
        
    }
}