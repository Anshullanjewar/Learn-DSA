package Matrices;

public class SearchInMatrix {
    public static void main(String[] args){
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int key = 14;
        staircaseSearch(arr,key);
    }

    public static boolean staircaseSearch(int [][]nums,int key){
        int row = 0;
        int col = nums[0].length-1;
        while(row<nums.length && col>=0){
            if(nums[row][col]== key){
                System.out.print("(" + row + ","+ col +")");
                return true;
            }
            else if (nums[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
