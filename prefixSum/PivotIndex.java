package dsa_learning.prefixSum;

public class PivotIndex {

    public static void main(String [] args){
        int [] nums = {1,7,3,6,5,6};
        System.out.print(pivotIndex(nums));
    }

    public static int pivotIndex(int [] nums){

        int totalSum=0;
        for(int n :nums){
            totalSum+=n;
        }
       int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int leftSum = (i == 0) ? 0 : prefixSum[i - 1];
            int rightSum = totalSum - prefixSum[i];

            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
