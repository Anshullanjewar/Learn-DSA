package Arrays;

public class LargestNumber{
    public static void main(String[] args){
        int nums[] = {1,2,6,3,5};
        System.out.println("Largest number in array is  "+getLargest(nums));
        System.out.print("Smallest number in array is  "+getsmallest(nums));

    }

    public static int getLargest(int[] nums){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static int getsmallest(int[] nums){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i]<smallest){
                smallest = nums[i];
            }
        }
        return smallest;
    }
}
