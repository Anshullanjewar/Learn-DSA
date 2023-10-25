package Strings;

public class ReverseWord {
    public static void main(String[] args){
        String  str = "Hi my name is Anshul ";
        char [] s = rev(str.toCharArray());
        System.out.print((s));
    }

    public static char [] rev(char []str){

        int start = 0;
        for(int end =0; end<str.length;end++ ){
            if(str[end] ==' '){
                reversing(str,start,end);
                start=end+1;
            }
        }
        reversing(str,start,str.length-1);
        reversing(str,0,str.length-1);

        return str;
    }

    public static void reversing(char[] str,int s,int e){
        while(s<=e){
            swap(str,s,e);
            s++;
            e--;
        }
    }
    public static void swap(char [] str,int s,int e){
        char temp = str[s];
        str[s]=str[e];
        str[e]=temp;

    }
}
