package Matrices;

public class SpiralMatrix  {
    public static void main(String[] args){
        int[][] arr = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        spiral(arr);
    }

    public static void spiral(int[] [] nums){
        int sR = 0;
        int eR = nums.length-1;
        int sC = 0;
        int eC = nums[0].length-1;
        while(sR<=eR && sC<=eC){
            for(int i=sC;i<=eC;i++){
                System.out.print(nums[sR][i] + " ");
            }
            sR++;
            for(int i=sR;i<=eR;i++){
                System.out.print(nums[i][eC] + " ");
            }
            eC--;
            for(int i=eC; i>=sC;i--){
                System.out.print(nums[eR][i] + " ");
            }
            eR--;
            for(int i=eR;i>=sR;i--){
                System.out.print(nums[i][sC] + " ");
            }
            sC++;
        }
    }
}
