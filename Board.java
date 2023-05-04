public class Board
{
    boolean[] board = new boolean[6];
    public Board(){
        for(int i = 0; i<6; i++){
            board[i]=false;
        }
    }
    public void changeSpace(int n)
    {
        if(board[n]){
            board[n]=false;
        }else{
            board[n]=true;
        }
    }
    public boolean returnSpace(int n){
        return board[n];
    }
}
