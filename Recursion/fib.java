public class fib {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    public static int fib(int n){
        if (n==0 ) return 0;
        if (n==1) return 1;

        int fib1 = fib(n-1);
        int fib2 = fib(n-2);

        return fib1+fib2;
    }
}
