package Strings;

public class Substring {
    public static void main(String args[]){
        String str ="HiAnshul";
        int s=1;
        int e=3;
        System.out.println(getSubstring(str,s,e));
       // System.out.print(str.substring(s,e));
    }

    public static String getSubstring(String str,int s, int e){
        String subStr = "";
        for(int i = s; i<e;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
}
