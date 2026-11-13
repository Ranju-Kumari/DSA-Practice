package dsa_learning.TwoPointer.LeetCode;

public class MergeTwoSortedArrays_Leetcode_88 {

    public static void main(String [] args){

        int[] nums1 = {1,2,3};
        int[] nums2 = {2,5,6};

//      merge(nums1,nums1.length,nums2, nums2.length);
        mergeSort(nums1,nums1.length,nums2,nums2.length);
    }

    //when nums1 = {1,2,3}
     public static void mergeSort(int [] nums1, int m, int [] nums2, int n){

        int nums3[] = new int[m+n];
        int i=0,j=0;
        for(int k=0;k<=m+n-1;k++){
            if(j>=n || i<m && nums1[i]<=nums2[j]){
                nums3[k]=nums1[i];
                i++;
            }else {
                nums3[k]=nums2[j];
                j++;
            }
        }

        for (i=0;i<nums3.length;i++){
            System.out.println(nums3[i]);
        }
    }

/*
* Complexity
Time: O(n + m). Every element is copied exactly once, and each iteration does constant work.
Space: O(n + m) for nums3. You can’t avoid that when the output must be a new array,
because the result itself has n + m elements.

Can you merge without nums3?
It depends on whether nums1 has room for the result.
Case 1: nums1 has empty space at the end (LeetCode 88). Here nums1 has length m + n,
with the last n slots set to 0 as placeholders. The trick is to merge from the back:
place the largest elements first, at the end of nums1. Those slots are empty, so you never overwrite values you still need.

* */

   // when nums1={1,2,3,0,0,0}
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }


    //But why  while(j>=0) and not while (i>=0)? Because the two arrays aren’t in the same situation.
    // nums1’s elements are already inside nums1.
    // nums2’s elements are not. The loop’s job is to move every element of nums2 into nums1,
    // so it has to keep going until nums2 is used up, and that’s exactly j >= 0

/*
This runs in O(m + n) time with O(1) extra space. The loop runs only while nums2 has elements.
Once nums2 is used up, whatever remains of nums1 is already in its correct place.
Merging from the front wouldn’t work here, because writing into nums1 would overwrite elements of nums1 that haven’t been read yet.

Case 2: both arrays are full and must stay separate. Java arrays have a fixed size, so nums1 can’t grow to hold everything.
The task then becomes rearranging values so that the smallest n end up in nums1 and the rest in nums2, both sorted.
That is possible without extra space, but it’s slower:
Swap and reinsert: for each nums1[i] greater than nums2[0], swap them, then shift the new nums2[0] into its correct spot in nums2.
This is O(n · m) time.
Gap method (based on Shell sort): compare elements a gap apart across both arrays, halving the gap each round. This is O((n + m) log(n + m)) time.

These show up as “merge without extra space” problems on GFG. In real code, and for LeetCode 88, the back-merge in Case 1 is what you’ll need.
 */


}
