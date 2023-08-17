package Matrices;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args){
        int [][] arr = new int[3][3];
        printMatrix(arr);
    }
    public static void printMatrix(int[][]arr){
        System.out.println("Input 3 X 3 Matrix");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        find(arr);
    }

    public static void find(int[][] nums){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0 ;i<nums.length ; i++){
            for(int j=0; j< nums[0].length; j++){
                largest = Math.max(largest,nums[i][j]);
                smallest = Math.min(smallest,nums[i][j]);
            }
        }
        System.out.println("Largest: " +largest + " Smallest: " +smallest);

    }
}
