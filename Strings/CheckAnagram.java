package Strings;

import java.util.Arrays;

import static java.sql.Types.CHAR;

public class CheckAnagram {
    public static void main(String args[]) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.print(anagram(str1, str2));
    }
    public static boolean anagram(String str1,String str2){
        if(str1.length()!= str2.length()){
            return false;
        }
        char [] a = str1.toCharArray();
        Arrays.sort(a);
        str1 = new String(a);

        char [] b = str2.toCharArray();
        Arrays.sort(b);
        str2 = new String(b);

        return str1.equals(str2);
    }

    public static boolean anagram2(String str1,String str2){
        if(str1.length()!= str2.length()){
            return false;
        }
        int []check = new int[CHAR];
        for(int i=0;i<str1.length();i++){
            check[str1.charAt(i)]++;
            check[str2.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++){
            if(check[i]!=0){
                return false;
            }
        }
        return true;
    }
}
//checking two string are permutation of each other or not
// order could be different but frequency should be same