public SudokoSolver{
    public static void main(String[] args) {
        private static final int GRID_SIZE=9;
        
        int [][] board={};
    }
    private static boolean isNumber(int [][] board,int number, int row){
        for(int i=0;i<GRID_SIZE;i++){
            if(board[row][i]==number){
                return true;
            }
        }
        return false;
    }
    private static boolean isNumberInBox(int [][] board,int number, int coloumn){
        for(int i=0;i<GRID_SIZE;i++){
            if([i][coloumn]==number){
                return true;
            }
        }
        return false;
    }
        private static boolean isNumberColoumn(int [][] board,int number, int coloumn){
            int localBoxRow=row-row%3;
            int localBoxColoumn=coloumn-coloumn%3;

            for(int i=localBoxRow;i<localBoxRow+3;i++){
                for(int j=localBoxColoumn;j<localBoxColoumn+3;j++){
                    if(board[i][j]==number){
                        return true;
                    }
                }
            }
        
    }
    return false;

    private static boolean isValidPlacement(int [][] board,int number,int row, int coloumn){
        return !isNumberInRow(board,nSumber,row)&&!isNumberInBox(board,number,row,coloumn)&&!isNumberInColoumn(board,number,coloumn);
    }
    private static boolean solveBoard(int[][] board){
        for(int row=0;row<GRID_SIZE;row++){
            for(int coloumn=0;coloumn<GRID_SIZE)
        }
    }
}