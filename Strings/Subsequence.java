package Strings;


public class Subsequence {
    public static void main(String args[]){
        String str1 ="ABCD";
        String str2 = "AD";
        System.out.print(checkSubsequence(str1,str2));
        System.out.print(checkSubsequence2(str1,str2,4,2));

    }
    public static boolean checkSubsequence(String str1,String str2){
        int i =0;
        int j =0;
        while (i<str1.length() && j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }

        }
        return (j==str2.length());
    }

    //recursive
    public static boolean checkSubsequence2(String str1,String str2,int m ,int n){
        if(n==0){
            return true;
        }
        if(m==0){
            return false;
        }
        if(str1.charAt(m-1) == str2.charAt(n-1)){
            return checkSubsequence2(str1,str2,m-1,n-1);
        }
        else{
            return checkSubsequence2(str1,str2,m-1,n);
        }
    }
}

//Same order but any number of characters