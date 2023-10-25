package Strings;

public class ShortestPath {
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.print(getShortestPath(path));
    }
    public static int getShortestPath(String str){
        int x=0;
        int y =0;
        for(int i=0; i<str.length();i++){
            if (str.charAt(i) =='E'){
                x++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }
            else{
                y--;
            }
        }
        return (int)Math.sqrt((x*x) + (y*y));
    }
}
