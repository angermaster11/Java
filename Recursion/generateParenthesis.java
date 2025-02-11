public class generateParenthesis {
    public static void main(String[] args) {
        Print(3, 0, 0, "");
    }
    public static void Print(int n, int open, int close, String ans){
        if(open > n || close > open){
            return;
        }

        if(open==close && open==n){
            System.out.println(ans);
            return;
        }
        Print(n, open+1, close, ans+"(");
        Print(n, open, close+1, ans+")");
    }
}
