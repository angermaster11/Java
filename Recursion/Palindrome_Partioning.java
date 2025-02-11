public class Palindrome_Partioning {
    public static void main(String[] args) {
        String ques = "nitin";
        Print(ques, "");
    }
    public static void Print(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        for(int cut = 1;cut<=ques.length();cut++){
            String s = ques.substring(0,cut);
            if(isPalindrome(s)){
                Print(ques.substring(cut), ans+s+"| ");
            }
        }
    }

    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
