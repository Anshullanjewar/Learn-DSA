package Arrays;

public class TrappedWater{
    public static void main(String[] args){
        int[] arr = {4,2,0,6,3,2,5};
        rainWater(arr);
    }

    public static void rainWater(int[]nums){
        int totalTrapped=0;

        int [] left = new int[nums.length];
        int [] right = new int [nums.length];

        left[0]= nums[0];
        right[nums.length-1]= nums[nums.length-1];

        for(int i =1;i<nums.length;i++){
            left[i]=Math.max(nums[i],left[i-1]);
        }

        for(int i=nums.length-2; i>=0 ;i--){
            right[i]= Math.max(nums[i],right[i+1]);

        }

        for(int i =0 ; i<nums.length;i++){
            totalTrapped += (Math.min(left[i],right[i])) - nums[i];
        }

        System.out.print(totalTrapped);
    }

}


/*
Trapped water formula
(waterlevel - barlevel) * width of bar
waterlevel = min of (maxLeft, maxRight)
*/
