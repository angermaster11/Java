public  class CoinCombination {
    public static void main(String[] args) {
        int[] coins = {2 ,3 ,5 };
        int amount = 8;
        Print(coins, amount, "",0);
    }

    public static void Print(int[] coins,int amount,String ans,int idx){
        if(amount==0){
            System.out.println(ans);
            return;
        }

        for(int i=idx;i<coins.length;i++){
            if(amount>=coins[i]){
                Print(coins, amount-coins[i], ans+coins[i],i);
            }
        }
    }
}
