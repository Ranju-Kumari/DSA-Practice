package dsa_learning.TwoPointer.LeetCode;

public class MergeTwoSortedArrays_Leetcode_88 {

    public static void main(String [] args){

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1,nums1.length,nums2, nums2.length);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        //Solution without using extra array
        int i = m/2-1; //because we want to start comparing here 3 with 6 and not 0 with 6
        int j = n-1;

        for(int k = m-1;k>=0;k--){
            if(j<0){
                // if j<0, that means nums2 is already over now
                // so, no need to anything now
                // since the remaining uniterated elements of nums1 is already sorted as menioned
                // in the qn, so we break out of the loop to avoid 'ArrayIndexOutOfBoundsException'
                break;
            }
            if(i>=0 && nums1[i]>=nums2[j]){ // if i>=0, this is false,
                // then all nums2 elements should be stored in num1[k]
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
        }

        for(int ind=0;ind<nums1.length;ind++){
            System.out.print(" "+nums1[ind]);
        }
    }



    //Solution: extra array
    /*public void merge(int[] nums1, int m, int[] nums2, int n) {
      int nums1Length = m-n;
       int [] result = new int[m];
       int k =0;
       int i=0;
       int j=0;

        while(k<=(m-1)){
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

    }*/
}
