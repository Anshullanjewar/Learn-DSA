package Strings;

public class StringCompression {
    public static void main(String [] args){
        String str = "aaannccddd";
        //System.out.print(getCompression(str));
        int n =123;
        System.out.print(jay(n));


    }
    public static String getCompression(String str){
        String newStr = "";

        for(int i =0 ;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }
        }
        return newStr;
    }


    public static int jay(int n){
        int temp =n;
        int rev =0;
        while(temp>0){
            rev = temp%10;
            rev =rev*10+ rev;
            temp = temp/10;

        }
        return rev;

    }
}
