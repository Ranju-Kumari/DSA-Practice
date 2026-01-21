package dsa_learning.TwoPointer.LeetCode;

import java.util.Arrays;

public class RemoveElement_Leetcode_27 {

    public static void main(String[] args){

        int [] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
      int k=0;
        Arrays.sort(nums);
        for(int i=1;i<=nums.length-1;i++){
            //Two pointer approach here
            // One, that would keep track of the current element in the original array
            //and another one for just for the unique elements
            if(nums[k]!=nums[i]){
                k++;
                nums[k]=nums[i];
            }
        }

        for(int j=0;j<=k;j++){
            System.out.print(" "+nums[j]+"\n");
        }
        return k+1;
    }
}
