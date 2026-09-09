package recursion.GFG.reverseArray;

public class ReverseIntegerArray {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};

        reverseArray(nums);
//        reverseArrayInRecursiveWay(nums,0, nums.length-1);
        for (int ele : nums) {
            System.out.println(ele);
        }
    }

    //Iterative approach
    public static int[] reverseArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }

    //Recursive approach
    public static void reverseArrayInRecursiveWay(int[] nums, int left, int right) {

        //exit condition
        if (left >= right) {
            return;
        }

        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        reverseArrayInRecursiveWay(nums, left + 1, right - 1);
    }

}
