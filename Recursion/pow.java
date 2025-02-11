// package 01;

public class pow {
    public static void main(String[] args) {
        System.out.println(POW(5,3));
    }
    public static int POW(int a,int x){
        if(x==0) return 1;
        int ans = POW(a, x-1);
        return ans*a;
    }
}
