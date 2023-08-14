package Arrays;

public class ReverseArray{
    public static void main(String args[]){
        int [] arr = {1,2,3,4,5};
        getReverse(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void getReverse(int[]nums){
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
