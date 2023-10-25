package Strings;

import static java.sql.Types.CHAR;

public class RepeatingCharacter {
    public static void main(String args[]) {
        String str = "abccb";
        System.out.print(checkRepeat2(str));
    }
    public static int checkRepeat(String str){
        int j=1;
        for(int i =0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(j)){
                return i;
            }
        }
        return -1;
    }

    static final int CHAR =256;
    public static int checkRepeat2(String str){
        int [] count = new int [CHAR];
        for(int i =0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i =0;i<str.length();i++){
           if(count[str.charAt(i)] > 1){
               return i;
           }
        }
        return -1;
    }
}
