package dsa_learning.Arrays.Leetcode;

public class RotateArray_LC_189 {

    public static void main(String [] args){
        int nums []={-1,-100,3,99};
        int k=2;
        rotate(nums,k);
    }

    public static void rotate(int[] nums, int k) {
        int answer [] = new int[nums.length];
        int i;
        int j=0;
        int n=nums.length;
        for(i=n-k;i<=n-1;i++){
            answer[j]=nums[i];
            j++;
        }

        for(i=0;i<=n-k-1;i++){
            answer[j]=nums[i];
            j++;
        }

         for (i=0;i<=n-1;i++){
             System.out.print(answer[i]+" ");
         }
    }
}
