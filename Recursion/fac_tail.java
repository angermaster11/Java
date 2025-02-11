public class fac_tail {
    public static void main(String[] args) {
        System.out.println(fac(5,1));
    }

    public static int fac(int n, int ans){
        if(n==0) return ans;
        return fac(n-1, ans*n);
    }
}
