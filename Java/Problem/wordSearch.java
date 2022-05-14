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
            return false;
        }
        public boolean searchWord(int i, int j, int index, String word, char[][] board){
            visited[i][j]=true;
            if(searchWord(i+1,j,index+1,word,board))||searchWord(i+1,j,index+1,word,board)||searchWord(i+1,j,index+1,word,board)||searchWord(i+1,j,index+1,word,board)||searchWord(i+1,j,index+1,word,board)){
                return true;
                }
                visited[i][j]=false;
                return false;
        }
    }
    public static void main(String[] args){

    }
}