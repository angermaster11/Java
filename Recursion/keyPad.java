public class keyPad{
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void main(String[] args) {
        PrintMap("23", "");
    }

    public static void PrintMap(String number, String ans){
        if(number.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = number.charAt(0);
        int n =  ch - '0';
        String getString = key[n];
        for(int i=0;i<getString.length();i++){
            PrintMap(number.substring(1), ans+getString.charAt(i));
        }
    }
    
}