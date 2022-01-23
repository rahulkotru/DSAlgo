public class SudokoSolver{
    private static final int GRID_SIZE=9;
    public static void main(String[] args) {

        
        int [][] board={
            {7,0,2,0,5,0,6,0,0},
            {0,0,0,0,0,3,0,0,0},
            {1,0,0,0,0,9,5,0,0},
            {8,0,0,0,0,0,0,9,0},
            {0,4,3,0,0,0,7,5,0},
            {0,9,0,0,0,0,0,0,8},
            {0,0,9,7,0,0,0,0,5},
            {0,0,0,2,0,0,0,0,0},
            {0,0,7,0,4,0,2,0,3}
        };
                    if(solveBoard(board)){
                        System.out.println("Solved Successfully");
                    }
                    else{
                        System.out.println("Unsolvable");
                    }
    }
    private static boolean isNumberInRow(int [][] board,int number, int row){
        for(int i=0;i<GRID_SIZE;i++){
            if(board[row][i]==number){
                return true;
            }
        }
        return false;
    }
    private static boolean isNumberInColoumn(int [][] board,int number, int coloumn){
        for(int i=0;i<GRID_SIZE;i++){
            if(board[i][coloumn]==number){
                return true;
            }
        }
        return false;
    }
    private static boolean isNumberInBox(int [][] board,int number, int row,int coloumn){
        int localBoxRow=row-row%3;
        int localBoxColoumn=coloumn-coloumn%3;

        for(int i=localBoxRow;i<localBoxRow+3;i++){
            for(int j=localBoxColoumn;j<localBoxColoumn+3;j++){
                if(board[i][j]==number){
                    return true;
                }
            }
        }
        return false;
    }


    private static boolean isValidPlacement(int [][] board,int number,int row, int coloumn){
        return !isNumberInRow(board,number,row)&&!isNumberInBox(board,number,row,coloumn)&&!isNumberInColoumn(board,number,coloumn);
    }

    private static boolean solveBoard(int[][] board){
        for(int row=0;row<GRID_SIZE;row++){
            for(int coloumn=0;coloumn<GRID_SIZE;coloumn++){
                if(board[row][coloumn]==0){
                    for(int numberToTry=1;numberToTry<=GRID_SIZE;numberToTry++){
                        if(isValidPlacement(board,numberToTry,row,coloumn)){
                            board[row][coloumn]=numberToTry;
                            if(solveBoard(board)){
                                return true;
                            }
                            else{
                                board[row][coloumn]=0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}