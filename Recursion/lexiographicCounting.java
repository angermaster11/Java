public class lexiographicCounting {
    public static void main(String[] args) {
        count(100, 0);
    }

    public static void count (int n,int curr){
        if(curr > n) return;
        System.out.println(curr);

        int i = 0;
        if(curr ==0) {
            i = 1;
        }

        for(;i<=9;i++){
            count(n, curr*10+i);
        }

        
    }
}
