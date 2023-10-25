package Strings;

public class Palindrome {
    public static void main(String args[]){
        String str = "mom";
        System.out.print(pString3(str));
    }
    static boolean pString(String str){
        int last = str.length()-1;
        for(int i =0; i<(str.length())/2;i++){
            if(str.charAt(i)!=str.charAt(last-i)){
                return false;
            }
        }
        return true;
    }
    // reversing the string and compare both string
    static boolean pString2(String str){
        String rev = "";
        for(int i = str.length()-1; i >=0;i--){
            rev += str.charAt(i);
        }
        if(! rev.equals(str)){
            return false;
        }
        return true;
    }
    static boolean pString3(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }
}
