package Strings;

import java.util.Arrays;

public class NotRepeating {
    public static void main(String args[]) {
        String str = "abccabg";
        System.out.print(checkNonRepeat3(str));

    }
    public static int checkNonRepeat(String str){
        for(int i =0;i<str.length();i++){
            int count =0;
            for(int j=0;j<str.length();j++){
              if(i!=j && str.charAt(i)==str.charAt(j)) {
                count++;
               }
            }
            if(count==0){
                return i;
            }
        }
        return -1;
    }

     static final int CHAR = 256;
    public static int checkNonRepeat2(String str){
        int []count = new int [CHAR];
        for(int i =0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }

    public static int checkNonRepeat3(String str){
        int [] ind = new int[CHAR];
        Arrays.fill(ind,-1);
        for(int i=0;i<str.length();i++){
            if(ind[str.charAt(i)]==-1){
                ind[str.charAt(i)]=i;
            }
            else{
                 ind[str.charAt(i)] = -2;
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i=0;i<CHAR;i++){
            if(ind[i]>=0){
                res = Math.min(res,ind[i]);
            }
        }
        return (res==Integer.MAX_VALUE)?-1 :res;
    }
}
