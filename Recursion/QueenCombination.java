public class QueenCombination {
    public static void main(String[] args) {
        boolean[] board = new boolean[4];
        Print(board, 2, "", 0,0);
    }

    public static void Print(boolean[] board,int tq,String ans, int qsp, int idx){
        if(qsp==tq){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<board.length;i++){
            if(board[i]==false){
                board[i] = true;
                Print(board, tq, ans+"b"+i+"q"+qsp, qsp+1,i+1);
                board[i] = false;
            }
        }
    }
}
