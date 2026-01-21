package dsa_learning.TwoPointer.LeetCode;

public class MergeTwoSortedArrays_Leetcode_88 {

    public static void main(String [] args){

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1,nums1.length,nums2, nums2.length);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int nums1Length = m-n;
       int [] result = new int[m];
       int k =0;
       int i=0;
       int j=0;

        while(k<= ((m)-1)){
           if((j>=n) || (i<=(nums1Length-1)) && (nums1[i]<=nums2[j])) {
               result[k] = nums1[i];
               k++;
               i++;
           }
           else {
               result[k] = nums2[j];
               k++;
               j++;
           }

        }

        for(int ind=0;ind<result.length;ind++){
            System.out.print(" "+result[ind]);
        }


    }
}
