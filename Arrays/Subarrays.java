package Arrays;

public class Subarrays{
    public static void main(String[]args){
        int [] arr = {2,4,6,8,10};
        //subarrays(arr);
        // prefixSum(arr);
        kadane(arr);
    }

    //print subarrays, sum of subarrays, max subarray, min subarray, total subarray
    public static void subarrays(int [] nums){
        int subarraySum = 0;
        int totalSum =0;
        int maxSubarray =Integer.MIN_VALUE;
        int minSubarray =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j= i; j<nums.length;j++){
                for(int k = i ;k<=j;k++){
                    System.out.print("(" + nums[k] + ")" + " ");    //Prints subarray elements.
                    subarraySum+= nums[k] ;             //Add subarray's element.
                    totalSum += nums[k];                //Add total elements of subarrays.
                }
                System.out.print("Sum of Subarray is " + subarraySum);   //Prints subarray sum.
                if(maxSubarray<subarraySum){
                    maxSubarray=subarraySum;
                }
                if(minSubarray>subarraySum){
                    minSubarray = subarraySum;
                }
                System.out.println();                                    // nextline.
                subarraySum = 0;                                         // reset subarray sum.
            }
            System.out.println();                                        // nextline.
        }
        System.out.println(totalSum);                                    // total subarray sum.
        System.out.println("Max is "+ maxSubarray + " " + "Min is "+ minSubarray);
    }

    //max subarray sum using prefix
    public static void prefixSum(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int []prearr = new int[nums.length];
        prearr[0]=nums[0];
        for(int i=1; i<prearr.length;i++){
            prearr[i]= prearr[i-1]+ nums[i];
        }

        for(int i = 0 ; i<nums.length;i++){
            for(int j = i ; j<nums.length;j++){
                int currSum = i == 0 ? prearr[j] : prearr[j] - prearr[i-1];

                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.print(maxSum);
    }


    //max subarray sum using Kadane Algorithm
    public static void kadane(int[]nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0 ; i< nums.length; i++){
            currSum = currSum<0 ? 0 : currSum + nums[i];
            if(currSum>maxSum){
                maxSum = currSum;
            }
        }
        System.out.print(maxSum);
    }

}

/*
Total number of subarrays are (n(n+1))/2
*/
