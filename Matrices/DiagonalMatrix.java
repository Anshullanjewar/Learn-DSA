package Matrices;

/*
In diagonals every cell has rows = columns
 */


public class DiagonalMatrix {
    public static void main(String[] args){
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        diagonalSum(arr);
    }
    public static void diagonalSum(int[][]nums){
        int sum = 0;
        int r = 0;
        int c=nums.length;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i][i];
            if (nums.length%2!=0){
               int mid = (nums.length-1)/2;
               sum= sum-nums[mid][mid];
            }
            sum += nums[r][nums.length - 1 - i];
            r++;
            c--;
        }
        System.out.print(sum);
    }
}
