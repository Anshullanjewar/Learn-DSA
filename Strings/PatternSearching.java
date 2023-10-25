package Strings;

public class PatternSearching {
    public static void main(String args[]){
        String txt = "ABABABABCD";
        String patt = "ABAB";
         patternFind(txt,patt);
    }

    public static void patternFind(String str,String pat){
        for(int i = 0;i<str.length()-pat.length();i++){
            for(int j=0;j<pat.length();j++) {
                if (str.charAt(i+j) != pat.charAt(j)) {
                    break;
                }
                if (j == pat.length()) {
                    System.out.print(i + " ");
                }
            }
        }
        //return -1;
    }
}
