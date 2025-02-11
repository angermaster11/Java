public class subsequence {
    public static void main(String[] args) {
        PrintSubSequence("abc", "");
        // System.out.println("hi");
    }

    public static void PrintSubSequence(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch = ques.charAt(0);
        PrintSubSequence(ques.substring(1), ans);
        PrintSubSequence(ques.substring(1), ans+ch);
    }
    
}
