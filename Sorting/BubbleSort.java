package Sorting;

/*
 - Bubble Sort / Sinking Sort / Exchange Sort
     Comparing and swapping the adjacent array repeatedly such that
     the large element come to end of array.

     - Time complexity = O(n2)
*/

public class BubbleSort{
    public static void main(String[] args){
        int [] arr = { 5,4,1,3,2};
        apply(arr);
    }

    public static void apply(int[] nums){
        boolean swapped;
        for(int pass =0 ; pass<nums.length-1;pass++){
            swapped = false;
            for(int j=1;j<nums.length-pass;j++){
                if(nums[j-1]>nums[j]){
                    swap(nums,j-1,j);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        for(int i = 0; i <nums.length;i++){
            System.out.print(nums[i]);
        }
    }
    public static void swap(int[]nums,int f,int s){
        int temp = nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
}

