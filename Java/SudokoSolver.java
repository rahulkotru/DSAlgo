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
            int localBoxRow
        
    }
}