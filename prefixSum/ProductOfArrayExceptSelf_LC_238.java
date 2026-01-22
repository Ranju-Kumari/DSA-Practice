package dsa_learning.prefixSum;

public class ProductOfArrayExceptSelf_LC_238 {

    public static void main(String args[]){

        int nums [] = {1,2,3,4};
        productExceptSelf(nums);
        for(int n : nums){
            System.out.print(n+" ");
        }

    }

    public static int[] productExceptSelf(int[] nums) {

        //We can't use division operation because of edge cases like
        // [10^5, 10^3, 10^4] --> 10^5 * 10^3 * 10^4 = 10^12 which is greater than 2^32
        // [-1,1,0,-3,3]  --> -1*1*0*-3*3 = 0 and 0/nums[i] = IOException


        // Hence, we'll use the concept of prefix product and suffix product here
        // For each element, we just have to find :
        // product of elements preceeding that element & product of elements suceeding that element
        // And then finally multiply these two to get the product of the element except self

        int prefixProd [] = new int[nums.length];
        int sufixProd [] = new int[nums.length];

        prefixProd[0] = 1; // Since there is no element left side of the first elementin the array
        sufixProd[nums.length-1] = 1; // Since there is no element after the last element in the array

        int i ;
        for(i = 1 ; i<=nums.length-1;i++){

            prefixProd[i] = prefixProd[i-1]*nums[i-1];
        }

        for(i=nums.length-2;i>=0;i--){
            sufixProd[i] = sufixProd[i+1]*nums[i+1];
        }


        for(i=0;i<=nums.length-1;i++){
            nums[i]=prefixProd[i]*sufixProd[i];
        }

        return nums;
    }
}
