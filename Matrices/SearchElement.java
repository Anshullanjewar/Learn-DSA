package Matrices;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args){
        int [][] arr = new int[3][3];
        printMatrix(arr);
    }

    public static boolean Search (int[][]nums , int target){
        for(int i = 0 ;i<nums.length; i++){
            for(int j = 0; j<nums[0].length; j++){
                if(nums[i][j] == target){
                    System.out.println("index (" + i +"," + j + ")");
                    return true;
                }
            }
        }
        return false;
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
        Scanner t = new Scanner(System.in);
        int tr = t.nextInt();
        Search(arr,tr);
    }
}
