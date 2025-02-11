public class QueenPermuataion {
    public static void main(String[] args) {
        boolean[] board = new boolean[4];
        Print(board, 1, "", 0);
    }

    public static void Print(boolean[] board,int tq,String ans, int qsp){
        if(qsp==tq){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
                board[i] = true;
                Print(board, tq, ans+"b"+i+"q"+qsp, qsp+1);
                board[i] = false;
            }
        }
    }
}
