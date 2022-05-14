class wordSearch{
    class Solution{
        public boolean exists(char board[][],String word){
            int rows= board.lenght;
            int cols=board[0].length;
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(word.charAt(0)==board[i][j]&& searchWord(i,j,0,word,board)){
                        return true;
                    }
                }
            }
        }
    }
    public static void main(String[] args){

    }
}