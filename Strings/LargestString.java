package Strings;

//Lexicographic order
public class LargestString {
    public static void main(String args[]){
        String []names = {"Anshul", "Rahul", "Ram","Aaaa"};
        System.out.print(lexicographicLargest(names));
    }
    public static String lexicographicLargest(String []str){
        String largest = str[0];
        for(int i = 0 ;i<str.length;i++){
           if(largest.compareTo(str[i]) < 0){
               largest = str[i];
           }
        }
        return largest;
    }
}
