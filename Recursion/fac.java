public class fac{
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
    public static int fac(int n){
        if(n==0) return 1;

        int fn = fac(n-1);
        return n*fn;
    }
}