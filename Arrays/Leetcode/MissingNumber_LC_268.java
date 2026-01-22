package dsa_learning.Arrays.Leetcode;

import java.util.Arrays;

public class MissingNumber_LC_268 {

    public static void main(String [] args){
        int [] nums = {0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int [] nums){
        Arrays.sort(nums);
        int lastNum = nums[nums.length-1];
        System.out.println(lastNum);
        int expectedSum = (lastNum*(lastNum+1))/2;
        int actualSum =0;

        for(int i =0;i<=nums.length-1;i++){
            actualSum = actualSum+nums[i];
        }

        if(expectedSum==actualSum){
            return lastNum+1;
        }else{
            return (expectedSum-actualSum);
        }

    }


}