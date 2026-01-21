class Solution {

    // Iterative approach
    
    public int search(int[] nums, int target) {
      int start = 0;
      int end = nums.length - 1;
      
      while (start <= end) {
      int mid = (start + end) / 2;
     
      if (target < nums[mid]) {
      end = mid - 1;
      } else if (target > nums[mid]) {
      start = mid + 1;
      } else {
      return mid;
      }
      }
      return -1;
      }

    // Recursive aaproach
    /*
     * public int search(int nums[], int target, int start, int end) {
     * 
     * int mid = (start + end) / 2;
     * while(start <=end) {
     * if (target == nums[mid]) {
     * return mid;
     * }
     * if (target < nums[mid]) {
     * end = mid - 1;
     * return search(nums, target, start, end);
     * } else if(target > nums[mid]){
     * start = mid + 1;
     * return search(nums, target, start, end);
     * }
     * }
     * return -1;
     * }
     */

}
