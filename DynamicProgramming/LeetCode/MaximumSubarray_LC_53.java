package dsa_learning.DynamicProgramming.LeetCode;

import static java.lang.Math.max;

public class MaximumSubarray_LC_53 {

    public static void main(String [] args){
        int [] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum sum is "+ maxSum_KadanesAlgo(a));
        // System.out.println("Maximum sum is "+ maxSum_BigOofNsquareSoln(a));
    }

//Approach:
    //This uses Kadane’s Algorithm.
    //It keeps a running sum and resets it when it becomes negative.
//How it works:
    //Add current element to sum.
    //Update maxSum if current sum is better.
    //If sum becomes negative → reset to 0 (because a negative prefix will only hurt future sums).
    //O(n) (single loop)

//Insight:
   //It avoids unnecessary work by discarding subarrays that would reduce future sums.
   //It’s an optimized greedy approach. 
    public static long maxSum_KadanesAlgo(int [] nums){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<=nums.length-1;i++){
            sum = sum+nums[i];
            maxSum = Math.max(sum, maxSum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }


//Brute force approach : O(n^2)
//Approach:
    //This checks all possible subarrays.
//How it works:    
    //Outer loop picks starting index i.
    //Inner loop builds subarrays from i to end.
    //Computes sum of every possible subarray.
    //O(n²) (nested loops)

    public static int maxSum_BigOofNsquareSoln(int [] nums){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<=nums.length-1;i++){
            sum=0;
            for(int j=i;j<=nums.length-1;j++){
                sum = sum+nums[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }   
}
