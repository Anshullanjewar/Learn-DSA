package Sorting;

/*
Selection Sort
  - Select the element and put it in its correct index.
  - We can select maximum or minimum element.
  - It not stable Algorithm
  - It performs well in small list


  - Time Complexity :- O(n2)
  -

 */
public class SelectionSort {
    public static void main(String[] args){
        int [] arr = { 5,4,1,3,2};
        apply(arr);
    }
    public static void apply(int [] nums){
        int position = nums.length-1;
        for(int i = 0; i<nums.length;i++){
           // int maxValueIndex = getMaxValueIndex(nums,0,position);
          //  swap(nums, maxValueIndex,position);
        }
    }
//    public static int getMaxValueIndex(int[] nums , int f,int l){
//
//    }
}
