package dsa_learning.arrays.Leetcode;

public class SubarraySumEqualsK_LC_570 {

    public static void main(String [] args){

        int [] nums = {1,1,1};
        int k=2;
        System.out.println(subarrarySum(nums,k));
    }

    public static int subarrarySum(int [] nums, int k){

        int sum;
        int count=0;

        for(int i=0;i<=nums.length-1;i++){
            sum=0;
            for(int j=i;j<=nums.length-1;j++){
                sum = sum + nums[j];
                System.out.println("sum is  "+sum);
                if(sum==k){
                    count++;
                    System.out.println(" "+j);
                }
            }
        }
        return count;
    }
}