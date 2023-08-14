package Arrays;

public class PairsArray{
    public static void main(String []args){
        int[] arr = {1,2,3,4,5,6};
        pairs(arr);

    }
    public static void pairs(int [] nums){
        for(int i = 0 ; i<nums.length-1;i++){
            for(int j = i+1; j<nums.length;j++){
                System.out.print("(" + nums[i] + "," + nums[j] + ")");
            }
            System.out.println();
        }
    }
}

/*
total number of pairs are (n(n-1))/2
*/
