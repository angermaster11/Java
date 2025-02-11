public class coin {
    public static void main(String[] args) {
        CoinPrint(3, "");
    }
    public static void CoinPrint(int n,String ans){
        if(n==0){
            System.out.print(ans+ " ");
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
            CoinPrint(n-1, ans+"H");
        }
        CoinPrint(n-1, ans+"T");
    }
    
}
